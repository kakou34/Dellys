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
public class TransportFragmant extends Fragment {


    public TransportFragmant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> transport = new ArrayList<Location>();
        transport.add(new Location(getResources().getString(R.string.oued_medjni), getResources().getString(R.string.bus5)));
        transport.add(new Location(getResources().getString(R.string.oued_afir), getResources().getString(R.string.bus10)));
        transport.add(new Location(getResources().getString(R.string.dellys_bagh), getResources().getString(R.string.bus10)));
        transport.add(new Location(getResources().getString(R.string.dellys_tizi), getResources().getString(R.string.bus15)));
        transport.add(new Location(getResources().getString(R.string.dellys_alg), getResources().getString(R.string.bus30)));
        transport.add(new Location(getResources().getString(R.string.dellys_bmrds), getResources().getString(R.string.bus20)));
        transport.add(new Location(getResources().getString(R.string.dellys_sidid), getResources().getString(R.string.bus10)));

        // creating a location adapter that knows how to create list items for each item in the list.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), transport);

        //find the list view layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //setting the adapter we created to the list
        listView.setAdapter(locationAdapter);

        //return the fragment view
        return rootView;
    }

}
