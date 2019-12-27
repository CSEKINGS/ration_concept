package com.e_rationqueue.app;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ProductList extends ArrayAdapter<product> {

    private Activity context;
    private List<product> productList;

    public ProductList(Activity context, List<product> ProductList) {
        super(context, R.layout.activity_product_list, ProductList);
        this.context = context;
        this.productList = productList;

    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.activity_product_list, null, true);

        product p = productList.get(position);

        //TextView textViewProductName = (TextView) listViewItem.findViewById(R.id.);


        return listViewItem;
    }
}
