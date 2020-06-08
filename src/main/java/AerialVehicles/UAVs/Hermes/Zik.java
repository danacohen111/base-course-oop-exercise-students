package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;

public class Zik extends Hermes implements AerialIntelligenceVehicle, AerialBdaVehicle {

    public Zik(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void performBda() {
        
    }

    @Override
    public void collectIntelligence() {

    }
}
