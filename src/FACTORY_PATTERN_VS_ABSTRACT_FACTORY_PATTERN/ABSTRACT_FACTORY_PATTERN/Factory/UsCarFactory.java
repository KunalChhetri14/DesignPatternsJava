package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Factory;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Car;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.CarType;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Impl.Luxury;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.ABSTRACT_FACTORY_PATTERN.Car.Impl.MiniCar;

public class UsCarFactory {

  public static Car buildCar(CarType model) {

    Car car = null;

    switch(model) {
      case MINI:
        car = new MiniCar(Location.US);
        break;
      case LUXURY:
        car = new Luxury(Location.US);
        break;
    }
    return car;
  }
}
