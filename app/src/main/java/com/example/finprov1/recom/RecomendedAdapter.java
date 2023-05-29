package com.example.finprov1.recom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemRecomBinding;
import com.example.finprov1.databinding.ItempfBinding;

import java.util.ArrayList;
import java.util.List;

public class RecomendedAdapter extends RecyclerView.Adapter<RecomendedAdapter.ViewHolder> {

    List<RecomendedModel> listRecomended = new ArrayList<>();

    void setData(List<RecomendedModel> listRecomended) {
        this.listRecomended.clear();
        this.listRecomended.addAll(listRecomended);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public RecomendedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recom, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecomendedAdapter.ViewHolder holder, int position) {
        RecomendedModel recomendedModel = listRecomended.get(position);
        holder.bindData(recomendedModel);

    }

    @Override
    public int getItemCount() {
        return listRecomended.size();

    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemRecomBinding binding;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemRecomBinding.bind(itemView);
        }

        public void bindData(RecomendedModel recomendedModel) {
            binding.imgRecom.setImageResource(recomendedModel.getGambar());
            binding.txtRecomJudul.setText(recomendedModel.getJudul());
            binding.txtRecomSubJudul.setText(recomendedModel.getSubjudul());
        }
    }
}
