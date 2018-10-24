package com.xinx.dagger.android.demo.hello;

import com.xinx.dagger.android.demo.BasePresenter;
import com.xinx.dagger.android.demo.BaseView;

public interface HelloContract {

    interface View extends BaseView<Presenter> {

        void sayHello(String value);

    }

    interface Presenter extends BasePresenter<View> {

        void initHelloValue();

    }
}
