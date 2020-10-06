package io.github.rikihanks.riotApi.model;

public class ActiveShardDto {

    private String puuId;
    private String game;
    private String activeShard;

    public ActiveShardDto(String puuId, String game, String activeShard) {
        this.puuId = puuId;
        this.game = game;
        this.activeShard = activeShard;
    }

    public String getPuuId() {
        return puuId;
    }

    public void setPuuId(String puuId) {
        this.puuId = puuId;
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
