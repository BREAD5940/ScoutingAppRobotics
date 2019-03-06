package com.example.scoutingdataentry;

public class Storage {

    public Storage() {}

    int teamNumber = 0;
    String alliance = "null";
    int startLevel = 0;
    int sCargoShip = 0;
    int sCargoRocket = 0;
    int sCargoDrop = 0;
    int sHatchShip = 0;
    int sHatchRocket = 0;
    int sHatchDrop = 0;
    int gCargoShip = 0;
    int gCargoRocket = 0;
    int gCargoDrop = 0;
    int gHatchShip = 0;
    int gHatchRocket = 0;
    int gHatchDrop = 0;
    int endLevel = 0;
    int techFouls = 0;
    int fouls = 0;
    boolean yellowCard = false;
    boolean redCard = false;
    boolean broke = false;
    int points = 0;
    String notes = "null";

    public int getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(int teamNumber) {
        this.teamNumber = teamNumber;
    }

    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    public int getgCargoShip() {
        return gCargoShip;
    }

    public void setgCargoShip(int gCargoShip) {
        this.gCargoShip = gCargoShip;
    }

    public int getgCargoRocket() {
        return gCargoRocket;
    }

    public void setgCargoRocket(int gCargoRocket) {
        this.gCargoRocket = gCargoRocket;
    }

    public int getgCargoDrop() {
        return gCargoDrop;
    }

    public void setgCargoDrop(int gCargoDrop) {
        this.gCargoDrop = gCargoDrop;
    }

    public int getgHatchShip() {
        return gHatchShip;
    }

    public void setgHatchShip(int gHatchShip) {
        this.gHatchShip = gHatchShip;
    }

    public int getgHatchRocket() {
        return gHatchRocket;
    }

    public void setgHatchRocket(int gHatchRocket) {
        this.gHatchRocket = gHatchRocket;
    }

    public int getgHatchDrop() {
        return gHatchDrop;
    }

    public void setgHatchDrop(int gHatchDrop) {
        this.gHatchDrop = gHatchDrop;
    }

    public int getEndLevel() {
        return endLevel;
    }

    public void setEndLevel(int endLevel) {
        this.endLevel = endLevel;
    }

    public int getTechFouls() {
        return techFouls;
    }

    public void setTechFouls(int techFouls) {
        this.techFouls = techFouls;
    }

    public int getFouls() {
        return fouls;
    }

    public void setFouls(int fouls) {
        this.fouls = fouls;
    }

    public boolean getYellowCard() {
        return yellowCard;
    }

    public void setYellowCard(boolean yellowCard) {
        this.yellowCard = yellowCard;
    }

    public boolean getRedCard() {
        return redCard;
    }

    public void setRedCard(boolean redCard) {
        this.redCard = redCard;
    }

    public boolean getBroke() {
        return broke;
    }

    public void setBroke(boolean broke) {
        this.broke = broke;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getStartLevel() {
        return startLevel;
    }

    public void setStartLevel(int startLevel) {
        this.startLevel = startLevel;
    }

    public int getsCargoShip() {
        return sCargoShip;
    }

    public void setsCargoShip(int sCargoShip) {
        this.sCargoShip = sCargoShip;
    }

    public int getsCargoRocket() {
        return sCargoRocket;
    }

    public void setsCargoRocket(int sCargoRocket) {
        this.sCargoRocket = sCargoRocket;
    }

    public int getsCargoDrop() {
        return sCargoDrop;
    }

    public void setsCargoDrop(int sCargoDrop) {
        this.sCargoDrop = sCargoDrop;
    }

    public int getsHatchShip() {
        return sHatchShip;
    }

    public void setsHatchShip(int sHatchShip) {
        this.sHatchShip = sHatchShip;
    }

    public int getsHatchRocket() {
        return sHatchRocket;
    }

    public void setsHatchRocket(int sHatchRocket) {
        this.sHatchRocket = sHatchRocket;
    }

    public int getsHatchDrop() {
        return sHatchDrop;
    }

    public void setsHatchDrop(int sHatchDrop) {
        this.sHatchDrop = sHatchDrop;
    }


    @Override
    public String toString() {
        return alliance + "," + startLevel + "," + sCargoShip + "," + sCargoRocket + "," + sCargoDrop + "," + sHatchShip + "," + sHatchRocket + "," + sHatchDrop + "," + gCargoShip + "," + gCargoRocket + "," + gCargoDrop + "," + gHatchShip + "," + gHatchRocket + "," + gHatchDrop + "," + endLevel + "," + techFouls + "," + fouls + "," + yellowCard + "," + redCard + "," + broke + "," + points + "," + notes;

    }

}
