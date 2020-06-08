package AerialVehicles.UAVs.Hermes;

import AerialVehicles.AerialAttackVehicle;
import AerialVehicles.AerialBdaVehicle;
import AerialVehicles.AerialIntelligenceVehicle;
import Missions.*;

public class Zik extends Hermes {

    public Zik(String cameraType, String sensorType, String pilotName, Mission mission, int flightHoursAfterRepair, boolean isReadyToFly) {
        super(sensorType, cameraType, pilotName, mission, flightHoursAfterRepair, isReadyToFly);
    }

    @Override
    public void setMission(Mission mission) throws MissionTypeException {
        if(mission instanceof BdaMission || mission instanceof IntelligenceMission) {
            this.changeMission(mission);
        } else throw new MissionTypeException(this.getClass().getSimpleName()+" Doesn't have the ability to perform mission");
    }
}
