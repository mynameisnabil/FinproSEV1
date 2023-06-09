package com.example.finprov1.news;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.databinding.ItemnewsBinding;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private static List<NewsModel> newsList;
    private OnNewsClickListener listener;

    public interface OnNewsClickListener {
        void onNewsClick(NewsModel newsModel);
    }

    public NewsAdapter(List<NewsModel> newsList, OnNewsClickListener listener) {
        this.newsList = newsList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemnewsBinding binding = ItemnewsBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new NewsViewHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.NewsViewHolder holder, int position) {
        NewsModel newsModel = newsList.get(position);
        holder.bind(newsModel);
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    static class NewsViewHolder extends RecyclerView.ViewHolder {

        private ItemnewsBinding binding;

        public NewsViewHolder(ItemnewsBinding binding, OnNewsClickListener listener) {
            super(binding.getRoot());
            this.binding = binding;

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    NewsModel clickedNewsModel = newsList.get(position);
                    listener.onNewsClick(clickedNewsModel);
                }
            });
        }

        public void bind(NewsModel newsModel) {
            binding.imgUser.setImageResource(newsModel.getImageResourceId());
            binding.newsTitle.setText(newsModel.getTitle());
            binding.newsAuthorLocation.setText(newsModel.getAuthorLocation());
            binding.newsDescription.setText(newsModel.getDescription());
        }
    }
}