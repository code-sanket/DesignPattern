package adapterDesignPattern;

public class Main {
    public static void main(String[] args) {
        Charger oldCharger = new LightningCharger();
        UsbCCharger adapter = new AdapterClass(oldCharger);
        Phone phone = new Phone(adapter);
        phone.charge();

        LightningCableCharger lightningCableCharger = new LightningCableCharger();
        TypeCCharger charger = new AdapterClassForLightningToTypeC(lightningCableCharger);
        charger.charge();
    }
}
