package com.example.guitarista.citem;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabInternationalFragment extends Fragment {


    public TabInternationalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);
        TextView txt = (TextView) v.findViewById(R.id.person_name);
        TextView txt1 = (TextView) v.findViewById(R.id.person_age);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_regular.ttf");
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_bold.ttf");
        txt.setTypeface(font1);
        txt1.setTypeface(font);

        return v;
    }

}