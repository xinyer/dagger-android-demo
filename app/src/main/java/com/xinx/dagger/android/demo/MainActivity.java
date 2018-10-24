package com.xinx.dagger.android.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xinx.dagger.android.demo.hello.HelloActivity;
import com.xinx.dagger.android.demo.hi.HiFragment;
import com.xinx.dagger.android.demo.utils.ActivityUtils;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_hello).setOnClickListener(v -> {
            startActivity(new Intent(this, HelloActivity.class));
        });

        findViewById(R.id.btn_hi).setOnClickListener(v -> {
            showHiFragment();
        });
    }

    private void showHiFragment() {
        HiFragment hiFragment = (HiFragment) getSupportFragmentManager()
                .findFragmentById(R.id.container);
        if (hiFragment == null) {
            hiFragment = new HiFragment();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(),
                    hiFragment, R.id.container);
        }
    }
}
