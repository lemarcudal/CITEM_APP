package com.example.guitarista.citem.Exhibitor;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.guitarista.citem.Gallery_SpringForward.GalleryFragment;
import com.example.guitarista.citem.Gallery_activity.GalleryActivity;
import com.example.guitarista.citem.R;
import java.util.List;



/**
 * Created by smdojt on 1/24/2017.
 */

public class TabInt_RV_Adapter extends RecyclerView.Adapter<TabInt_RV_Adapter.ItemViewHolder> {

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        static CardView cv;
        TextView itemName;
        TextView itemCathegory;
        ImageView itemPhoto;

        ItemViewHolder(View itemView) {
            super(itemView);
            cv = (CardView)itemView.findViewById(R.id.cv);
            itemName = (TextView) itemView.findViewById(R.id.item_name);
            itemCathegory = (TextView) itemView.findViewById(R.id.item_cathegory);
            itemPhoto = (ImageView) itemView.findViewById(R.id.item_photo);
        }
    }

    List<Exhibitors_Int> items;
    Context context;
    TabInt_RV_Adapter(List<Exhibitors_Int> items, Context context) {
        this.context = context;
        this.items = items;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_exhibitor_tabint_item, viewGroup, false);
        ItemViewHolder ivh = new ItemViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, final int i) {
        itemViewHolder.cv.setOnClickListener(null);
        itemViewHolder.itemName.setText(items.get(i).name);
        itemViewHolder.itemCathegory.setText(items.get(i).cathegory);
        itemViewHolder.itemPhoto.setImageResource(items.get(i).photoId);

        ItemViewHolder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 1) {
                    //Toast.makeText(context, "Index position is 1", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent (context, GalleryActivity.class);
                    context.startActivity(intent);
                }
                else if (i == 2) {
                    //Toast.makeText(context, "Index position is 2 ", Toast.LENGTH_SHORT).show();
                    AppCompatActivity activity = (AppCompatActivity) v.getContext();
                    GalleryFragment gf = new GalleryFragment();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, gf).addToBackStack(null).commit();
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}