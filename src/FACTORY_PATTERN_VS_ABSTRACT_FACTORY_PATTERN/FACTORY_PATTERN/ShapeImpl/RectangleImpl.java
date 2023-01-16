package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN.ShapeImpl;

import FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN.ShapeInterface;

public class RectangleImpl implements ShapeInterface {

  @Override
  public void draw() {
    System.out.println("Rectangle drawn");
  }
}
