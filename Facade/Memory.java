package Facade;

import java.util.HashMap;

public class Memory {
    private HashMap< Long, String> data = new HashMap();
    private static Memory instance =  null;
    private Memory(){


    }
    public static Memory getInstance(){
        if (instance == null){
            instance = new Memory();

        }
        return instance;

    }
    public  void Load(long position, String data){
        System.out.println("loading " + data + " at " + position);
        this.data.put(position, data);

    }
    public String read(long position){
        return this.data.get(position);

    }
}
