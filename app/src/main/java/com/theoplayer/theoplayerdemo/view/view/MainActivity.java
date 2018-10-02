package com.theoplayer.theoplayerdemo.view.view;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.theoplayer.theoplayerdemo.R;
import com.theoplayer.theoplayerdemo.view.model.CustomPagerAdapter;
import com.theoplayer.theoplayerdemo.view.model.MockData;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);


        MockData mockData =  new MockData();
        viewPager.setAdapter(new CustomPagerAdapter(getSupportFragmentManager(),mockData.getData()));
    }
}
