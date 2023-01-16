package DECORATOR_DESIGN_PATTERN.Toppings.Impl;

import DECORATOR_DESIGN_PATTERN.BasePizza;
import DECORATOR_DESIGN_PATTERN.Toppings.ToppingDecorator;

public class ExtraCheese extends ToppingDecorator {

  BasePizza pizza;
  public ExtraCheese(BasePizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public int getCost() {
    return this.pizza.getCost() + 50;
  }
}
