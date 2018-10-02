package com.theoplayer.theoplayerdemo.view.model;

import java.util.ArrayList;

public class MockData {

    public ArrayList<TheoPlayer> getData(){

        /*
        * Create Mock list of TheoPlayer objects
        * */
        ArrayList<TheoPlayer> theoPlayers =  new ArrayList<>();

        /*
        * Video with Poster image
        * */
        TheoVideo theoVideo =  new TheoVideo(TheoVideo.Video_type.VIDEO_THUMBNAIL);
        theoVideo.url = "https://cdn.theoplayer.com/theoVideo/elephants-dream/playlist.m3u8";
        theoVideo.poster_img_url = "http://cdn.theoplayer.com/video/big_buck_bunny/poster.jpg";
        theoPlayers.add(new TheoPlayer(theoVideo));

        /*
         * Video with advertisement
         * */
        theoVideo =  new TheoVideo(TheoVideo.Video_type.VIDEO_ADS);
        theoVideo.url = "https://cdn.theoplayer.com/theoVideo/elephants-dream/playlist.m3u8";
        theoVideo.advertisement = new Advertisement("https://cdn.theoplayer.com/demos/preroll.xml","10","3");

        theoPlayers.add(new TheoPlayer(theoVideo));

    return theoPlayers;
    }


}
