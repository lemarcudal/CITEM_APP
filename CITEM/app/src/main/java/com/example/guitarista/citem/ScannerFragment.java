package com.example.guitarista.citem;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.guitarista.citem.Gallery_SpringForward.GalleryFragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class ScannerFragment extends Fragment {

    public ScannerFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Scanner");
        View v = inflater.inflate(R.layout.fragment_scanner, container, false);

        v.findViewById(R.id.btnScan).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent i = new Intent(getActivity(), GalleryFragment.class);
                //startActivity(i);
                Toast.makeText(getContext(), "QR SCANNER",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }



}
