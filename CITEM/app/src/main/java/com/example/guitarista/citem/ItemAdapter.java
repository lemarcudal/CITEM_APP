package com.example.guitarista.citem;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by smdojt on 1/13/2017.
 */

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<ExhibitorInternational> exhibitorIntList;
    public ItemAdapter(List<ExhibitorInternational> exhibitorIntList) {
        this.exhibitorIntList = exhibitorIntList;
    }
    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.international_ex_layout, parent, false);
        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        ExhibitorInternational item = exhibitorIntList.get(position);
        holder.txtIntExName.setText(item.getName());
        holder.txtCathegory.setText(item.getCathegory());
        Picasso.with(holder.txtIntExName.getContext()).load(item.getProfilePhotoLocation()).into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return exhibitorIntList.size();
    }
}