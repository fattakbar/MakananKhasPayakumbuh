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
import com.zendev.gelamaitiara.data.Food;
import com.zendev.gelamaitiara.R;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.CategoryViewHolder> {

    private Context context;
    private ArrayList<Food> listFood;

    public ListFoodAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Food> getListFood() {
        return listFood;
    }

    public void setListFood(ArrayList<Food> listFood) {
        this.listFood = listFood;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_food, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, final int i) {
        categoryViewHolder.tvName.setText(getListFood().get(i).getName());
        categoryViewHolder.tvFood.setText(getListFood().get(i).getFood());

        Glide.with(context)
                .load(getListFood().get(i).getImage())
                .apply(new RequestOptions().override(55,55))
                .into(categoryViewHolder.imgPhoto);

        categoryViewHolder.parentFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Kamu Memilih " + getListFood().get(i).getName(), Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return getListFood().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvFood;
        ImageView imgPhoto;
        RelativeLayout parentFood;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            parentFood = itemView.findViewById(R.id.parent_food);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFood = itemView.findViewById(R.id.tv_item_food);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}

