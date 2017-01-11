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
public class TabInternationalFragment extends Fragment {


    public TabInternationalFragment() {
        // Required empty public constructor
    }

    TextView tv1;
    Typeface f1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);

        tv1 = (TextView) v.findViewById(R.id.textView1);
        f1 = Typeface.createFromAsset(getContext().getAssets(), "century_gothic_bold.ttf");
        tv1.setTypeface(f1);

        return v;
    }

}
