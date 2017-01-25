package com.example.guitarista.citem.Exhibitor;

/**
 * Created by smdojt on 1/24/2017.
 */
import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guitarista.citem.R;

public class TabInt_CV_Activity extends Activity {

    TextView itemName;
    TextView itemCathegory;
    ImageView itemPhoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tabint_cv_activity);
        itemName = (TextView)findViewById(R.id.item_name);
        itemCathegory = (TextView)findViewById(R.id.item_cathegory);
        itemPhoto = (ImageView)findViewById(R.id.item_photo);

        itemName.setText("CITEM");
        itemCathegory.setText("Manila Fame");
        itemPhoto.setImageResource(R.drawable.emma);
    }
}
