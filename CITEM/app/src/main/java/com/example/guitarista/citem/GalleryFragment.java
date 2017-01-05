package com.example.guitarista.citem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;
import com.github.sundeepk.compactcalendarview.CompactCalendarView;
import com.github.sundeepk.compactcalendarview.domain.CalendarDayEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {

    private Toolbar toolbar;
    CompactCalendarView compactCalendarView;
    private SimpleDateFormat dateFormatForMonth = new SimpleDateFormat("MMMM- yyyy", Locale.getDefault());
    private Calendar currentCalender = Calendar.getInstance(Locale.getDefault());


    public GalleryFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);

        toolbar = (Toolbar) v.findViewById(R.id.toolbar);
        ((AppCompatActivity)getActivity()).setSupportActionBar(toolbar);
        final ActionBar actionBar = ((AppCompatActivity) getActivity()).getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu_white_24px);
        actionBar.setDisplayHomeAsUpEnabled(true);
        // Setting default toolbar title to empty
        actionBar.setTitle(null);

        compactCalendarView = (CompactCalendarView) v.findViewById(R.id.compactcalendar_view);
        compactCalendarView.drawSmallIndicatorForEvents(true);
        compactCalendarView.setUseThreeLetterAbbreviation(true);

        //set initial title
        actionBar.setTitle(dateFormatForMonth.format(compactCalendarView.getFirstDayOfCurrentMonth()));

        //set title on calendar scroll
        compactCalendarView.setListener(new CompactCalendarView.CompactCalendarViewListener() {
            @Override
            public void onDayClick(Date dateClicked) {


                Toast.makeText(getActivity(), "Date : " + dateClicked.toString(), Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onMonthScroll(Date firstDayOfNewMonth) {
                // Changes toolbar title on monthChange
                actionBar.setTitle(dateFormatForMonth.format(firstDayOfNewMonth));

            }

        });

        addDummyEvents();

        gotoToday();



        return v;
    }

    // Adding dummy events in calendar view for April, may, june 2016
    private void addDummyEvents() {

        addEvents(compactCalendarView, Calendar.APRIL);
        addEvents(compactCalendarView, Calendar.MAY);
        addEvents(compactCalendarView, Calendar.JUNE);

        // Refresh calendar to update events
        compactCalendarView.invalidate();
    }

    private void addEvents(CompactCalendarView compactCalendarView, int month) {
        currentCalender.setTime(new Date());
        currentCalender.set(Calendar.DAY_OF_MONTH, 1);
        Date firstDayOfMonth = currentCalender.getTime();
        for (int i = 0; i < 6; i++) {
            currentCalender.setTime(firstDayOfMonth);
            if (month > -1) {
                currentCalender.set(Calendar.MONTH, month);
            }
            currentCalender.add(Calendar.DATE, i);
            setToMidnight(currentCalender);
            compactCalendarView.addEvent(new CalendarDayEvent(currentCalender.getTimeInMillis(), Color.argb(255, 255, 255, 255)), false);
        }
    }
    private void setToMidnight(Calendar calendar) {
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);
    }
    public void gotoToday() {

        // Set any date to navigate to particular date
        compactCalendarView.setCurrentDate(Calendar.getInstance(Locale.getDefault()).getTime());


    }


}
