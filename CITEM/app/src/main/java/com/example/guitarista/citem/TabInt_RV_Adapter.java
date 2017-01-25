package com.example.guitarista.citem;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by smdojt on 1/24/2017.
 */

public class TabInt_RV_Adapter extends RecyclerView.Adapter<TabInt_RV_Adapter.ItemViewHolder> {

    public static class ItemViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView itemName;
        TextView itemCathegory;
        static ImageView itemPhoto;

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
    TabInt_RV_Adapter(List<Exhibitors_Int> items) {

        this.items = items;
    }


    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.tabint_item, viewGroup, false);
        ItemViewHolder ivh = new ItemViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(ItemViewHolder itemViewHolder, int i) {
        itemViewHolder.itemName.setText(items.get(i).name);
        itemViewHolder.itemCathegory.setText(items.get(i).cathegory);
        itemViewHolder.itemPhoto.setImageResource(items.get(i).photoId);

        ItemViewHolder.itemPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "Index position is: ", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}
