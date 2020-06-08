package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJets implements AerialIntelligenceVehicle, AerialBdaVehicle {
    public F16(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void performBda() {

    }

    @Override
    public void collectIntelligence() {

    }
}
