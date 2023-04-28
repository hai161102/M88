package com.haiprj.apps.m88.ui.activity;

import android.os.Handler;
import android.util.Log;

import com.haiprj.apps.m88.R;
import com.haiprj.apps.m88.databinding.ActivityLoadBinding;
import com.haiprj.apps.m88.model.TeammateModel;
import com.haiprj.apps.m88.utils.AppUtil;
import com.haiprj.apps.m88.utils.TeammateContainer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LoadActivity extends MyActivity<ActivityLoadBinding>{
    @Override
    protected int getLayoutId() {
        return R.layout.activity_load;
    }

    @Override
    protected void setupView() {
        loadArsenalTeammate();
        loadAstonVillaTeammate();
        loadBrightonTeammate();
        loadChelseaTeammate();
        loadFulHamTeammate();
        loadLiverTeammate();
        loadMCTeammate();
        loadMUTeammate();
        loadNewCastleTeammate();
        loadTOTTeammate();
        Log.d("checkSize", "setupView: " + TeammateContainer.getInstance().arsenalTeammates.size());

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startMain();
            }
        }, 5000);
    }

    private void startMain() {
        MainActivity.start(this);
    }

    private void loadArsenalTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "asenal_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().arsenalTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void loadAstonVillaTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "aston_villa_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().astonVillaTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadBrightonTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "brighton_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().brightonTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadChelseaTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "chelsea_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().chelseaTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadFulHamTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "fullham_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().fulhamTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadLiverTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "liver_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().liverTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadMCTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "mc_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().mcTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadMUTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "mu_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().muTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadNewCastleTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "newcatsle.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().newCastleTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private void loadTOTTeammate() {
        File file = AppUtil.writeContentToCache(this, AppUtil.readFileTextContentFromAsset(this, "tottenham_teamate.txt"));

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] dataLine = line.split("-");
                TeammateModel teammateModel = new TeammateModel();
                teammateModel.setPosition(dataLine[0]);
                teammateModel.setFullName(dataLine[1]);
                teammateModel.setCountry(dataLine[2]);
                teammateModel.setBirthYear(Integer.parseInt(dataLine[3]));
                TeammateContainer.getInstance().totTeammates.add(teammateModel);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void addEvents() {

    }
}
