package Composite;
public class PC implements Tehdas {
    public Laite luoEmolevy() {
        return new Laiteosat.Emolevy(150.0);
    }

    public Laite luoProsessori() {
        return new Laiteosat.Prosessori(200.0);
    }

    public Laite luoNaytonohjain() {
        return new Laiteosat.Naytonohjain(100.0);
    }

    public Laite luoMuistipiiri() {
        return new Laiteosat.Muistipiiri(50.0);
    }

    public Laite luoVerkkokortti() {
        return new Laiteosat.Verkkokortti(20.0);
    }

    public Laite luoKotelo() {
        return new Laiteosat.Kotelo(50.0);
    }


}
