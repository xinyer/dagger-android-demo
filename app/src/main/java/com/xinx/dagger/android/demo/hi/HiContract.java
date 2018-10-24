package com.xinx.dagger.android.demo.hi;

import com.xinx.dagger.android.demo.BasePresenter;
import com.xinx.dagger.android.demo.BaseView;

public interface HiContract {

    interface View extends BaseView<Presenter> {

        void sayHi(String value);

    }

    interface Presenter extends BasePresenter<View> {

        void initHiValue();

    }
}
