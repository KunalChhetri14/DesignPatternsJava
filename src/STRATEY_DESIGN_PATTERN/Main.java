package STRATEY_DESIGN_PATTERN;

import STRATEY_DESIGN_PATTERN.ConcreteVehicles.NormalVehicle;
import STRATEY_DESIGN_PATTERN.ConcreteVehicles.OffRoadVehicle;
import STRATEY_DESIGN_PATTERN.ConcreteVehicles.SportsVehicle;

public class Main {

  public static void main(String args[]) {

//    SportsVehicle vehicle = new SportsVehicle();
    OffRoadVehicle vehicle = new OffRoadVehicle();
//    NormalVehicle vehicle = new NormalVehicle();
    vehicle.drive();
  }

}
