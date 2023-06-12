package com.example.finprov1.community;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.finprov1.R;
import com.example.finprov1.databinding.ItemCommunityBinding;

import java.util.ArrayList;
import java.util.List;

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.ViewHolder>{

    List<CommunityModel> listCommunity = new ArrayList<>();

    void setData(List<CommunityModel> listCommunity) {
        this.listCommunity.clear();
        this.listCommunity.addAll(listCommunity);
        notifyDataSetChanged();
    }




    @NonNull
    @Override
    public CommunityAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_community, parent, false);
        return new ViewHolder(v);

    }

    @Override
    public void onBindViewHolder(@NonNull CommunityAdapter.ViewHolder holder, int position) {
        CommunityModel communityModel = listCommunity.get(position);
        holder.bindData(communityModel);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = holder.itemView.getContext();
                Intent intent = new Intent(context, CommunityDetail.class);
                intent.putExtra("communitymodel", communityModel);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {

        return listCommunity.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemCommunityBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemCommunityBinding.bind(itemView);

        }

        public void bindData(CommunityModel communityModel) {
            binding.imgItemCom.setImageResource(communityModel.getGambar());
            binding.itemCommunityTittle.setText(communityModel.getNameCommunity());
            binding.itemCommunityAuthorLocation.setText(communityModel.getNamaContactCommunity());
            binding.itemCommunityDescription.setText(communityModel.getDeskripsi());
        }
    }
}
