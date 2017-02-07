package com.example.guitarista.citem.Attendees;

import android.app.Activity;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;

import com.example.guitarista.citem.R;

/**
 * Created by smdojt on 1/25/2017.
 */

public class TabAllList extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] AllAttendees;
    private final int[] imageId;
    public TabAllList(Activity context,
                      String[] AllAttendess, int[] imageId) {
        super(context, R.layout.layoutAttendees.attall_list_single, AllAttendess);
        this.context = context;
        this.AllAttendees = AllAttendess;
        this.imageId = imageId;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.fragment_attendees_attall_list_single, null, true);
        TextView txtName = (TextView) rowView.findViewById(R.id.txtName);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.img);
        txtName.setText(AllAttendees[position]);
        imageView.setImageResource(Integer.parseInt(String.valueOf(imageId[position])));
        return rowView;
    }
}
