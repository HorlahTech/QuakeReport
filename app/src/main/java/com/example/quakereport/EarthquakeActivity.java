package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {
    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);
        ArrayList<EarthquakeReport> earthquakes = QueryUtils.extractEarthquakes();

        ListView earthquakelistView = findViewById(R.id.listViewItem);
        Log.e("EarthquakeActivies", "Problem parsing the earthquake JSON results");
        EarthquakeReportAdapter adapter = new EarthquakeReportAdapter(EarthquakeActivity.this, earthquakes);
        earthquakelistView.setAdapter(adapter);
    }
}