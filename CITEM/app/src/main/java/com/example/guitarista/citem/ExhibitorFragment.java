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

    private FragmentTabHost mTabHost;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        mTabHost = new FragmentTabHost(getActivity());
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.layout.fragment_exhibitor);

        //Bundle arg1 = new Bundle();
        //arg1.putInt("Arg for frag1", 1);
        mTabHost.addTab(mTabHost.newTabSpec("Tab 1").setIndicator("Frag tab1"),
                TabInternationalFragment.class, null);
        //Bundle arg2 = new Bundle();
        //arg1.putInt("Arg for frag1", 2);
        mTabHost.addTab(mTabHost.newTabSpec("Tab 2").setIndicator("Frag tab2"),
                TabInternationalFragment.class, null);


        return mTabHost;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mTabHost = null;
    }

}