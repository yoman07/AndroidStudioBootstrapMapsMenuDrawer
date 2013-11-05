package com.menudrawerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by yoman on 03.11.2013.
 */

public class DrawerAdapterClass  extends ArrayAdapter<String> {
    Context context;
    private ArrayList<String> TextValue = new ArrayList<String>();

    public DrawerAdapterClass(Context context, ArrayList<String> TextValue) {
        super(context, R.layout.row_of_drawer, TextValue);
        this.context = context;
        this.TextValue= TextValue;

    }


    @Override
    public View getView(int position, View coverView, ViewGroup parent) {
        // TODO Auto-generated method stub

        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row_of_drawer,
                parent, false);

        TextView text1 = (TextView)rowView.findViewById(R.id.text_drawer);
        text1.setText(TextValue.get(position));

        return rowView;

    }

}