package factoryDesignPattern;

public class Square implements Shape{
    @Override
    public void createShape() {
        System.out.println("Creating Square ....");
    }
}
