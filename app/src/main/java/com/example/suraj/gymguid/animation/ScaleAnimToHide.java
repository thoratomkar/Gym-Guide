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

public class ScaleAnimToHide extends ScaleAnimation
{

    private View mView;

    private LinearLayout.LayoutParams mLayoutParams;

    private int mMarginBottomFromY, mMarginBottomToY;

    private boolean mVanishAfter = false;

    public ScaleAnimToHide(float fromX, float toX, float fromY, float toY, int duration, View view,boolean vanishAfter)
    {
        super(fromX, toX, fromY, toY);
        setDuration(duration);
        MuscleGain.openLayout = null;
        mView = view;
        mVanishAfter = vanishAfter;
        mLayoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        int height = mView.getHeight();
        mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin - height;
        mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) - height;

        Log.v("CZ","height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
    }

    @Override
    protected void applyTransformation(float interpolatedTime, Transformation t)
    {
        super.applyTransformation(interpolatedTime, t);
        if (interpolatedTime < 1.0f)
        {
            int newMarginBottom = mMarginBottomFromY + (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime);
            mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
            mView.getParent().requestLayout();
            //Log.v("CZ","newMarginBottom..." + newMarginBottom + " , mLayoutParams.topMargin..." + mLayoutParams.topMargin);
        }
        else if (mVanishAfter)
        {
            mView.setVisibility(View.GONE);
        }
    }
}
