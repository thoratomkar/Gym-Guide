package com.example.suraj.gymguid;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.suraj.gymguid.animation.ScaleAnimToHide;
import com.example.suraj.gymguid.animation.ScaleAnimToHideInside;
import com.example.suraj.gymguid.animation.ScaleAnimToShow;
import com.example.suraj.gymguid.animation.ScaleAnimToShowInside;

public class WeightLoss extends AppCompatActivity implements View.OnClickListener{

    public View.OnLongClickListener longClickListner;

    LinearLayout panel1, panel2, panel3, panel4, panel5,panel6;
    TextView text1, text2, text3, text4, text5,text6;


    LinearLayout panelm1, panelm2, panelm3, panelm4, panelm5,panelm6;
    TextView textm1, textm2, textm3, textm4, textm5,textm6;


    LinearLayout panela1, panela2, panela3, panela4, panela5,panela6;
    TextView texta1, texta2, texta3, texta4, texta5,texta6;

    LinearLayout paneld1e1, paneld1e2, paneld1e3, paneld1e4, paneld1e5,paneld1e6,paneld1e7,paneld1e8;
    TextView textd1exe1, textd1exe2,textd1exe3, textd1exe4,textd1exe5, textd1exe6,textd1exe7, textd1exe8;

    LinearLayout paneld2e1, paneld2e2, paneld2e3, paneld2e4, paneld2e5,paneld2e6,paneld2e7,paneld2e8;
    TextView textd2exe1, textd2exe2,textd2exe3, textd2exe4,textd2exe5, textd2exe6,textd2exe7, textd2exe8;

    LinearLayout paneld3e1, paneld3e2, paneld3e3, paneld3e4, paneld3e5,paneld3e6,paneld3e7,paneld3e8;;
    TextView textd3exe1, textd3exe2,textd3exe3, textd3exe4,textd3exe5, textd3exe6,textd3exe7, textd3exe8;;

    LinearLayout paneld4e1, paneld4e2, paneld4e3, paneld4e4, paneld4e5,paneld4e6;
    TextView textd4exe1, textd4exe2,textd4exe3, textd4exe4,textd4exe5, textd4exe6;

    LinearLayout paneld5e1, paneld5e2, paneld5e3, paneld5e4, paneld5e5,paneld5e6;
    TextView textd5exe1, textd5exe2,textd5exe3, textd5exe4,textd5exe5, textd5exe6;

    LinearLayout paneld6e1, paneld6e2, paneld6e3, paneld6e4, paneld6e5,paneld6e6;
    TextView textd6exe1, textd6exe2,textd6exe3, textd6exe4,textd6exe5, textd6exe6;
    public static View openLayout;
    public static View openLayout2;
    VideoView videoView2,videoView,videoView3,videoView4,videoView5,videoView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        final TabHost host = (TabHost) findViewById(R.id.tabHostM);
        // host.setBackgroundResource(R.drawable.tab_baground);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Beginner");
        spec.setContent(R.id.tab1);
        spec.setIndicator("Beginner");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Moderate");
        spec.setContent(R.id.tab2);
        spec.setIndicator("Moderate");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Advance");
        spec.setContent(R.id.tab3);
        spec.setIndicator("Advance");
        host.addTab(spec);
        panel1 = (LinearLayout) findViewById(R.id.panel1);
        panel2 = (LinearLayout) findViewById(R.id.panel2);
        panel3 = (LinearLayout) findViewById(R.id.panel3);
        panel4 = (LinearLayout) findViewById(R.id.panel4);
        panel5 = (LinearLayout) findViewById(R.id.panel5);
        panel6 = (LinearLayout) findViewById(R.id.panel6);



        panelm1 = (LinearLayout) findViewById(R.id.panelm1);
        panelm2 = (LinearLayout) findViewById(R.id.panelm2);
        panelm3 = (LinearLayout) findViewById(R.id.panelm3);
        panelm4 = (LinearLayout) findViewById(R.id.panelm4);
        panelm5 = (LinearLayout) findViewById(R.id.panelm5);
        panelm6 = (LinearLayout) findViewById(R.id.panelm6);



        panela1 = (LinearLayout) findViewById(R.id.panela1);
        panela2 = (LinearLayout) findViewById(R.id.panela2);
        panela3 = (LinearLayout) findViewById(R.id.panela3);
        panela4 = (LinearLayout) findViewById(R.id.panela4);
        panela5 = (LinearLayout) findViewById(R.id.panela5);

        paneld1e1 = (LinearLayout) findViewById(R.id.panelday1exe1);
        paneld1e2 = (LinearLayout) findViewById(R.id.panelday1exe2);
        paneld1e3 = (LinearLayout) findViewById(R.id.panelday1exe3);
        paneld1e4 = (LinearLayout) findViewById(R.id.panelday1exe4);
        paneld1e5 = (LinearLayout) findViewById(R.id.panelday1exe5);
        paneld1e6 = (LinearLayout) findViewById(R.id.panelday1exe6);
        paneld1e7 = (LinearLayout) findViewById(R.id.panelday1exe7);
        paneld1e8 = (LinearLayout) findViewById(R.id.panelday1exe8);



        paneld2e1 = (LinearLayout) findViewById(R.id.panelday2exe1);
        paneld2e2 = (LinearLayout) findViewById(R.id.panelday2exe2);
        paneld2e3 = (LinearLayout) findViewById(R.id.panelday2exe3);



        paneld3e1 = (LinearLayout) findViewById(R.id.panelday3exe1);
        paneld3e2 = (LinearLayout) findViewById(R.id.panelday3exe2);
        paneld3e3 = (LinearLayout) findViewById(R.id.panelday3exe3);
        paneld3e4 = (LinearLayout) findViewById(R.id.panelday3exe4);
        paneld3e5 = (LinearLayout) findViewById(R.id.panelday3exe5);
        paneld3e6 = (LinearLayout) findViewById(R.id.panelday3exe6);
        paneld3e7 = (LinearLayout) findViewById(R.id.panelday3exe7);
        paneld3e8 = (LinearLayout) findViewById(R.id.panelday3exe8);


        paneld4e1 = (LinearLayout) findViewById(R.id.panelday4exe1);
        paneld4e2 = (LinearLayout) findViewById(R.id.panelday4exe2);
        paneld4e3 = (LinearLayout) findViewById(R.id.panelday4exe3);


        paneld5e1 = (LinearLayout) findViewById(R.id.panelday5exe1);
        paneld5e2 = (LinearLayout) findViewById(R.id.panelday5exe2);
        paneld5e3 = (LinearLayout) findViewById(R.id.panelday5exe3);
        paneld5e4 = (LinearLayout) findViewById(R.id.panelday5exe4);
        paneld5e5 = (LinearLayout) findViewById(R.id.panelday5exe5);
        paneld5e6 = (LinearLayout) findViewById(R.id.panelday5exe6);


        paneld6e1 = (LinearLayout) findViewById(R.id.panelday6exe1);
        paneld6e2 = (LinearLayout) findViewById(R.id.panelday6exe2);
        paneld6e3 = (LinearLayout) findViewById(R.id.panelday6exe3);

        //panel1.setVisibility(View.VISIBLE);

        //panel1.setVisibility(View.VISIBLE);

        //Log.v("CZ","height at first ..." + panel1.getMeasuredHeight());

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);

        textm1 = (TextView) findViewById(R.id.textm1);
        textm2 = (TextView) findViewById(R.id.textm2);
        textm3 = (TextView) findViewById(R.id.textm3);
        textm4 = (TextView) findViewById(R.id.textm4);
        textm5 = (TextView) findViewById(R.id.textm5);
        textm6 = (TextView) findViewById(R.id.textm6);


        texta1 = (TextView) findViewById(R.id.texta1);
        texta2 = (TextView) findViewById(R.id.texta2);
        texta3 = (TextView) findViewById(R.id.texta3);
        texta4 = (TextView) findViewById(R.id.texta4);
        texta5 = (TextView) findViewById(R.id.texta5);


        textd1exe1 = (TextView) findViewById(R.id.day1exe1);
        textd1exe2 = (TextView) findViewById(R.id.day1exe2);
        textd1exe3 = (TextView) findViewById(R.id.day1exe3);
        textd1exe4 = (TextView) findViewById(R.id.day1exe4);
        textd1exe5 = (TextView) findViewById(R.id.day1exe5);
        textd1exe6 = (TextView) findViewById(R.id.day1exe6);
        textd1exe7 = (TextView) findViewById(R.id.day1exe7);
        textd1exe8 = (TextView) findViewById(R.id.day1exe8);


        textd2exe1 = (TextView) findViewById(R.id.day2exe1);
        textd2exe2 = (TextView) findViewById(R.id.day2exe2);
        textd2exe3 = (TextView) findViewById(R.id.day2exe3);



        textd3exe1 = (TextView) findViewById(R.id.day3exe1);
        textd3exe2 = (TextView) findViewById(R.id.day3exe2);
        textd3exe3 = (TextView) findViewById(R.id.day3exe3);
        textd3exe4 = (TextView) findViewById(R.id.day3exe4);
        textd3exe5 = (TextView) findViewById(R.id.day3exe5);
        textd3exe6 = (TextView) findViewById(R.id.day3exe6);
        textd3exe7 = (TextView) findViewById(R.id.day3exe7);
        textd3exe8 = (TextView) findViewById(R.id.day3exe8);


        textd4exe1 = (TextView) findViewById(R.id.day4exe1);
        textd4exe2 = (TextView) findViewById(R.id.day4exe2);
        textd4exe3 = (TextView) findViewById(R.id.day4exe3);


        textd5exe1 = (TextView) findViewById(R.id.day5exe1);
        textd5exe2 = (TextView) findViewById(R.id.day5exe2);
        textd5exe3 = (TextView) findViewById(R.id.day5exe3);
        textd5exe4 = (TextView) findViewById(R.id.day5exe4);
        textd5exe5 = (TextView) findViewById(R.id.day5exe5);
        textd5exe6 = (TextView) findViewById(R.id.day5exe6);


        textd6exe1 = (TextView) findViewById(R.id.day6exe1);
        textd6exe2 = (TextView) findViewById(R.id.day6exe2);
        textd6exe3 = (TextView) findViewById(R.id.day6exe3);



        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        text6.setOnClickListener(this);

        textm1.setOnClickListener(this);
        textm2.setOnClickListener(this);
        textm3.setOnClickListener(this);
        textm4.setOnClickListener(this);
        textm5.setOnClickListener(this);
        textm6.setOnClickListener(this);

        texta1.setOnClickListener(this);
        texta2.setOnClickListener(this);
        texta3.setOnClickListener(this);
        texta4.setOnClickListener(this);
        texta5.setOnClickListener(this);


        textd1exe1.setOnClickListener(this);
        textd1exe2.setOnClickListener(this);
        textd1exe3.setOnClickListener(this);
        textd1exe4.setOnClickListener(this);
        textd1exe5.setOnClickListener(this);
        textd1exe6.setOnClickListener(this);
        textd1exe7.setOnClickListener(this);
        textd1exe8.setOnClickListener(this);



        textd2exe1.setOnClickListener(this);
        textd2exe2.setOnClickListener(this);
        textd2exe3.setOnClickListener(this);


        textd3exe1.setOnClickListener(this);
        textd3exe2.setOnClickListener(this);
        textd3exe3.setOnClickListener(this);
        textd3exe4.setOnClickListener(this);
        textd3exe5.setOnClickListener(this);
        textd3exe6.setOnClickListener(this);


        textd4exe1.setOnClickListener(this);
        textd4exe2.setOnClickListener(this);
        textd4exe3.setOnClickListener(this);

        textd5exe1.setOnClickListener(this);
        textd5exe2.setOnClickListener(this);
        textd5exe3.setOnClickListener(this);
        textd5exe4.setOnClickListener(this);
        textd5exe5.setOnClickListener(this);
        textd5exe6.setOnClickListener(this);


        textd6exe1.setOnClickListener(this);
        textd6exe2.setOnClickListener(this);
        textd6exe3.setOnClickListener(this);

        videoView =(VideoView)findViewById(R.id.day1exe1video);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));

        videoView2 =(VideoView)findViewById(R.id.day1exe2video);
        videoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        videoView3 =(VideoView)findViewById(R.id.day1exe3video);
        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));
        //Creating MediaController
        MediaController mediaController3= new MediaController(this);
        mediaController.setAnchorView(videoView3);


        videoView4 =(VideoView)findViewById(R.id.day1exe4video);
        videoView4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));
        //Creating MediaController
        MediaController mediaController4= new MediaController(this);
        mediaController.setAnchorView(videoView4);



        videoView5 =(VideoView)findViewById(R.id.day1exe5video);
        videoView5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));
        //Creating MediaController
        MediaController mediaController5= new MediaController(this);
        mediaController.setAnchorView(videoView5);



        videoView6 =(VideoView)findViewById(R.id.day1exe3video);
        videoView6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.day1exe1));
        //Creating MediaController
        MediaController mediaController6= new MediaController(this);
        mediaController.setAnchorView(videoView6);

        //specify the location of media file
        //Uri uri= Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/videos/day1exe1.mp4");




        //Setting MediaController and URI, then starting the videoView
        //videoView.setMediaController(mediaController);
        //videoView.setVideoURI(uri);
        //videoView.requestFocus();
        //videoView.start();






        //Creating MediaController
        MediaController mediaController2= new MediaController(this);
        mediaController2.setAnchorView(videoView2);

        //specify the location of media file
        //Uri uri= Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/videos/day1exe1.mp4");




        //Setting MediaController and URI, then starting the videoView
        //videoView.setMediaController(mediaController);
        //videoView.setVideoURI(uri);
        // videoView2.requestFocus();
        //videoView2.start();

    }

    @Override
    public void onClick(View v) {

        hideOthersday1(v);
        hideOthersday2(v);
        hideOthersday3(v);
        hideOthersday4(v);
        hideOthersday5(v);
        hideOthersday6(v);
        hideOthers(v);
    }

    private void hideThemAll() {
        if (openLayout == null) return;
        if (openLayout == panel1)
            panel1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
        if (openLayout == panel2)
            panel2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
        if (openLayout == panel3)
            panel3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
        if (openLayout == panel4)
            panel4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
        if (openLayout == panel5)
            panel5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
        if (openLayout == panel6)
            panel6.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel6, true));

        if (openLayout == panelm1)
            panelm1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm1, true));
        if (openLayout == panelm2)
            panelm2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm2, true));
        if (openLayout == panelm3)
            panelm3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm3, true));
        if (openLayout == panelm4)
            panelm4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm4, true));
        if (openLayout == panelm5)
            panelm5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm5, true));
        if (openLayout == panelm6)
            panelm6.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm6, true));


        if (openLayout == panela1)
            panela1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela1, true));
        if (openLayout == panela2)
            panela2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela2, true));
        if (openLayout == panela3)
            panela3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela3, true));
        if (openLayout == panela4)
            panela4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela4, true));
        if (openLayout == panela5)
            panela5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela5, true));

    }

    private void hideOthers(View layoutView) {
        {
            int v;
            if (layoutView.getId() == R.id.text1) {
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
            } else if (layoutView.getId() == R.id.text2) {
                v = panel2.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
                }
            } else if (layoutView.getId() == R.id.text3) {
                v = panel3.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
                }
            } else if (layoutView.getId() == R.id.text4) {
                v = panel4.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
                }
            } else if (layoutView.getId() == R.id.text5) {
                v = panel5.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
                }
            }else if (layoutView.getId() == R.id.text6) {
                v = panel6.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panel6.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel6, true));
                }
            }
            /*if (layoutView.getId() == R.id.day1exe1) {
            v = paneld1e1.getVisibility();
            *//*if (v != View.VISIBLE) {


                paneld1e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld1e1.getHeight());
            }*//*

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday1();
            if (v != View.VISIBLE) {

                paneld1e1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e1, true));
            }
        } else if (layoutView.getId() == R.id.day1exe2) {
            v = paneld1e2.getVisibility();
                hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e2, true));
            }
        }*/










            if (layoutView.getId() == R.id.textm1) {
                v = panelm1.getVisibility();
                if (v != View.VISIBLE) {


                    panelm1.setVisibility(View.VISIBLE);




                    Log.v("CZ", "height..." + panelm1.getHeight());
                }

                //panel1.setVisibility(View.GONE);
                //Log.v("CZ","again height..." + panel1.getHeight());
                hideThemAll();

                if (v != View.VISIBLE) {
                    panelm1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm1, true));
                }
            } else if (layoutView.getId() == R.id.textm2) {
                v = panelm2.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panelm2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm2, true));
                }
            } else if (layoutView.getId() == R.id.textm3) {
                v = panelm3.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panelm3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm3, true));
                }
            } else if (layoutView.getId() == R.id.textm4) {
                v = panelm4.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panelm4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm4, true));
                }
            } else if (layoutView.getId() == R.id.textm5) {
                v = panelm5.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panelm5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm5, true));
                }
            }else if (layoutView.getId() == R.id.textm6) {
                v = panelm6.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panelm6.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panelm6, true));
                }
            }


            if (layoutView.getId() == R.id.texta1) {
                v = panela1.getVisibility();
                if (v != View.VISIBLE) {


                    panela1.setVisibility(View.VISIBLE);




                    Log.v("CZ", "height..." + panela1.getHeight());
                }

                //panel1.setVisibility(View.GONE);
                //Log.v("CZ","again height..." + panel1.getHeight());
                hideThemAll();

                if (v != View.VISIBLE) {
                    panela1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela1, true));
                }
            } else if (layoutView.getId() == R.id.texta2) {
                v = panela2.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela2, true));
                }
            } else if (layoutView.getId() == R.id.texta3) {
                v = panela3.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela3, true));
                }
            } else if (layoutView.getId() == R.id.texta4) {
                v = panela4.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela4, true));
                }
            } else if (layoutView.getId() == R.id.texta5) {
                v = panela5.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela5, true));
                }
            }


        }
    }

    private void hideOthersday1(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day1exe1) {
            videoView.start();
            v = paneld1e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld1e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld1e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday1();
            if (v != View.VISIBLE) {

                paneld1e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e1, true));
            }
        } else if (layoutView.getId() == R.id.day1exe2) {
            videoView2.start();

            v = paneld1e2.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e2, true));
            }
        }else if (layoutView.getId() == R.id.day1exe3) {
            videoView3.start();
            v = paneld1e3.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e3, true));
            }
        }else if (layoutView.getId() == R.id.day1exe4) {
            videoView4.start();
            v = paneld1e4.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e4, true));
            }
        }else if (layoutView.getId() == R.id.day1exe5) {
            videoView5.start();
            v = paneld1e5.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e5, true));
            }
        }else if (layoutView.getId() == R.id.day1exe6) {
            videoView6.start();
            v = paneld1e6.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e6, true));
            }
        }else if (layoutView.getId() == R.id.day1exe7) {
            videoView2.start();
            v = paneld1e7.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e7, true));
            }
        }else if (layoutView.getId() == R.id.day1exe8) {
            videoView2.start();
            v = paneld1e8.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e8, true));
            }
        }
    }


    private void hideThemAllday1() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld1e1) {

            paneld1e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e1, true));
        }
        if (openLayout2 == paneld1e2)
            paneld1e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e2, true));


        if (openLayout2 == paneld1e3)
            paneld1e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e3, true));

        if (openLayout2 == paneld1e4)
            paneld1e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e4, true));

        if (openLayout2 == paneld1e5)
            paneld1e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e5, true));

        if (openLayout2 == paneld1e6)
            paneld1e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e6, true));

        if (openLayout2 == paneld1e7)
            paneld1e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e7, true));

        if (openLayout2 == paneld1e8)
            paneld1e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e8, true));

    }

    private  void hideOthersday2(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day2exe1) {
            videoView.start();
            v = paneld2e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld2e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld2e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday2();
            if (v != View.VISIBLE) {

                paneld2e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e1, true));
            }
        } else if (layoutView.getId() == R.id.day2exe2) {
            videoView2.start();
            v = paneld2e2.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e2, true));
            }
        }else if (layoutView.getId() == R.id.day2exe3) {
            videoView2.start();
            v = paneld2e3.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e3, true));
            }
        }
    }


    private void hideThemAllday2() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld2e1)
            paneld2e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e1, true));

        if (openLayout2 == paneld2e2)
            paneld2e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e2, true));


        if (openLayout2 == paneld2e3)
            paneld2e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e3, true));


    }

    private void hideOthersday3(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day3exe1) {
            videoView.start();
            v = paneld3e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld3e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld3e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday3();
            if (v != View.VISIBLE) {

                paneld3e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e1, true));
            }
        } else if (layoutView.getId() == R.id.day3exe2) {
            videoView2.start();
            v = paneld3e2.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e2, true));
            }
        }else if (layoutView.getId() == R.id.day3exe3) {
            videoView2.start();
            v = paneld3e3.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e3, true));
            }
        }else if (layoutView.getId() == R.id.day3exe4) {
            videoView2.start();
            v = paneld3e4.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e4, true));
            }
        }else if (layoutView.getId() == R.id.day3exe5) {
            videoView2.start();
            v = paneld3e5.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e5, true));
            }
        }else if (layoutView.getId() == R.id.day3exe6) {
            videoView2.start();
            v = paneld3e6.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e6, true));
            }
        }else if (layoutView.getId() == R.id.day3exe7) {
            videoView2.start();
            v = paneld3e7.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e7, true));
            }
        }else if (layoutView.getId() == R.id.day3exe8) {
            videoView2.start();
            v = paneld3e8.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e8, true));
            }
        }
    }


    private void hideThemAllday3() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld3e1)
            paneld3e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e1, true));

        if (openLayout2 == paneld3e2)
            paneld3e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e2, true));


        if (openLayout2 == paneld3e3)
            paneld3e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e3, true));

        if (openLayout2 == paneld3e4)
            paneld3e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e4, true));

        if (openLayout2 == paneld3e5)
            paneld3e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e5, true));

        if (openLayout2 == paneld3e6)
            paneld3e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e6, true));

        if (openLayout2 == paneld3e7)
            paneld3e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e7, true));

        if (openLayout2 == paneld3e8)
            paneld3e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e8, true));


    }


    private void hideThemAllday4() {

        if (openLayout2 == null) return;
        if (openLayout2 == paneld4e1)
            paneld4e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e1, true));

        if (openLayout2 == paneld4e2)
            paneld4e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e2, true));


        if (openLayout2 == paneld4e3)
            paneld4e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e3, true));


    }

    private void hideOthersday4(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.day4exe1) {
            videoView.start();
            v = paneld4e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld2e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld2e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday4();
            if (v != View.VISIBLE) {

                paneld4e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e1, true));
            }
        } else if (layoutView.getId() == R.id.day4exe2) {
            videoView2.start();
            v = paneld4e2.getVisibility();
            hideThemAllday4();
            if (v != View.VISIBLE) {
                paneld4e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e2, true));
            }
        }else if (layoutView.getId() == R.id.day4exe3) {
            videoView2.start();
            v = paneld4e3.getVisibility();
            hideThemAllday4();
            if (v != View.VISIBLE) {
                paneld4e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld4e3, true));
            }
        }
    }

    private void hideThemAllday5() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld5e1) {

           /* videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);*/
            paneld5e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e1, true));
        }
        if (openLayout2 == paneld5e2) {
           /* videoView17.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);*/
            paneld5e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e2, true));
        }

        if (openLayout2 == paneld5e3) {
           /* videoView18.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);*/
            paneld5e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e3, true));
        }
        if (openLayout2 == paneld5e4) {
           /* videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);*/
            paneld5e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e4, true));

        }
        if (openLayout2 == paneld5e5) {
           /* videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);*/
            paneld5e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e5, true));
        }
        if (openLayout2 == paneld5e6) {
           /* videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);*/
            paneld5e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e6, true));
        }


    }

    private void hideOthersday5(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.day5exe1) {
            //videoView17.setVisibility(View.VISIBLE);
            //videoView17.start();
            v = paneld5e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld3e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld3e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday5();
            if (v != View.VISIBLE) {

                paneld5e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e1, true));
            }
        } else if (layoutView.getId() == R.id.day5exe2) {
            //videoView18.setVisibility(View.VISIBLE);

            //videoView18.start();
            v = paneld5e2.getVisibility();
            hideThemAllday5();
            if (v != View.VISIBLE) {
                paneld5e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e2, true));
            }
        }else if (layoutView.getId() == R.id.day5exe3) {
            //videoView19.setVisibility(View.VISIBLE);

            //videoView19.start();
            v = paneld5e3.getVisibility();
            hideThemAllday5();
            if (v != View.VISIBLE) {
                paneld5e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e3, true));
            }
        }else if (layoutView.getId() == R.id.day5exe4) {
            //videoView20.setVisibility(View.VISIBLE);

            //videoView20.start();
            v = paneld5e4.getVisibility();
            hideThemAllday5();
            if (v != View.VISIBLE) {
                paneld5e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e4, true));
            }
        }else if (layoutView.getId() == R.id.day5exe5) {
            //videoView21.setVisibility(View.VISIBLE);

            //videoView21.start();
            v = paneld5e5.getVisibility();
            hideThemAllday5();
            if (v != View.VISIBLE) {
                paneld5e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e5, true));
            }
        }else if (layoutView.getId() == R.id.day5exe6) {
            //videoView22.setVisibility(View.VISIBLE);

            //videoView22.start();
            v = paneld5e6.getVisibility();
            hideThemAllday5();
            if (v != View.VISIBLE) {
                paneld5e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld5e6, true));
            }
        }

    }


    private void hideThemAllday6() {

    }

    private void hideOthersday6(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.day6exe1) {
            videoView.start();
            v = paneld6e1.getVisibility();
            /*if (v != View.VISIBLE) {


                paneld2e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + paneld2e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllday6();
            if (v != View.VISIBLE) {

                paneld6e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld6e1, true));
            }
        } else if (layoutView.getId() == R.id.day6exe2) {
            videoView2.start();
            v = paneld6e2.getVisibility();
            hideThemAllday6();
            if (v != View.VISIBLE) {
                paneld6e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld6e2, true));
            }
        }else if (layoutView.getId() == R.id.day6exe3) {
            videoView2.start();
            v = paneld6e3.getVisibility();
            hideThemAllday6();
            if (v != View.VISIBLE) {
                paneld6e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld6e3, true));
            }
        }

    }
}

