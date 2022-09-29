package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public abstract class ParFelter extends YatzyBlokFelt {

    public ParFelter(String typeNavn) {
        super(typeNavn);
    }

    public abstract boolean erMulig(int[] terninger);
    public abstract int[] beregnMulige(int[] terninger);
    public int beregnPoint(int oejenVaerdi) {
        return 0;
    }

    protected int[] beregnEns(int[] terninger, int hvorMangeEns) {
        int[] antal = antalTaeller(terninger);
        int arrayLaengde = 0;
        for (int i : antal) {
            if (i >= hvorMangeEns) {
                arrayLaengde++;
            }
        }
        int[] parIntArray = new int[arrayLaengde];
        int taeller = 0;
        for (int i = 0; i < 6; i++) {
            if (antal[i] >= hvorMangeEns) {
                parIntArray[taeller] = antal[i];
                taeller++;
            }
        }
        return parIntArray;
    }
    private int[] antalTaeller(int[] terninger) {
        int[] antal = {0, 0, 0, 0, 0, 0};
        for (int i : terninger) {
            switch (i) {
                case 1 -> antal[0]++;
                case 2 -> antal[1]++;
                case 3 -> antal[2]++;
                case 4 -> antal[3]++;
                case 5 -> antal[4]++;
                case 6 -> antal[5]++;
            }
        }
        return antal;
    }
}
