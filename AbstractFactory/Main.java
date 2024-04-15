package AbstractFactory;
    public class Main {
        public static void main(String[] args) {
            Jasper jasper = new Jasper();

            VaateTehdas adidasTehdas = new AdidasTehdas();
            jasper.pueVaatteet(adidasTehdas);
            System.out.println("Opiskelijana puen: ");
            jasper.kerroVaatteet();

            VaateTehdas bossTehdas = new BossTehdas();
            jasper.pueVaatteet(bossTehdas);
            System.out.println("\nValmistumisen jälkeen puen: ");
            jasper.kerroVaatteet();
        }
    }
