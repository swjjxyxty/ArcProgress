package com.bestxty.pb;

import android.content.res.Resources;

/**
 * @author xty
 *         Created by xty on 2016/6/19.
 */
public class PxUtil {
    public static float dp2px(Resources resources, float dp) {
        final float scale = resources.getDisplayMetrics().density;
        return dp * scale + 0.5f;
    }

    public static float sp2px(Resources resources, float sp) {
        final float scale = resources.getDisplayMetrics().scaledDensity;
        return sp * scale;
    }
}
