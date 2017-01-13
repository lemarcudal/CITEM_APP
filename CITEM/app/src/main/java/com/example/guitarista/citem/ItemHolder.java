package com.example.guitarista.citem;

/**
 * Created by smdojt on 1/13/2017.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by smdojt on 1/13/2017.
 */
public class ItemHolder extends RecyclerView.ViewHolder {

    public TextView txtIntExName, txtCathegory;
    public CircleImageView profileImage;

    public ItemHolder(View view) {
        super(view);
        txtIntExName = (TextView) view.findViewById(R.id.txtIntExName);
        txtCathegory = (TextView) view.findViewById(R.id.txtCathegory);
        profileImage = (CircleImageView) view.findViewById(R.id.profileImage);
    }
}
