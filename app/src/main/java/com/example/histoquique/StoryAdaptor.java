package com.example.histoquique;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class StoryAdaptor extends ArrayAdapter<Story> {
    private Context mContext;
    private int mResource;

    public StoryAdaptor(@NonNull Context context, int resource, @NonNull ArrayList<Story> objects) {
        super(context, resource, objects);
        this.mContext = context;
        this.mResource =  resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mContext);
        convertView = layoutInflater.inflate(mResource,parent,false);


        TextView textView = convertView.findViewById(R.id.title);
        TextView textView1 = convertView.findViewById(R.id.subtitle);
        TextView textView2 = convertView.findViewById(R.id.subtitle2);
        TextView textView3 = convertView.findViewById(R.id.textleft);
        TextView textView4 = convertView.findViewById(R.id.subTextLeft);

        textView.setText(getItem(position).getTitle());
        textView1.setText(getItem(position).getSubtitle());
        textView2.setText(getItem(position).getSubtitle2());
        textView3.setText(getItem(position).getTextLeft());
        textView4.setText(getItem(position).getSubTextLeft());





        return  convertView;
    }

}
