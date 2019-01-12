package com.example.suraj.gymguid;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.suraj.gymguid.animation.ScaleAnimToHide;
import com.example.suraj.gymguid.animation.ScaleAnimToShow;

public class TestWorkout extends AppCompatActivity implements View.OnClickListener{

    LinearLayout panel1;
    TextView text1;
    public static View openLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_workout);
        panel1 = (LinearLayout) findViewById(R.id.panelday1);
        text1 = (TextView) findViewById(R.id.day1exe1);
        text1.setOnClickListener(this);

        VideoView videoView =(VideoView)findViewById(R.id.day1exe1video);

        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //specify the location of media file
        //Uri uri= Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/videos/day1exe1.mp4");

        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));


        //Setting MediaController and URI, then starting the videoView
        //videoView.setMediaController(mediaController);
        //videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
    @Override
    public void onClick(View v) {
        hideOthers(v);
    }

    private void hideThemAll() {
        if (openLayout == null) return;
        if (openLayout == panel1)
            panel1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));

    }
    private void hideOthers(View layoutView) {
        {
            int v;
            if (layoutView.getId() == R.id.day1exe1) {
                v = panel1.getVisibility();
                if (v != View.VISIBLE) {
                    panel1.setVisibility(View.VISIBLE);
                    Log.v("CZ", "height..." + panel1.getHeight());
                }

                //panel1.setVisibility(View.GONE);
                //Log.v("CZ","again height..." + panel1.getHeight());
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
                }
            }
        }
    }
}
