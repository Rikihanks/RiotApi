package io.github.rikihanks.riotApi.model.account;

public class AccountDto {

    private String puuid;
    private String gameName;
    private String tagLine;

    public AccountDto() {

    }

    public AccountDto(String puuId, String gameName, String tagLine) {
        this.puuid = puuId;
        this.gameName = gameName;
        this.tagLine = tagLine;
    }

    public String getpuuid() {
        return puuid;
    }

    public void setpuuid(String puuId) {
        this.puuid = puuId;
    }

    /**
     * This field may be excluded if the account doesn't have a gameName
     * @return
     */
    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    /**
     * This field may be excluded if the account doesn't have a TagLine
     * @return
     */
    public String getTagLine() {
        return tagLine;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }
}
