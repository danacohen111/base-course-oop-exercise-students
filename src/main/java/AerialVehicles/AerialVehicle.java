package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;


public abstract class AerialVehicle implements AerialVehicleService{
    private String pilotName;
    private Mission mission;
    private int FlightHoursAfterRepair;
    private boolean isReadyToFly;;

    public AerialVehicle(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        this.pilotName = pilotName;
        this.mission = mission;
        FlightHoursAfterRepair = flightHoursAfterRepair;
        this.isReadyToFly = isReadyToFly;
    }

    public void land() {
        System.out.println("Landing");
    }

    abstract public void check();

    protected void repair() {
        this.setReadyToFly(true);
        this.setFlightHoursAfterRepair(0);
    }

    public boolean isReadyToFly() {
        return isReadyToFly;
    }

    public int getFlightHoursAfterRepair() {
        return FlightHoursAfterRepair;
    }

    private void setFlightHoursAfterRepair(int flightHoursAfterRepair) {
        FlightHoursAfterRepair = flightHoursAfterRepair;
    }

    private void setReadyToFly(boolean readyToFly) {
        isReadyToFly = readyToFly;
    }
}
