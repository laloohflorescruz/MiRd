package com.crudcreativo.mird;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Eduardo Flores on 7/1/2018.
 */

public class CibaoAdapter extends ArrayAdapter<Cibao> {

    public CibaoAdapter(Activity context, ArrayList<Cibao> cibaos) {
        super(context, 0, cibaos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_sd, parent, false);
        }

        Cibao currentCibao= getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.site_name);
        nameTextView.setText(currentCibao.getSite());

        return listItemView;
    }
}
