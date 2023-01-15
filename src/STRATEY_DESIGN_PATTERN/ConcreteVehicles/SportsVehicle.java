package STRATEY_DESIGN_PATTERN.ConcreteVehicles;

import STRATEY_DESIGN_PATTERN.Interface.Drive.Impl.SportsDriveImpl;
import STRATEY_DESIGN_PATTERN.Vehicle;

public class SportsVehicle extends Vehicle {

  public SportsVehicle() {
    super(new SportsDriveImpl());
  }
}
