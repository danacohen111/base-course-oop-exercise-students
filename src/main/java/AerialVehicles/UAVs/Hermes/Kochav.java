package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.Mission;
import Missions.MissionTypeException;

public class Kochav extends Hermes implements AerialAttackVehicle{
    private int missileNum;
    private String missileType;

    public Kochav(int missileNum, String missileType, String sensorType, String cameraType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(cameraType, sensorType, pilotName, mission, flightHoursAfterRepair, isReadyToFly);
        this.missileNum = missileNum;
        this.missileType = missileType;
    }

    public int getMissileNum() {
        return missileNum;
    }

    public String getMissileType() {
        return missileType;
    }

    @Override
    public String attack() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" Attacking " + this.getMission().getDataForMission() + " with: " +
                this.getMissileType() + "X" + this.getMissileNum();
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        this.changeMission(mission);
    }
}
