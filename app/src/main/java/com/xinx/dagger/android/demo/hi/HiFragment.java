package com.xinx.dagger.android.demo.hi;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.xinx.dagger.android.demo.R;

import javax.inject.Inject;

import dagger.android.support.DaggerFragment;


public class HiFragment extends DaggerFragment implements HiContract.View {

    @Inject
    HiPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hi, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        presenter.taskView(this);
        presenter.initHiValue();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        presenter.dropView();
    }

    @Override
    public void sayHi(String value) {
        Toast.makeText(getContext(), value, Toast.LENGTH_LONG).show();
    }
}
