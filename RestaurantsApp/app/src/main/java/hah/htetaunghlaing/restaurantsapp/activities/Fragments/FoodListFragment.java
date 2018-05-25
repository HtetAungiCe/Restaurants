package hah.htetaunghlaing.restaurantsapp.activities.Fragments;


import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import hah.htetaunghlaing.restaurantsapp.R;
import hah.htetaunghlaing.restaurantsapp.activities.Adapters.FoodListAdapter;

/**
 * Created by Htet Aung Hlaing on 5/24/2018.
 */

public class FoodListFragment extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.vp_food_list)
    ViewPager viewPager;

    @BindView(R.id.tl_food_list)
    TabLayout tabLayout;

    private FoodListAdapter mFoodListAdapter;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_food_list, container, false);
        ButterKnife.bind(this,view);


        mFoodListAdapter = new FoodListAdapter(getFragmentManager());
        viewPager.setAdapter(mFoodListAdapter);


        mFoodListAdapter.addTab("", new ItemFoodListFragment());
        mFoodListAdapter.addTab("", new ItemFoodListFragment());
        mFoodListAdapter.addTab("", new ItemFoodListFragment());
        /**
         * tablayout nae viewPager nae bind
         */
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.getTabAt(0).setIcon(R.drawable.ic_format_list_bulleted_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_videocam_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_format_list_bulleted_black_24dp);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setTint(Color.BLUE);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setTint(Color.rgb(75,75,75));

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        viewPager.setOffscreenPageLimit(mFoodListAdapter.getCount());

        return view;


    }
}
