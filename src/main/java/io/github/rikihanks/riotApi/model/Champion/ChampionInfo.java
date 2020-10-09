package io.github.rikihanks.riotApi.model.Champion;

public class ChampionInfo {

    public int maxNewPlayerLevel;
    public int [] freeChampionIdsForNewPlayers;
    public int [] freeChampionIds;

    public ChampionInfo() {

    }

    public int getMaxNewPlayerLevel() {
        return maxNewPlayerLevel;
    }

    public void setMaxNewPlayerLevel(int maxNewPlayerLevel) {
        this.maxNewPlayerLevel = maxNewPlayerLevel;
    }

    public int[] getFreeChampionIdsForNewPlayers() {
        return freeChampionIdsForNewPlayers;
    }

    public void setFreeChampionIdsForNewPlayers(int[] freeChampionIdsForNewPlayers) {
        this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
    }

    public int[] getFreeChampionIds() {
        return freeChampionIds;
    }

    public void setFreeChampionIds(int[] freeChampionIds) {
        this.freeChampionIds = freeChampionIds;
    }
}
