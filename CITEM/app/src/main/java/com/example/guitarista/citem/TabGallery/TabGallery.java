package com.example.guitarista.citem.TabGallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.guitarista.citem.AboutFragment;
import com.example.guitarista.citem.ContactFragment;
import com.example.guitarista.citem.Gallery_SpringForward.GalleryFragment;
import com.example.guitarista.citem.Gallery_activity.GalleryActivity;
import com.example.guitarista.citem.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabGallery extends Fragment {

    public TabGallery() {
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
    String[] AllGalleriesSub = {
            "Manila Fame",
            "Citem 1",
            "Citem 2",
            "Citem 3",
            "Citem 4",
            "Citem 5",
            "Citem 6"
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
                CustomList(TabGallery.this.getActivity(), AllGalleries, AllGalleriesSub, imageID);
        list = (ListView) v.findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 if (position == 0) {
                     GalleryFragment fr = new GalleryFragment();
                     Bundle args = new Bundle();
                     fr.setArguments(args);
                     FragmentManager fm = getFragmentManager();
                     FragmentTransaction fragmentTransaction = fm.beginTransaction();
                     fragmentTransaction.replace(R.id.fragment_container, fr);
                     fragmentTransaction.addToBackStack(null);
                     fragmentTransaction.commit();
                }
                if (position == 1) {
                    Intent intent = new Intent (getContext(), GalleryActivity.class);
                    getContext().startActivity(intent);
                }
            }
        });
        return v;
    }



}
