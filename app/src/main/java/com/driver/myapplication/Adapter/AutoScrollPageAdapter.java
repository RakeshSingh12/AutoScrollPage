package com.driver.myapplication.Adapter;
import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

;
import androidx.viewpager.widget.PagerAdapter;

import com.driver.myapplication.R;
import com.driver.myapplication.helpers.AppUtilis;
import com.driver.myapplication.model.AppConfigurationModel;
import com.driver.myapplication.model.HomeDataBean;

import java.util.ArrayList;
import java.util.List;


public class AutoScrollPageAdapter extends PagerAdapter {
    Context context;
    LayoutInflater inflater;
    ArrayList<HomeDataBean.Offer> list;

    public AutoScrollPageAdapter(Context context,ArrayList<HomeDataBean.Offer> list) {
        this.context = context;
        this.list = list;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = inflater.inflate(R.layout.slider_item, container, false);
        ImageView imgSlider = (ImageView) itemView.findViewById(R.id.imgSlider);
        AppUtilis.setImagePicasso(context,imgSlider,list.get(position).getImage());


        container.addView(itemView);
        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}