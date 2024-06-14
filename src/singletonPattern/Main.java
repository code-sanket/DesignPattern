package singletonPattern;

public class Main {
    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getSingletonClass();
        SingletonClass singletonClass1 = SingletonClass.getSingletonClass();
        System.out.println(singletonClass.hashCode());
        System.out.println(singletonClass1.hashCode());
    }
}
