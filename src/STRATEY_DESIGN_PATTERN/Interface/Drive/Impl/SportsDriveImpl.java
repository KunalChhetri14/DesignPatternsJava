package STRATEY_DESIGN_PATTERN.Interface.Drive.Impl;

import STRATEY_DESIGN_PATTERN.Interface.Drive.DriveInterface;

public class SportsDriveImpl implements DriveInterface {

  @Override
  public void drive() {
    System.out.println("Custom or sports vehicle drive funcitnality");
  }
}
