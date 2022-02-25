package com.example.quakereport;

public class EarthquakeReport {
    private String mMagnitude;
    private String mLocation;
    private String mTiime;

    public EarthquakeReport(String mMagnitude, String mLocation, String mTiime) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTiime = mTiime;
    }

    public String getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public String getmTiime() {
        return mTiime;
    }
}
