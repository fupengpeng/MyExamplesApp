package com.fpp.myexamplesapp.base;

/**
 * @Description  Presenter基类
 * @Author fpp
 * @Date 2018/11/8 0008 23:22
 */
public interface BasePresenter<T extends BaseView>{

    void attachView(T view);

    void detachView();
}
