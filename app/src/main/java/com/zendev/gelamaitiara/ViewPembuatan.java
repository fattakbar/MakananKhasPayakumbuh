package com.zendev.gelamaitiara;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewPembuatan extends AppCompatActivity{

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_KOMPOSISI = "extra_komposisi";
    public static final String EXTRA_CARA = "extra_cara";
    public static final String EXTRA_KATEGORI = "extra_kategori";

    TextView tvNama, tvKomposisi, tvCara, tvKategori;
    ImageView ivGambar;
    Button btnBeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pembuatan);

        tvNama = findViewById(R.id.tv_nama);
        ivGambar = findViewById(R.id.iv_gambar);
        tvCara = findViewById(R.id.tv_cara);
        tvKomposisi = findViewById(R.id.tv_komposisi);
        tvKategori = findViewById(R.id.tv_kategori);
        btnBeli = findViewById(R.id.btn_pesan);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String komposisi = getIntent().getStringExtra(EXTRA_KOMPOSISI);
        String cara = getIntent().getStringExtra(EXTRA_CARA);
        String kategori = getIntent().getStringExtra(EXTRA_KATEGORI);

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendWhatsapp(view);
            }
        });

        tvNama.setText(nama);
        tvCara.setText(cara);
        tvKomposisi.setText(komposisi);
        tvKategori.setText(kategori);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_IMG))
                .into(ivGambar);

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
