package STRATEY_DESIGN_PATTERN;

import STRATEY_DESIGN_PATTERN.Interface.Drive.DriveInterface;

public class Vehicle {

  int noOfTyres;
  boolean isCommercial;

  DriveInterface driveInterface;

  protected Vehicle(DriveInterface childDriveInterface) {
    this.driveInterface = childDriveInterface;
  }

  public void drive() {
    driveInterface.drive();
  }

}
