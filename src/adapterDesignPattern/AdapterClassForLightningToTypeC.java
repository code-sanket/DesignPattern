package adapterDesignPattern;

public class AdapterClassForLightningToTypeC implements TypeCCharger{

    LightningCableCharger lightningCableCharger;

    AdapterClassForLightningToTypeC(LightningCableCharger lightningCableCharger){
        this.lightningCableCharger = lightningCableCharger;
    }


    @Override
    public void charge() {
        lightningCableCharger.chargeWithLightningCable();
    }
}
