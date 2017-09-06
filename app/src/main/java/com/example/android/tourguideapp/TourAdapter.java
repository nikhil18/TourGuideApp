package com.example.android.tourguideapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TourAdapter extends ArrayAdapter<TourItem> {

    private Context context;

    public TourAdapter(Context context, ArrayList<TourItem> tourItemArrayList) {
        super(context, 0, tourItemArrayList);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TourItem tourItem = getItem(position);
        ViewHolder viewHolder;

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.imageview_lv.setImageResource(tourItem.getImage());
        viewHolder.title_textview_lv.setText(tourItem.getTitle());
        viewHolder.info_textview_lv.setText(tourItem.getInformation());
        viewHolder.loc_textview_lv.setText(tourItem.getLocation());

        return convertView;
    }

    // somewhere else in your class definition
    static class ViewHolder {
        @BindView(R.id.title_textview_lv)
        TextView title_textview_lv;
        @BindView(R.id.info_textview_lv)
        TextView loc_textview_lv;
        @BindView(R.id.loc_textview_lv)
        TextView info_textview_lv;
        @BindView(R.id.imageview_lv)
        ImageView imageview_lv;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
