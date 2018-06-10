package com.example.jh.proto;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

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

    class MenuViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView price;
        TextView cal;
        ImageView image;
        MenuViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.menu_title);
            price = itemView.findViewById(R.id.menu_price);
            cal = itemView.findViewById(R.id.menu_kcal);
            image = itemView.findViewById(R.id.menu_image);
        }


    }
}
