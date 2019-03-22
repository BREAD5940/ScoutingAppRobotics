package com.example.scoutingdataentry;

import java.util.HashMap;

public class Storage {

    String teamNumber = " ";

    //Game Data Variables
    String alliance = " ";
    String matchType = " ";
    int matchNum = 0;
    int startLevel = 0;
//    HashMap<String, Integer> =
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
    String endLevel = "0";
    int techFouls = 0;
    int fouls = 0;
    boolean yellowCard = false;
    boolean redCard = false;
    boolean broke = false;
    boolean noAuto = false;
    String points = " ";
    String notes = " ";

    //Pit Data Variables
    boolean floorIntake = false;
    boolean sidewaysElevator = false;
    boolean shooter = false;
    boolean encoders = false;
    String intakeType = " ";
    String language = " ";
    //Drive Train, dTrain, get it? It's cuz it's a shorter way of writing it
    String dTrainType = " ";
    String strategy = " ";
    String sandstormType = " ";
    String wheelSize = " ";
    String weight = " ";
    String elevatorSpeed = " ";
    String highDTrainSpeed = " ";
    String lowDTrainSpeed = " ";
    int elevatorHeight = 0;
    int habScale = 0;
    //I want this to be the working title:
    int roboPiggybacks = 0;

    public static GameDataChecker isGameData = new GameDataChecker();


    public boolean getFloorIntake() {
        return floorIntake;
    }

    public void setFloorIntake(boolean floorIntake) {
        this.floorIntake = floorIntake;
    }

    public boolean getSidewaysElevator() {
        return sidewaysElevator;
    }

    public void setSidewaysElevator(boolean sidewaysElevator) {
        this.sidewaysElevator = sidewaysElevator;
    }

    public boolean getShooter() {
        return shooter;
    }

    public void setShooter(boolean shooter) {
        this.shooter = shooter;
    }

    public boolean getEncoders() { return encoders; }

    public void setEncoders(boolean encoders) { this.encoders = encoders; }

    public String getIntakeType() {
        return intakeType;
    }

    public void setIntakeType(String intakeType) {
        this.intakeType = intakeType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getdTrainType() {
        return dTrainType;
    }

    public void setdTrainType(String dTrainType) {
        this.dTrainType = dTrainType;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getSandstormType() {
        return sandstormType;
    }

    public void setSandstormType(String sandstormType) {
        this.sandstormType = sandstormType;
    }

    public String getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(String wheelSize) {
        this.wheelSize = wheelSize;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getElevatorSpeed() {
        return elevatorSpeed;
    }

    public void setElevatorSpeed(String elevatorSpeed) {
        this.elevatorSpeed = elevatorSpeed;
    }

    public String getHighDTrainSpeed() {
        return highDTrainSpeed;
    }

    public void setHighDTrainSpeed(String highDTrainSpeed) {
        this.highDTrainSpeed = highDTrainSpeed;
    }

    public String getLowDTrainSpeed() {
        return lowDTrainSpeed;
    }

    public void setLowDTrainSpeed(String lowDTrainSpeed) {
        this.lowDTrainSpeed = lowDTrainSpeed;
    }

    public int getElevatorHeight() {
        return elevatorHeight;
    }

    public void setElevatorHeight(int elevatorHeight) {
        this.elevatorHeight = elevatorHeight;
    }

    public int getHabScale() {
        return habScale;
    }

    public void setHabScale(int habScale) {
        this.habScale = habScale;
    }

    public int getRoboPiggybacks() {
        return roboPiggybacks;
    }

    public void setRoboPiggybacks(int roboPiggybacks) {
        this.roboPiggybacks = roboPiggybacks;
    }



    public String getTeamNumber() {
        return teamNumber;
    }

    public void setTeamNumber(String teamNumber) {
        this.teamNumber = teamNumber;
    }



    public String getAlliance() {
        return alliance;
    }

    public void setAlliance(String alliance) {
        this.alliance = alliance;
    }

    public String getMatchType() { return matchType; }

    public void setMatchType(String matchType) { this.matchType = matchType; }

    public int getMatchNum() { return matchNum; }

    public void setMatchNum(int matchNum) { this.matchNum = matchNum; }

    public boolean getNoAuto(){ return noAuto; }

    public void setNoAuto(boolean isChecked) {this.noAuto = isChecked;}

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

    public String getEndLevel() {
        return endLevel;
    }

    public void setEndLevel(String endLevel) {
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

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
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


    @Override @Deprecated
    public String toString() {
        System.out.println("STATE OF ISGAMEDATA: " + isGameData.isGameDataCheck());
        if (isGameData.isGameDataCheck()) {
            return matchType+","+matchNum+","+teamNumber + "," + alliance + "," + startLevel + "," + sCargoShip + "," + sCargoRocket + "," + sCargoDrop + "," + sHatchShip + "," + sHatchRocket + "," + sHatchDrop + "," + gCargoShip + "," + gCargoRocket + "," + gCargoDrop + "," + gHatchShip + "," + gHatchRocket + "," + gHatchDrop + "," + endLevel + "," + techFouls + "," + fouls + "," + yellowCard + "," + redCard + "," + broke + "," + points + "," + "," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + notes + "\n";
        }else{
            return teamNumber + "," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + " ," + floorIntake + "," + sidewaysElevator + "," + intakeType + "," + language + "," + dTrainType + "," + wheelSize + "," + weight + "," + elevatorSpeed + "," + highDTrainSpeed + "," + lowDTrainSpeed + "," + elevatorHeight + "," + habScale + "," + roboPiggybacks + "," + strategy + "," + shooter + "," + sandstormType + "," + notes + "\n";
        }
    }

    public String stringGame(){
        return matchType+","+matchNum+","+teamNumber + "," + alliance + "," + startLevel + "," + sCargoShip + "," + sCargoRocket + "," + sCargoDrop + "," + sHatchShip + "," + sHatchRocket + "," + sHatchDrop + "," + gCargoShip + "," + gCargoRocket + "," + gCargoDrop + "," + gHatchShip + "," + gHatchRocket + "," + gHatchDrop + "," + endLevel + "," + techFouls + "," + fouls + "," + yellowCard + "," + redCard + "," + broke +"," + points +","+"|"+ notes+"|" + "\n";
    }

    public String stringPit(){
        return floorIntake + "," + sidewaysElevator + "," + intakeType + "," + language + "," + dTrainType + "," + wheelSize + "," + weight + "," + elevatorSpeed + "," + highDTrainSpeed + "," + lowDTrainSpeed + "," + elevatorHeight + "," + habScale + "," + roboPiggybacks + "," + strategy + "," + shooter + "," + sandstormType + "," + notes + "\n";
    }

}
