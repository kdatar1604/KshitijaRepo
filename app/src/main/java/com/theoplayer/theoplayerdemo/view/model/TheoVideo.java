package com.theoplayer.theoplayerdemo.view.model;

public class TheoVideo {

    public TheoVideo(Video_type video_type){
        this.videoType = video_type;
    }
    public enum Video_type{
        VIDEO_ADS,
        VIDEO_THUMBNAIL
    }

    public String url;
    public String poster_img_url;
    public Advertisement advertisement;
    public Video_type videoType;

}
