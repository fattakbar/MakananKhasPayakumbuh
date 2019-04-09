package com.zendev.gelamaitiara.fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.zendev.gelamaitiara.R;

public class HomeFragment extends Fragment {

    View view;
    Button btnWa;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        btnWa = view.findViewById(R.id.btn_contact);

        btnWa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendWhatsapp(view);
            }
        });
        return view;
    }

    public void sendWhatsapp(View view){
        try {
            String text = "Halo Admin, Saya Ingin Melakukan Pemesanan";
            String number = "6285278870436";

            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("http://api.whatsapp.com/send?phone="+number + "&text="+text));
            startActivity(intent);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}