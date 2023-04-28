package com.haiprj.apps.m88.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityMainBinding;

public class MainActivity extends MyActivity<ActivityMainBinding> {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void setupView() {
        binding.topBar.back.setVisibility(View.GONE);
    }

    @Override
    protected void addEvents() {

    }
}