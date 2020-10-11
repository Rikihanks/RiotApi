package io.github.rikihanks.riotApi.servicesImp;

import io.github.rikihanks.riotApi.config.ConfigValues;
import io.github.rikihanks.riotApi.config.Configuration;
import io.github.rikihanks.riotApi.model.clash.PlayerDto;
import io.github.rikihanks.riotApi.model.clash.TeamDto;
import io.github.rikihanks.riotApi.model.clash.TournamentDto;
import io.github.rikihanks.riotApi.services.IClashService;
import io.github.rikihanks.riotApi.utility.HttpUtil;
import org.apache.http.HttpEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClashService extends BaseService implements IClashService {

    public ClashService(String apiKey) {
        super(apiKey);
    }

    public List<PlayerDto> getPlayersBySummonerId(String summonerId) {
        PlayerDto playerDtos []  = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_CLASH_PLAYERS_BY_SUMMONER_ID)
                    .replace("{summonerId}", summonerId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            playerDtos = mapper.readValue(EntityUtils.toString(entity), PlayerDto[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<PlayerDto>(Arrays.asList(playerDtos));
    }

    public TeamDto getTeamByTeamId(String teamId) {
        TeamDto teamDto = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_CLASH_TEAMS_BY_TEAM_ID)
                    .replace("{teamId}", teamId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            teamDto = mapper.readValue(EntityUtils.toString(entity), TeamDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return teamDto;
    }

    public List<TournamentDto> getActiveTournaments() {
        TournamentDto tournamentDtos []  = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_CLASH_ACTIVE_TOURNAMENTS);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            tournamentDtos = mapper.readValue(EntityUtils.toString(entity), TournamentDto[].class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ArrayList<TournamentDto>(Arrays.asList(tournamentDtos));
    }

    public TournamentDto getTournamentByTeamId(String teamId) {
        TournamentDto tournamentDto = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_CLASH_TOURNAMENTS_BY_TEAM)
                        .replace("{teamId}", teamId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            tournamentDto = mapper.readValue(EntityUtils.toString(entity), TournamentDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tournamentDto;
    }

    public TournamentDto getTournamentByTournamentId(String tournamentId) {
        TournamentDto tournamentDto = null;
        try {
            String url = Configuration.getConfigByValue(ConfigValues.V1_CLASH_TOURNAMENTS_BY_TOURNAMENT_ID)
                    .replace("{tournamentId}", tournamentId);
            HttpEntity entity = HttpUtil.doGet(url , apiKey);
            tournamentDto = mapper.readValue(EntityUtils.toString(entity), TournamentDto.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tournamentDto;
    }
}
