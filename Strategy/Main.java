package Strategy;
import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] taulukko = new int[10000];
        Random random = new Random();

        for (int i = 0; i < taulukko.length; i++) {
            taulukko[i] = random.nextInt(1000);
        }

        LajitteluStrategia lajitteluStrategia = new KuplaLajitteluStrategia();


        long startTime = System.currentTimeMillis();
        lajitteluStrategia.lajittele(taulukko);
        long endTime = System.currentTimeMillis();

        System.out.println("Lajittelun kesto (ms): " + (endTime - startTime));
    }
}
