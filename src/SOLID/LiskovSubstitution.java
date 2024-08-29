package SOLID;

public class LiskovSubstitution {

    //incorrect way

    static class Bird{
        void fly(){
            // fly logic
        }
    }

    static class Sparrow extends Bird{
        @Override
        void fly() {
            System.out.println("Sparrow is flying ....");
        }
    }

    static  class Ostrich extends  Bird{
        @Override
        void fly() {
            throw new RuntimeException("I cannot fly ...");
        }
    }

    // in the above example the child class ostrich will not be able to replace the parent so it do not
    //follow liskov principal;



    //correct way

    static abstract class NewBird{
        //common bird behaviour
    }

    static class FlyingBird extends NewBird{
        void fly(){
            // fly logic
        }
    }

    static class Parrot extends FlyingBird{
        // can fly
    }

    static class SmartOstrich extends NewBird{
        // cannot fly but still it will be replaceable to parent.
    }
}
