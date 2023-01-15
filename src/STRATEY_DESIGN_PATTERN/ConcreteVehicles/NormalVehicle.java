package STRATEY_DESIGN_PATTERN.ConcreteVehicles;

import STRATEY_DESIGN_PATTERN.Interface.Drive.DriveInterface;
import STRATEY_DESIGN_PATTERN.Interface.Drive.Impl.NormalVehicleImpl;
import STRATEY_DESIGN_PATTERN.Vehicle;

public class NormalVehicle extends Vehicle {

  public NormalVehicle() {
    super(new NormalVehicleImpl());
  }
}
