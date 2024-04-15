package Adapter;

public class Adapter {
    WhatIUse whatIUse = new WhatIUse();
    WhatIHave whatIHave = new WhatIHave();
    WhatIWant adapt = new ProxyAdapter(whatIHave);
    WhatIUse2 whatIUse2 = new WhatIUse2();
    WhatIHave2 whatIHave2 = new WhatIHave2();
    WhatIHave3 whatIHave3 = new WhatIHave3();

    public void test() {
        System.out.println("Tapa1:");
        whatIUse.op(adapt);
        System.out.println("______________________________________");
        System.out.println("Tapa2:");
        whatIUse2.op(whatIHave);
        System.out.println("______________________________________");
        System.out.println("Tapa3:");
        whatIUse.op(whatIHave2);
        System.out.println("______________________________________");
        System.out.println("Tapa4:");
        whatIUse.op(whatIHave3.whatIWant());
    }

    public static void main(String args[]) {
        new Adapter().test();
    }
}