package com.example.guitarista.citem;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {


    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("Contact Us");
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);
        TextView txt1 = (TextView) v.findViewById(R.id.textView1);
        TextView txt2 = (TextView) v.findViewById(R.id.textView2);
        TextView txt3 = (TextView) v.findViewById(R.id.textView3);
        TextView txt4 = (TextView) v.findViewById(R.id.textView4);
        TextView txt5 = (TextView) v.findViewById(R.id.textView5);
        TextView txt6 = (TextView) v.findViewById(R.id.textView6);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_bold.ttf");
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_bold.ttf");
        txt1.setTypeface(font1);
        txt2.setTypeface(font2);
        txt3.setTypeface(font1);
        txt4.setTypeface(font2);
        txt5.setTypeface(font1);
        txt6.setTypeface(font2);
        return v;
    }

}
