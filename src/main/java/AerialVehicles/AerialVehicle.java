package AerialVehicles;

import Missions.Mission;


public abstract class AerialVehicle implements AerialVehicleService{
    private String pilotName;
    private Mission mission;
    private int FlightHoursAfterRepair;
    private boolean readyToFly;

    public AerialVehicle(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        this.pilotName = pilotName;
        this.mission = mission;
        FlightHoursAfterRepair = flightHoursAfterRepair;
        this.readyToFly = isReadyToFly;
    }


    public int getHoursOfFlightSinceLastRepair() {
        return FlightHoursAfterRepair;
    }

    public void setHoursOfFlightSinceLastRepair(int flightHoursAfterRepair) {
        FlightHoursAfterRepair = flightHoursAfterRepair;
    }

    public String getPilotName() {
        return pilotName;
    }

    public Mission getMission() {
        return mission;
    }

    public void changeMission(Mission mission) {
        this.mission = mission;
    }

    public void setReadyToFly(boolean readyToFly) {
        this.readyToFly = readyToFly;
    }

    @Override
    public void flyTo(){
        System.out.println("Flying to: "+this.getMission().getMissionCoordinates().getCoordinatesDescription());
    }
    @Override
    public void land() {
        System.out.println("Landing");
    }

    @Override
    public void repair() {
        this.setReadyToFly(true);
        this.setHoursOfFlightSinceLastRepair(0);
    }
}
