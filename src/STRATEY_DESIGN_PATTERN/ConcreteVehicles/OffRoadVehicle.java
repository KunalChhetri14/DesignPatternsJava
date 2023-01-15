package STRATEY_DESIGN_PATTERN.ConcreteVehicles;

import STRATEY_DESIGN_PATTERN.Interface.Drive.DriveInterface;
import STRATEY_DESIGN_PATTERN.Interface.Drive.Impl.SportsDriveImpl;
import STRATEY_DESIGN_PATTERN.Vehicle;

public class OffRoadVehicle extends Vehicle {
  public OffRoadVehicle() {
    super(new SportsDriveImpl());
  }
}
