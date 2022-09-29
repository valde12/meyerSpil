package YatzyBlok.YazyBlokFelter.Felter.Special;

import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public abstract class SpecialFelter extends YatzyBlokFelt {

    public SpecialFelter(String typeNavn) {
        super(typeNavn);
    }

    public abstract boolean erMulig(int[] terninger);

    public abstract int beregnPoint();

    protected int[] antalTaeller(int[] terninger) {
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
