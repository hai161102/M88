package com.haiprj.apps.m88.ui.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

public abstract class MyActivity<T> extends AppCompatActivity {

    protected T binding;

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = (T) DataBindingUtil.setContentView(this, getLayoutId());
        setupView();
        addEvents();
    }

    protected abstract int getLayoutId();

    protected abstract void setupView();

    protected abstract void addEvents();
}
