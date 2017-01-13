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
import android.widget.TextView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabInternationalFragment extends Fragment {


    public TabInternationalFragment() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;
    private ItemAdapter itemAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);
        TextView txt = (TextView) v.findViewById(R.id.textView);
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_bold.ttf");
        txt.setTypeface(font);

        ArrayList<ExhibitorInternational> itemList = new ArrayList<>();
        fillDummyData(itemList);


        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

        itemAdapter = new ItemAdapter(itemList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(itemAdapter);
        return v;
    }

    private void fillDummyData(ArrayList<ExhibitorInternational> itemList) {
        ExhibitorInternational exInt1 = new ExhibitorInternational();
        exInt1.setName("ABEEBA CORPORATION");
        exInt1.setCathegory("FASHION");
        exInt1.setProfilePhotoLocation("http://www.cgtutorials.com/oneadmin/_files/linksdir/9041_turn_the_low_quality_photos_to_high_quality.jpg");
        itemList.add(exInt1);
    }


}
