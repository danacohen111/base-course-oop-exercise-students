package Missions;

import Entities.Coordinates;

public abstract class Mission{
    private Coordinates missionCoordinates;

    public Mission(Coordinates missionCoordinates) {
        this.missionCoordinates = missionCoordinates;
    }

    public Coordinates getMissionCoordinates() {
        return missionCoordinates;
    }

    public void setMissionCoordinates(Coordinates missionCoordinates) {
        this.missionCoordinates = missionCoordinates;
    }

    public void begin() {
        System.out.println("Beginning Mission!");
    }

    public void cancel() {
        System.out.println("Abort Mission!");
    }

    public void finish() {
        System.out.println("Finish Mission!");
    }
}


