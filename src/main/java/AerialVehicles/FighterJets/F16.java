package AerialVehicles.FighterJets;

import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.BdaMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class F16 extends FighterJets implements AerialBdaVehicle {
    private String cameraType;

    public F16(String cameraType, int missileNum, String missileType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(missileNum, missileType, pilotName, mission, flightHoursAfterRepair, isReadyToFly);
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
        if(mission instanceof AttackMission || mission instanceof BdaMission) {
            this.changeMission(mission);
        } else throw new MissionTypeException(this.getClass().getSimpleName()+" Doesn't have the ability to perform mission");
    }
}
