package com.example.jh.proto;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

        Button commitButton = findViewById(R.id.menu_commit_button);
        commitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.sendMessage(1);
            }
        });

    }


    List<Menu> getDefaultList(){
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        menuList.add(new Menu("야심찬 술안주 불족발","₩ 1500","512 Kcal"));
        return menuList;
    }
}
