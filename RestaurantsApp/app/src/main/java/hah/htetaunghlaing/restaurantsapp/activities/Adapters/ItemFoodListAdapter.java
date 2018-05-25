package hah.htetaunghlaing.restaurantsapp.activities.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hah.htetaunghlaing.restaurantsapp.R;
import hah.htetaunghlaing.restaurantsapp.activities.ViewHolders.FoodListViewHolder;

/**
 * Created by Htet Aung Hlaing on 5/25/2018.
 */

public class ItemFoodListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View foodItemView = inflater.inflate(R.layout.item_for_food_list,parent,false);
        FoodListViewHolder foodListViewHolder = new FoodListViewHolder(foodItemView);
        return foodListViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
