package AbstractFactory;

public class Vaatteet {

    public interface Vaate {
        String toString();
    }

    public static class AdidasFarmarit implements Vaate {
        public String toString() { return "Adidas farmarit"; }
    }

    public static class AdidasTPaita implements Vaate {
        public String toString() { return "Adidas t-paita"; }
    }

    public static class AdidasLippis implements Vaate {
        public String toString() { return "Adidas lippis"; }
    }

    public static class AdidasKengat implements Vaate {
        public String toString() { return "Adidas kengät"; }
    }

    public static class BossFarmarit implements Vaate {
        public String toString() { return "Boss farmarit"; }
    }

    public static class BossTPaita implements Vaate {
        public String toString() { return "Boss t-paita"; }
    }

    public static class BossLippis implements Vaate {
        public String toString() { return "Boss lippis"; }
    }

    public static class BossKengat implements Vaate {
        public String toString() { return "Boss kengät"; }
    }


}
