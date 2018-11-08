package com.fpp.myexamplesapp.utils;

import com.orhanobut.logger.BuildConfig;
import com.orhanobut.logger.Logger;

/**
 * @Description
 * @Author fpp
 * @Date 2018/11/8 0008 23:16
 */
public class LogUtil {

    public static boolean isDebug = BuildConfig.DEBUG;
    private static final String TAG = "com.fpp.myexamplesapp";

    public static void e(String tag, Object o) {
        if(isDebug) {
            Logger.e(tag, o);
        }
    }

    public static void e(Object o) {
        LogUtil.e(TAG,o);
    }

    public static void w(String tag, Object o) {
        if(isDebug) {
            Logger.w(tag, o);
        }
    }

    public static void w(Object o) {
        LogUtil.w(TAG,o);
    }

    public static void d(String msg) {
        if(isDebug) {
            Logger.d(msg);
        }
    }

    public static void i(String msg) {
        if(isDebug) {
            Logger.i(msg);
        }
    }
}
