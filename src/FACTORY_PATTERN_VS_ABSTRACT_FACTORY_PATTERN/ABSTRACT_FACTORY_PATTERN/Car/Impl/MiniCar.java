package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Impl;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Car;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Factory.Location;

public class MiniCar extends Car {

  Location location;

  public MiniCar(Location location) {
    this.location = location;
    construct();
  }

  @Override
  protected void construct() {
    System.out.println("Car type is : MINI CAR and location is "+ this.location);
  }

}
