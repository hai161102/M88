package com.haiprj.apps.m88.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.view.View;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityViewAppInfoBinding;

public class AppInfoActivity extends MyActivity<ActivityViewAppInfoBinding>{
    private static final String TITLE = "TITLE";
    private static final String DATA = "DATA";
    private String title = "";
    private String data = "";

    public static void start(Context context, String title, String data) {
        Intent starter = new Intent(context, SupportActivity.class);
        starter.putExtra(TITLE, title);
        starter.putExtra(DATA, data);
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_view_app_info;
    }

    @Override
    protected void setupView() {
        title = getIntent().getStringExtra(TITLE);
        data = getIntent().getStringExtra(DATA);
        binding.topBar.menu.setVisibility(View.GONE);
        binding.topBar.title.setText(title);
        binding.text.setText(data);
    }

    @Override
    protected void addEvents() {

    }
}
