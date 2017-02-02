package com.example.guitarista.citem.TabGallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.guitarista.citem.Gallery.GalleryFragment;
import com.example.guitarista.citem.R;

/**
 * Created by Guitarista on 30/01/2017.
 */

public class Tab_Gallery extends Activity {
    ListView list;
    String[] web = {
            "Spring Forward",
            "Miscellaneous"
    };
    int[] imageID = {
            R.drawable.image1,
            R.drawable.image2
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomList adapter = new
                CustomList(Tab_Gallery.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                if (position == 0) {
                    Intent intent = new Intent(Tab_Gallery.this, GalleryFragment.class);
                    startActivity(intent);
                }
            }
        });

    }
}
