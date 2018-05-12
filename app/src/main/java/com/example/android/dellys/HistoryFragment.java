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
public class HistoryFragment extends Fragment {


    public HistoryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        final ArrayList<Location> history = new ArrayList<Location>();
        history.add(new Location(getResources().getString(R.string.casbah), getResources().getString(R.string.free), R.drawable.casbah));
        history.add(new Location(getResources().getString(R.string.vieux_port), getResources().getString(R.string.free), R.drawable.oldport));
        history.add(new Location(getResources().getString(R.string.old_mosque), getResources().getString(R.string.free_mosque), R.drawable.old_mosque));
        history.add(new Location(getResources().getString(R.string.bengut), getResources().getString(R.string.entrence_limit), R.drawable.bengut));
        history.add(new Location(getResources().getString(R.string.abdelkader), getResources().getString(R.string.free), R.drawable.cup_sidi_ebdelkader));
        history.add(new Location(getResources().getString(R.string.chateau), getResources().getString(R.string.entrence_limit), R.drawable.chateau_fort));
        history.add(new Location(getResources().getString(R.string.sidi_lharfi), getResources().getString(R.string.free_lharfi), R.drawable.sidiherfi));

        // creating a location adapter that knows how to create list items for each item in the list.
        LocationAdapter locationAdapter = new LocationAdapter(getActivity(), history);

        //find the list view layout
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //setting the adapter we created to the list
        listView.setAdapter(locationAdapter);

        //return the fragment view
        return rootView;
    }
}
