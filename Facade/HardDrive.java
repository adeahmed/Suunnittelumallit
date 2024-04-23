package Facade;

import java.util.HashMap;

public class HardDrive {
    private HashMap<Long,String> data = new HashMap<>();
    public HardDrive() {
      data.put(0L,"ADE flsidhflejshflshflskhfleshfljslfjhsefhklseifhlsifhlsjfhlsefjhlsfjlhsfjlshflhfejfifsehfuiefheiufgsjalhfksafhdsluhgalshgauhgawhgflauhwgakubsdfhaflsheflahselfhakshfjskfuhksdfjlasdjföaosjfosdnhfoösdjfaioöjsefojöoishfjabnclbvapäfhbaoiäghhabwoihbvnsäw-nvpiawjhgvjhöuowejvöiohwevhbpiähwvnbaoåhebvnosjoölvhnöjaöpifgnwöjfhouejfnwio<öhvubwö-gnmäpishnlkgfnl<hskdjbvsfeb vlöo<ishehfgoöushdöhgcshdbjf");
    }
    public String Read(long lba , int size){
        System.out.println("HardDrive Read");
        char[] result = new char[size];
        for (int i=0;i<size;i++){
            result[i]=data.get(lba).charAt(i);


        }
        return new String(result);


    }
}
