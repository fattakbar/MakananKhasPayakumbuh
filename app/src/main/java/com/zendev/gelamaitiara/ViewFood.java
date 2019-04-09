package com.zendev.gelamaitiara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewFood extends AppCompatActivity {

    public static final String EXTRA_FOOD = "extra_food";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_CATEGORY = "extra_category";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_IMG = "extra_img";

    TextView tvNama, tvDeskripsi, tvKategori, tvHarga;
    ImageView ivGambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food);

        tvNama = findViewById(R.id.tv_nama);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvKategori = findViewById(R.id.tv_kategori);
        tvHarga = findViewById(R.id.tv_harga);
        ivGambar = findViewById(R.id.iv_gambar);

        String deskripsi = getIntent().getStringExtra(EXTRA_DESKRIPSI);
        String food = getIntent().getStringExtra(EXTRA_FOOD);
        String kategori = getIntent().getStringExtra(EXTRA_CATEGORY);
        String harga = getIntent().getStringExtra(EXTRA_PRICE);

        tvNama.setText(food);
        tvDeskripsi.setText(deskripsi);
        tvKategori.setText(kategori);
        tvHarga.setText(harga);

        Glide.with(this)
                .load(getIntent().getStringExtra(EXTRA_IMG))
                .into(ivGambar);
    }
}
