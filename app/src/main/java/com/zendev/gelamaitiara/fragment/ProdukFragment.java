package com.zendev.gelamaitiara.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zendev.gelamaitiara.R;
import com.zendev.gelamaitiara.adapter.ListFoodAdapter;
import com.zendev.gelamaitiara.data.Food;
import com.zendev.gelamaitiara.data.FoodData;

import java.util.ArrayList;

public class ProdukFragment extends Fragment {

    View view;
    private RecyclerView rvFood;
    private ArrayList<Food> list =  new ArrayList<>();

    public ProdukFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_produk, container, false);

        list.clear();
        list.addAll(FoodData.getListData());

        rvFood = view.findViewById(R.id.rv_food);

        showData();

        return view;
    }

    private void showData(){
        rvFood.setLayoutManager(new LinearLayoutManager(getContext()));
        ListFoodAdapter listFoodAdapter = new ListFoodAdapter(getContext());
        listFoodAdapter.setListFood(list);
        rvFood.setAdapter(listFoodAdapter);

        rvFood.setHasFixedSize(true);
    }
}