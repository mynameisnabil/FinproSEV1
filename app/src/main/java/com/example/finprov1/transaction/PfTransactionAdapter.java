package com.example.finprov1.transaction;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemPftransaksiBinding;
import com.example.finprov1.placefacility.DetailPfActivity;
import com.example.finprov1.placefacility.Pfadapter;

import java.util.ArrayList;
import java.util.List;

public class PfTransactionAdapter extends RecyclerView.Adapter<PfTransactionAdapter.ViewHolder> {

    List<PfTransaction> listTransaksi = new ArrayList<>();

    void setData(List<PfTransaction> listTransaksi) {
        this.listTransaksi.clear();
        this.listTransaksi.addAll(listTransaksi);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pftransaksi, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PfTransactionAdapter.ViewHolder holder, int position) {
        PfTransaction pftransaction = listTransaksi.get(position);
        holder.bindData(pftransaction);

        //buat intent pindah ke detail
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent (context, DetailTransaction.class);
                intent.putExtra("pftransaction", pftransaction);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listTransaksi.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemPftransaksiBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemPftransaksiBinding.bind(itemView);
        }

        public void bindData(PfTransaction pftransaksi) {
            binding.imgPfItem.setImageResource(pftransaksi.gambar);
            binding.juduPfItemTransaksi.setText(pftransaksi.judulLapang);
            binding.kotaPfItemTransaksi.setText(pftransaksi.kotaLapang);
            binding.hargaPfItemTransaksi.setText(pftransaksi.hargaLapang);
        }

//        buat intent ke detail


    }
}
