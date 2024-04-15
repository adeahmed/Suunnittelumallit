package AbstractFactory;

public class AdidasTehdas implements VaateTehdas {
    public Vaatteet.Vaate luoFarmarit() { return new Vaatteet.AdidasFarmarit(); }
    public Vaatteet.Vaate luoTPaita() { return new Vaatteet.AdidasTPaita(); }
    public Vaatteet.Vaate luoLippis() { return new Vaatteet.AdidasLippis(); }
    public Vaatteet.Vaate luoKengat() { return new Vaatteet.AdidasKengat(); }

}
