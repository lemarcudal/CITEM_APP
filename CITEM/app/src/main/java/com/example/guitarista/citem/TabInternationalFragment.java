package com.example.guitarista.citem;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabInternationalFragment extends Fragment {

    String[] data={"Sunday","Monday","Tuesday"};
    ListView l;
    public TabInternationalFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);

        l = (ListView) v.findViewById(R.id.listView);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(getActivity(), R.layout.fragment_tab_int_single_row, R.id.textView, data);
        l.setAdapter(adapter);
        return v;
    }

}