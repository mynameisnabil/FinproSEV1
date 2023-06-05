package com.example.finprov1.placefacility;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItempfBinding;

import java.util.ArrayList;
import java.util.List;

public class Pfadapter extends RecyclerView.Adapter<Pfadapter.ViewHoder> {

    List<Pfmodel> listPf = new ArrayList<>();

    void setData(List<Pfmodel> listPf) {
        this.listPf.clear();
        this.listPf.addAll(listPf);
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public Pfadapter.ViewHoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.itempf, parent, false);
        return new ViewHoder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Pfadapter.ViewHoder holder, int position) {
        Pfmodel pfmodel = listPf.get(position);
        holder.bindData(pfmodel);


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, DetailPfActivity.class);
                intent.putExtra("pfmodel", pfmodel);
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return listPf.size();
    }

    public class ViewHoder extends RecyclerView.ViewHolder {
        ItempfBinding binding;

        public ViewHoder(@NonNull View itemView) {
            super(itemView);
            binding = ItempfBinding.bind(itemView);
        }

        public void bindData(Pfmodel data) {
            binding.imgPfItem.setImageResource(data.getGambar());
            binding.juduPfItem.setText(data.getNamalapangan());
            binding.kotaPfItem.setText(data.getKota());
            binding.hargaPfItem.setText(data.getPrice());


        }
    }
}
