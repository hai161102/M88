package com.haiprj.apps.m88.ui.activity;

import android.content.Context;
import android.content.Intent;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityMenuBinding;

public class MenuActivity extends MyActivity<ActivityMenuBinding>{

    public static void start(Context context) {
        Intent starter = new Intent(context, MenuActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_menu;
    }

    @Override
    protected void setupView() {

    }

    @Override
    protected void addEvents() {
        binding.textExit.setOnClickListener(v -> finish());
        binding.textHt.setOnClickListener(v -> {
            SupportActivity.start(this, "Hỗ trợ");
        });
    }
}
