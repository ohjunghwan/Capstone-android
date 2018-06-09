package com.example.jh.proto;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MenuActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        RecyclerView recyclerView = findViewById(R.id.menu_recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this,2);
        MenuAdapter adapter = new MenuAdapter(getDefaultList());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }
    List<Menu> getDefaultList(){

        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        menuList.add(new Menu("1","2"));
        return menuList;
    }
}
