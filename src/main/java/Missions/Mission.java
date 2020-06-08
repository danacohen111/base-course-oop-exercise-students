package Missions;

import Entities.Coordinates;

public abstract class Mission implements MissionService{
    private Coordinates missionCoordinates;

    public Mission(Coordinates missionCoordinates) {
        this.missionCoordinates = missionCoordinates;
    }

    public Coordinates getMissionCoordinates() {
        return missionCoordinates;
    }

    @Override
    public void begin() {
        System.out.println("Beginning Mission!");
    }

    @Override
    public void cancel() {
        System.out.println("Abort Mission!");
    }

    @Override
    public void finish() {
        System.out.println("Finish Mission!");
    }

    @Override
    public abstract String getDataForMission();
}


