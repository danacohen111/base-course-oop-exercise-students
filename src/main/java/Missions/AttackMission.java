package Missions;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialVehicle;
import Entities.Coordinates;

public class AttackMission extends Mission{
    private String target;

    public String getTarget() {
        return target;
    }

    public AttackMission(String target, Coordinates missionCoordinates) {
        super(missionCoordinates);
        this.target = target;
    }

    @Override
    public String getDataForMission() {
        return this.getTarget();
    }
}
