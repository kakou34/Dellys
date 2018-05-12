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
public class BeachesFragment extends Fragment {


    public BeachesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> beaches = new ArrayList<Location>();
        beaches.add(new Location(getResources().getString(R.string.les_salines), getResources().getString(R.string.guarded), R.drawable.lessalines));
        beaches.add(new Location(getResources().getString(R.string.ramla), getResources().getString(R.string.unguarded), R.drawable.ramla));
        beaches.add(new Location(getResources().getString(R.string.zawech), getResources().getString(R.string.guarded), R.drawable.zawech));

        // creating a location adapter that knows how to create list items for each item in the list.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), beaches);

        //find the list view layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //setting the adapter we created to the list
        listView.setAdapter(locationAdapter);

        //return the fragment view
        return rootView;
    }

}
