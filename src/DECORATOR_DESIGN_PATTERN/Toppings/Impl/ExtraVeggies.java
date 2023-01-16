package DECORATOR_DESIGN_PATTERN.Toppings.Impl;

import DECORATOR_DESIGN_PATTERN.BasePizza;
import DECORATOR_DESIGN_PATTERN.Toppings.ToppingDecorator;

public class ExtraVeggies extends ToppingDecorator {

  BasePizza pizza;
  public ExtraVeggies(BasePizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int getCost() {
    return this.pizza.getCost() + 30;
  }
}
