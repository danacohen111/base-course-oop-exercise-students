package Missions;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class BdaMission extends Mission{
    private String objective;

    public BdaMission(Coordinates missionCoordinates) {
        super(missionCoordinates);
    }
}
