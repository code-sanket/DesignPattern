package adapterDesignPattern;

public class Phone {

    private UsbCCharger usbCCharger;


    public Phone(UsbCCharger usbCCharger) {
        this.usbCCharger = usbCCharger;
    }

    void charge(){
        usbCCharger.chargeWithUSBC();
    }
}
