package factoryDesignPattern;

public class Rectangle implements Shape{
    @Override
    public void createShape() {
        System.out.println("Creating Rectangle....");
    }
}
