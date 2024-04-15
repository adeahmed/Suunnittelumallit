package Adapter;

class WhatIHave3 extends WhatIHave {
    private class InnerAdapter implements WhatIWant {
        public void f() {
            System.out.println("Tapa4: In method f()");
            g();
            h();
        }
    }

    public WhatIWant whatIWant() {
        return new InnerAdapter();
    }
}