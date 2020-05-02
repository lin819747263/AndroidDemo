package com.example.app.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import java.util.List;

public class MainHeaderAdAdapter extends PagerAdapter {
    protected Context context;
    protected List<ImageView> imageViews;

    public MainHeaderAdAdapter(Context context, List<ImageView> imageViews) {
        this.context = context;
        this.imageViews = imageViews;
    }

    @Override
    public int getCount() {
        return null!= imageViews?imageViews.size():0;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(imageViews.get(position));
        return imageViews.get(position);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(imageViews.get(position));
    }
}
