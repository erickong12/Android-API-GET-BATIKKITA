package com.example.a1822250025ericagustianwinardi.Adapter;
//eric agustian winardi 1822250025
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a1822250025ericagustianwinardi.DetailActivity;
import com.example.a1822250025ericagustianwinardi.Model.Hasil;
import com.example.a1822250025ericagustianwinardi.R;

import java.util.List;

public class BatikAdapter extends RecyclerView.Adapter<BatikAdapter.MyViewHolder>{
    List<Hasil> list;

    public BatikAdapter(List<Hasil> hasilList) {
        list = hasilList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder (ViewGroup parent, int viewType){
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.batik_list, parent, false);
        return new MyViewHolder(mView);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder (MyViewHolder holder,final int position){
        holder.textId.setText("Id = " + list.get(position).getId());
        holder.textName.setText("Nama = " + list.get(position).getNama_batik());
        holder.textDaerah.setText("Daerah = " + list.get(position).getDaerah_batik());
        holder.textMin.setText("Terendah = " + list.get(position).getHarga_rendah());
        holder.textMax.setText("Tertinggi = " + list.get(position).getHarga_tinggi());
        holder.itemView.setOnClickListener(view -> {
            Intent mIntent = new Intent(view.getContext(), DetailActivity.class);
            mIntent.putExtra("Id", list.get(position).getId());
            mIntent.putExtra("Nama", list.get(position).getNama_batik());
            mIntent.putExtra("Daerah", list.get(position).getDaerah_batik());
            mIntent.putExtra("Makna", list.get(position).getMakna_batik());
            mIntent.putExtra("Min", list.get(position).getHarga_rendah());
            mIntent.putExtra("Max", list.get(position).getHarga_tinggi());
            view.getContext().startActivity(mIntent);
        });
    }

    @Override
    public int getItemCount () {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView textId, textName, textDaerah,textMin,textMax;

        public MyViewHolder(View itemView) {
            super(itemView);
            textId = itemView.findViewById(R.id.tvId);
            textName = itemView.findViewById(R.id.tvNama);
            textDaerah = itemView.findViewById(R.id.tvDaerah);
            textMin = itemView.findViewById(R.id.tvMin);
            textMax = itemView.findViewById(R.id.tvMax);
        }
    }
}
