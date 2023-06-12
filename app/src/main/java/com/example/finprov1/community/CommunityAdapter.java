package com.example.finprov1.community;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.databinding.ItemCommunityBinding;

import java.util.List;

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.CommunityViewHolder> {

    private static List<CommunityModel> communityList;

    private OnCommunityClickListener listener;

    public interface OnCommunityClickListener {
        void onCommunityClick(CommunityModel communityModel);
    }

    public CommunityAdapter(List<CommunityModel> communityList, OnCommunityClickListener listener) {
        this.communityList = communityList;
        this.listener = listener;
    }




    @NonNull
    @Override
    public CommunityAdapter.CommunityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ItemCommunityBinding binding = ItemCommunityBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new CommunityViewHolder(binding, listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CommunityAdapter.CommunityViewHolder holder, int position) {
        CommunityModel communityModel = communityList.get(position);
        holder.bind(communityModel);
    }

    @Override
    public int getItemCount() {

        return communityList.size();
    }

    public class CommunityViewHolder extends RecyclerView.ViewHolder {

        private ItemCommunityBinding binding;

        public CommunityViewHolder(ItemCommunityBinding binding, OnCommunityClickListener listener) {
            super(binding.getRoot());
            this.binding = binding;

            itemView.setOnClickListener(v -> {
                int position = getAdapterPosition();
                if (listener != null && position != RecyclerView.NO_POSITION) {
                    CommunityModel clickedCommunityModel = communityList.get(position);
                    listener.onCommunityClick(clickedCommunityModel);
                }
            });
        }


        public void bind(CommunityModel communityModel) {
            binding.imgItemCom.setImageResource(communityModel.getImageResourceId());
            binding.itemCommunityTittle.setText(communityModel.getTitle());
            binding.itemCommunityAuthorLocation.setText(communityModel.getAuthor_location());
            binding.itemCommunityDescription.setText(communityModel.getDescription());
        }
    }
}
