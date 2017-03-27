package com.example.syedaliraza.assignment2customlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class customAdapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] values;
    private String[] numberarray;

    public customAdapter(Context context, String[] values,String[] numberarray) {
        super(context, -1, values);
        this.context = context;
        this.values = values;
        this.numberarray = numberarray;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.rowlayout, parent, false);

        TextView textView = (TextView) rowView.findViewById(R.id.Name);
        TextView textView2 = (TextView) rowView.findViewById(R.id.number);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageView1);
        textView.setText(values[position]);

        // change the icon for Windows and iPhone
        String s = values[position];

        textView2.setText(numberarray[position]);

        return rowView;
    }
}

