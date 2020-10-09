package io.github.rikihanks.riotApi.model.clash;

public class TournamentDto {

    private int id;
    private int themeId;
    private String nameKey;
    private String nameKeySecondary;
    private TournamentPhaseDto[] schedule;

    public TournamentDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getThemeId() {
        return themeId;
    }

    public void setThemeId(int themeId) {
        this.themeId = themeId;
    }

    public String getNameKey() {
        return nameKey;
    }

    public void setNameKey(String nameKey) {
        this.nameKey = nameKey;
    }

    public String getNameKeySecondary() {
        return nameKeySecondary;
    }

    public void setNameKeySecondary(String nameKeySecondary) {
        this.nameKeySecondary = nameKeySecondary;
    }

    public TournamentPhaseDto[] getSchedule() {
        return schedule;
    }

    public void setSchedule(TournamentPhaseDto[] schedule) {
        this.schedule = schedule;
    }
}
