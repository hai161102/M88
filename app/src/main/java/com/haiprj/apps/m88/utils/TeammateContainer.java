package com.haiprj.apps.m88.utils;

import com.haiprj.apps.m88.model.TeammateModel;

import java.util.ArrayList;
import java.util.List;

public class TeammateContainer {

    private static TeammateContainer instance;

    public final List<TeammateModel> arsenalTeammates = new ArrayList<>();
    public final List<TeammateModel> astonVillaTeammates = new ArrayList<>();
    public final List<TeammateModel> brightonTeammates = new ArrayList<>();
    public final List<TeammateModel> chelseaTeammates = new ArrayList<>();
    public final List<TeammateModel> fulhamTeammates = new ArrayList<>();
    public final List<TeammateModel> liverTeammates = new ArrayList<>();
    public final List<TeammateModel> mcTeammates = new ArrayList<>();
    public final List<TeammateModel> muTeammates = new ArrayList<>();
    public final List<TeammateModel> newCastleTeammates = new ArrayList<>();
    public final List<TeammateModel> totTeammates = new ArrayList<>();
    private TeammateContainer() {

    }
    public static TeammateContainer getInstance() {
        if (instance == null) instance = new TeammateContainer();
        return instance;
    }
}
