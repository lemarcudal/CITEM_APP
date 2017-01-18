package com.example.guitarista.citem;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabInternationalFragment extends Fragment {

    String[] players={"Player1","Player2", "Player3"};
    int[] images = {R.drawable.custom_mf_logo,R.drawable.custom_mf_logo,R.drawable.custom_mf_logo};

    ArrayList<HashMap<String, String>> data;
    SimpleAdapter adapter;

    public TabInternationalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);

        //code for fill
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i=0;i<players.length;i++)
        {
            map = new HashMap<String, String>();
            map.put("Player", players[i] );
            map.put("Image", Integer.toString(images[i]));
            data.add(map);
        }
        String[] from={"Player", "Image"};
        int[] to = {R.id.nameTxt, R.id.imageView1};
        adapter = new SimpleAdapter(getActivity(), data, R.layout.fragment_tab_international, from, to);
        setListAdapter(adapter);
        //--------------------------------------------
        return v;
    }


}
