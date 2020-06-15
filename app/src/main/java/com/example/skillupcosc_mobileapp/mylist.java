package com.example.skillupcosc_mobileapp;
import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

class MyListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] roles;
    private final String[] status;
    public MyListAdapter(Activity context, String[] roles,String[] status) {
        super(context, R.layout.mylist, roles);
        this.context=context;
        this.roles=roles;
        this.status=status;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);

        TextView titleText = (TextView) rowView.findViewById(R.id.Role);
        TextView subtitleText = (TextView) rowView.findViewById(R.id.Status);

        titleText.setText(roles[position]);
        subtitleText.setText(status[position]);

        return rowView;

    };
}