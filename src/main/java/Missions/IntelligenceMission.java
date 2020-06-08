package Missions;

import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class IntelligenceMission extends Mission{
    private String region;

    public IntelligenceMission(Coordinates missionCoordinates) {
        super(missionCoordinates);
    }
}
