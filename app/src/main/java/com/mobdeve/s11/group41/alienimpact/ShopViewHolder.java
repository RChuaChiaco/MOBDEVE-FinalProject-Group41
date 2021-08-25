package com.mobdeve.s11.group41.alienimpact;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class ShopViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivPicture;
    private TextView tvQuantity;
    private TextView tvOnePrice;
    private TextView tvTenPrice;

    public ShopViewHolder(@NonNull @NotNull View itemView) {
        super(itemView);

        this.ivPicture = itemView.findViewById(R.id.ivShopItemPicture);
        this.tvQuantity = itemView.findViewById(R.id.tvShopQuantity);
        this.tvOnePrice = itemView.findViewById(R.id.tvShopForOne);
        this.tvTenPrice = itemView.findViewById(R.id.tvShopForTen);
    }

    public void setIvPicture (int pic) {this.ivPicture.setImageResource(pic);}
    public void setTvQuantity (int amount) {
        String txt = "x" + Integer.toString(amount);
        this.tvQuantity.setText(txt);
    }
    public void setTvOnePrice (int price) {
        String txt = Integer.toString(price) + " FOR 1";
        this.tvOnePrice.setText(txt);
    }
    public void setTvTenPrice (int price) {
        String txt = Integer.toString(price) + " FOR 10";
        this.tvTenPrice.setText(txt);
    }
}
