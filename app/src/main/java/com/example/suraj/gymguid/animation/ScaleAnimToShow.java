package com.example.suraj.gymguid.animation;

import android.util.Log;
import android.view.View;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;

import com.example.suraj.gymguid.MuscleGain;

/**
 * Created by suraj on 2/18/2018.
 */

public class ScaleAnimToShow extends ScaleAnimation
{

    private View mView;

    private LinearLayout.LayoutParams mLayoutParams;

    private int mMarginBottomFromY, mMarginBottomToY;

    private boolean mVanishAfter = false;

    public ScaleAnimToShow(float toX, float fromX, float toY, float fromY, int duration, View view,boolean vanishAfter)
    {
        super(fromX, toX, fromY, toY);
        MuscleGain.openLayout = view;
        setDuration(duration);
        mView = view;
        mVanishAfter = vanishAfter;
        mLayoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        mView.setVisibility(View.VISIBLE);
        int height = mView.getHeight();
        //mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin + height;
        //mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) + height;

        mMarginBottomFromY = 0;
        mMarginBottomToY = height;

        Log.v("CZ",".................height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
        super.applyTransformation(interpolatedTime, t);
        if (interpolatedTime < 1.0f)
        {
            int newMarginBottom = (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime) - mMarginBottomToY;
            mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
            mView.getParent().requestLayout();
            //Log.v("CZ","newMarginBottom..." + newMarginBottom + " , mLayoutParams.topMargin..." + mLayoutParams.topMargin);
        }
    }


}

