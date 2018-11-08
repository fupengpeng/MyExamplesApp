package com.fpp.myexamplesapp.base;

/**
 * @Description  View基类
 * @Author fpp
 * @Date 2018/11/8 0008 23:22
 */
public interface BaseView {

    void showErrorMsg(String msg);

    void useNightMode(boolean isNight);

    //=======  State  =======
    void stateError();

    void stateEmpty();

    void stateLoading();

    void stateMain();
}
