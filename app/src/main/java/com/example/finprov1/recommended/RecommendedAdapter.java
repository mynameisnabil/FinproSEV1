package com.example.finprov1.recommended;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemRecommendedBinding;

import java.util.ArrayList;
import java.util.List;

public class RecommendedAdapter extends RecyclerView.Adapter<RecommendedAdapter.ViewHolder> {

    List<RecommendedModel> listRecommended = new ArrayList<>();

    void setData(List<RecommendedModel> listRecomended) {
        this.listRecommended.clear();
        this.listRecommended.addAll(listRecomended);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecommendedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recommended, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecommendedAdapter.ViewHolder holder, int position) {
        RecommendedModel recommendedModel = listRecommended.get(position);
        holder.bindData(recommendedModel);

    }

    @Override
    public int getItemCount() {
        return listRecommended.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecommendedBinding binding;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemRecommendedBinding.bind(itemView);
        }

        public void bindData(RecommendedModel recommendedModel) {
            binding.imgRecom.setImageResource(recommendedModel.getGambar());
            binding.txtRecomJudul.setText(recommendedModel.getJudul());
            binding.txtRecomSubJudul.setText(recommendedModel.getSubjudul());
        }
    }
}
