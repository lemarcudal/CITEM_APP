package com.example.guitarista.citem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    CalendarView calendar;

    public GalleryFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

        calendar = (CalendarView) v.findViewById(R.id.calendar1);
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
                Toast.makeText(getActivity(), "Selected date " +dayOfMonth+"/"+month+"/"+year, Toast.LENGTH_SHORT).show();
                //if (month==01 && dayOfMonth==01){
                //    Toast.makeText(getActivity(), "New Year", Toast.LENGTH_SHORT).show();
                //}
            }
        });

    return v;
    }

}
