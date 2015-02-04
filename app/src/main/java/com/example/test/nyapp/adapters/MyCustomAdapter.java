package com.example.test.nyapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.test.nyapp.Amic;
import com.example.test.nyapp.R;

import java.util.List;

/**
 * Created by TEST on 04/02/2015.
 */
public class MyCustomAdapter extends ArrayAdapter {
    private List<Amic> namics;
    private Context ncontext;
    private int nResource;


    public MyCustomAdapter(Context context, List<Amic> data) {
        super(context, R.layout.element, data);
        namics = data;
        ncontext = context;
        nResource = R.layout.element;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutinflater= (LayoutInflater) ncontext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView= layoutinflater.inflate(nResource,parent,false);

        TextView nom=(TextView) rowView.findViewById(R.id.name);
        TextView mitjana=(TextView) rowView.findViewById(R.id.rate);

        nom.setText(namics.get(position).nom);
        mitjana.setText(namics.get(position).mitjana+"");

        return rowView;
    }
}
