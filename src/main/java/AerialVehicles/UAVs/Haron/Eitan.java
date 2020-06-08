package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;

public class Eitan extends Haron implements AerialIntelligenceVehicle, AerialAttackVehicle {
    public Eitan(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void attack() {

    }

    @Override
    public void collectIntelligence() {

    }
}
