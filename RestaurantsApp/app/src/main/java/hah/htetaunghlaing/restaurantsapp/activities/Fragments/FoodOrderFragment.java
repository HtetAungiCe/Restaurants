package hah.htetaunghlaing.restaurantsapp.activities.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.restaurantsapp.R;
import hah.htetaunghlaing.restaurantsapp.activities.Adapters.ItemFoodOrderAdapter;

/**
 * Created by Htet Aung Hlaing on 5/24/2018.
 */

public class FoodOrderFragment extends Fragment {

    @BindView(R.id.rv_item_for_food_order)
    RecyclerView recyclerView;

    private ItemFoodOrderAdapter mItemFoodOrderAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_order,container,false);

        ButterKnife.bind(this,view);

        mItemFoodOrderAdapter = new ItemFoodOrderAdapter();
        recyclerView.setAdapter(mItemFoodOrderAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        return view;
    }
}
