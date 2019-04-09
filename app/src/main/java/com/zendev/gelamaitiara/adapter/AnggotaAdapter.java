package com.zendev.gelamaitiara.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.zendev.gelamaitiara.R;
import com.zendev.gelamaitiara.data.Anggota;

import java.util.ArrayList;

public class AnggotaAdapter extends RecyclerView.Adapter<AnggotaAdapter.MyViewHolder> {

    private ArrayList<Anggota> anggotaList;

    public AnggotaAdapter(Context context) {
        this.context = context;
    }

    private Context context;

    public AnggotaAdapter(Context context, ArrayList<Anggota> anggotaList) {
        this.anggotaList = anggotaList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View view = layoutInflater.inflate(R.layout.list_item, viewGroup, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        final Anggota anggota = anggotaList.get(i);

        myViewHolder.idcx.setText(anggotaList.get(i).getIdcx());
        myViewHolder.nama.setText(anggotaList.get(i).getNama());
        myViewHolder.divisi.setText(anggotaList.get(i).getDivisi());

        myViewHolder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Kamu Memilih " + anggota.getNama(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return anggotaList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nama, idcx, divisi;
        CardView parent;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nama = itemView.findViewById(R.id.tv_nama);
            idcx = itemView.findViewById(R.id.tv_idcx);
            divisi = itemView.findViewById(R.id.tv_divisi);
            parent = itemView.findViewById(R.id.parent);
        }
    }
}

