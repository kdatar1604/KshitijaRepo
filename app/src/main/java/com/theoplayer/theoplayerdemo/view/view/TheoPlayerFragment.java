package com.theoplayer.theoplayerdemo.view.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.theoplayer.android.api.THEOplayerView;
import com.theoplayer.android.api.source.SourceDescription;
import com.theoplayer.theoplayerdemo.R;
import com.theoplayer.theoplayerdemo.view.model.TheoPlayer;

public class TheoPlayerFragment extends Fragment {


    private THEOplayerView theOplayerView;
    private SourceDescription sourceDescription;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_player,container,false);
        theOplayerView = view.findViewById(R.id.theoplayer_view);

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        theOplayerView.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        theOplayerView.onResume();
        theOplayerView.getPlayer().setSource(sourceDescription);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        theOplayerView.onDestroy();
    }

    public void setSource(TheoPlayer source) {
        sourceDescription =source.build();
    }

}
