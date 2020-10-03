package com.example.androidsupportdesign25082020;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRcvBanner,mRcvProduct;
    BannerAdapter mBannerAdapter;
    List<Banner> mBannerList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRcvBanner = findViewById(R.id.recyclerViewBanner);
        mRcvProduct = findViewById(R.id.recyclerViewProduct);

        mBannerList = new ArrayList<>();
        mBannerList.add(new Banner(R.drawable.phim_rom));
        mBannerList.add(new Banner(R.drawable.phim_chan_to_phieu_luu_ky));
        mBannerList.add(new Banner(R.drawable.phim_dinh_thu_xac_song));
        mBannerList.add(new Banner(R.drawable.phim_muon_xac));
        mBannerList.add(new Banner(R.drawable.phim_phong_thu_dia_cau));
        mBannerAdapter = new BannerAdapter(mBannerList);

        mRcvProduct.setAdapter(mBannerAdapter);
        mRcvBanner.setAdapter(mBannerAdapter);
    }
}