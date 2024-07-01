package singletonPattern;

public class SingletonClass {

    private static volatile SingletonClass singleInstance; // volatile keyword means the value of this reference will be visible to all the threads and not be fetched from cache

    private SingletonClass (){

    };

    public static SingletonClass getSingletonClass(){
        if (singleInstance == null){ // first check that if the object is initialized or not
            synchronized (SingletonClass.class){ // second check inside the synchronized block so that only one thread had access
                if (singleInstance == null){
                    singleInstance = new SingletonClass();
                }
            }

        }

        return singleInstance;
    }
}
