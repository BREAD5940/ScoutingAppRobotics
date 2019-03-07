package com.example.scoutingdataentry;

public class Storage {

    public Storage() {}

    int teamNumber = 0;

    //Game Data Variables
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

    //Pit Data Variables
    boolean floorIntake = false;
    boolean sidewaysElevator = false;
    boolean shooter = false;
    String intakeType = "null";
    String language = "null";
    //Drive Train, dTrain, get it? It's cuz it's a shorter way of writing it
    String dTrainType = "null";
    String strategy = "null";
    String sandstormType = "null";
    String wheelSize = "null";
    String weight = "null";
    String elevatorSpeed = "null";
    String highDTrainSpeed = "null";
    String lowDTrainSpeed = "null";
    int elevatorHeight = 0;
    int habScale = 0;
    //I want this to be the working title:
    int roboPiggybacks = 0;


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
        return teamNumber + "," + alliance + "," + startLevel + "," + sCargoShip + "," + sCargoRocket + "," + sCargoDrop + "," + sHatchShip + "," + sHatchRocket + "," + sHatchDrop + "," + gCargoShip + "," + gCargoRocket + "," + gCargoDrop + "," + gHatchShip + "," + gHatchRocket + "," + gHatchDrop + "," + endLevel + "," + techFouls + "," + fouls + "," + yellowCard + "," + redCard + "," + broke + "," + points + "," + floorIntake + "," + sidewaysElevator + "," + intakeType + "," + language + "," + dTrainType + "," + wheelSize + "," + weight + "," + elevatorSpeed + "," + highDTrainSpeed + "," + lowDTrainSpeed + "," + elevatorHeight + "," + habScale + "," + roboPiggybacks + "," + strategy + "," + shooter + "," + sandstormType + "," + notes + "\n";

    }

}
