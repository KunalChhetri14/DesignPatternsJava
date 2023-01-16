package DECORATOR_DESIGN_PATTERN.BaseClassImpl.Veg;

import DECORATOR_DESIGN_PATTERN.BasePizza;

public class Farmhouse extends BasePizza {

  @Override
  public int getCost() {
    return 255;
  }

}
