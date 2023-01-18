package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Factory;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Car;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.CarType;

public class CarFactory {

  public static Car buildCar(CarType model) {
    Location location = Location.INDIA;
    Car car = null;
    switch(location) {
      case INDIA:
        car = IndiaCarFactory.buildCar(model);
        break;
      case US:
        car = UsCarFactory.buildCar(model);
        break;
//      case UK:
//        car = IndiaCarFactory.buildCar(model);
    }
    return car;
  }
}
