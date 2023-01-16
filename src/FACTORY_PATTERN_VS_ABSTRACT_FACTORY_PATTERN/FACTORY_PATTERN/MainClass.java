package FACTORY_PATTERN_VS_ABSTRACT_FACTORY_PATTERN.FACTORY_PATTERN;

public class MainClass {



  public static void main(String args[]) {
    ShapeFactoryClass shapeFactoryClass = new ShapeFactoryClass();
    ShapeInterface shape = shapeFactoryClass.getShape("rectangle");
    shape.draw();
  }

}
