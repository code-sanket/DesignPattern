package SOLID;

import factoryDesignPattern.Shape;

public class OpenAndClose {

    static abstract class Shape{ // this class is open of extension means
        // if there is n number of shapes then they can extend this class and implement the method.
        abstract void draw();
    }

    static class Circle extends Shape{

        @Override
        void draw() {
            System.out.println("Drawing Circle..");
        }
    }

    static class Square extends Shape{

        @Override
        void draw() {
            System.out.println("Drawing Square ...");
        }
    }


}
