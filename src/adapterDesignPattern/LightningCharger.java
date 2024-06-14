package adapterDesignPattern;

public class LightningCharger implements Charger{
    @Override
    public void chargeWithLightning() {
        System.out.println("Charging with Lightning Cable"); // implementation for old charger
    }


}
