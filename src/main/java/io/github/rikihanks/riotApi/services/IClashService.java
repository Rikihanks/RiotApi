package io.github.rikihanks.riotApi.services;

import io.github.rikihanks.riotApi.model.clash.PlayerDto;
import io.github.rikihanks.riotApi.model.clash.TeamDto;
import io.github.rikihanks.riotApi.model.clash.TournamentDto;

import java.util.List;

public interface IClashService {

    List<PlayerDto> getPlayersBySummonerId(String summonerId);
    TeamDto getTeamByTeamId(String teamId);
    List<TournamentDto> getActiveTournaments();
    TournamentDto getTournamentByTeamId(String teamId);
    TournamentDto getTournamentByTournamentId(String tournamentId);
}
