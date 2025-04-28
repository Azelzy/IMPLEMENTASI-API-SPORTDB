package com.example.implementasiapisportdb;

import com.google.gson.annotations.SerializedName;

public class Team {
    @SerializedName("strTeam")
    private String teamName;

    @SerializedName("strTeamBadge")
    private String teamBadge;

    public String getTeamName() {
        return teamName;
    }

    public String getTeamBadge() {
        return teamBadge;
    }
}
