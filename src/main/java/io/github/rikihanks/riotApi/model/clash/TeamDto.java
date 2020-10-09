package io.github.rikihanks.riotApi.model.clash;

public class TeamDto {

    private String id;
    private int tournamentId;
    private String name;
    private int iconId;
    private int tier;
    private String captain;
    private String abbreviation;
    private PlayerDto[] players;

    public TeamDto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(int tournamentId) {
        this.tournamentId = tournamentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public PlayerDto[] getPlayers() {
        return players;
    }

    public void setPlayers(PlayerDto[] players) {
        this.players = players;
    }
}
