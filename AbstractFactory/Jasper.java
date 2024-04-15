package AbstractFactory;

class Jasper {
    private Vaatteet.Vaate farmarit;
    private Vaatteet.Vaate tpaita;
    private Vaatteet.Vaate lippis;
    private Vaatteet.Vaate kengat;

    public void pueVaatteet(VaateTehdas tehdas) {
        farmarit = tehdas.luoFarmarit();
        tpaita = tehdas.luoTPaita();
        lippis = tehdas.luoLippis();
        kengat = tehdas.luoKengat();
    }

    public void kerroVaatteet() {
        System.out.println("Minulla on päälläni:");
        System.out.println(farmarit);
        System.out.println(tpaita);
        System.out.println(lippis);
        System.out.println(kengat);
    }
}