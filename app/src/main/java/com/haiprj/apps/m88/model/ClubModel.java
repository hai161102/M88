package com.haiprj.apps.m88.model;

import java.io.Serializable;
import java.util.List;

public class ClubModel implements Serializable {

    public static class ClubDescription {
        private String title;
        private String body;

        public ClubDescription(String title, String body) {
            this.title = title;
            this.body = body;
        }

        public ClubDescription() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
    }

    private String clubName;
    private int logoRes;
    private List<TeammateModel> list;
    private ClubDescription description;

    public ClubModel(String clubName, int logoRes, List<TeammateModel> list, ClubDescription description) {
        this.clubName = clubName;
        this.logoRes = logoRes;
        this.list = list;
        this.description = description;
    }

    public ClubModel() {
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getLogoRes() {
        return logoRes;
    }

    public void setLogoRes(int logoRes) {
        this.logoRes = logoRes;
    }

    public List<TeammateModel> getList() {
        return list;
    }

    public void setList(List<TeammateModel> list) {
        this.list = list;
    }

    public ClubDescription getDescription() {
        return description;
    }

    public void setDescription(ClubDescription description) {
        this.description = description;
    }
}
