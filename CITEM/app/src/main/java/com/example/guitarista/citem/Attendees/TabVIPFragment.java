package com.example.guitarista.citem.Attendees;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.guitarista.citem.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabVIPFragment extends Fragment {


    public TabVIPFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layoutAttendees.fragment_tab_vi, container, false);
    }

}
