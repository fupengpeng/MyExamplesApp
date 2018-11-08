package com.fpp.myexamplesapp.utils;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * @Description
 * @Author fpp
 * @Date 2018/11/8 0008 23:15
 */

public class SnackbarUtil {

    public static void show(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_LONG).show();
    }

    public static void showShort(View view, String msg) {
        Snackbar.make(view, msg, Snackbar.LENGTH_SHORT).show();
    }
}
