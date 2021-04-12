package com.example.pdmtode;

public class newsReader {

    public static void read(){
        RSSFeedParser parser = new RSSFeedParser("https://ba.uowm.gr/category/news/feed/");
        Feed feed = parser.readFeed();
        System.out.println(feed);
        System.out.println(feed.getMessages().size());
        for (FeedMessage message : feed.getMessages()) {
            System.out.println(message);
            System.out.println("hai");

        }
    }

}
