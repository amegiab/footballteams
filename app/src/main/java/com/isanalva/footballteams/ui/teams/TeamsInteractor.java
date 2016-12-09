package com.isanalva.footballteams.ui.teams;

import com.isanalva.footballteams.domain.FootballTeam;

import java.util.List;

public interface TeamsInteractor {

    interface OnFinishedListener {
        void onFinished(List<FootballTeam> items);
    }

    void findTeams(OnFinishedListener listener);
}
