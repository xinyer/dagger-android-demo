package com.xinx.dagger.android.demo.hi;

import com.xinx.dagger.android.demo.hello.HelloContract;

import javax.inject.Inject;

public class HiPresenter implements HiContract.Presenter {

    private HiContract.View hiView;

    @Inject
    HiPresenter() {

    }

    @Override
    public void initHiValue() {
        hiView.sayHi("Hi World.");
    }

    @Override
    public void taskView(HiContract.View view) {
        this.hiView = view;
    }

    @Override
    public void dropView() {
        this.hiView = null;
    }
}
