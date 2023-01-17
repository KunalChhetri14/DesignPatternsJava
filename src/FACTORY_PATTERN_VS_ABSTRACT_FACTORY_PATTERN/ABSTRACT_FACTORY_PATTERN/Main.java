package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Car;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.CarType;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Factory.CarFactory;

public class Main {

  public static void main(String args[]) {
    Car car = CarFactory.buildCar(CarType.MINI);
  }

}
