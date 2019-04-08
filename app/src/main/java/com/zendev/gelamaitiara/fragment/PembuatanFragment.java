package com.zendev.gelamaitiara.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zendev.gelamaitiara.R;

public class PembuatanFragment extends Fragment {

    View view;

    public PembuatanFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pembuatan, container, false);
        return view;
    }
}