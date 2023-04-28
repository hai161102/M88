package com.haiprj.apps.m88.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivitySupportBinding;

public class SupportActivity extends MyActivity<ActivitySupportBinding>{

    private static final String TITLE = "TITLE";
    private static final String DATA = "DATA";

    public static void start(Context context, String title) {
        Intent starter = new Intent(context, SupportActivity.class);
        starter.putExtra(TITLE, title);
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_support;
    }

    @Override
    protected void setupView() {
        String title = getIntent().getStringExtra(TITLE);
        binding.topBar.menu.setVisibility(View.INVISIBLE);
        binding.topBar.title.setText(title);
    }

    @Override
    protected void addEvents() {
        binding.topBar.back.setOnClickListener(v -> finish());
    }
}
