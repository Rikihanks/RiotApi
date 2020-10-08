package io.github.rikihanks.riotApi.model.account;

public class ActiveShardDto {

    private String puuid;
    private String game;
    private String activeShard;

    public ActiveShardDto() {
    }

    public ActiveShardDto(String puuId, String game, String activeShard) {
        this.puuid = puuId;
        this.game = game;
        this.activeShard = activeShard;
    }

    public String getPuuid() {
        return puuid;
    }

    public void setPuuid(String puuId) {
        this.puuid = puuId;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getActiveShard() {
        return activeShard;
    }

    public void setActiveShard(String activeShard) {
        this.activeShard = activeShard;
    }
}
