package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.app.fragment.FindFragment;
import com.example.app.fragment.MainFragment;
import com.example.app.fragment.MeFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    protected LinearLayout mMenuMain;
    protected LinearLayout mMenuFind;
    protected LinearLayout mMenuMe;
    protected MainFragment mainFragment = new MainFragment();
    protected FindFragment findFragment = new FindFragment();
    protected MeFragment meFragment = new MeFragment();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        this.getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.container_content, mainFragment)
                .add(R.id.container_content, findFragment)
                .hide(findFragment)
                .add(R.id.container_content, meFragment)
                .hide(meFragment)
                .commit();

    }

    public void initView(){
        mMenuMain = this.findViewById(R.id.menu_main);
        mMenuFind = this.findViewById(R.id.menu_find);
        mMenuMe = this.findViewById(R.id.menu_me);
        mMenuMain.setOnClickListener(this);
        mMenuFind.setOnClickListener(this);
        mMenuMe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_main:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .show(mainFragment)
                        .hide(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
            case R.id.menu_find:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mainFragment)
                        .show(findFragment)
                        .hide(meFragment)
                        .commit();
                break;
            case R.id.menu_me:
                this.getSupportFragmentManager()
                        .beginTransaction()
                        .hide(mainFragment)
                        .hide(findFragment)
                        .show(meFragment)
                        .commit();
                break;
        }

    }
}
