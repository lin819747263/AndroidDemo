package com.example.app.util;

import android.content.Context;
import android.widget.ImageView;

import com.example.app.entity.Menu;

import java.util.ArrayList;
import java.util.List;

public class DataUtil {
    public static List<ImageView> getHeaderAddInfo(Context context,int[] icons){
        List<ImageView> data = new ArrayList<>();
        for (int i = 0; i< icons.length; i++) {
            ImageView icon = new ImageView(context);
            icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
            icon.setImageResource(icons[i]);
            data.add(icon);

        }

        return data;
    }

    public static List<Menu> getMainMenu(int[] icons, String[] names){
        List<Menu> list = new ArrayList<>();
        for(int i = 0;i< icons.length ; i++){
            Menu menu = new Menu(icons[i],names[i]);
            list.add(menu);
        }
        return list;
    }
}
