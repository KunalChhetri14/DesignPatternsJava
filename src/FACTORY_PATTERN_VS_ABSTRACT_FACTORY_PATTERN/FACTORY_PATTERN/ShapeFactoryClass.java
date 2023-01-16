package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN.ShapeImpl.CircleImpl;
import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN.ShapeImpl.RectangleImpl;

import java.awt.*;

public class ShapeFactoryClass {

  public ShapeInterface getShape(String shape) {


    switch(shape) {
      case("circle"):
        return new CircleImpl();
      case("rectangle"):
        return new RectangleImpl();
      default:
        return null;
    }

  }

}
