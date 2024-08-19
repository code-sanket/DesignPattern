package decoratorDesignPattern;

public class Tester {
    public static void main(String[] args) {
        IceCream iceCream = new ButterScothIceCream();
        iceCream = new ChocolateSyrupDecorator(iceCream);
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.cost());
    }
}
