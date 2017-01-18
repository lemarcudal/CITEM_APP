package com.example.guitarista.citem;


import java.text.SimpleDateFormat;

import android.graphics.Typeface;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.prolificinteractive.materialcalendarview.OnDateSelectedListener;

import java.text.DateFormat;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {

    public ScheduleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("My Schedule");
        View v = inflater.inflate(R.layout.fragment_schedule, container, false);

        TextView tvDisplayDate = (TextView) v.findViewById(R.id.textDate2);
        TextView tvDisplayD = (TextView) v.findViewById(R.id.textDate1);
        Typeface font1 = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_bold.ttf");
        Typeface font2 = Typeface.createFromAsset(getActivity().getAssets(), "century_gothic_regular.ttf");
        //tvDisplayDate.setText(DateUtils.formatDateTime(getContext(), System.currentTimeMillis(), DateUtils.FORMAT_SHOW_TIME | DateUtils.FORMAT_SHOW_DATE | DateUtils.FORMAT_NUMERIC_DATE | DateUtils.FORMAT_12HOUR));
        long date = System.currentTimeMillis();

        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy / h:mm a");
        String dateString = sdf.format(date);
        tvDisplayDate.setText(dateString);
        tvDisplayDate.setTypeface(font2);
        tvDisplayD.setTypeface(font1);

        final MaterialCalendarView materialCalendarView = (MaterialCalendarView) v.findViewById(R.id.calendarView);
        materialCalendarView.state().edit()
                .setFirstDayOfWeek(Calendar.MONDAY)
                .setMinimumDate(CalendarDay.from(1900, 1, 1))
                .setMaximumDate(CalendarDay.from(2100, 12, 31))
                .setCalendarDisplayMode(CalendarMode.MONTHS)
                .commit();

        materialCalendarView.setOnDateChangedListener(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@NonNull MaterialCalendarView widget, @NonNull CalendarDay date, boolean selected) {
                //Toast.makeText(getActivity(), "Today is " + sdf.format(date), Toast.LENGTH_SHORT).show();
                if (materialCalendarView.getSelectedDate().equals(CalendarDay.from(2017, 0, 1))) {
                    Toast.makeText(getActivity(), "NEW YEAR!", Toast.LENGTH_SHORT).show();
                }
                else if (materialCalendarView.getSelectedDate().equals(CalendarDay.from(2017, 1, 14))) {
                    Toast.makeText(getActivity(), "Happy Valentines Day!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return v;
    }

}
