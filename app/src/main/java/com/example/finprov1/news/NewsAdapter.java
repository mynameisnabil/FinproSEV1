package com.example.finprov1.news;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;

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
        View view = View.inflate(parent.getContext(), R.layout.itemnews, null);
        return new NewsViewHolder(view, listener);
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

        ImageView newsImage;
        TextView newsTitle;
        TextView newsAuthorLocation;
        TextView newsDescription;

        public NewsViewHolder(@NonNull View itemView, OnNewsClickListener listener) {
            super(itemView);
            newsImage = itemView.findViewById(R.id.imgUser);
            newsTitle = itemView.findViewById(R.id.news_title);
            newsAuthorLocation = itemView.findViewById(R.id.news_author_location);
            newsDescription = itemView.findViewById(R.id.news_description);

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    NewsModel clickedNewsModel = newsList.get(position);
                    listener.onNewsClick(clickedNewsModel);
                }
            });
        }

        public void bind(NewsModel newsModel) {
            newsImage.setImageResource(newsModel.getImageResourceId());
            newsTitle.setText(newsModel.getTitle());
            newsAuthorLocation.setText(newsModel.getAuthorLocation());
            newsDescription.setText(newsModel.getDescription());
        }
    }
}
