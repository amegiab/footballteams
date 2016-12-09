package com.isanalva.footballteams.ui.teams;

import android.util.Log;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.isanalva.footballteams.FootballTeamsApp;
import com.isanalva.footballteams.domain.CompetitionTeams;
import com.isanalva.footballteams.services.impl.FootballTeamApiVolleyClient;


public class TeamsInteractorImpl implements TeamsInteractor {

    private static final String TAG = "TeamsInteractorImpl";

    @Override
    public void findTeams(final OnFinishedListener listener) {
        FootballTeamApiVolleyClient client = new FootballTeamApiVolleyClient();
        client.getFootballTeams("436",FootballTeamsApp.getContext(), new Response.Listener<CompetitionTeams>() {
            @Override
            public void onResponse(CompetitionTeams response) {
                listener.onFinished(response.getTeams());
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(TAG,error.getMessage());
            }
        });
    }

}
