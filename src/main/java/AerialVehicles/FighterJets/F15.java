package AerialVehicles.FighterJets;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F15 extends FighterJets implements AerialIntelligenceVehicle {
    private String sensorType;

    public F15(String sensorType, int missileNum, String missileType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(missileNum, missileType, pilotName, mission, flightHoursAfterRepair, isReadyToFly);
        this.sensorType = sensorType;
    }

    public String getSensorType() {

        return sensorType;
    }

    @Override
    public String collectIntelligence() {
        return this.getPilotName() + ": "+ this.getClass().getSimpleName()+" Collecting Data in " + this.getMission().getDataForMission() + " with sensor type: " +
                this.getSensorType();
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {

        if(mission instanceof IntelligenceMission || mission instanceof AttackMission) {
            this.changeMission(mission);
        } else throw new MissionTypeException(this.getClass().getSimpleName()+" Doesn't have the ability to perform mission");
    }
}
