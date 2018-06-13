package com.example.jh.proto;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private List<Menu> menuList;

    MenuAdapter(List<Menu> menuList) {
        this.menuList = menuList;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_viewholder,parent,false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        holder.title.setText(menuList.get(position).getName());
        holder.price.setText(menuList.get(position).getPrice());
        holder.cal.setText(menuList.get(position).getCal());
        holder.image.setImageResource(menuList.get(position).getImageId());


    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        TextView price;
        TextView cal;
        ImageView image;
        LinearLayout linearLayout;
        MenuViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.menu_title);
            price = itemView.findViewById(R.id.menu_price);
            cal = itemView.findViewById(R.id.menu_kcal);
            image = itemView.findViewById(R.id.menu_image);
            linearLayout = itemView.findViewById(R.id.menu_layout);
            linearLayout.setOnClickListener(this);

        }


        @Override
        public void onClick(View v) {
            MenuActivity.setCart();
        }
    }
}
