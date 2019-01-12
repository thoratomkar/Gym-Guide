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

public class MuscleGain extends AppCompatActivity implements View.OnClickListener{

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

    LinearLayout paneld3e1, paneld3e2, paneld3e3, paneld3e4, paneld3e5,paneld3e6;
    TextView textd3exe1, textd3exe2,textd3exe3, textd3exe4,textd3exe5, textd3exe6;


    LinearLayout panelmd1e1, panelmd1e2, panelmd1e3, panelmd1e4, panelmd1e5,panelmd1e6,panelmd1e7,panelmd1e8;
    TextView textmd1exe1, textmd1exe2,textmd1exe3, textmd1exe4,textmd1exe5, textmd1exe6,textmd1exe7, textmd1exe8;

    LinearLayout panelmd2e1, panelmd2e2, panelmd2e3, panelmd2e4, panelmd2e5;
    TextView textmd2exe1, textmd2exe2,textmd2exe3, textmd2exe4,textmd2exe5;

     LinearLayout panelmd3e1, panelmd3e2, panelmd3e3, panelmd3e4;
     TextView textmd3exe1, textmd3exe2,textmd3exe3, textmd3exe4;



    LinearLayout panelmd4e1, panelmd4e2, panelmd4e3, panelmd4e4, panelmd4e5;
    TextView textmd4exe1, textmd4exe2,textmd4exe3, textmd4exe4,textmd4exe5;


    LinearLayout panelmd5e1, panelmd5e2, panelmd5e3, panelmd5e4, panelmd5e5,panelmd5e6, panelmd5e7, panelmd5e8, panelmd5e9, panelmd5e10, panelmd5e11;
    TextView textmd5exe1, textmd5exe2,textmd5exe3, textmd5exe4,textmd5exe5,textmd5exe6, textmd5exe7,textmd5exe8, textmd5exe9,textmd5exe10,textmd5exe11;


    LinearLayout panelmd6e1, panelmd6e2, panelmd6e3, panelmd6e4, panelmd6e5;
    TextView textmd6exe1, textmd6exe2,textmd6exe3, textmd6exe4,textmd6exe5;



    LinearLayout panelad1e1, panelad1e2, panelad1e3, panelad1e4, panelad1e5,panelad1e6, panelad1e7, panelad1e8, panelad1e9, panelad1e10, panelad1e11;
    TextView textad1exe1, textad1exe2,textad1exe3, textad1exe4,textad1exe5,textad1exe6, textad1exe7,textad1exe8, textad1exe9,textad1exe10,textad1exe11;




    LinearLayout panelad3e1, panelad3e2, panelad3e3, panelad3e4, panelad3e5,panelad3e6, panelad3e7, panelad3e8, panelad3e9, panelad3e10, panelad3e11,panelad3e12, panelad3e13;
    TextView textad3exe1, textad3exe2,textad3exe3, textad3exe4,textad3exe5,textad3exe6, textad3exe7,textad3exe8, textad3exe9,textad3exe10,textad3exe11,textad3exe12, textad3exe13;



    LinearLayout panelad2e1, panelad2e2, panelad2e3, panelad2e4;
    TextView textad2exe1, textad2exe2,textad2exe3, textad2exe4;



    LinearLayout panelad4e1, panelad4e2, panelad4e3, panelad4e4;
    TextView textad4exe1, textad4exe2,textad4exe3, textad4exe4;





    public static View openLayout;
    public static View openLayout2;
    public static VideoView videoView2,videoView,videoView3,videoView4,videoView5,videoView6,videoView7,videoView8,videoView9,videoView10,videoView11,videoView12,
            videoView13,videoView14,videoView15,videoView24,videoView23,videoView16,videoView17,videoView18,videoView19,videoView20,videoView21,videoView22,
            videoView33,videoView34,videoView35,videoView36,videoView25,videoView26,videoView27,videoView28,videoView29,videoView30,videoView31,videoView32,
            videoView42,videoView41,videoView43,videoView44,videoView45,videoView46,videoView47,videoView48,videoView49,videoView50,
    videoView52,videoView51,videoView53,videoView54,videoView55,videoView56,videoView57,videoView58,videoView59,videoView60,videoView37,videoView38,videoView39,videoView40,
            videoView62,videoView61,videoView63,videoView64,videoView65,videoView66,videoView67,videoView68,videoView69,videoView70,
            videoView82,videoView81,videoView83,videoView84,videoView85,videoView86,videoView87,videoView88,videoView89,videoView90,
    videoView72,videoView71,videoView73,videoView74,videoView75,videoView76,videoView77,videoView78,videoView79,videoView80, videoView92,videoView91;

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
        /*panela5 = (LinearLayout) findViewById(R.id.panela5);
        panela6 = (LinearLayout) findViewById(R.id.panela6);*/
       /* panel4 = (LinearLayout) findViewById(R.id.panel4);
        panel5 = (LinearLayout) findViewById(R.id.panel5);
        panel6 = (LinearLayout) findViewById(R.id.panel6);*/

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
        paneld2e4 = (LinearLayout) findViewById(R.id.panelday2exe4);
        paneld2e5 = (LinearLayout) findViewById(R.id.panelday2exe5);
        paneld2e6 = (LinearLayout) findViewById(R.id.panelday2exe6);
        paneld2e7 = (LinearLayout) findViewById(R.id.panelday2exe7);
        paneld2e8 = (LinearLayout) findViewById(R.id.panelday2exe8);


        paneld3e1 = (LinearLayout) findViewById(R.id.panelday3exe1);
        paneld3e2 = (LinearLayout) findViewById(R.id.panelday3exe2);
        paneld3e3 = (LinearLayout) findViewById(R.id.panelday3exe3);
        paneld3e4 = (LinearLayout) findViewById(R.id.panelday3exe4);
        paneld3e5 = (LinearLayout) findViewById(R.id.panelday3exe5);
        paneld3e6 = (LinearLayout) findViewById(R.id.panelday3exe6);



        panelmd1e1 = (LinearLayout) findViewById(R.id.panelmday1exe1);
        panelmd1e2 = (LinearLayout) findViewById(R.id.panelmday1exe2);
        panelmd1e3 = (LinearLayout) findViewById(R.id.panelmday1exe3);
        panelmd1e4 = (LinearLayout) findViewById(R.id.panelmday1exe4);
        panelmd1e5 = (LinearLayout) findViewById(R.id.panelmday1exe5);
        panelmd1e6 = (LinearLayout) findViewById(R.id.panelmday1exe6);
        panelmd1e7 = (LinearLayout) findViewById(R.id.panelmday1exe7);
        panelmd1e8 = (LinearLayout) findViewById(R.id.panelmday1exe8);


        panelmd2e1 = (LinearLayout) findViewById(R.id.panelmday2exe1);
        panelmd2e2 = (LinearLayout) findViewById(R.id.panelmday2exe2);
        panelmd2e3 = (LinearLayout) findViewById(R.id.panelmday2exe3);
        panelmd2e4 = (LinearLayout) findViewById(R.id.panelmday2exe4);
        panelmd2e5 = (LinearLayout) findViewById(R.id.panelmday2exe5);



        panelmd3e1 = (LinearLayout) findViewById(R.id.panelmday3exe1);
        panelmd3e2 = (LinearLayout) findViewById(R.id.panelmday3exe2);
        panelmd3e3 = (LinearLayout) findViewById(R.id.panelmday3exe3);
        panelmd3e4 = (LinearLayout) findViewById(R.id.panelmday3exe4);



        panelmd4e1 = (LinearLayout) findViewById(R.id.panelmday4exe1);
        panelmd4e2 = (LinearLayout) findViewById(R.id.panelmday4exe2);
        panelmd4e3 = (LinearLayout) findViewById(R.id.panelmday4exe3);
        panelmd4e4 = (LinearLayout) findViewById(R.id.panelmday4exe4);
        panelmd4e5 = (LinearLayout) findViewById(R.id.panelmday4exe5);








        panelmd5e1 = (LinearLayout) findViewById(R.id.panelmday5exe1);
        panelmd5e2 = (LinearLayout) findViewById(R.id.panelmday5exe2);
        panelmd5e3 = (LinearLayout) findViewById(R.id.panelmday5exe3);
        panelmd5e4 = (LinearLayout) findViewById(R.id.panelmday5exe4);
        panelmd5e5 = (LinearLayout) findViewById(R.id.panelmday5exe5);
        panelmd5e6 = (LinearLayout) findViewById(R.id.panelmday5exe6);
        panelmd5e7 = (LinearLayout) findViewById(R.id.panelmday5exe7);
        panelmd5e8 = (LinearLayout) findViewById(R.id.panelmday5exe8);
        panelmd5e9 = (LinearLayout) findViewById(R.id.panelmday5exe9);
        panelmd5e10 = (LinearLayout) findViewById(R.id.panelmday5exe10);
        panelmd5e11 = (LinearLayout) findViewById(R.id.panelmday5exe11);







        panelmd6e1 = (LinearLayout) findViewById(R.id.panelmday6exe1);
        panelmd6e2 = (LinearLayout) findViewById(R.id.panelmday6exe2);
        panelmd6e3 = (LinearLayout) findViewById(R.id.panelmday6exe3);
        panelmd6e4 = (LinearLayout) findViewById(R.id.panelmday6exe4);
        panelmd6e5 = (LinearLayout) findViewById(R.id.panelmday6exe5);









        panelad1e1 = (LinearLayout) findViewById(R.id.paneladay1exe1);
        panelad1e2 = (LinearLayout) findViewById(R.id.paneladay1exe2);
        panelad1e3 = (LinearLayout) findViewById(R.id.paneladay1exe3);
        panelad1e4 = (LinearLayout) findViewById(R.id.paneladay1exe4);
        panelad1e5 = (LinearLayout) findViewById(R.id.paneladay1exe5);
        panelad1e6 = (LinearLayout) findViewById(R.id.paneladay1exe6);
        panelad1e7 = (LinearLayout) findViewById(R.id.paneladay1exe7);
        panelad1e8 = (LinearLayout) findViewById(R.id.paneladay1exe8);
        panelad1e9 = (LinearLayout) findViewById(R.id.paneladay1exe9);
        panelad1e10 = (LinearLayout) findViewById(R.id.paneladay1exe10);
        panelad1e11 = (LinearLayout) findViewById(R.id.paneladay1exe11);


        panelad2e1 = (LinearLayout) findViewById(R.id.paneladay2exe1);
        panelad2e2 = (LinearLayout) findViewById(R.id.paneladay2exe2);
        panelad2e3 = (LinearLayout) findViewById(R.id.paneladay2exe3);
        panelad2e4 = (LinearLayout) findViewById(R.id.paneladay2exe4);



        panelad3e1 = (LinearLayout) findViewById(R.id.paneladay3exe1);
        panelad3e2 = (LinearLayout) findViewById(R.id.paneladay3exe2);
        panelad3e3 = (LinearLayout) findViewById(R.id.paneladay3exe3);
        panelad3e4 = (LinearLayout) findViewById(R.id.paneladay3exe4);
        panelad3e5 = (LinearLayout) findViewById(R.id.paneladay3exe5);
        panelad3e6 = (LinearLayout) findViewById(R.id.paneladay3exe6);
        panelad3e7 = (LinearLayout) findViewById(R.id.paneladay3exe7);
        panelad3e8 = (LinearLayout) findViewById(R.id.paneladay3exe8);
        panelad3e9 = (LinearLayout) findViewById(R.id.paneladay3exe9);
        panelad3e10 = (LinearLayout) findViewById(R.id.paneladay3exe10);
        panelad3e11 = (LinearLayout) findViewById(R.id.paneladay3exe11);
        panelad3e12 = (LinearLayout) findViewById(R.id.paneladay3exe12);
        panelad3e13 = (LinearLayout) findViewById(R.id.paneladay3exe13);


        panelad4e1 = (LinearLayout) findViewById(R.id.paneladay4exe1);
        panelad4e2 = (LinearLayout) findViewById(R.id.paneladay4exe2);
        panelad4e3 = (LinearLayout) findViewById(R.id.paneladay4exe3);
        panelad4e4 = (LinearLayout) findViewById(R.id.paneladay4exe4);






        //panel1.setVisibility(View.VISIBLE);

        //panel1.setVisibility(View.VISIBLE);

        //Log.v("CZ","height at first ..." + panel1.getMeasuredHeight());

        text1 = (TextView) findViewById(R.id.text1);
        text2 = (TextView) findViewById(R.id.text2);
        text3 = (TextView) findViewById(R.id.text3);
        /*text4 = (TextView) findViewById(R.id.text4);
        text5 = (TextView) findViewById(R.id.text5);
        text6 = (TextView) findViewById(R.id.text6);*/

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
        /*texta5 = (TextView) findViewById(R.id.texta5);
        texta6 = (TextView) findViewById(R.id.texta6);*/

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
        textd2exe4 = (TextView) findViewById(R.id.day2exe4);
        textd2exe5 = (TextView) findViewById(R.id.day2exe5);
        textd2exe6 = (TextView) findViewById(R.id.day2exe6);
        textd2exe7 = (TextView) findViewById(R.id.day2exe7);
        textd2exe8 = (TextView) findViewById(R.id.day2exe8);


        textd3exe1 = (TextView) findViewById(R.id.day3exe1);
        textd3exe2 = (TextView) findViewById(R.id.day3exe2);
        textd3exe3 = (TextView) findViewById(R.id.day3exe3);
        textd3exe4 = (TextView) findViewById(R.id.day3exe4);
        textd3exe5 = (TextView) findViewById(R.id.day3exe5);
        textd3exe6 = (TextView) findViewById(R.id.day3exe6);




        textmd1exe1 = (TextView) findViewById(R.id.mday1exe1);
        textmd1exe2 = (TextView) findViewById(R.id.mday1exe2);
        textmd1exe3 = (TextView) findViewById(R.id.mday1exe3);
        textmd1exe4 = (TextView) findViewById(R.id.mday1exe4);
        textmd1exe5 = (TextView) findViewById(R.id.mday1exe5);
        textmd1exe6 = (TextView) findViewById(R.id.mday1exe6);
        textmd1exe7 = (TextView) findViewById(R.id.mday1exe7);
        textmd1exe8 = (TextView) findViewById(R.id.mday1exe8);




        textmd2exe1 = (TextView) findViewById(R.id.mday2exe1);
        textmd2exe2 = (TextView) findViewById(R.id.mday2exe2);
        textmd2exe3 = (TextView) findViewById(R.id.mday2exe3);
        textmd2exe4 = (TextView) findViewById(R.id.mday2exe4);
        textmd2exe5 = (TextView) findViewById(R.id.mday2exe5);




        textmd3exe1 = (TextView) findViewById(R.id.mday3exe1);
        textmd3exe2 = (TextView) findViewById(R.id.mday3exe2);
        textmd3exe3 = (TextView) findViewById(R.id.mday3exe3);
        textmd3exe4 = (TextView) findViewById(R.id.mday3exe4);



        textmd4exe1 = (TextView) findViewById(R.id.mday4exe1);
        textmd4exe2 = (TextView) findViewById(R.id.mday4exe2);
        textmd4exe3 = (TextView) findViewById(R.id.mday4exe3);
        textmd4exe4 = (TextView) findViewById(R.id.mday4exe4);
        textmd4exe5 = (TextView) findViewById(R.id.mday4exe5);


        textmd5exe1 = (TextView) findViewById(R.id.mday5exe1);
        textmd5exe2 = (TextView) findViewById(R.id.mday5exe2);
        textmd5exe3 = (TextView) findViewById(R.id.mday5exe3);
        textmd5exe4 = (TextView) findViewById(R.id.mday5exe4);
        textmd5exe5 = (TextView) findViewById(R.id.mday5exe5);
        textmd5exe6 = (TextView) findViewById(R.id.mday5exe6);
        textmd5exe7 = (TextView) findViewById(R.id.mday5exe7);
        textmd5exe8 = (TextView) findViewById(R.id.mday5exe8);
        textmd5exe9 = (TextView) findViewById(R.id.mday5exe9);
        textmd5exe10 = (TextView) findViewById(R.id.mday5exe10);
        textmd5exe11 = (TextView) findViewById(R.id.mday5exe11);

        textmd6exe1 = (TextView) findViewById(R.id.mday6exe1);
        textmd6exe2 = (TextView) findViewById(R.id.mday6exe2);
        textmd6exe3 = (TextView) findViewById(R.id.mday6exe3);
        textmd6exe4 = (TextView) findViewById(R.id.mday6exe4);
        textmd6exe5 = (TextView) findViewById(R.id.mday6exe5);

        textad1exe1 = (TextView) findViewById(R.id.aday1exe1);
        textad1exe2 = (TextView) findViewById(R.id.aday1exe2);
        textad1exe3 = (TextView) findViewById(R.id.aday1exe3);
        textad1exe4 = (TextView) findViewById(R.id.aday1exe4);
        textad1exe5 = (TextView) findViewById(R.id.aday1exe5);
        textad1exe6 = (TextView) findViewById(R.id.aday1exe6);
        textad1exe7 = (TextView) findViewById(R.id.aday1exe7);
        textad1exe8 = (TextView) findViewById(R.id.aday1exe8);
        textad1exe9 = (TextView) findViewById(R.id.aday1exe9);
        textad1exe10 = (TextView) findViewById(R.id.aday1exe10);
        textad1exe11 = (TextView) findViewById(R.id.aday1exe11);


        textad2exe1 = (TextView) findViewById(R.id.aday2exe1);
        textad2exe2 = (TextView) findViewById(R.id.aday2exe2);
        textad2exe3 = (TextView) findViewById(R.id.aday2exe3);
        textad2exe4 = (TextView) findViewById(R.id.aday2exe4);



        textad3exe1 = (TextView) findViewById(R.id.aday3exe1);
        textad3exe2 = (TextView) findViewById(R.id.aday3exe2);
        textad3exe3 = (TextView) findViewById(R.id.aday3exe3);
        textad3exe4 = (TextView) findViewById(R.id.aday3exe4);
        textad3exe5 = (TextView) findViewById(R.id.aday3exe5);
        textad3exe6 = (TextView) findViewById(R.id.aday3exe6);
        textad3exe7 = (TextView) findViewById(R.id.aday3exe7);
        textad3exe8 = (TextView) findViewById(R.id.aday3exe8);
        textad3exe9 = (TextView) findViewById(R.id.aday3exe9);
        textad3exe10 = (TextView) findViewById(R.id.aday3exe10);
        textad3exe11 = (TextView) findViewById(R.id.aday3exe11);
        textad3exe12 = (TextView) findViewById(R.id.aday3exe12);
        textad3exe13 = (TextView) findViewById(R.id.aday3exe13);


        textad4exe1 = (TextView) findViewById(R.id.aday4exe1);
        textad4exe2 = (TextView) findViewById(R.id.aday4exe2);
        textad4exe3 = (TextView) findViewById(R.id.aday4exe3);
        textad4exe4 = (TextView) findViewById(R.id.aday4exe4);



        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        /*text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        text6.setOnClickListener(this);*/

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
   /*     texta5.setOnClickListener(this);
        texta6.setOnClickListener(this);*/

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
        textd2exe4.setOnClickListener(this);
        textd2exe5.setOnClickListener(this);
        textd2exe6.setOnClickListener(this);
        textd2exe7.setOnClickListener(this);
        textd2exe8.setOnClickListener(this);

        textd3exe1.setOnClickListener(this);
        textd3exe2.setOnClickListener(this);
        textd3exe3.setOnClickListener(this);
        textd3exe4.setOnClickListener(this);
        textd3exe5.setOnClickListener(this);
        textd3exe6.setOnClickListener(this);


        textmd1exe1.setOnClickListener(this);
        textmd1exe2.setOnClickListener(this);
        textmd1exe3.setOnClickListener(this);
        textmd1exe4.setOnClickListener(this);
        textmd1exe5.setOnClickListener(this);
        textmd1exe6.setOnClickListener(this);
        textmd1exe7.setOnClickListener(this);
        textmd1exe8.setOnClickListener(this);


        textmd2exe1.setOnClickListener(this);
        textmd2exe2.setOnClickListener(this);
        textmd2exe3.setOnClickListener(this);
        textmd2exe4.setOnClickListener(this);
        textmd2exe5.setOnClickListener(this);


        textmd3exe1.setOnClickListener(this);
        textmd3exe2.setOnClickListener(this);
        textmd3exe3.setOnClickListener(this);
        textmd3exe4.setOnClickListener(this);


        textmd4exe1.setOnClickListener(this);
        textmd4exe2.setOnClickListener(this);
        textmd4exe3.setOnClickListener(this);
        textmd4exe4.setOnClickListener(this);
        textmd4exe5.setOnClickListener(this);

        textmd5exe1.setOnClickListener(this);
        textmd5exe2.setOnClickListener(this);
        textmd5exe3.setOnClickListener(this);
        textmd5exe4.setOnClickListener(this);
        textmd5exe5.setOnClickListener(this);
        textmd5exe6.setOnClickListener(this);
        textmd5exe7.setOnClickListener(this);
        textmd5exe8.setOnClickListener(this);
        textmd5exe9.setOnClickListener(this);
        textmd5exe10.setOnClickListener(this);
        textmd5exe11.setOnClickListener(this);

        textmd6exe1.setOnClickListener(this);
        textmd6exe2.setOnClickListener(this);
        textmd6exe3.setOnClickListener(this);
        textmd6exe4.setOnClickListener(this);
        textmd6exe5.setOnClickListener(this);





        textad1exe1.setOnClickListener(this);
        textad1exe2.setOnClickListener(this);
        textad1exe3.setOnClickListener(this);
        textad1exe4.setOnClickListener(this);
        textad1exe5.setOnClickListener(this);
        textad1exe6.setOnClickListener(this);
        textad1exe7.setOnClickListener(this);
        textad1exe8.setOnClickListener(this);
        textad1exe9.setOnClickListener(this);
        textad1exe10.setOnClickListener(this);
        textad1exe11.setOnClickListener(this);


        textad2exe1.setOnClickListener(this);
        textad2exe2.setOnClickListener(this);
        textad2exe3.setOnClickListener(this);
        textad2exe4.setOnClickListener(this);



        textad3exe1.setOnClickListener(this);
        textad3exe2.setOnClickListener(this);
        textad3exe3.setOnClickListener(this);
        textad3exe4.setOnClickListener(this);
        textad3exe5.setOnClickListener(this);
        textad3exe6.setOnClickListener(this);
        textad3exe7.setOnClickListener(this);
        textad3exe8.setOnClickListener(this);
        textad3exe9.setOnClickListener(this);
        textad3exe10.setOnClickListener(this);
        textad3exe11.setOnClickListener(this);
        textad3exe12.setOnClickListener(this);
        textad3exe13.setOnClickListener(this);



        textad4exe1.setOnClickListener(this);
        textad4exe2.setOnClickListener(this);
        textad4exe3.setOnClickListener(this);
        textad4exe4.setOnClickListener(this);



        videoView =(VideoView)findViewById(R.id.day1exe1video);
        videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.inclinedbenchpress));

        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);



        videoView2 =(VideoView)findViewById(R.id.day1exe2video);
        videoView2.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.declinedbenchpress));
        //Creating MediaController
        MediaController mediaController2= new MediaController(this);
        mediaController2.setAnchorView(videoView2);

        videoView3 =(VideoView)findViewById(R.id.day1exe3video);
        videoView3.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.flatbenchpress));
        //Creating MediaController
        MediaController mediaController3= new MediaController(this);
        mediaController3.setAnchorView(videoView3);


        videoView4 =(VideoView)findViewById(R.id.day1exe4video);
        videoView4.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellfly));
        //Creating MediaController
        MediaController mediaController4= new MediaController(this);
        mediaController4.setAnchorView(videoView4);



        videoView5 =(VideoView)findViewById(R.id.day1exe5video);
        videoView5.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidelateralraise));
        //Creating MediaController
        MediaController mediaController5= new MediaController(this);
        mediaController5.setAnchorView(videoView5);



        videoView6 =(VideoView)findViewById(R.id.day1exe3video);
        videoView6.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cabletriceppushdown));
        //Creating MediaController
        MediaController mediaController6= new MediaController(this);
        mediaController6.setAnchorView(videoView6);



        videoView7 =(VideoView)findViewById(R.id.day1exe7video);
        videoView7.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bothhandoverheaddumbelltricep));
        //Creating MediaController
        MediaController mediaController7= new MediaController(this);
        mediaController7.setAnchorView(videoView7);


        videoView8 =(VideoView)findViewById(R.id.day1exe8video);
        videoView8.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableropepushdown));
        //Creating MediaController
        MediaController mediaController8= new MediaController(this);
        mediaController8.setAnchorView(videoView8);



        videoView9 =(VideoView)findViewById(R.id.day2exe1video);
        videoView9.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));
        //Creating MediaController
        MediaController mediaController9= new MediaController(this);
        mediaController9.setAnchorView(videoView9);



        videoView10 =(VideoView)findViewById(R.id.day2exe2video);
        videoView10.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableseatedrow));
        //Creating MediaController
        MediaController mediaController10= new MediaController(this);
        mediaController10.setAnchorView(videoView10);




        videoView11 =(VideoView)findViewById(R.id.day2exe3video);
        videoView11.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));

        MediaController mediaController11= new MediaController(this);
        mediaController11.setAnchorView(videoView11);



        videoView12 =(VideoView)findViewById(R.id.day2exe4video);
        videoView12.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellshrugs));
        //Creating MediaController
        MediaController mediaController12= new MediaController(this);
        mediaController12.setAnchorView(videoView12);

        videoView13 =(VideoView)findViewById(R.id.day2exe5video);
        videoView13.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepcablecurl));
        //Creating MediaController
        MediaController mediaController13= new MediaController(this);
        mediaController13.setAnchorView(videoView13);


        videoView14 =(VideoView)findViewById(R.id.day2exe6video);
        videoView14.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepspeachercurl));
        //Creating MediaController
        MediaController mediaController14= new MediaController(this);
        mediaController14.setAnchorView(videoView14);



        videoView15 =(VideoView)findViewById(R.id.day2exe7video);
        videoView15.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellbicepscurl));
        //Creating MediaController
        MediaController mediaController15= new MediaController(this);
        mediaController15.setAnchorView(videoView15);



        videoView16 =(VideoView)findViewById(R.id.day2exe8video);
        videoView16.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicephammercurl));
        //Creating MediaController
        MediaController mediaController16= new MediaController(this);
        mediaController16.setAnchorView(videoView16);



        videoView17 =(VideoView)findViewById(R.id.day3exe1video);
        videoView17.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.squat));
        //Creating MediaController
        MediaController mediaController17= new MediaController(this);
        mediaController17.setAnchorView(videoView17);


        videoView18 =(VideoView)findViewById(R.id.day3exe2video);
        videoView18.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController18= new MediaController(this);
        mediaController18.setAnchorView(videoView18);



        videoView19 =(VideoView)findViewById(R.id.day3exe3video);
        videoView19.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.seatedlegcurl));
        //Creating MediaController
        MediaController mediaController19= new MediaController(this);
        mediaController19.setAnchorView(videoView19);



        videoView20 =(VideoView)findViewById(R.id.day3exe4video);
        videoView20.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.standingcalfraise));
        //Creating MediaController
        MediaController mediaController20= new MediaController(this);
        mediaController20.setAnchorView(videoView20);



        videoView21 =(VideoView)findViewById(R.id.day3exe5video);
        videoView21.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.seatedcalfraise));

        MediaController mediaController21= new MediaController(this);
        mediaController21.setAnchorView(videoView21);




        videoView22 =(VideoView)findViewById(R.id.day3exe6video);
        videoView22.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hamstringcurl));
        //Creating MediaController
        MediaController mediaController22= new MediaController(this);
        mediaController22.setAnchorView(videoView22);

        videoView23 =(VideoView)findViewById(R.id.mday1exe1video);
        videoView23.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellforearms));
        //Creating MediaController
        MediaController mediaController23= new MediaController(this);
        mediaController23.setAnchorView(videoView23);


        videoView24 =(VideoView)findViewById(R.id.mday1exe2video);
        videoView24.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbellrow));
        //Creating MediaController
        MediaController mediaController24= new MediaController(this);
        mediaController24.setAnchorView(videoView24);



        videoView25 =(VideoView)findViewById(R.id.mday1exe3video);
        videoView25.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));
        //Creating MediaController
        MediaController mediaController25= new MediaController(this);
        mediaController25.setAnchorView(videoView25);



        videoView26 =(VideoView)findViewById(R.id.mday1exe4video);
        videoView26.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellrowsinglehand));
        //Creating MediaController
        MediaController mediaController26= new MediaController(this);
        mediaController26.setAnchorView(videoView26);



        videoView27 =(VideoView)findViewById(R.id.mday1exe5video);
        videoView27.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));
        //Creating MediaController
        MediaController mediaController27= new MediaController(this);
        mediaController27.setAnchorView(videoView27);


        videoView28 =(VideoView)findViewById(R.id.mday1exe6video);
        videoView28.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableseatedrow));
        //Creating MediaController
        MediaController mediaController28= new MediaController(this);
        mediaController28.setAnchorView(videoView28);



        videoView29 =(VideoView)findViewById(R.id.mday1exe7video);
        videoView29.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellshrugs));
        //Creating MediaController
        MediaController mediaController29= new MediaController(this);
        mediaController29.setAnchorView(videoView29);



        videoView30 =(VideoView)findViewById(R.id.mday1exe8video);
        videoView30.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbellshrugs));
        //Creating MediaController
        MediaController mediaController30= new MediaController(this);
        mediaController30.setAnchorView(videoView30);


        videoView31 =(VideoView)findViewById(R.id.mday2exe1video);
        videoView31.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.declinedbenchpress));

        MediaController mediaController31= new MediaController(this);
        mediaController31.setAnchorView(videoView31);



        videoView32 =(VideoView)findViewById(R.id.mday2exe2video);
        videoView32.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.inclinedbenchpress));
        //Creating MediaController
        MediaController mediaController32= new MediaController(this);
        mediaController32.setAnchorView(videoView32);

        videoView33 =(VideoView)findViewById(R.id.mday2exe3video);
        videoView33.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.flatbenchpress));
        //Creating MediaController
        MediaController mediaController33= new MediaController(this);
        mediaController33.setAnchorView(videoView33);


        videoView34 =(VideoView)findViewById(R.id.mday2exe4video);
        videoView34.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellfly));
        //Creating MediaController
        MediaController mediaController34= new MediaController(this);
        mediaController34.setAnchorView(videoView34);



        videoView35 =(VideoView)findViewById(R.id.mday2exe5video);
        videoView35.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellfly));
        //Creating MediaController
        MediaController mediaController35= new MediaController(this);
        mediaController35.setAnchorView(videoView35);



        videoView36 =(VideoView)findViewById(R.id.mday3exe1video);
        videoView36.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.squat));
        //Creating MediaController
        MediaController mediaController36= new MediaController(this);
        mediaController36.setAnchorView(videoView36);


        videoView37 =(VideoView)findViewById(R.id.mday3exe2video);
        videoView37.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController37= new MediaController(this);
        mediaController37.setAnchorView(videoView37);


        videoView38 =(VideoView)findViewById(R.id.mday3exe3video);
        videoView38.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController38= new MediaController(this);
        mediaController38.setAnchorView(videoView38);



        videoView39 =(VideoView)findViewById(R.id.mday3exe4video);
        videoView39.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController39= new MediaController(this);
        mediaController39.setAnchorView(videoView39);



        videoView40 =(VideoView)findViewById(R.id.mday4exe1video);
        videoView40.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidelateralcableraise));
        //Creating MediaController
        MediaController mediaController40= new MediaController(this);
        mediaController40.setAnchorView(videoView40);




        videoView41 =(VideoView)findViewById(R.id.mday4exe2video);
        videoView41.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidelateralraise));

        MediaController mediaController41= new MediaController(this);
        mediaController41.setAnchorView(videoView41);



        videoView42 =(VideoView)findViewById(R.id.mday4exe3video);
        videoView42.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rearlateralraise));
        //Creating MediaController
        MediaController mediaController42= new MediaController(this);
        mediaController42.setAnchorView(videoView42);

        videoView43 =(VideoView)findViewById(R.id.mday4exe4video);
        videoView43.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidedumbbellcrunches));
        //Creating MediaController
        MediaController mediaController43= new MediaController(this);
        mediaController43.setAnchorView(videoView43);


        videoView44 =(VideoView)findViewById(R.id.mday4exe5video);
        videoView44.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.crunches));
        //Creating MediaController
        MediaController mediaController44= new MediaController(this);
        mediaController44.setAnchorView(videoView44);



        videoView45 =(VideoView)findViewById(R.id.mday5exe1video);
        videoView45.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.declinedtriceppress));
        //Creating MediaController
        MediaController mediaController45= new MediaController(this);
        mediaController45.setAnchorView(videoView45);



        videoView46 =(VideoView)findViewById(R.id.mday5exe2video);
        videoView46.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableropepushdown));
        //Creating MediaController
        MediaController mediaController46= new MediaController(this);
        mediaController46.setAnchorView(videoView46);



        videoView47 =(VideoView)findViewById(R.id.mday5exe3video);
        videoView47.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bothhandoverheaddumbelltricep));
        //Creating MediaController
        MediaController mediaController47= new MediaController(this);
        mediaController47.setAnchorView(videoView47);


        videoView48 =(VideoView)findViewById(R.id.mday5exe4video);
        videoView48.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cabletriceppushdown));
        //Creating MediaController
        MediaController mediaController48= new MediaController(this);
        mediaController48.setAnchorView(videoView48);



        videoView49 =(VideoView)findViewById(R.id.mday5exe5video);
        videoView49.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.skullcrusher));
        //Creating MediaController
        MediaController mediaController49= new MediaController(this);
        mediaController49.setAnchorView(videoView49);



        videoView50 =(VideoView)findViewById(R.id.mday5exe6video);
        videoView50.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepcablecurl));
        //Creating MediaController
        MediaController mediaController50= new MediaController(this);
        mediaController50.setAnchorView(videoView50);



        videoView51 =(VideoView)findViewById(R.id.mday5exe7video);
        videoView51.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellbicepscurl));

        MediaController mediaController51= new MediaController(this);
        mediaController51.setAnchorView(videoView51);




        videoView52 =(VideoView)findViewById(R.id.mday5exe8video);
        videoView52.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepcablecurl));
        //Creating MediaController
        MediaController mediaController52= new MediaController(this);
        mediaController52.setAnchorView(videoView52);

        videoView53 =(VideoView)findViewById(R.id.mday5exe9video);
        videoView53.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepspeachercurl));
        //Creating MediaController
        MediaController mediaController53= new MediaController(this);
        mediaController53.setAnchorView(videoView53);


        videoView54 =(VideoView)findViewById(R.id.mday5exe10video);
        videoView54.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicephammercurl));
        //Creating MediaController
        MediaController mediaController54= new MediaController(this);
        mediaController54.setAnchorView(videoView54);



        videoView55 =(VideoView)findViewById(R.id.mday5exe11video);
        videoView55.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellforearms));
        //Creating MediaController
        MediaController mediaController55= new MediaController(this);
        mediaController55.setAnchorView(videoView55);



        videoView56 =(VideoView)findViewById(R.id.mday6exe1video);
        videoView56.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbelldeadlift));
        //Creating MediaController
        MediaController mediaController56= new MediaController(this);
        mediaController56.setAnchorView(videoView56);



        videoView57 =(VideoView)findViewById(R.id.mday6exe2video);
        videoView57.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.standingcalfraise));
        //Creating MediaController
        MediaController mediaController57= new MediaController(this);
        mediaController57.setAnchorView(videoView57);


        videoView58 =(VideoView)findViewById(R.id.mday6exe3video);
        videoView58.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.seatedcalfraise));
        //Creating MediaController
        MediaController mediaController58= new MediaController(this);
        mediaController58.setAnchorView(videoView58);



        videoView59 =(VideoView)findViewById(R.id.mday6exe4video);
        videoView59.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hamstringcurl));
        //Creating MediaController
        MediaController mediaController59= new MediaController(this);
        mediaController59.setAnchorView(videoView59);



        videoView60 =(VideoView)findViewById(R.id.mday6exe5video);
        videoView60.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbelldeadlift));
        //Creating MediaController
        MediaController mediaController60= new MediaController(this);
        mediaController60.setAnchorView(videoView60);




                videoView61 =(VideoView)findViewById(R.id.aday1exe1video);
        videoView61.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.declinedbenchpress));

        MediaController mediaController61= new MediaController(this);
        mediaController61.setAnchorView(videoView61);



        videoView62 =(VideoView)findViewById(R.id.aday1exe2video);
        videoView62.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.inclinedbenchpress));
        //Creating MediaController
        MediaController mediaController62= new MediaController(this);
        mediaController62.setAnchorView(videoView62);

        videoView63 =(VideoView)findViewById(R.id.aday1exe3video);
        videoView63.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.flatbenchpress));
        //Creating MediaController
        MediaController mediaController63= new MediaController(this);
        mediaController63.setAnchorView(videoView63);


        videoView64 =(VideoView)findViewById(R.id.aday1exe4video);
        videoView64.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellfly));
        //Creating MediaController
        MediaController mediaController64= new MediaController(this);
        mediaController64.setAnchorView(videoView64);



        videoView65 =(VideoView)findViewById(R.id.aday1exe5video);
        videoView65.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidelateralraise));
        //Creating MediaController
        MediaController mediaController65= new MediaController(this);
        mediaController65.setAnchorView(videoView65);



        videoView66 =(VideoView)findViewById(R.id.aday1exe6video);
        videoView66.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sidelateralcableraise));
        //Creating MediaController
        MediaController mediaController66= new MediaController(this);
        mediaController66.setAnchorView(videoView66);



        videoView67 =(VideoView)findViewById(R.id.aday1exe7video);
        videoView67.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rearlateralraise));
        //Creating MediaController
        MediaController mediaController67= new MediaController(this);
        mediaController67.setAnchorView(videoView67);


        videoView68 =(VideoView)findViewById(R.id.aday1exe8video);
        videoView68.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rearlateralraise));
        //Creating MediaController
        MediaController mediaController68= new MediaController(this);
        mediaController68.setAnchorView(videoView68);



        videoView69 =(VideoView)findViewById(R.id.aday1exe9video);
        videoView69.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cabletriceppushdown));
        //Creating MediaController
        MediaController mediaController69= new MediaController(this);
        mediaController69.setAnchorView(videoView69);



        videoView70 =(VideoView)findViewById(R.id.aday1exe10video);
        videoView70.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bothhandoverheaddumbelltricep));
        //Creating MediaController
        MediaController mediaController70= new MediaController(this);
        mediaController70.setAnchorView(videoView70);



        videoView71 =(VideoView)findViewById(R.id.aday1exe11video);
        videoView71.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableropepushdown));

        MediaController mediaController71= new MediaController(this);
        mediaController71.setAnchorView(videoView71);




        videoView72 =(VideoView)findViewById(R.id.aday2exe1video);
        videoView72.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.squat));
        //Creating MediaController
        MediaController mediaController72= new MediaController(this);
        mediaController72.setAnchorView(videoView72);

        videoView73 =(VideoView)findViewById(R.id.aday2exe2video);
        videoView73.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.frontsquat));
        //Creating MediaController
        MediaController mediaController73= new MediaController(this);
        mediaController73.setAnchorView(videoView73);


        videoView74 =(VideoView)findViewById(R.id.aday2exe3video);
        videoView74.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController74= new MediaController(this);
        mediaController74.setAnchorView(videoView74);



        videoView75 =(VideoView)findViewById(R.id.aday2exe4video);
        videoView75.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hamstringcurl));
        //Creating MediaController
        MediaController mediaController75= new MediaController(this);
        mediaController75.setAnchorView(videoView75);



        videoView76 =(VideoView)findViewById(R.id.aday3exe1video);
        videoView76.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbellrow));
        //Creating MediaController
        MediaController mediaController76= new MediaController(this);
        mediaController76.setAnchorView(videoView76);



        videoView77 =(VideoView)findViewById(R.id.aday3exe2video);
        videoView77.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));
        //Creating MediaController
        MediaController mediaController77= new MediaController(this);
        mediaController77.setAnchorView(videoView77);


        videoView78 =(VideoView)findViewById(R.id.aday3exe3video);
        videoView78.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellrowsinglehand));
        //Creating MediaController
        MediaController mediaController78= new MediaController(this);
        mediaController78.setAnchorView(videoView78);



        videoView79 =(VideoView)findViewById(R.id.aday3exe4video);
        videoView79.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.latpulldownwidegrip));
        //Creating MediaController
        MediaController mediaController79= new MediaController(this);
        mediaController79.setAnchorView(videoView79);



        videoView80 =(VideoView)findViewById(R.id.aday3exe5video);
        videoView80.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cableseatedrow));
        //Creating MediaController
        MediaController mediaController80= new MediaController(this);
        mediaController80.setAnchorView(videoView80);


        videoView81 =(VideoView)findViewById(R.id.aday3exe6video);
        videoView81.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellpullover));

        MediaController mediaController81= new MediaController(this);
        mediaController81.setAnchorView(videoView81);



        videoView82 =(VideoView)findViewById(R.id.aday3exe7video);
        videoView82.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellshrugs));
        //Creating MediaController
        MediaController mediaController82= new MediaController(this);
        mediaController82.setAnchorView(videoView82);

        videoView83 =(VideoView)findViewById(R.id.aday3exe8video);
        videoView83.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepcablecurl));
        //Creating MediaController
        MediaController mediaController83= new MediaController(this);
        mediaController83.setAnchorView(videoView83);


        videoView84 =(VideoView)findViewById(R.id.aday3exe9video);
        videoView84.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellbicepscurl));
        //Creating MediaController
        MediaController mediaController84= new MediaController(this);
        mediaController84.setAnchorView(videoView84);



        videoView85 =(VideoView)findViewById(R.id.aday3exe10video);
        videoView85.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicepspeachercurl));
        //Creating MediaController
        MediaController mediaController85= new MediaController(this);
        mediaController85.setAnchorView(videoView85);



        videoView86 =(VideoView)findViewById(R.id.aday3exe11video);
        videoView86.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bicephammercurl));
        //Creating MediaController
        MediaController mediaController86= new MediaController(this);
        mediaController86.setAnchorView(videoView86);


        videoView87 =(VideoView)findViewById(R.id.aday3exe12video);
        videoView87.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbellbicepcurl));
        //Creating MediaController
        MediaController mediaController87= new MediaController(this);
        mediaController87.setAnchorView(videoView87);


        videoView88 =(VideoView)findViewById(R.id.aday3exe13video);
        videoView88.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dumbellforearms));
        //Creating MediaController
        MediaController mediaController88= new MediaController(this);
        mediaController88.setAnchorView(videoView88);



        videoView89 =(VideoView)findViewById(R.id.aday4exe1video);
        videoView89.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.barbelldeadlift));
        //Creating MediaController
        MediaController mediaController89= new MediaController(this);
        mediaController89.setAnchorView(videoView89);



        videoView90 =(VideoView)findViewById(R.id.aday4exe2video);
        videoView90.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.legpress));
        //Creating MediaController
        MediaController mediaController90= new MediaController(this);
        mediaController90.setAnchorView(videoView90);




        videoView91 =(VideoView)findViewById(R.id.aday4exe3video);
        videoView91.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.seatedcalfraise));

        MediaController mediaController91= new MediaController(this);
        mediaController91.setAnchorView(videoView91);



        videoView92 =(VideoView)findViewById(R.id.aday4exe4video);
        videoView92.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hamstringcurl));
        //Creating MediaController
        MediaController mediaController92= new MediaController(this);
        mediaController92.setAnchorView(videoView92);




        //specify the location of media file
        //Uri uri= Uri.parse(Environment.getExternalStorageDirectory().getPath()+"/videos/day1exe1.mp4");




        //Setting MediaController and URI, then starting the videoView
        //videoView.setMediaController(mediaController);
        //videoView.setVideoURI(uri);
        //videoView.requestFocus();
        //videoView.start();






        //Creating MediaController
       /* MediaController mediaController2= new MediaController(this);
        mediaController2.setAnchorView(videoView2);*/

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
        hideOthersmday1(v);
        hideOthersmday2(v);
        hideOthersmday3(v);
        hideOthersmday4(v);
        hideOthersmday5(v);
        hideOthersmday6(v);
        hideOthersaday1(v);
        hideOthersaday2(v);
        hideOthersaday3(v);
        hideOthersaday4(v);
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
       /* if (openLayout == panel4)
            panel4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
        if (openLayout == panel5)
            panel5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
        if (openLayout == panel6)
            panel6.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel6, true));
*/

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
       /* if (openLayout == panela5)
            panela5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela5, true));
        if (openLayout == panela6)
            panela6.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panela6, true));
*/
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
            } /*else if (layoutView.getId() == R.id.text4) {
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
            }*/
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
            } /*else if (layoutView.getId() == R.id.texta5) {
                v = panela5.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela5, true));
                }
            }else if (layoutView.getId() == R.id.texta6) {
                v = panela6.getVisibility();
                hideThemAll();
                if (v != View.VISIBLE) {
                    panela6.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panela6, true));
                }
            }*/


        }
    }

    //beginer
    private void hideOthersday1(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day1exe1) {
            videoView.setVisibility(View.VISIBLE);
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
            videoView2.setVisibility(View.VISIBLE);
            videoView2.start();

            v = paneld1e2.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e2, true));
            }
        }else if (layoutView.getId() == R.id.day1exe3) {
            videoView3.setVisibility(View.VISIBLE);
            videoView3.start();
            v = paneld1e3.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e3, true));
            }
        }else if (layoutView.getId() == R.id.day1exe4) {
            videoView4.setVisibility(View.VISIBLE);
            videoView4.start();
            v = paneld1e4.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e4, true));
            }
        }else if (layoutView.getId() == R.id.day1exe5) {
            videoView5.setVisibility(View.VISIBLE);
            videoView5.start();
            v = paneld1e5.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e5, true));
            }
        }else if (layoutView.getId() == R.id.day1exe6) {
            videoView6.setVisibility(View.VISIBLE);
            videoView6.start();
            v = paneld1e6.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e6, true));
            }
        }else if (layoutView.getId() == R.id.day1exe7) {
            videoView7.setVisibility(View.VISIBLE);
            videoView7.start();
            v = paneld1e7.getVisibility();
            hideThemAllday1();
            if (v != View.VISIBLE) {
                paneld1e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e7, true));
            }
        }else if (layoutView.getId() == R.id.day1exe8) {
            videoView8.setVisibility(View.VISIBLE);
            videoView8.start();
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
            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e1, true));

        }
        if (openLayout2 == paneld1e2) {
            videoView.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e2, true));


        }


        if (openLayout2 == paneld1e3) {
            videoView2.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e3, true));


        }
        if (openLayout2 == paneld1e4) {
            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e4, true));

        }
        if (openLayout2 == paneld1e5) {

            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e5, true));
        }
        if (openLayout2 == paneld1e6) {
            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e6, true));

        }
        if (openLayout2 == paneld1e7) {
            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            videoView8.setVisibility(View.GONE);
            paneld1e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e7, true));

        }
        if (openLayout2 == paneld1e8) {
            videoView2.setVisibility(View.GONE);
            videoView3.setVisibility(View.GONE);
            videoView4.setVisibility(View.GONE);
            videoView5.setVisibility(View.GONE);
            videoView6.setVisibility(View.GONE);
            videoView7.setVisibility(View.GONE);
            videoView.setVisibility(View.GONE);
            paneld1e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld1e8, true));

        }
    }

    private  void hideOthersday2(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day2exe1) {
            videoView9.setVisibility(View.VISIBLE);
            videoView9.start();
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
            videoView10.setVisibility(View.VISIBLE);
            videoView10.start();
            v = paneld2e2.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e2, true));
            }
        }else if (layoutView.getId() == R.id.day2exe3) {
            videoView11.setVisibility(View.VISIBLE);
            videoView11.start();
            v = paneld2e3.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e3, true));
            }
        }else if (layoutView.getId() == R.id.day2exe4) {
            videoView12.setVisibility(View.VISIBLE);
            videoView12.start();
            v = paneld2e4.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e4, true));
            }
        }else if (layoutView.getId() == R.id.day2exe5) {
            videoView13.setVisibility(View.VISIBLE);
            videoView13.start();
            v = paneld2e5.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e5, true));
            }
        }else if (layoutView.getId() == R.id.day2exe6) {
            videoView14.setVisibility(View.VISIBLE);
            videoView14.start();
            v = paneld2e6.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e6, true));
            }
        }else if (layoutView.getId() == R.id.day2exe7) {
            videoView15.setVisibility(View.VISIBLE);
            videoView15.start();
            v = paneld2e7.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e7, true));
            }
        }else if (layoutView.getId() == R.id.day2exe8) {
            videoView16.setVisibility(View.VISIBLE);
            videoView16.start();
            v = paneld2e8.getVisibility();
            hideThemAllday2();
            if (v != View.VISIBLE) {
                paneld2e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e8, true));
            }
        }
    }

    private void hideThemAllday2() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld2e1) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e1, true));
        }
        if (openLayout2 == paneld2e2) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e2, true));

        }

        if (openLayout2 == paneld2e3) {
            videoView12.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e3, true));

        }
        if (openLayout2 == paneld2e4) {
            videoView10.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e4, true));

        }
        if (openLayout2 == paneld2e5) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e5, true));

        }
        if (openLayout2 == paneld2e6) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e6, true));

        }
        if (openLayout2 == paneld2e7) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            videoView16.setVisibility(View.GONE);
            paneld2e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e7, true));

        }
        if (openLayout2 == paneld2e8) {
            videoView10.setVisibility(View.GONE);
            videoView11.setVisibility(View.GONE);
            videoView12.setVisibility(View.GONE);
            videoView13.setVisibility(View.GONE);
            videoView14.setVisibility(View.GONE);
            videoView15.setVisibility(View.GONE);
            videoView9.setVisibility(View.GONE);
            paneld2e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld2e8, true));

        }
    }

    private void hideOthersday3(View layoutView) {
        int v;
        if (layoutView.getId() == R.id.day3exe1) {
            videoView17.setVisibility(View.VISIBLE);
            videoView17.start();
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
            videoView18.setVisibility(View.VISIBLE);

            videoView18.start();
            v = paneld3e2.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e2, true));
            }
        }else if (layoutView.getId() == R.id.day3exe3) {
            videoView19.setVisibility(View.VISIBLE);

            videoView19.start();
            v = paneld3e3.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e3, true));
            }
        }else if (layoutView.getId() == R.id.day3exe4) {
            videoView20.setVisibility(View.VISIBLE);

            videoView20.start();
            v = paneld3e4.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e4, true));
            }
        }else if (layoutView.getId() == R.id.day3exe5) {
            videoView21.setVisibility(View.VISIBLE);

            videoView21.start();
            v = paneld3e5.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e5, true));
            }
        }else if (layoutView.getId() == R.id.day3exe6) {
            videoView22.setVisibility(View.VISIBLE);

            videoView22.start();
            v = paneld3e6.getVisibility();
            hideThemAllday3();
            if (v != View.VISIBLE) {
                paneld3e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e6, true));
            }
        }
    }

    private void hideThemAllday3() {
        if (openLayout2 == null) return;
        if (openLayout2 == paneld3e1) {

            videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);
            paneld3e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e1, true));
        }
        if (openLayout2 == paneld3e2) {
            videoView17.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);
            paneld3e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e2, true));
        }

        if (openLayout2 == paneld3e3) {
            videoView18.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);
            paneld3e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e3, true));
        }
        if (openLayout2 == paneld3e4) {
            videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);
            paneld3e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e4, true));

        }
        if (openLayout2 == paneld3e5) {
            videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            videoView22.setVisibility(View.GONE);
            paneld3e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e5, true));
        }
        if (openLayout2 == paneld3e6) {
            videoView18.setVisibility(View.GONE);
            videoView19.setVisibility(View.GONE);
            videoView20.setVisibility(View.GONE);
            videoView21.setVisibility(View.GONE);
            videoView17.setVisibility(View.GONE);
            paneld3e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, paneld3e6, true));
        }

    }


    //moderate
    private void hideThemAllmday1() {


        if (openLayout2 == null) return;
        if (openLayout2 == panelmd1e1) {
            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e1, true));

        }
        if (openLayout2 == panelmd1e2) {
            videoView23.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e2, true));


        }


        if (openLayout2 == panelmd1e3) {
            videoView24.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e3, true));


        }
        if (openLayout2 == panelmd1e4) {
            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e4, true));

        }
        if (openLayout2 == panelmd1e5) {

            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e5, true));
        }
        if (openLayout2 == panelmd1e6) {
            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e6, true));

        }
        if (openLayout2 == panelmd1e7) {
            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            videoView30.setVisibility(View.GONE);
            panelmd1e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e7, true));

        }
        if (openLayout2 == panelmd1e8) {
            videoView24.setVisibility(View.GONE);
            videoView25.setVisibility(View.GONE);
            videoView26.setVisibility(View.GONE);
            videoView27.setVisibility(View.GONE);
            videoView28.setVisibility(View.GONE);
            videoView29.setVisibility(View.GONE);
            videoView23.setVisibility(View.GONE);
            panelmd1e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e8, true));

        }
    }

    private void hideOthersmday1(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.mday1exe1) {
            videoView23.setVisibility(View.VISIBLE);
            videoView23.start();
            v = panelmd1e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd1e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd1e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday1();
            if (v != View.VISIBLE) {

                panelmd1e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e1, true));
            }
        } else if (layoutView.getId() == R.id.mday1exe2) {
            videoView24.setVisibility(View.VISIBLE);
            videoView24.start();

            v = panelmd1e2.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e2, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe3) {
            videoView25.setVisibility(View.VISIBLE);
            videoView25.start();
            v = panelmd1e3.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e3, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe4) {
            videoView26.setVisibility(View.VISIBLE);
            videoView26.start();
            v = panelmd1e4.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e4, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe5) {
            videoView27.setVisibility(View.VISIBLE);
            videoView27.start();
            v = panelmd1e5.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e5, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe6) {
            videoView28.setVisibility(View.VISIBLE);
            videoView28.start();
            v = panelmd1e6.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e6, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe7) {
            videoView29.setVisibility(View.VISIBLE);
            videoView29.start();
            v = panelmd1e7.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e7, true));
            }
        }else if (layoutView.getId() == R.id.mday1exe8) {
            videoView30.setVisibility(View.VISIBLE);
            videoView30.start();
            v = panelmd1e8.getVisibility();
            hideThemAllmday1();
            if (v != View.VISIBLE) {
                panelmd1e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd1e8, true));
            }
        }

    }

    private void hideThemAllmday2() {
        if (openLayout2 == null) return;
        if (openLayout2 == panelmd2e1) {

            videoView32.setVisibility(View.GONE);
            videoView33.setVisibility(View.GONE);
            videoView34.setVisibility(View.GONE);
            videoView35.setVisibility(View.GONE);

            panelmd2e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e1, true));

        }
        if (openLayout2 == panelmd2e2) {
            videoView31.setVisibility(View.GONE);
            videoView33.setVisibility(View.GONE);
            videoView34.setVisibility(View.GONE);
            videoView35.setVisibility(View.GONE);
            panelmd2e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e2, true));


        }


        if (openLayout2 == panelmd2e3) {
            videoView32.setVisibility(View.GONE);
            videoView31.setVisibility(View.GONE);
            videoView34.setVisibility(View.GONE);
            videoView35.setVisibility(View.GONE);
            panelmd2e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e3, true));


        }
        if (openLayout2 == panelmd2e4) {
            videoView32.setVisibility(View.GONE);
            videoView33.setVisibility(View.GONE);
            videoView31.setVisibility(View.GONE);
            videoView35.setVisibility(View.GONE);
            panelmd2e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e4, true));

        }
        if (openLayout2 == panelmd2e5) {
            videoView32.setVisibility(View.GONE);
            videoView33.setVisibility(View.GONE);
            videoView34.setVisibility(View.GONE);
            videoView31.setVisibility(View.GONE);
            panelmd2e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e5, true));
        }


    }

    private void hideOthersmday2(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.mday2exe1) {
            videoView31.setVisibility(View.VISIBLE);
            videoView31.start();
            v = panelmd2e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd2e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd2e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday2();
            if (v != View.VISIBLE) {

                panelmd2e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e1, true));
            }
        } else if (layoutView.getId() == R.id.mday2exe2) {
            videoView32.setVisibility(View.VISIBLE);
            videoView32.start();

            v = panelmd2e2.getVisibility();
            hideThemAllmday2();
            if (v != View.VISIBLE) {
                panelmd2e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e2, true));
            }
        }else if (layoutView.getId() == R.id.mday2exe3) {
            videoView33.setVisibility(View.VISIBLE);
            videoView33.start();
            v = panelmd2e3.getVisibility();
            hideThemAllmday2();
            if (v != View.VISIBLE) {
                panelmd2e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e3, true));
            }
        }else if (layoutView.getId() == R.id.mday2exe4) {
            videoView34.setVisibility(View.VISIBLE);
            videoView34.start();
            v = panelmd2e4.getVisibility();
            hideThemAllmday2();
            if (v != View.VISIBLE) {
                panelmd2e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e4, true));
            }
        }else if (layoutView.getId() == R.id.mday2exe5) {
            videoView35.setVisibility(View.VISIBLE);
            videoView35.start();
            v = panelmd2e5.getVisibility();
            hideThemAllmday2();
            if (v != View.VISIBLE) {
                panelmd2e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd2e5, true));
            }
        }

    }

    private void hideThemAllmday3() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelmd3e1) {
            videoView37.setVisibility(View.GONE);
            videoView38.setVisibility(View.GONE);
            videoView39.setVisibility(View.GONE);

            panelmd3e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e1, true));

        }
        if (openLayout2 == panelmd3e2) {
            videoView36.setVisibility(View.GONE);
            videoView38.setVisibility(View.GONE);
            videoView39.setVisibility(View.GONE);
            panelmd3e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e2, true));


        }


        if (openLayout2 == panelmd3e3) {
            videoView37.setVisibility(View.GONE);
            videoView36.setVisibility(View.GONE);
            videoView39.setVisibility(View.GONE);
            panelmd3e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e3, true));


        }
        if (openLayout2 == panelmd3e4) {
            videoView37.setVisibility(View.GONE);
            videoView38.setVisibility(View.GONE);
            videoView36.setVisibility(View.GONE);
            panelmd3e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e4, true));

        }

    }

    private void hideOthersmday3(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.mday3exe1) {
            videoView36.setVisibility(View.VISIBLE);
            videoView36.start();
            v = panelmd3e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd3e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd3e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday3();
            if (v != View.VISIBLE) {

                panelmd3e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e1, true));
            }
        } else if (layoutView.getId() == R.id.mday3exe2) {
            videoView37.setVisibility(View.VISIBLE);
            videoView37.start();

            v = panelmd3e2.getVisibility();
            hideThemAllmday3();
            if (v != View.VISIBLE) {
                panelmd3e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e2, true));
            }
        }else if (layoutView.getId() == R.id.mday3exe3) {
            videoView38.setVisibility(View.VISIBLE);
            videoView38.start();
            v = panelmd3e3.getVisibility();
            hideThemAllmday3();
            if (v != View.VISIBLE) {
                panelmd3e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e3, true));
            }
        }else if (layoutView.getId() == R.id.mday3exe4) {
            videoView39.setVisibility(View.VISIBLE);
            videoView39.start();
            v = panelmd3e4.getVisibility();
            hideThemAllmday3();
            if (v != View.VISIBLE) {
                panelmd3e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd3e4, true));
            }
        }
    }

    private void hideThemAllmday4() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelmd4e1) {
            videoView41.setVisibility(View.GONE);
            videoView42.setVisibility(View.GONE);
            videoView43.setVisibility(View.GONE);
            videoView44.setVisibility(View.GONE);
            panelmd4e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e1, true));

        }
        if (openLayout2 == panelmd4e2) {
            videoView40.setVisibility(View.GONE);
            videoView41.setVisibility(View.GONE);
            videoView43.setVisibility(View.GONE);
            videoView44.setVisibility(View.GONE);
            panelmd4e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e2, true));


        }


        if (openLayout2 == panelmd4e3) {
            videoView41.setVisibility(View.GONE);
            videoView40.setVisibility(View.GONE);
            videoView43.setVisibility(View.GONE);
            videoView44.setVisibility(View.GONE);
            panelmd4e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e3, true));


        }
        if (openLayout2 == panelmd4e4) {
            videoView41.setVisibility(View.GONE);
            videoView42.setVisibility(View.GONE);
            videoView40.setVisibility(View.GONE);
            videoView44.setVisibility(View.GONE);
            panelmd4e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e4, true));

        }
        if (openLayout2 == panelmd4e5) {

            videoView41.setVisibility(View.GONE);
            videoView42.setVisibility(View.GONE);
            videoView43.setVisibility(View.GONE);
            videoView40.setVisibility(View.GONE);
            panelmd4e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e5, true));
        }
    }

    private void hideOthersmday4(View layoutView) {


        int v;
        if (layoutView.getId() == R.id.mday4exe1) {
            videoView40.setVisibility(View.VISIBLE);
            videoView40.start();
            v = panelmd4e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd4e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd4e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday4();
            if (v != View.VISIBLE) {

                panelmd4e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e1, true));
            }
        } else if (layoutView.getId() == R.id.mday4exe2) {
            videoView41.setVisibility(View.VISIBLE);
            videoView41.start();

            v = panelmd4e2.getVisibility();
            hideThemAllmday4();
            if (v != View.VISIBLE) {
                panelmd4e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e2, true));
            }
        }else if (layoutView.getId() == R.id.mday4exe3) {
            videoView42.setVisibility(View.VISIBLE);
            videoView42.start();
            v = panelmd4e3.getVisibility();
            hideThemAllmday4();
            if (v != View.VISIBLE) {
                panelmd4e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e3, true));
            }
        }else if (layoutView.getId() == R.id.mday4exe4) {
            videoView43.setVisibility(View.VISIBLE);
            videoView43.start();
            v = panelmd4e4.getVisibility();
            hideThemAllmday4();
            if (v != View.VISIBLE) {
                panelmd4e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e4, true));
            }
        }else if (layoutView.getId() == R.id.mday4exe5) {
            videoView44.setVisibility(View.VISIBLE);
            videoView44.start();
            v = panelmd4e5.getVisibility();
            hideThemAllmday4();
            if (v != View.VISIBLE) {
                panelmd4e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd4e5, true));
            }
        }

    }

    private void hideThemAllmday5() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelmd5e1) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e1, true));

        }
        if (openLayout2 == panelmd5e2) {
            videoView45.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e2, true));


        }


        if (openLayout2 == panelmd5e3) {
            videoView46.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e3, true));


        }
        if (openLayout2 == panelmd5e4) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e4, true));

        }
        if (openLayout2 == panelmd5e5) {

            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e5, true));
        }
        if (openLayout2 == panelmd5e6) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e6, true));

        }
        if (openLayout2 == panelmd5e7) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e7, true));

        }
        if (openLayout2 == panelmd5e8) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e8, true));

        }
        if (openLayout2 == panelmd5e9) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e9.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e9, true));

        }
        if (openLayout2 == panelmd5e10) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            videoView55.setVisibility(View.GONE);
            panelmd5e10.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e10, true));

        }
        if (openLayout2 == panelmd5e11) {
            videoView46.setVisibility(View.GONE);
            videoView47.setVisibility(View.GONE);
            videoView48.setVisibility(View.GONE);
            videoView49.setVisibility(View.GONE);
            videoView50.setVisibility(View.GONE);
            videoView51.setVisibility(View.GONE);
            videoView52.setVisibility(View.GONE);
            videoView53.setVisibility(View.GONE);
            videoView54.setVisibility(View.GONE);
            videoView45.setVisibility(View.GONE);
            panelmd5e11.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e11, true));

        }


    }

    private void hideOthersmday5(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.mday5exe1) {
            videoView45.setVisibility(View.VISIBLE);
            videoView45.start();
            v = panelmd5e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd5e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd5e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday5();
            if (v != View.VISIBLE) {

                panelmd5e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e1, true));
            }
        } else if (layoutView.getId() == R.id.mday5exe2) {
            videoView46.setVisibility(View.VISIBLE);
            videoView46.start();

            v = panelmd5e2.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e2, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe3) {
            videoView47.setVisibility(View.VISIBLE);
            videoView47.start();
            v = panelmd5e3.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e3, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe4) {
            videoView48.setVisibility(View.VISIBLE);
            videoView48.start();
            v = panelmd5e4.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e4, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe5) {
            videoView49.setVisibility(View.VISIBLE);
            videoView49.start();
            v = panelmd5e5.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e5, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe6) {
            videoView50.setVisibility(View.VISIBLE);
            videoView50.start();
            v = panelmd5e6.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e6, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe7) {
            videoView51.setVisibility(View.VISIBLE);
            videoView51.start();
            v = panelmd5e7.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e7, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe8) {
            videoView52.setVisibility(View.VISIBLE);
            videoView52.start();
            v = panelmd5e8.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e8, true));
            }
        }else if (layoutView.getId() == R.id.mday5exe9) {
            videoView53.setVisibility(View.VISIBLE);
            videoView53.start();
            v = panelmd5e9.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e9.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e9, true));
            }
        } else if (layoutView.getId() == R.id.mday5exe10) {
            videoView54.setVisibility(View.VISIBLE);
            videoView54.start();
            v = panelmd5e10.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e10.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e10, true));
            }
        } else if (layoutView.getId() == R.id.mday5exe11) {
            videoView55.setVisibility(View.VISIBLE);
            videoView55.start();
            v = panelmd5e11.getVisibility();
            hideThemAllmday5();
            if (v != View.VISIBLE) {
                panelmd5e11.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd5e11, true));
            }
        }

    }

    private void hideThemAllmday6() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelmd6e1) {
            videoView57.setVisibility(View.GONE);
            videoView58.setVisibility(View.GONE);
            videoView59.setVisibility(View.GONE);
            videoView60.setVisibility(View.GONE);

            panelmd6e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e1, true));

        }
        if (openLayout2 == panelmd6e2) {
            videoView56.setVisibility(View.GONE);
            videoView58.setVisibility(View.GONE);
            videoView59.setVisibility(View.GONE);
            videoView60.setVisibility(View.GONE);
            panelmd6e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e2, true));


        }


        if (openLayout2 == panelmd6e3) {
            videoView57.setVisibility(View.GONE);
            videoView56.setVisibility(View.GONE);
            videoView59.setVisibility(View.GONE);
            videoView60.setVisibility(View.GONE);
            panelmd6e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e3, true));


        }
        if (openLayout2 == panelmd6e4) {
            videoView57.setVisibility(View.GONE);
            videoView58.setVisibility(View.GONE);
            videoView56.setVisibility(View.GONE);
            videoView60.setVisibility(View.GONE);
            panelmd6e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e4, true));

        }
        if (openLayout2 == panelmd6e5) {

            videoView57.setVisibility(View.GONE);
            videoView58.setVisibility(View.GONE);
            videoView59.setVisibility(View.GONE);
            videoView56.setVisibility(View.GONE);
            panelmd6e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e5, true));
        }


    }

    private void hideOthersmday6(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.mday6exe1) {
            videoView56.setVisibility(View.VISIBLE);
            videoView56.start();
            v = panelmd6e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelmd6e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelmd6e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAllmday6();
            if (v != View.VISIBLE) {

                panelmd6e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e1, true));
            }
        } else if (layoutView.getId() == R.id.mday6exe2) {
            videoView57.setVisibility(View.VISIBLE);
            videoView57.start();

            v = panelmd6e2.getVisibility();
            hideThemAllmday6();
            if (v != View.VISIBLE) {
                panelmd6e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e2, true));
            }
        }else if (layoutView.getId() == R.id.mday6exe3) {
            videoView58.setVisibility(View.VISIBLE);
            videoView58.start();
            v = panelmd6e3.getVisibility();
            hideThemAllmday6();
            if (v != View.VISIBLE) {
                panelmd6e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e3, true));
            }
        }else if (layoutView.getId() == R.id.mday6exe4) {
            videoView59.setVisibility(View.VISIBLE);
            videoView59.start();
            v = panelmd6e4.getVisibility();
            hideThemAllmday6();
            if (v != View.VISIBLE) {
                panelmd6e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e4, true));
            }
        }else if (layoutView.getId() == R.id.mday6exe5) {
            videoView60.setVisibility(View.VISIBLE);
            videoView60.start();
            v = panelmd6e5.getVisibility();
            hideThemAllmday6();
            if (v != View.VISIBLE) {
                panelmd6e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelmd6e5, true));
            }
        }

    }

//Advance
    private void hideThemAlladay1() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelad1e1) {


            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e1, true));

        }
        if (openLayout2 == panelad1e2) {
            videoView61.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e2, true));


        }


        if (openLayout2 == panelad1e3) {
            videoView62.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e3, true));


        }
        if (openLayout2 == panelad1e4) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e4, true));

        }
        if (openLayout2 == panelad1e5) {

            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e5, true));
        }
        if (openLayout2 == panelad1e6) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e6, true));

        }
        if (openLayout2 == panelad1e7) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e7, true));

        }
        if (openLayout2 == panelad1e8) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e8, true));

        }
        if (openLayout2 == panelad1e9) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e9.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e9, true));

        }
        if (openLayout2 == panelad1e10) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView31.setVisibility(View.GONE);
            videoView71.setVisibility(View.GONE);
            panelad1e10.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e10, true));

        }
        if (openLayout2 == panelad1e11) {
            videoView62.setVisibility(View.GONE);
            videoView63.setVisibility(View.GONE);
            videoView64.setVisibility(View.GONE);
            videoView65.setVisibility(View.GONE);
            videoView66.setVisibility(View.GONE);
            videoView67.setVisibility(View.GONE);
            videoView68.setVisibility(View.GONE);
            videoView69.setVisibility(View.GONE);
            videoView70.setVisibility(View.GONE);
            videoView61.setVisibility(View.GONE);
            panelad1e11.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e11, true));

        }

    }

    private void hideOthersaday1(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.aday1exe1) {
            videoView61.setVisibility(View.VISIBLE);
            videoView61.start();
            v = panelad1e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelad1e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelad1e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAlladay1();
            if (v != View.VISIBLE) {

                panelad1e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e1, true));
            }
        } else if (layoutView.getId() == R.id.aday1exe2) {
            videoView62.setVisibility(View.VISIBLE);
            videoView62.start();

            v = panelad1e2.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e2, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe3) {
            videoView63.setVisibility(View.VISIBLE);
            videoView63.start();
            v = panelad1e3.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e3, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe4) {
            videoView64.setVisibility(View.VISIBLE);
            videoView64.start();
            v = panelad1e4.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e4, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe5) {
            videoView65.setVisibility(View.VISIBLE);
            videoView65.start();
            v = panelad1e5.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e5, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe6) {
            videoView66.setVisibility(View.VISIBLE);
            videoView66.start();
            v = panelad1e6.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e6, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe7) {
            videoView67.setVisibility(View.VISIBLE);
            videoView67.start();
            v = panelad1e7.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e7, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe8) {
            videoView68.setVisibility(View.VISIBLE);
            videoView68.start();
            v = panelad1e8.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e8, true));
            }
        }else if (layoutView.getId() == R.id.aday1exe9) {
            videoView69.setVisibility(View.VISIBLE);
            videoView69.start();
            v = panelad1e9.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e9.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e9, true));
            }
        } else if (layoutView.getId() == R.id.aday1exe10) {
            videoView70.setVisibility(View.VISIBLE);
            videoView70.start();
            v = panelad1e10.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e10.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e10, true));
            }
        } else if (layoutView.getId() == R.id.aday1exe11) {
            videoView71.setVisibility(View.VISIBLE);
            videoView71.start();
            v = panelad1e11.getVisibility();
            hideThemAlladay1();
            if (v != View.VISIBLE) {
                panelad1e11.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad1e11, true));
            }
        }

    }

    private void hideThemAlladay2() {
        if (openLayout2 == null) return;
        if (openLayout2 == panelad2e1) {
            videoView73.setVisibility(View.GONE);
            videoView74.setVisibility(View.GONE);
            videoView75.setVisibility(View.GONE);


            panelad2e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e1, true));

        }
        if (openLayout2 == panelad2e2) {
            videoView72.setVisibility(View.GONE);
            videoView74.setVisibility(View.GONE);
            videoView75.setVisibility(View.GONE);
            panelad2e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e2, true));


        }


        if (openLayout2 == panelad2e3) {
            videoView73.setVisibility(View.GONE);
            videoView72.setVisibility(View.GONE);
            videoView75.setVisibility(View.GONE);
            panelad2e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e3, true));


        }
        if (openLayout2 == panelad2e4) {
            videoView73.setVisibility(View.GONE);
            videoView74.setVisibility(View.GONE);
            videoView72.setVisibility(View.GONE);
            panelad2e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e4, true));

        }


    }

    private void hideOthersaday2(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.aday2exe1) {
            videoView72.setVisibility(View.VISIBLE);
            videoView72.start();
            v = panelad2e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelad2e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelad2e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAlladay2();
            if (v != View.VISIBLE) {

                panelad2e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e1, true));
            }
        } else if (layoutView.getId() == R.id.aday2exe2) {
            videoView73.setVisibility(View.VISIBLE);
            videoView73.start();

            v = panelad2e2.getVisibility();
            hideThemAlladay2();
            if (v != View.VISIBLE) {
                panelad2e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e2, true));
            }
        }else if (layoutView.getId() == R.id.aday2exe3) {
            videoView74.setVisibility(View.VISIBLE);
            videoView74.start();
            v = panelad2e3.getVisibility();
            hideThemAlladay2();
            if (v != View.VISIBLE) {
                panelad2e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e3, true));
            }
        }else if (layoutView.getId() == R.id.aday2exe4) {
            videoView75.setVisibility(View.VISIBLE);
            videoView75.start();
            v = panelad2e4.getVisibility();
            hideThemAlladay2();
            if (v != View.VISIBLE) {
                panelad2e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad2e4, true));
            }
        }


    }

    private void hideThemAlladay3() {

        if (openLayout2 == null) return;
        if (openLayout2 == panelad3e1) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e1, true));

        }
        if (openLayout2 == panelad3e2) {
            videoView76.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e2, true));


        }


        if (openLayout2 == panelad3e3) {
            videoView77.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e3, true));


        }
        if (openLayout2 == panelad3e4) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e4, true));

        }
        if (openLayout2 == panelad3e5) {

            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e5.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e5, true));
        }
        if (openLayout2 == panelad3e6) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e6.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e6, true));

        }
        if (openLayout2 == panelad3e7) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e7.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e7, true));

        }
        if (openLayout2 == panelad3e8) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e8.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e8, true));

        }
        if (openLayout2 == panelad3e9) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e9.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e9, true));

        }
        if (openLayout2 == panelad3e10) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e10.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e10, true));

        }
        if (openLayout2 == panelad3e11) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e11.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e11, true));

        }


        if (openLayout2 == panelad3e12) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            videoView88.setVisibility(View.GONE);
            panelad3e12.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e12, true));

        }
        if (openLayout2 == panelad3e13) {
            videoView77.setVisibility(View.GONE);
            videoView78.setVisibility(View.GONE);
            videoView79.setVisibility(View.GONE);
            videoView80.setVisibility(View.GONE);
            videoView81.setVisibility(View.GONE);
            videoView82.setVisibility(View.GONE);
            videoView83.setVisibility(View.GONE);
            videoView84.setVisibility(View.GONE);
            videoView85.setVisibility(View.GONE);
            videoView86.setVisibility(View.GONE);
            videoView87.setVisibility(View.GONE);
            videoView76.setVisibility(View.GONE);
            panelad3e13.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e13, true));

        }


    }

    private void hideOthersaday3(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.aday3exe1) {
            videoView76.setVisibility(View.VISIBLE);
            videoView76.start();
            v = panelad3e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelad3e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelad3e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAlladay3();
            if (v != View.VISIBLE) {

                panelad3e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e1, true));
            }
        } else if (layoutView.getId() == R.id.aday3exe2) {
            videoView77.setVisibility(View.VISIBLE);
            videoView77.start();

            v = panelad3e2.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e2, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe3) {
            videoView78.setVisibility(View.VISIBLE);
            videoView78.start();
            v = panelad3e3.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e3, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe4) {
            videoView79.setVisibility(View.VISIBLE);
            videoView79.start();
            v = panelad3e4.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e4, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe5) {
            videoView80.setVisibility(View.VISIBLE);
            videoView80.start();
            v = panelad3e5.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e5.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e5, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe6) {
            videoView81.setVisibility(View.VISIBLE);
            videoView81.start();
            v = panelad3e6.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e6.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e6, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe7) {
            videoView82.setVisibility(View.VISIBLE);
            videoView82.start();
            v = panelad3e7.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e7.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e7, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe8) {
            videoView83.setVisibility(View.VISIBLE);
            videoView83.start();
            v = panelad3e8.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e8.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e8, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe9) {
            videoView84.setVisibility(View.VISIBLE);
            videoView84.start();
            v = panelad3e9.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e9.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e9, true));
            }
        } else if (layoutView.getId() == R.id.aday3exe10) {
            videoView85.setVisibility(View.VISIBLE);
            videoView85.start();
            v = panelad3e10.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e10.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e10, true));
            }
        } else if (layoutView.getId() == R.id.aday3exe11) {
            videoView86.setVisibility(View.VISIBLE);
            videoView86.start();
            v = panelad3e11.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e11.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e11, true));
            }
        }else if (layoutView.getId() == R.id.aday3exe12) {
            videoView87.setVisibility(View.VISIBLE);
            videoView87.start();
            v = panelad3e12.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e12.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e12, true));
            }
        } else if (layoutView.getId() == R.id.aday3exe13) {
            videoView88.setVisibility(View.VISIBLE);
            videoView88.start();
            v = panelad3e13.getVisibility();
            hideThemAlladay3();
            if (v != View.VISIBLE) {
                panelad3e13.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad3e13, true));
            }
        }

    }

    private void hideThemAlladay4() {
        if (openLayout2 == null) return;
        if (openLayout2 == panelad4e1) {
            videoView90.setVisibility(View.GONE);
            videoView91.setVisibility(View.GONE);
            videoView92.setVisibility(View.GONE);

            panelad4e1.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e1, true));

        }
        if (openLayout2 == panelad4e2) {
            videoView89.setVisibility(View.GONE);
            videoView91.setVisibility(View.GONE);
            videoView92.setVisibility(View.GONE);
            panelad4e2.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e2, true));


        }


        if (openLayout2 == panelad4e3) {
            videoView90.setVisibility(View.GONE);
            videoView89.setVisibility(View.GONE);
            videoView92.setVisibility(View.GONE);
            panelad4e3.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e3, true));


        }
        if (openLayout2 == panelad4e4) {
            videoView90.setVisibility(View.GONE);
            videoView91.setVisibility(View.GONE);
            videoView89.setVisibility(View.GONE);
            panelad4e4.startAnimation(new ScaleAnimToHideInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e4, true));

        }


    }

    private void hideOthersaday4(View layoutView) {

        int v;
        if (layoutView.getId() == R.id.aday4exe1) {
            videoView89.setVisibility(View.VISIBLE);
            videoView89.start();
            v = panelad4e1.getVisibility();
            /*if (v != View.VISIBLE) {


                panelad4e1.setVisibility(View.VISIBLE);



                Log.v("CZ", "height..." + panelad4e1.getHeight());
            }*/

            //panel1.setVisibility(View.GONE);
            //Log.v("CZ","again height..." + panel1.getHeight());
            hideThemAlladay4();
            if (v != View.VISIBLE) {

                panelad4e1.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e1, true));
            }
        } else if (layoutView.getId() == R.id.aday4exe2) {
            videoView90.setVisibility(View.VISIBLE);
            videoView90.start();

            v = panelad4e2.getVisibility();
            hideThemAlladay4();
            if (v != View.VISIBLE) {
                panelad4e2.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e2, true));
            }
        }else if (layoutView.getId() == R.id.aday4exe3) {
            videoView91.setVisibility(View.VISIBLE);
            videoView91.start();
            v = panelad4e3.getVisibility();
            hideThemAlladay4();
            if (v != View.VISIBLE) {
                panelad4e3.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e3, true));
            }
        }else if (layoutView.getId() == R.id.aday4exe4) {
            videoView92.setVisibility(View.VISIBLE);
            videoView92.start();
            v = panelad4e4.getVisibility();
            hideThemAlladay4();
            if (v != View.VISIBLE) {
                panelad4e4.startAnimation(new ScaleAnimToShowInside(1.0f, 1.0f, 1.0f, 0.0f, 500, panelad4e4, true));
            }
        }

    }

}
