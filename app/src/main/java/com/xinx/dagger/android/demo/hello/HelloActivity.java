package com.xinx.dagger.android.demo.hello;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.xinx.dagger.android.demo.R;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class HelloActivity extends DaggerAppCompatActivity implements HelloContract.View {

    @Inject
    HelloPresenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        presenter.taskView(this);
        presenter.initHelloValue();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.dropView();
    }

    @Override
    public void sayHello(String value) {
        Toast.makeText(this, value, Toast.LENGTH_LONG).show();
    }
}
