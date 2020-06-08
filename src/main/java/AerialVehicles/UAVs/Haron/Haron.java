package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class Haron extends AerialVehicle {
    private final static int MAX_FLIGHT_HOURS_AFTER_REPAIR = 150;

    public Haron(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void check() {
        if(this.getFlightHoursAfterRepair() > MAX_FLIGHT_HOURS_AFTER_REPAIR) {
            this.repair();
        }
    }
}
