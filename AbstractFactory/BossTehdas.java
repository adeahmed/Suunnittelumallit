package AbstractFactory;

public class BossTehdas implements VaateTehdas {
    public Vaatteet.Vaate luoFarmarit() { return new Vaatteet.BossFarmarit(); }
    public Vaatteet.Vaate luoTPaita() { return new Vaatteet.BossTPaita(); }
    public Vaatteet.Vaate luoLippis() { return new Vaatteet.BossLippis(); }
    public Vaatteet.Vaate luoKengat() { return new Vaatteet.BossKengat(); }

}
