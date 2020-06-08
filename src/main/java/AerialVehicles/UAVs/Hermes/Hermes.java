package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.Mission;

public abstract class Hermes extends AerialVehicle implements AerialIntelligenceVehicle, AerialBdaVehicle {
    private final static int MAX_FLIGHT_HOURS_AFTER_REPAIR = 100;
    private String cameraType;
    private String sensorType;

    public Hermes(String sensorType, String cameraType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly ) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
        this.cameraType = cameraType;
        this.sensorType = sensorType;
    }


    public String getCameraType() {
        return cameraType;
    }

    public String getSensorType() {
        return sensorType;
    }

    @Override
    public void check() {
        if(this.getHoursOfFlightSinceLastRepair() > MAX_FLIGHT_HOURS_AFTER_REPAIR) {
            this.repair();
        }
    }

    @Override
    public String collectIntelligence() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" Collecting Data in " + this.getMission().getDataForMission() + " with sensor type: " +
                this.getSensorType();
    }

    @Override
    public String preformBda() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" taking pictures of " + this.getMission().getDataForMission() + " with: " +
                this.getCameraType() +" camera";
    }
}
