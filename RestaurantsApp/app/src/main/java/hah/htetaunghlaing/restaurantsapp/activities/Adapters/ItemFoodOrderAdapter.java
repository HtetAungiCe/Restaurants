package hah.htetaunghlaing.restaurantsapp.activities.Adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.restaurantsapp.R;
import hah.htetaunghlaing.restaurantsapp.activities.ViewHolders.ItemFoodOrderViewHolder;

/**
 * Created by Htet Aung Hlaing on 5/25/2018.
 */

public class ItemFoodOrderAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View foodOrderView = inflater.inflate(R.layout.item_for_food_order,parent,false);
        ItemFoodOrderViewHolder itemFoodOrderViewHolder = new ItemFoodOrderViewHolder(foodOrderView);
        return itemFoodOrderViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }
}
