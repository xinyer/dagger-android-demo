package com.xinx.dagger.android.demo;

public interface BasePresenter<T> {

    void taskView(T view);

    void dropView();
}
