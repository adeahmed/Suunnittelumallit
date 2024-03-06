package Strategy;

public class KuplaLajitteluStrategia implements LajitteluStrategia{
    @Override
    public void lajittele(int[] taulukko) {
        boolean vaihdettu;
        for (int i = 0; i < taulukko.length - 1; i++) {
            vaihdettu = false;
            for (int j = 0; j < taulukko.length - i - 1; j++) {
                if (taulukko[j] > taulukko[j + 1]) {
                    int temp = taulukko[j];
                    taulukko[j] = taulukko[j + 1];
                    taulukko[j + 1] = temp;
                    vaihdettu = true;
                }
            }
            if (!vaihdettu) break;
        }
    }

}
