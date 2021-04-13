package com.example.pdmtode;

import android.app.Activity;

public class newsReader extends Activity {

    public static Feed read(){
        Feed feed = null;
        try{
            RSSFeedParser parser = new RSSFeedParser("https://ba.uowm.gr/feed/");
            feed = parser.readFeed();

        }catch (Exception e){
            System.out.println(e.toString());
        }
        return feed;
    }

}
