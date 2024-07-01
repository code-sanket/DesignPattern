package singletonPattern;

public class SingeltonPrep {

    private SingeltonPrep (){

    };

    private static volatile SingeltonPrep onlyInstance;

    static SingeltonPrep getSingeltonPrep(){
        if(onlyInstance == null){
            synchronized (SingeltonPrep.class){
                if (onlyInstance == null){
                    onlyInstance = new SingeltonPrep();
                }
            }
        }

        return onlyInstance;
    }
}
