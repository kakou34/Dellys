package com.example.android.dellys;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> restaurant = new ArrayList<Location>();
        restaurant.add(new Location(getResources().getString(R.string.allalou), getResources().getString(R.string.restaurant6), R.drawable.allalou));
        restaurant.add(new Location(getResources().getString(R.string.talawaldoun), getResources().getString(R.string.restaurant6), R.drawable.talaweldouun));
        restaurant.add(new Location(getResources().getString(R.string.baraka), getResources().getString(R.string.restaurant10), R.drawable.talaweldoun));
        restaurant.add(new Location(getResources().getString(R.string.medjni), getResources().getString(R.string.restaurant10), R.drawable.rest));
        restaurant.add(new Location(getResources().getString(R.string.port), getResources().getString(R.string.restaurant10), R.drawable.poisson));

        // creating a location adapter that knows how to create list items for each item in the list.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), restaurant);

        //find the list view layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //setting the adapter we created to the list
        listView.setAdapter(locationAdapter);

        //return the fragment view
        return rootView;
    }

}
