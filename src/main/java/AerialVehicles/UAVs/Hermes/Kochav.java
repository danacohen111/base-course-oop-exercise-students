package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;

public class Kochav extends Hermes implements AerialIntelligenceVehicle, AerialAttackVehicle, AerialBdaVehicle {
    public Kochav(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
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
