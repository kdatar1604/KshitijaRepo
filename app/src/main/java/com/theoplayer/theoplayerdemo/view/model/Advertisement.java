package com.theoplayer.theoplayerdemo.view.model;

/*
* Set advertisement parameters
* 1. url
* 2. skipoffset = skip add after x seconds
* 3. timeoffset =
* */

class Advertisement {

    String url;
    String timeOffset = "0";
    String skipOffset = "0";

    public Advertisement(String url, String timeOffset, String skipOffset){
        this.url = url;
        this.timeOffset = timeOffset;
        if(timeOffset == null)
            this.timeOffset = "0";

        this.skipOffset = skipOffset;
        if(skipOffset == null)
            this.skipOffset = "0";
    }

    public boolean isEmpty() {
        if(url != null){
            return false;
        }
        return true;
    }
}
