package com.haiprj.apps.m88.ui.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityListMembersBinding;
import com.haiprj.apps.m88.model.ClubModel;
import com.haiprj.apps.m88.ui.adapter.TeammateAdapter;

public class ListMemberActivity extends MyActivity<ActivityListMembersBinding>{

    private TeammateAdapter adapter;
    private static ClubModel clubModel;

    public static void start(Context context, ClubModel club) {
        Intent starter = new Intent(context, ListMemberActivity.class);
        clubModel = club;
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_list_members;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void setupView() {
        adapter = new TeammateAdapter(this);
        binding.listMember.setAdapter(adapter);
        binding.topBar.title.setText("Cầu thủ "+ clubModel.getClubName());
        adapter.update(clubModel.getList());
    }

    @Override
    protected void addEvents() {
        binding.topBar.back.setOnClickListener(v -> {
            this.finish();
        });
        binding.topBar.menu.setOnClickListener(v -> {
            MenuActivity.start(this);
        });
    }
}
