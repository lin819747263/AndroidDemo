package com.example.app.fragment;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.app.R;
import com.example.app.adapter.MainHeaderAdAdapter;
import com.example.app.adapter.MainMenuAdapter;
import com.example.app.util.DataUtil;


public class MainFragment extends Fragment {

    protected ViewPager viewPager;

    protected int[] icons = {R.mipmap.header_pic_ad1,R.mipmap.header_pic_ad2};

    protected int[] menuIcons = {R.mipmap.menu_airport,R.mipmap.menu_car,
            R.mipmap.menu_course,R.mipmap.menu_hatol,
            R.mipmap.menu_nearby,R.mipmap.me_menu_go,
    R.mipmap.menu_ticket,R.mipmap.menu_train};
    protected String[] menu;

    protected RecyclerView recyclerView;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        menu = this.getActivity().getResources().getStringArray(R.array.main_menu);

        viewPager = getView().findViewById(R.id.view_page_header_ad);
        recyclerView = getView().findViewById(R.id.recyclerview_main_menu);

        MainHeaderAdAdapter adapter = new MainHeaderAdAdapter(getActivity(), DataUtil.getHeaderAddInfo(getActivity(),icons));
        viewPager.setAdapter(adapter);

        //菜单
        //布局样式
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(),4));
        MainMenuAdapter mainMenuAdapter=new MainMenuAdapter(getActivity(),DataUtil.getMainMenu(menuIcons,menu));
        recyclerView.setAdapter(mainMenuAdapter);
    }
}
