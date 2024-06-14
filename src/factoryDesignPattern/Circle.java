package factoryDesignPattern;

public class Circle implements Shape{
    @Override
    public void createShape() {
        System.out.println("Creating Circle ...");
    }
}
