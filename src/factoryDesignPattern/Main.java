package factoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape cirlceShape = shapeFactory.getShape("CIRCLE");
        cirlceShape.createShape();

        Shape square = shapeFactory.getShape("SQUARE");
        square.createShape();
    }
}
