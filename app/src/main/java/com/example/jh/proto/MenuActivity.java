package com.example.jh.proto;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MenuActivity extends Activity {
    static int count = 0;
    static TextView textView = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        RecyclerView recyclerView = findViewById(R.id.menu_recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        MenuAdapter adapter = new MenuAdapter(getDefaultList());
        recyclerView.setAdapter(adapter);
        textView = findViewById(R.id.menu_cart);
        recyclerView.setLayoutManager(layoutManager);
        Button commitButton = findViewById(R.id.menu_commit_button);
        commitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog();
            }
        });

    }


    List<Menu> getDefaultList() {
        List<Menu> menuList = new ArrayList<>();
        menuList.add(new Menu("너구리", "₩ 800", "312 Kcal", R.drawable.nuguri));
        menuList.add(new Menu("닭달버거", "₩ 2000", "352 Kcal", R.drawable.b));
        menuList.add(new Menu("치즈 소시지 김밤&유부초밥", "₩ 2900", "342 Kcal", R.drawable.c));
        menuList.add(new Menu("뉴 정통 함박 스테이크", "₩ 4500", "532 Kcal", R.drawable.d));
        menuList.add(new Menu("더 커진 참치마요 덮밥", "₩ 3500", "432 Kcal", R.drawable.e));
        menuList.add(new Menu("에그&참치김치 덮밥", "₩ 3300", "422 Kcal", R.drawable.f));
        menuList.add(new Menu("충무 김밥", "₩ 2900", "312 Kcal", R.drawable.g));
        menuList.add(new Menu("햄 치즈 크로아상 샌드", "₩ 2800", "422 Kcal", R.drawable.h));
        menuList.add(new Menu("숯불갈비맛 버거", "₩ 2500", "422 Kcal", R.drawable.i));
        menuList.add(new Menu("베이컨 치즈 머핀", "₩ 3200", "334 Kcal", R.drawable.j));
        menuList.add(new Menu("매콤 칠리 치즈 머핀", "₩ 2500", "354 Kcal", R.drawable.k));
        menuList.add(new Menu("매콤 칠리 치킨버거", "₩ 2600", "332 Kcal", R.drawable.l));
        menuList.add(new Menu("듬뿍 햄 치즈 김밥", "₩ 3300", "334 Kcal", R.drawable.m));
        menuList.add(new Menu("함박 스테이크 김밥", "₩ 4300", "316 Kcal", R.drawable.n));
        menuList.add(new Menu("더블 치킨 도시락", "₩ 2800", "352 Kcal", R.drawable.o));
        menuList.add(new Menu("햄 김치 볶음밥 계란말이", "₩ 3800", "412 Kcal", R.drawable.p));
        menuList.add(new Menu("봄내음 달래 간장 비빔밥", "₩ 4200", "312 Kcal", R.drawable.q));
        menuList.add(new Menu("안동식 찜닭 도시락", "₩ 3100", "312 Kcal", R.drawable.r));
        menuList.add(new Menu("중화 깐풍기 도시락", "₩ 4200", "364 Kcal", R.drawable.s));
        menuList.add(new Menu("더블 고기 도시락", "₩ 4500", "472 Kcal", R.drawable.t));
        menuList.add(new Menu("함박 스테이크 도시락", "₩ 4600", "522 Kcal", R.drawable.u));
        menuList.add(new Menu("구운 햄&너비아니 도시락", "₩ 4800", "512 Kcal", R.drawable.v));
        return menuList;
    }

    public static void setCart() {
        count++;
        textView.setText(count +"개의 상품이 선택 되었습니다.");
    }
    public void Dialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("상품 구매");
        builder.setMessage("총 "+count + "개의 상품을 구매 하시겠습니까?");
        builder.setPositiveButton("확인",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        MainActivity.sendMessage(1);
                    }
                });
        builder.setNegativeButton("취소",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        builder.show();
    }

}
