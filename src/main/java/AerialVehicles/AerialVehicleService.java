package AerialVehicles;

import Entities.Coordinates;
import Missions.Mission;
import Missions.MissionTypeException;

public interface AerialVehicleService {
     void check();
     void land();
     void repair();
     void flyTo();
     void setMission(Mission mission) throws MissionTypeException;
}
