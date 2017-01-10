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
        FragmentTabHost mTabHost;
        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getFragmentManager(), android.R.id.tabcontent);

        mTabHost.addTab(mTabHost.newTabSpec("tab1").setIndicator("tab2"),
                TabLocalFragment.class,null);
        mTabHost.addTab(mTabHost.newTabSpec("tab2")
                .setIndicator("tab2"), TabInternationalFragment.class, null);


        return mTabHost;
    }

    //@Override
    //public void onDestroyView() {
    //    s uper.onDestroyView();
    //    mTabHost = null;
    //}

}
