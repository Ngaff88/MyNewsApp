package com.example.android.mynewsapp;

import android.support.v4.content.ContextCompat;

import java.text.SimpleDateFormat;
import java.util.Date;
import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Nicholas on 4/5/2017.
 */

public class News {


    private String mTitle;


    private  long mTime;

    private String mUrl;


    public News(String vTitle,long vTime,String vUrl )
    {
        mTitle = vTitle;
        mTime = vTime;
        mUrl = vUrl;
    }

    /**
     * Get the Android version number
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Get the image resource ID
     */
    public long getTimeInMilliseconds() {
        return mTime;
    }

    public String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }

    public String formatTime(Date dateObject) {
        SimpleDateFormat timeFormat = new SimpleDateFormat("h:mm a");
        return timeFormat.format(dateObject);
    }

    public String getUrl() {
        return mUrl;
    }

}
