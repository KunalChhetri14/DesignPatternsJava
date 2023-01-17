package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Factory;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Car;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.CarType;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Impl.MiniCar;

public class IndiaCarFactory {

  Location location = null;
  CarType model = null;

  static Car buildCar(CarType model) {
    Car car = null;
    switch(model) {
      case MINI:
        car = new MiniCar(Location.INDIA);
        break;

        default:
        car = new MiniCar(Location.INDIA);
    }
    return car;
  }

}
