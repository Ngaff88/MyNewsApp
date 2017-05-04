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


    private  String mCat;

    private String mUrl;


    public News(String vTitle,String vCat,String vUrl )
    {
        mTitle = vTitle;
        mCat = vCat;
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
    public String getCategory() {
        return mCat;
    }


    public String getUrl() {
        return mUrl;
    }

}
