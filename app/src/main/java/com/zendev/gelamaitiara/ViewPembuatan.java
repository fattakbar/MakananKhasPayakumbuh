package com.zendev.gelamaitiara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewPembuatan extends AppCompatActivity {

    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_IMG = "extra_img";
    public static final String EXTRA_KOMPOSISI = "extra_komposisi";
    public static final String EXTRA_CARA = "extra_cara";
    public static final String EXTRA_KATEGORI = "extra_kategori";

    TextView tvNama, tvKomposisi, tvCara, tvKategori;
    ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pembuatan);

        tvNama = findViewById(R.id.tv_nama);
        ivGambar = findViewById(R.id.iv_gambar);
        tvCara = findViewById(R.id.tv_cara);
        tvKomposisi = findViewById(R.id.tv_komposisi);
        tvKategori = findViewById(R.id.tv_kategori);

        String nama = getIntent().getStringExtra(EXTRA_NAME);
        String komposisi = getIntent().getStringExtra(EXTRA_KOMPOSISI);
        String cara = getIntent().getStringExtra(EXTRA_CARA);
        String kategori = getIntent().getStringExtra(EXTRA_KATEGORI);

        tvNama.setText(nama);
        tvCara.setText(cara);
        tvKomposisi.setText(komposisi);
        tvKategori.setText(kategori);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_IMG))
                .into(ivGambar);
    }
}
