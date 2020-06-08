package AerialVehicles.FighterJets;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class FighterJets extends AerialVehicle {
    final static int MAX_FLIGHT_HOURS_AFTER_REPAIR = 250;

    public FighterJets(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void check() {
        if(this.getFlightHoursAfterRepair() > MAX_FLIGHT_HOURS_AFTER_REPAIR) {
            this.repair();
        }
    }
}
