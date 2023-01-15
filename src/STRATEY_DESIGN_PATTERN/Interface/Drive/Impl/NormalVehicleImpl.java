package STRATEY_DESIGN_PATTERN.Interface.Drive.Impl;

import STRATEY_DESIGN_PATTERN.Interface.Drive.DriveInterface;

public class NormalVehicleImpl implements DriveInterface {

  @Override
  public void drive() {
    System.out.println("Normal Vehicle drive functionality");
  }
}
