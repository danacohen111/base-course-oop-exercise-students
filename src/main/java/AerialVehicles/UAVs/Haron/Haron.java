package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class Haron extends AerialVehicle implements AerialIntelligenceVehicle, AerialAttackVehicle {
    private final static int MAX_FLIGHT_HOURS_AFTER_REPAIR = 150;
    private String sensorType;
    private int missileNum;
    private String missileType;


    public Haron(String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly, int missileNum, String missileType, String sensorType) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
        this.sensorType = sensorType;
        this.missileNum = missileNum;
        this.missileType = missileType;
    }

    public String getSensorType() {
        return sensorType;
    }

    public int getMissileNum() {
        return missileNum;
    }

    public String getMissileType() {
        return missileType;
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
    public String attack() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" Attacking " + this.getMission().getDataForMission() + " with: " +
                this.getMissileType() + "X" + this.getMissileNum();
    }
}
