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
import com.zendev.gelamaitiara.data.Food;

public class ViewFood extends AppCompatActivity {

    public static final String EXTRA_FOOD = "extra_food";
    public static final String EXTRA_DESKRIPSI = "extra_deskripsi";
    public static final String EXTRA_CATEGORY = "extra_category";
    public static final String EXTRA_PRICE = "extra_price";
    public static final String EXTRA_IMG = "extra_img";

    TextView tvNama, tvDeskripsi, tvKategori, tvHarga;
    ImageView ivGambar;
    Button btnBeli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food);

        tvNama = findViewById(R.id.tv_nama);
        tvDeskripsi = findViewById(R.id.tv_deskripsi);
        tvKategori = findViewById(R.id.tv_kategori);
        tvHarga = findViewById(R.id.tv_harga);
        ivGambar = findViewById(R.id.iv_gambar);
        btnBeli = findViewById(R.id.btn_beli);

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendWhatsapp(view);
            }
        });

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

    public void sendWhatsapp(View view){
        String food = getIntent().getStringExtra(EXTRA_FOOD);
        try {
            String text = "Halo Admin, Saya Ingin Melakukan Pemesanan "+ food;
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
