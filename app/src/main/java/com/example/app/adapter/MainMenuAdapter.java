package com.example.app.adapter;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import com.example.app.R;
import com.example.app.entity.Menu;

import java.util.List;

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuViewHolder> {

    protected Context context;
    protected List<Menu> menus;

    public MainMenuAdapter(Context context, List<Menu> menus) {
        this.context = context;
        this.menus = menus;
    }


    @NonNull
    @Override
    public MainMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainMenuViewHolder(LayoutInflater.from(context).inflate(R.layout.item_main_menu,null));
    }

    @Override
    public void onBindViewHolder(@NonNull MainMenuViewHolder holder, int position) {
        Menu menu  = menus.get(position);
        holder.imageView.setImageResource(menu.icon);
        holder.textView.setText(menu.menuName);
    }

    @Override
    public int getItemCount() {
        return menus != null? menus.size() :0;
    }
}
class MainMenuViewHolder extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public TextView textView;

    public MainMenuViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img_menu_icon);
        textView = itemView.findViewById(R.id.img_menu_text);
    }
}
