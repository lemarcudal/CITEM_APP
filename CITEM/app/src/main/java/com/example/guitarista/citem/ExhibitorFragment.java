package com.example.guitarista.citem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ExhibitorFragment extends Fragment{


    public ExhibitorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       
        View v = inflater.inflate(R.layout.fragment_exhibitor, container, false);

        FragmentTabHost mTabHost = (FragmentTabHost) v.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(), getFragmentManager(), R.id.International);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("Tab1"),
                TabInternationalFragment.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2").setIndicator("Tab2"),
                TabLocalFragment.class, null);
        return v;
    }

}
