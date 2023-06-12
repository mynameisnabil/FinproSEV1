package com.example.finprov1.training;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemTrainingBinding;

import java.util.ArrayList;
import java.util.List;

public class TrainigAdapter extends RecyclerView.Adapter<TrainigAdapter.ViewHolder> {

    List<TrainingModel> listTraining = new ArrayList<>();

    void setData(List<TrainingModel> listTraining) {
        this.listTraining.clear();
        this.listTraining.addAll(listTraining);
        notifyDataSetChanged();
    }



    @NonNull
    @Override
    public TrainigAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_training, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TrainigAdapter.ViewHolder holder, int position) {
        TrainingModel trainingModel = listTraining.get(position);
        holder.bindData(trainingModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, TrainingAndOnlineDetail.class);
                intent.putExtra("trainingmodel", trainingModel);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listTraining.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemTrainingBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemTrainingBinding.bind(itemView);

        }

        public void bindData(TrainingModel trainingModel) {
            binding.imgTOItem.setImageResource(trainingModel.getGambar());
            binding.juduTOItem.setText(trainingModel.getNameTraining());
            binding.kotaTOItem.setText(trainingModel.getKota());
            binding.hargaTOItem.setText(trainingModel.getPrice());
        }
    }
}
