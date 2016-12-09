package com.isanalva.footballteams.ui.teams;

import com.isanalva.footballteams.domain.FootballTeam;

import java.util.List;

public interface TeamsView {

    void showProgress();

    void hideProgress();

    void setTeams(List<FootballTeam> items);

    void showMessage(String message);
}
