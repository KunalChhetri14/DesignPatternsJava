package DECORATOR_DESIGN_PATTERN;

import DECORATOR_DESIGN_PATTERN.BaseClassImpl.NonVeg.ChickenSuasage;
import DECORATOR_DESIGN_PATTERN.Toppings.Impl.ExtraCheese;
import DECORATOR_DESIGN_PATTERN.Toppings.Impl.ExtraVeggies;

public class MainClass {



  public static void main(String args[]) {
    BasePizza pizza = new ExtraCheese(new ChickenSuasage());
    pizza = new ExtraVeggies(pizza);
    System.out.println("the price is : "+ pizza.getCost());
  }

}
