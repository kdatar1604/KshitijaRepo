package com.theoplayer.theoplayerdemo.view.model;

import android.text.TextUtils;

import com.theoplayer.android.api.source.SourceDescription;
import com.theoplayer.android.api.source.addescription.THEOplayerAdDescription;

public class TheoPlayer {

    public TheoVideo getTheoVideo() {
        return theoVideo;
    }

    public TheoVideo theoVideo;

    private SourceDescription.Builder srcDescBuilder;

    /**
     * Create TheoVideo object with appropriate data to play video
     * @param TheoVideo
     */
    public TheoPlayer(TheoVideo theoVideo){
        this.theoVideo = theoVideo;
        srcDescBuilder = SourceDescription.Builder.sourceDescription(theoVideo.url);
        if(theoVideo.poster_img_url != null && !TextUtils.isEmpty(theoVideo.poster_img_url))
        srcDescBuilder.poster(theoVideo.poster_img_url);
        if(theoVideo.advertisement != null && !TextUtils.isEmpty(theoVideo.advertisement.url)) {
            srcDescBuilder.ads(THEOplayerAdDescription.Builder.adDescription(theoVideo.advertisement.url)
                    .timeOffset(theoVideo.advertisement.timeOffset)
                    .skipOffset(theoVideo.advertisement.skipOffset)
                    .build());
        }
    }

    /**
     *function used to build source description build
     * @return SourceDescription - just by TheoPlayerView to play video
     */
    public SourceDescription build() {
        return srcDescBuilder.build();
    }
}
