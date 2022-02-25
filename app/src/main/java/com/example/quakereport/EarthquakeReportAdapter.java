package com.example.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class EarthquakeReportAdapter extends ArrayAdapter<EarthquakeReport> {
    public EarthquakeReportAdapter(@NonNull Context context, @NonNull ArrayList<EarthquakeReport> objects) {
        super(context, 0, objects);
    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listViewItem = convertView;
        if (listViewItem == null){
    listViewItem = LayoutInflater.from(getContext()).inflate(R.layout.item_view, parent, false);

        }
        EarthquakeReport currentDetails = getItem(position);
        TextView magnitudeLayer = listViewItem.findViewById(R.id.magnitude);
        magnitudeLayer.setText(currentDetails.getmMagnitude());
        TextView locationLayer = listViewItem.findViewById(R.id.location);
        locationLayer.setText(currentDetails.getmLocation());
        TextView timeLayer = listViewItem.findViewById(R.id.time);
        timeLayer.setText(currentDetails.getmTiime());

        return listViewItem;
    }
}
