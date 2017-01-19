package com.example.guitarista.citem;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class TabInternationalFragment extends Fragment {

    private ListView lvProduct;
    private ProductListAdapter adapter;
    private List<Product> mProductList;


    public TabInternationalFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_tab_international, container, false);
        lvProduct = (ListView) v.findViewById(R.id.listview_product);

        mProductList = new ArrayList<>();

        mProductList.add(new Product(1, "iPhone4", 200, "Apple iPhone4 16GB"));
        mProductList.add(new Product(2, "iPhones", 250, "Apple iPhone4 16GB"));
        mProductList.add(new Product(3, "iPhone5", 300, "Apple iPhone5 16GB"));

        adapter = new ProductListAdapter(getContext(), mProductList);
        lvProduct.setAdapter(adapter);

        lvProduct.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(getContext(), "Clicked product id = " + view.getTag(), Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}