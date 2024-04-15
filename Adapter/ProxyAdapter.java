package Adapter;

class ProxyAdapter implements WhatIWant {
    WhatIHave whatIHave;

    public ProxyAdapter(WhatIHave wih) {
        whatIHave = wih;
    }

    public void f() {
        whatIHave.g();
        System.out.println("In method f(), calling whatIHave.g()");
        whatIHave.h();
        System.out.println("In method f(), calling whatIHave.h()");
    }
}
