package adapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        Charger oldCharger = new LightningCharger();
        UsbCCharger adapter = new AdapterClass(oldCharger);
        Phone phone = new Phone(adapter);
        phone.charge();
    }
}
