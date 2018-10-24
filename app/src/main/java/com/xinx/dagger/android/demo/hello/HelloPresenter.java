package com.xinx.dagger.android.demo.hello;

import javax.inject.Inject;

public class HelloPresenter implements HelloContract.Presenter {

    private HelloContract.View helloView;

    @Inject
    HelloPresenter() {

    }

    @Override
    public void initHelloValue() {
        helloView.sayHello("Hello World.");
    }

    @Override
    public void taskView(HelloContract.View view) {
        this.helloView = view;
    }

    @Override
    public void dropView() {
        this.helloView = null;
    }
}
