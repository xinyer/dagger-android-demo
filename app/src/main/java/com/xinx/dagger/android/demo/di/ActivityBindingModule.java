package com.xinx.dagger.android.demo.di;

import com.xinx.dagger.android.demo.hello.HelloActivity;
import com.xinx.dagger.android.demo.hello.HelloModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBindingModule {


    @ContributesAndroidInjector(modules = HelloModule.class)
    abstract HelloActivity helloActivity();

}
