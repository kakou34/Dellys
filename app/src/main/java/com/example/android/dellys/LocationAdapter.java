package com.example.android.dellys;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class LocationAdapter extends ArrayAdapter<Location> {

    //constructor to create a location adapter
    public LocationAdapter(Context context, ArrayList<Location> locations) {
        super(context, 0, locations);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //getting the current location object
        Location currentLocation = getItem(position);

        //Find the image view in the list_item.xml layout with the id location_image
        ImageView image = listItemView.findViewById(R.id.location_image);
        //Setting the image view to match the current location item
        if (currentLocation.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            image.setImageResource(currentLocation.getImageId());
            // Make sure the view is visible
            image.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            image.setVisibility(View.GONE);
        }

        //find the textView in the list_item.xml with teh id location_name
        TextView name = listItemView.findViewById(R.id.location_name);
        //setting the name of the location to the textView
        name.setText(currentLocation.getName());

        //find the textView in the list_item.xml with teh id information.
        TextView information = listItemView.findViewById(R.id.information);
        //setting information about the location to the textView
        information.setText(currentLocation.getInformation());

        //return the list item to be shown in the list
        return listItemView;
    }
}
