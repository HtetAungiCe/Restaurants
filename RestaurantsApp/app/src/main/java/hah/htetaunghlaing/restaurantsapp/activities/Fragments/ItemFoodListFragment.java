package hah.htetaunghlaing.restaurantsapp.activities.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.zip.Inflater;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.restaurantsapp.R;
import hah.htetaunghlaing.restaurantsapp.activities.Adapters.ItemFoodListAdapter;

/**
 * Created by Htet Aung Hlaing on 5/25/2018.
 */

public class ItemFoodListFragment extends Fragment {

    @BindView(R.id.rv_item_for_food)
    RecyclerView recyclerView;

    private ItemFoodListAdapter mItemFoodListAdapter;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_for_food_list,container,false);
        ButterKnife.bind(this,view);

        mItemFoodListAdapter = new ItemFoodListAdapter();
        recyclerView.setAdapter(mItemFoodListAdapter);

        GridLayoutManager layoutManager = new GridLayoutManager(getContext(),3,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

        return view;


    }
}
