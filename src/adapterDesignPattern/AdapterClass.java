package adapterDesignPattern;

public class AdapterClass implements UsbCCharger{

    private Charger oldCharger;

    public AdapterClass(Charger oldCharger) {
        this.oldCharger = oldCharger;
    }

    @Override
    public void chargeWithUSBC() {  // adapter class impl for converting old to new charger
        oldCharger.chargeWithLightning();
        System.out.println("Charger converting from USB A to USB C");
    }
}
