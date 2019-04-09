package com.zendev.gelamaitiara.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.zendev.gelamaitiara.R;
import com.zendev.gelamaitiara.data.Pembuatan;

import java.util.ArrayList;

public class ListPembuatanAdapter extends RecyclerView.Adapter<ListPembuatanAdapter.MyViewHolder> {

    private Context context;
    private ArrayList<Pembuatan> listPembuatan;

    public ListPembuatanAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Pembuatan> getListPembuatan() {
        return listPembuatan;
    }

    public void setListPembuatan(ArrayList<Pembuatan> listPembuatan) {
        this.listPembuatan = listPembuatan;
    }

    @NonNull
    @Override
    public ListPembuatanAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_pembuatan, viewGroup, false);
        return new ListPembuatanAdapter.MyViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull ListPembuatanAdapter.MyViewHolder myViewHolder, final int i) {
        myViewHolder.tvName.setText(getListPembuatan().get(i).getName());
        myViewHolder.tvPembuatan.setText(getListPembuatan().get(i).getPembuatan());

        Glide.with(context)
                .load(getListPembuatan().get(i).getImage())
                .apply(new RequestOptions().override(55,55))
                .into(myViewHolder.imgPhoto);

        myViewHolder.parentPembuatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Kamu Memilih " + getListPembuatan().get(i).getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListPembuatan().size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvName;
        TextView tvPembuatan;
        ImageView imgPhoto;
        RelativeLayout parentPembuatan;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            parentPembuatan = itemView.findViewById(R.id.parent_pembuatan);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvPembuatan = itemView.findViewById(R.id.tv_item_make);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
