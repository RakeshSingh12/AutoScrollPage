package com.driver.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.driver.myapplication.Adapter.AutoScrollPageAdapter;
import com.driver.myapplication.databinding.ActivityMainBinding;
import com.driver.myapplication.model.AppConfigurationModel;
import com.driver.myapplication.model.HomeDataBean;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //private ArrayList<HomeDataBean.Offer> bannerList=new ArrayList();
    private HomeDataBean.Offer appConfigurationModel;
   // private List<HomeDataBean.Offer> list;
   private ArrayList<HomeDataBean.Offer> bannerList=new ArrayList<>();
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSliderOnViewPager();



    }

    //****************Auto slider pager****************//
    private void setSliderOnViewPager() {
       // bannerList.addAll(appConfigurationModel.getImage());
        AutoScrollPageAdapter myAdapter = new AutoScrollPageAdapter(MainActivity.this, bannerList);
        if (myAdapter == null){
            binding.viewPagerSlider.setAdapter(myAdapter);
        }

        //initIndicator();
        binding.viewPagerSlider.startAutoScroll(5000);
        binding.viewPagerSlider.setInterval(5000);
    }

}
