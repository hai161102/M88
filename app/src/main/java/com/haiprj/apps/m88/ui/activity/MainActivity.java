package com.haiprj.apps.m88.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityMainBinding;
import com.haiprj.apps.m88.model.ClubModel;
import com.haiprj.apps.m88.ui.adapter.ClubAdapter;
import com.haiprj.apps.m88.utils.TeammateContainer;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends MyActivity<ActivityMainBinding> {

    private ClubAdapter clubAdapter;
    private final List<ClubModel> clubModels = new ArrayList<>();
    private final List<ClubModel> listSearch = new ArrayList<>();

    public static void start(Context context) {
        Intent starter = new Intent(context, MainActivity.class);
        context.startActivity(starter);
    }
    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void setupView() {
        binding.topBar.back.setVisibility(View.INVISIBLE);
        binding.topBar.title.setText("Danh sách các đội bóng 2023");
        initListClub();
        clubAdapter = new ClubAdapter(this);
        binding.rcvTeam.setAdapter(clubAdapter);
        clubAdapter.update(clubModels);
    }

    private void initListClub() {
        clubModels.add(
                new ClubModel("Arsenal",
                        R.drawable.arsenal,
                        TeammateContainer.getInstance().arsenalTeammates,
                        new ClubModel.ClubDescription(
                                "Arsenal là một trong những đội bóng lớn và nối tiếng thế giới," +
                                        " có trụ sở tại London. Arsenal được thành lập vào năm 1886 và hiện là một trong những đội bóng có lịch sử lâu đời nhất tại Anh Quốc",
                                "Arsenal hiện đang thi đấu tại giải Ngoại hạng Anh," +
                                        " câu lạc bộ này đã giành được 13 chức vô địch quốc gia, " +
                                        "14 Cup FA (kỷ lục), 2 Cúp Liên đoàn Anh, " +
                                        "1 Cúp Liên đoàn Thế kỷ, 16 Siêu cúp Anh," +
                                        " 1 Cup UEFA và 1 Cup Inter-Cities Fairs. " +
                                        "Arsenal cũng được biết đến với trung tâm đào tạo cầu thủ trẻ với nhiều cầu thủ trẻ tài năng được tạo điều kiện để phát triển và trở thành những ngôi sao trong tương lai.\n"
                        )));
        clubModels.add(
                new ClubModel(
                        "Aston Villa",
                        R.drawable.aston_villa,
                        TeammateContainer.getInstance().astonVillaTeammates,
                        new ClubModel.ClubDescription(
                                "Aston Villa Football Club là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại thành phố Birmingham, nước Anh.",
                                "Được thành lập vào năm 1874, là một trong những câu lạc bộ bóng đá có lịch sử lâu đời nhất ở nước Anh và giành được nhiều danh hiệu. CLB đang thi đấu tại giải Ngoại hạng Anh và giành được vô địch giải này tới 7 lần trong lịch sử của mình. Ngoài ra, CLB còn đăng quang tại Cúp FA, 5 lần giành Siêu cúp Anh và 1 lần giành Cúp C2 Châu  u (nay là Europa League). Aston Villa là một trong những câu lạc bộ có lượng fan hâm mộ đông đảo nhất tại Anh và thường xuyên thi đấu trên sân nhà có sức chưa hơn 42.000 khán giả đó là sân vận động Villa Park."
                        )));
        clubModels.add(
                new ClubModel(
                        "Brighton",
                        R.drawable.brighton,
                        TeammateContainer.getInstance().brightonTeammates,
                        new ClubModel.ClubDescription(
                                "",
                                ""
                        )));
        clubModels.add(new ClubModel("FulHam", R.drawable.fulham, TeammateContainer.getInstance().fulhamTeammates, new ClubModel.ClubDescription("", "")));
        clubModels.add(
                new ClubModel(
                        "Liverpool",
                        R.drawable.liver,
                        TeammateContainer.getInstance().liverTeammates,
                        new ClubModel.ClubDescription(
                                "Liverpool là một câu lạc bộ đến từ thành phố Liverpool của Anh.",
                                " Được thành lập vào năm 1982, là một trong những đội bóng có  lịch sử lâu đời và được yêu thích nhất ở Anh và trên toàn thế giới. Liverpool đã có một profile khá khủng đó là 19 chức vô địch Ngoại hạng Anh, 7 lần vô địch Champions League, 8 lần vô địch Cúp FA, 4 lần vô didhcj Cúp Liên đoàn Anh và 1 lần vô địch Siêu cúp Châu  u. Ngoài ra, CLB còn có đội hình tài năng và có một cộng đồng fan hâm mộ đông đảo. Với sức chứa hơn 54.000 chỗ ngồi, sân Anfield – sân nhà của Liverpool – được coi là một trong những sân vận động lừng danh nhất thế giới."
                        )));
        clubModels.add(
                new ClubModel(
                        "Manchester City",
                        R.drawable.mc,
                        TeammateContainer.getInstance().mcTeammates,
                        new ClubModel.ClubDescription(
                                "Manchester City ( hay còn gọi là MC) là một trong những đội bóng hàng đầu của bóng đá Anh và thế giới.",
                                "Được thành lập vào năm 1880, MC đã trải qua nhiều giai đoạn phát triển và trở thành đội bóng hùng mạnh như ngày nay. Với màu sắc xanh chủ đạo trên áo đấu, MC là biểu tượng của thành phố Manchester và được người hâm mộ trên toàn thế giới yêu thích. Đội bóng sở hữu một sân vận động hiện đại là Etihad Stadium với sức chứa lên đến hơn 55.000 người. Về thành tích, MC đã 7 lần vô địch giải Ngoại hạng Anh, 6 lần Cúp Liên đoàn Anh, 6 lần Cúp FA,…và nhiều giải đấu danh giá nhất Châu Âu."
                        )));
        clubModels.add(
                new ClubModel(
                        "Manchester United",
                        R.drawable.mu,
                        TeammateContainer.getInstance().muTeammates,
                        new ClubModel.ClubDescription(
                                "Manchester United là một CLB bóng đá nổi tiếng và sức ảnh hưởng to lớn trên toàn thế giới.",
                                "Với lịch sử hơn một thế kỷ, MU đã trở thành một trong những đội bóng hàng đầu tại Anh và toàn cầu, với 20 chức vô địch Ngoại hạng Anh, 3 lần vô địch Champions League và nhiều danh hiệu khác. Sự thành công của CLB không chỉ bắt nguồn từ sự thể hiện trên sân cỏ mà còn từ niềm đam mê và tình yêu của những người hâm mộ trung thành, tạo nên một thương hiệu vững chắc và sức mạnh tuyệt đối."
                        )));
        clubModels.add(
                new ClubModel("New Castle",
                        R.drawable.newcastle,
                        TeammateContainer.getInstance().newCastleTeammates,
                        new ClubModel.ClubDescription(
                                "Newcastle United hay được gọi là Newcastle hay chỉ đơn giản là NUFC là một câu lạc bộ bóng đá chuyên nghiệp có trụ sở tại thành phố Newcastle nước Anh.",
                                "Được thành lập vào năm 1892, Newcastle là một trong những đội bóng có lịch sử lâu đời và được yêu thích nhất tại khu vực Bắc Đông nước Anh. Trong suốt hơn một thế kr tồn tại, Newcastle đã giành được nhiều danh hiệu như 4 chức vô địch Ngoại hạng Anh, 6 lần đoạt Cúp FA và 1 lần đoạt Siêu cúp Anh. Ngoài ra, CLB còn có một đội hình tài năng và được yêu thích bởi cộng đồng fan hâm mộ toàn cầu."
                        )));
        clubModels.add(
                new ClubModel(
                        "Tottenham Hotspur",
                        R.drawable.tot,
                        TeammateContainer.getInstance().totTeammates,
                        new ClubModel.ClubDescription(
                                "Tottenham là một câu lạc bộ bóng đá có trụ sở tại London, Anh Quốc.",
                                "Tottenham được thành lập năm 1882 và hiện đang thi đấu ở Giải Ngoại hạng Anh – giải đấu cao nhất của bóng đá Anh. Tottenham đã giành được nhiều danh hiệu lớn trong lịch sử của mình bảo gồm 2 chức vô địch CÚp C2 Châu  u, 2 chức vô địch Ngoại hạng Anh, 8 lần vô địch Cup FA và 4 lần vô địch Cup Liên đoàn Anh, Các thành tích này đã giúp cho Tottenham trở thành một trong top các đội bóng hàng đầu của bóng đá Anh."
                        )));
    }

    @Override
    protected void addEvents() {
        binding.topBar.menu.setOnClickListener(v -> {
            MenuActivity.start(this);
        });
        binding.searchSpace.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                search(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    private void search(CharSequence s) {
        listSearch.clear();
        if (s.length() == 0) {
            clubAdapter.update(clubModels);
            return;
        }
        for (ClubModel clubModel : clubModels) {
            if (clubModel.getClubName().toLowerCase().contains(s.toString().toLowerCase())) {
                listSearch.add(clubModel);
            }
        }
        clubAdapter.update(listSearch);
    }
}