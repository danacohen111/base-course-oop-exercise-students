package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import AerialVehicles.AerialVehicle;
import Missions.AttackMission;
import Missions.Mission;
import Missions.MissionTypeException;

public abstract class FighterJets extends AerialVehicle implements AerialAttackVehicle {
    final static int MAX_FLIGHT_HOURS_AFTER_REPAIR = 250;
    private int missileNum;
    private String missileType;

    public FighterJets(int missileNum,String missileType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly);
        this.missileType = missileType;
        this.missileNum= missileNum;
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
    public String attack() {
        return this.getPilotName() + ": "+this.getClass().getSimpleName()+" Attacking " + this.getMission().getDataForMission() + " with: " +
                this.getMissileType() + "X" + this.getMissileNum();
    }
}
