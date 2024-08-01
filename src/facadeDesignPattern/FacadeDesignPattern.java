package facadeDesignPattern;

public class FacadeDesignPattern {

    static class Display{
        void display(){
            System.out.println("Displaying the Screen .....");
        }
    }

    static class Remote{
        void turnOn(){
            System.out.println("Turn on the System ....");
        }
    }

    static class Cable{
        void connect2DTH(){
            System.out.println("Making Connection to DTH .....");
        }
    }

    static class TvFacade{
        Display display;
        Remote remote;
        Cable cable;

        public TvFacade(Display display, Remote remote, Cable cable) {
            this.display = display;
            this.remote = remote;
            this.cable = cable;
        }

        void start(){
            remote.turnOn();
            display.display();
            cable.connect2DTH();
        }
    }

    public static void main(String[] args) {
        Display display = new Display();
        Remote remote = new Remote();
        Cable cable = new Cable();

        TvFacade tvFacade = new TvFacade(display  ,remote , cable);
        tvFacade.start();
    }
}
