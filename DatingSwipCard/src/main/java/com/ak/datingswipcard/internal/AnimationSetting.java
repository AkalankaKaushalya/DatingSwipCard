package com.ak.datingswipcard.internal;

import android.view.animation.Interpolator;

import com.ak.datingswipcard.Direction;

public interface AnimationSetting {
    Direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
