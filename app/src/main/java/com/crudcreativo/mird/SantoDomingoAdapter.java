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
 * Created by Eduardo Flores on 2/1/2018.
 */
public class SantoDomingoAdapter extends ArrayAdapter<SantoDomingo> {

    public SantoDomingoAdapter(Activity context, ArrayList<SantoDomingo> santoDomingos) {
        super(context, 0, santoDomingos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_sd, parent, false);
        }

        SantoDomingo currentSantoDomingo= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.site_name);
        nameTextView.setText(currentSantoDomingo.getSite());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_image);
        iconView.setImageResource(currentSantoDomingo.getImageResourceId());

        return listItemView;
    }
}
