package com.haiprj.apps.m88.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityTeamInfoBinding;
import com.haiprj.apps.m88.model.ClubModel;

import java.io.Serializable;

public class TeamInfoActivity extends MyActivity<ActivityTeamInfoBinding>{

    private static final String CLUB = "CLUB";
    private static ClubModel clubModel;
    public static void start(Context context, ClubModel club) {
        Intent starter = new Intent(context, TeamInfoActivity.class);
        clubModel = club;
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_team_info;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void setupView() {
        binding.topBar.title.setText("Giới thiệu " + clubModel.getClubName());
        binding.titleInfo.setText(clubModel.getDescription().getTitle());
        binding.bodyText.setText(clubModel.getDescription().getBody());
    }

    @Override
    protected void addEvents() {
        binding.topBar.back.setOnClickListener(v -> finish());
        binding.showListBtn.setOnClickListener(v -> {
            ListMemberActivity.start(this, clubModel);
        });
        binding.topBar.menu.setOnClickListener(v -> {
            MenuActivity.start(this);
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        clubModel = null;
    }
}
