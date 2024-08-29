package SOLID;

public class DirectiveInversion {

    // Definition - High-level modules should not depend on low-level modules.
    // Both should depend on abstractions. Abstractions should not depend on details.
    // Details should depend on abstractions.

    class LightBulb {
        public void turnOn() {
            // Turn on logic
        }

        public void turnOff() {
            // Turn off logic
        }
    }

    class Switch {
        private LightBulb bulb;

        public Switch(LightBulb bulb) {
            this.bulb = bulb;
        }

        public void operate() {
            bulb.turnOn();
        }
    }

    //correct way

    // Abstraction
    interface Switchable {
        void turnOn();
        void turnOff();
    }

    // Low-level module implements abstraction
    class LightBulbNew implements Switchable {
        public void turnOn() {
            // Turn on logic
        }

        public void turnOff() {
            // Turn off logic
        }
    }

    // High-level module depends on abstraction
    class SwitchNew {
        private Switchable device;

        public SwitchNew(Switchable device) {
            this.device = device;
        }

        public void operate() {
            device.turnOn();
        }
    }




}
