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
import com.zendev.gelamaitiara.adapter.ListPembuatanAdapter;
import com.zendev.gelamaitiara.data.Food;
import com.zendev.gelamaitiara.data.FoodData;
import com.zendev.gelamaitiara.data.Pembuatan;
import com.zendev.gelamaitiara.data.PembuatanData;

import java.util.ArrayList;

public class PembuatanFragment extends Fragment {

    View view;
    private RecyclerView rvPembuatan;
    private ArrayList<Pembuatan> list =  new ArrayList<>();

    public PembuatanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pembuatan, container, false);

        list.clear();
        list.addAll(PembuatanData.getListData());

        rvPembuatan = view.findViewById(R.id.rv_make);

        showDataPembuatan();

        return view;
    }

    private void showDataPembuatan(){
        rvPembuatan.setLayoutManager(new LinearLayoutManager(getContext()));
        ListPembuatanAdapter listPembuatanAdapter = new ListPembuatanAdapter(getContext());
        listPembuatanAdapter.setListPembuatan(list);
        rvPembuatan.setAdapter(listPembuatanAdapter);

        rvPembuatan.setHasFixedSize(true);
    }
}