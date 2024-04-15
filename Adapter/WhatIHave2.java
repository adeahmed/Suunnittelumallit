package Adapter;

class WhatIHave2 extends WhatIHave implements WhatIWant {
    public void f() {
        System.out.println("Tapa3: In method f()");
        g();
        h();
    }
}

