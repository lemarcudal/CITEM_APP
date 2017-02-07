package com.example.guitarista.citem.TabGallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.guitarista.citem.Gallery.GalleryFragment;
import com.example.guitarista.citem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabGallery1 extends Fragment {


    public TabGallery1() {
        // Required empty public constructor
    }

    ListView list;
    String[] AllGalleries = {
            "Spring Forward",
            "Twitter",
            "Windows",
            "Bing",
            "Itunes",
            "Wordpress",
            "Drupal"
    };

    int[] imageID = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getActivity().setTitle("MANILA FAME GALLERIES");
        View v = inflater.inflate(R.layout.fragment_tab_gallery, container, false);

        CustomList adapter = new
                CustomList(TabGallery1.this.getActivity(), AllGalleries, imageID);
        list = (ListView) v.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(getActivity(), GalleryFragment.class);
                    startActivity(intent);
                }
            }
        });

        return v;
    }

}
