package com.zendev.gelamaitiara;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zendev.gelamaitiara.adapter.ViewPagerAdapter;
import com.zendev.gelamaitiara.fragment.HomeFragment;
import com.zendev.gelamaitiara.fragment.PembuatanFragment;
import com.zendev.gelamaitiara.fragment.ProdukFragment;
import com.zendev.gelamaitiara.fragment.TentangFragment;

public class MainActivity extends AppCompatActivity {

    AppBarLayout appBarLayout;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appBarLayout = findViewById(R.id.appbar_id);
        viewPager = findViewById(R.id.viewpager_id);
        tabLayout = findViewById(R.id.tablayout_id);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new HomeFragment(), "Home");
        adapter.addFragment(new ProdukFragment(), "Produk");
        adapter.addFragment(new PembuatanFragment(), "Pembuatan");
        adapter.addFragment(new TentangFragment(), "Tentang");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
