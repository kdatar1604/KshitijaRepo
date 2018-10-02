package com.theoplayer.theoplayerdemo.view.model;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.theoplayer.android.api.player.Player;
import com.theoplayer.theoplayerdemo.R;
import com.theoplayer.theoplayerdemo.view.view.TheoPlayerFragment;

import java.util.ArrayList;

public class CustomPagerAdapter extends FragmentStatePagerAdapter {


    private Context mContext;
    private ArrayList<TheoPlayer> theoPlayerList;

    /**
     *
     * @param FragmentManager
     * @param ArrayList<TheoPlayer> - list of videos with diff types
     * @return
     */
    public CustomPagerAdapter(FragmentManager fm, ArrayList<TheoPlayer> theoPlayerList) {
        super(fm);
        this.theoPlayerList = theoPlayerList;
    }

    @Override
    public Fragment getItem(int i) {
        TheoPlayerFragment theoPlayerFragment =  new TheoPlayerFragment();
        if(theoPlayerList != null){
            TheoPlayer theoPlayer = theoPlayerList.get(i);
            theoPlayerFragment.setSource(theoPlayer);
        }
        return theoPlayerFragment;
    }


    @Override
    public int getCount() {
        if(theoPlayerList != null)
        return theoPlayerList.size();
        return 0;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if(theoPlayerList != null) {
            TheoPlayer player = theoPlayerList.get(position);
            if(player != null){
                TheoVideo theoVideo = player.getTheoVideo();
                if(theoVideo != null){
                    switch (theoVideo.videoType){
                        case VIDEO_THUMBNAIL:
                           return mContext.getResources().getString(R.string.VIDEO_THUMBNAIL);

                        case VIDEO_ADS:
                            return mContext.getResources().getString(R.string.VIDEO_ADS);
                    }
                }
            }
        }
        return "";
    }

}
