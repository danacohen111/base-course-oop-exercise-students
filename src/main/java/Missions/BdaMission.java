package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission{
    private String objective;

    public String getObjective() {
        return objective;
    }

    public BdaMission(String objective, Coordinates missionCoordinates) {
        super(missionCoordinates);
        this.objective = objective;
    }

    @Override
    public String getDataForMission() {
        return this.getObjective();
    }
}
