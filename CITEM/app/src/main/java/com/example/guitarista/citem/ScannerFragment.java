package com.example.guitarista.citem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.app.ActionBar;
import android.view.MenuItem;


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
        View v = inflater.inflate(R.layout.fragment_scanner, container, false);

        ActionBar ab = getActivity().getActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        v.findViewById(R.id.btnScan).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Intent i = new Intent(getActivity(), MainFragment.class);
                //startActivity(i);
                Toast.makeText(getContext(), "QR SCANNER",Toast.LENGTH_SHORT).show();
            }
        });
        return v;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // app icon in action bar clicked; go home
                Intent intent = new Intent(getActivity(), MainFragment.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
