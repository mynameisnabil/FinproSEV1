package com.example.finprov1.latestupdates;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemLatestupdatesBinding;

import java.util.ArrayList;
import java.util.List;

public class LatestUpdatesAdapter extends RecyclerView.Adapter<com.example.finprov1.latestupdates.LatestUpdatesAdapter.ViewHolder> {

    List<LatestUpdatesModel> listLatestUpdates = new ArrayList<>();

    public void setData(List<LatestUpdatesModel> list) {
        this.listLatestUpdates.clear();
        this.listLatestUpdates.addAll(list);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public com.example.finprov1.latestupdates.LatestUpdatesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_latestupdates, parent, false);
        return new com.example.finprov1.latestupdates.LatestUpdatesAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull com.example.finprov1.latestupdates.LatestUpdatesAdapter.ViewHolder holder, int position) {
        LatestUpdatesModel latestUpdatesModel = listLatestUpdates.get(position);
        holder.bindData(latestUpdatesModel);

    }

    @Override
    public int getItemCount() {
        return listLatestUpdates.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemLatestupdatesBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemLatestupdatesBinding.bind(itemView);
        }

        public void bindData(LatestUpdatesModel latestUpdatesModel) {
            binding.imgLatest.setImageResource(latestUpdatesModel.getGambar());
            binding.txtLatestJudul.setText(latestUpdatesModel.getJudul());
            binding.txtLatestSubJudul.setText(latestUpdatesModel.getSubjudul());
        }
    }
}

