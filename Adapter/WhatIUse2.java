package Adapter;

public class WhatIUse2 extends WhatIUse{
    public void op(WhatIHave wih) {
        System.out.println("In method op()");
        new ProxyAdapter(wih).f();
    }

}

