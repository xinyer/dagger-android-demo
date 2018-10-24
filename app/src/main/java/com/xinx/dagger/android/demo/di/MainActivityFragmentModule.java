package com.xinx.dagger.android.demo.di;

import com.xinx.dagger.android.demo.hello.HelloActivity;
import com.xinx.dagger.android.demo.hello.HelloModule;
import com.xinx.dagger.android.demo.hi.HiFragment;
import com.xinx.dagger.android.demo.hi.HiModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityFragmentModule {

    @ContributesAndroidInjector(modules = HiModule.class)
    abstract HiFragment hiFragment();

}
