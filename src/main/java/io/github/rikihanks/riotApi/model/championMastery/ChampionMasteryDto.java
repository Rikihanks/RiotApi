package io.github.rikihanks.riotApi.model.championMastery;

public class ChampionMasteryDto {

    private float championId;
    private float championLevel;
    private float championPoints;
    private float lastPlayTime;
    private float championPointsSinceLastLevel;
    private float championPointsUntilNextLevel;
    private boolean chestGranted;
    private float tokensEarned;
    private String summonerId;


    public float getChampionId() {
        return championId;
    }

    public float getChampionLevel() {
        return championLevel;
    }

    public float getChampionPoints() {
        return championPoints;
    }

    public float getLastPlayTime() {
        return lastPlayTime;
    }

    public float getChampionPointsSinceLastLevel() {
        return championPointsSinceLastLevel;
    }

    public float getChampionPointsUntilNextLevel() {
        return championPointsUntilNextLevel;
    }

    public boolean getChestGranted() {
        return chestGranted;
    }

    public float getTokensEarned() {
        return tokensEarned;
    }

    public String getSummonerId() {
        return summonerId;
    }

    public void setChampionId(float championId) {
        this.championId = championId;
    }

    public void setChampionLevel(float championLevel) {
        this.championLevel = championLevel;
    }

    public void setChampionPoints(float championPoints) {
        this.championPoints = championPoints;
    }

    public void setLastPlayTime(float lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public void setChampionPointsSinceLastLevel(float championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public void setChampionPointsUntilNextLevel(float championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public void setChestGranted(boolean chestGranted) {
        this.chestGranted = chestGranted;
    }

    public void setTokensEarned(float tokensEarned) {
        this.tokensEarned = tokensEarned;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

}
