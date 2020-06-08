package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;

public class Shoval extends Haron implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {
    public Shoval(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void attack() {

    }

    @Override
    public void performBda() {

    }

    @Override
    public void collectIntelligence() {

    }
}

