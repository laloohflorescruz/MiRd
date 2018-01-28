package com.crudcreativo.mird;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eduardo Flores on 8/1/2018.
 */

public class SurAdapter extends ArrayAdapter<Sur> {

    public SurAdapter(Activity context, ArrayList<Sur> surs) {
        super(context, 0, surs);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_sur, parent, false);
        }

        Sur currentSur= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.site_name);
        nameTextView.setText(currentSur.getSite());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        iconView.setImageResource(currentSur.getImageResourceId());

        return listItemView;
    }

}
