package AerialVehicles.UAVs.Haron;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.AttackMission;
import Missions.IntelligenceMission;
import Missions.Mission;
import Missions.MissionTypeException;

public class Eitan extends Haron {
    public Eitan(int missileNum , String missileType ,String sensorType ,String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(pilotName, mission, flightHoursAfterRepair, isReadyToFly, missileNum, missileType, sensorType);
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof AttackMission || mission instanceof IntelligenceMission) {
            this.changeMission(mission);
        } else throw new MissionTypeException(this.getClass().getSimpleName()+ "Doesn't have the ability to perform mission");
    }
}
