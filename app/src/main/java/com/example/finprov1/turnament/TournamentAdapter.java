package com.example.finprov1.turnament;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemTournamentBinding;

import java.util.ArrayList;
import java.util.List;

public class TournamentAdapter extends RecyclerView.Adapter<TournamentAdapter.ViewHolder> {

    List<TournamentModel> listTournament = new ArrayList<>();

    void setData(List<TournamentModel> listTournament) {
        this.listTournament.clear();
        this.listTournament.addAll(listTournament);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public TournamentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_tournament, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull TournamentAdapter.ViewHolder holder, int position) {
        TournamentModel tournamentModel = listTournament.get(position);
        holder.bindData(tournamentModel);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, TournametDetail.class);
                intent.putExtra("tournamentmodel", tournamentModel);
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return listTournament.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemTournamentBinding binding;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemTournamentBinding.bind(itemView);

        }

        public void bindData(TournamentModel tournamentModel) {
            binding.imgTrItem.setImageResource(tournamentModel.getGambar());
            binding.juduTrItem.setText(tournamentModel.getNameTournament());
            binding.kotaPfItem.setText(tournamentModel.getKota());
            binding.hargaTrItem.setText(tournamentModel.getPrice());

        }
    }
}
