package DECORATOR_DESIGN_PATTERN.BaseClassImpl.NonVeg;

import DECORATOR_DESIGN_PATTERN.BasePizza;

public class ChickenSuasage extends BasePizza {

  @Override
  public int getCost() {
    return 255;
  }

}
