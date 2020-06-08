package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;
import Missions.MissionTypeException;

public class Shoval extends Haron implements AerialBdaVehicle {
    private String cameraType;

    public Shoval(String cameraType, int missileNum, String sensorType, String missileType , String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly, missileNum, sensorType, missileType);
        this.cameraType = cameraType;
    }

    public String getCameraType() {
        return cameraType;
    }

    @Override
    public String preformBda() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" taking pictures of " + this.getMission().getDataForMission() + " with: " +
                this.getCameraType() +" camera";
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        this.changeMission(mission);
    }
}

