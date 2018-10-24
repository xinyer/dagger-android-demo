package com.xinx.dagger.android.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xinx.dagger.android.demo.hello.HelloActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_hello).setOnClickListener(v -> {
            startActivity(new Intent(this, HelloActivity.class));
        });
    }
}
