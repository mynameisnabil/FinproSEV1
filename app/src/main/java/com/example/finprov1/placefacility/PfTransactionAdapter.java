package com.example.finprov1.placefacility;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemPftransaksiBinding;

import java.util.ArrayList;
import java.util.List;

public class PfTransactionAdapter extends RecyclerView.Adapter<PfTransactionAdapter.ViewHolder> {

    List<PfTransaction> listTransaksi = new ArrayList<>();

    public void setData(List<PfTransaction> listTransaksi) {
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
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PfTransaction pftransaksi = listTransaksi.get(position);
        holder.bindData(pftransaksi);
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
            binding.juduPfItemTransaksi.setText(pftransaksi.judulLapang);
            binding.kotaPfItemTransaksi.setText(pftransaksi.kotaLapang);
            binding.hargaPfItemTransaksi.setText(pftransaksi.hargaLapang);
        }
    }
}
