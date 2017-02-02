package com.example.guitarista.citem.TabGallery;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guitarista.citem.R;

/**
 * Created by smdojt on 2/2/2017.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] AllGalleries;
    private final int[] imageId;
    public CustomList(Activity context,
                      String[] AllAttendess, int[] imageId) {
            super(context, R.layout.fragment_tab_gallery_list, AllAttendess);
            this.context = context;
            this.AllGalleries = AllAttendess;
            this.imageId = imageId;
            }

    @Override
    public View getView(int position, View view, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View rowView = inflater.inflate(R.layout.fragment_tab_gallery_list, null, true);
            TextView txtName = (TextView) rowView.findViewById(R.id.txtName);
            ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
            txtName.setText(AllGalleries[position]);
            imageView.setImageResource(Integer.parseInt(String.valueOf(imageId[position])));
            return rowView;
            } {
}}
