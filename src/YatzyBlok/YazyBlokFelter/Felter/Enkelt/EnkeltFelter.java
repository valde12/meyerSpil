package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public abstract class EnkeltFelter extends YatzyBlokFelt {
    public EnkeltFelter(String typeNavn) {
        super(typeNavn);
    }
    protected int instanser(int[] terninger, int tal) {
        int instanser = 0;
        for (int i : terninger) {
            instanser = (i == tal) ? instanser + tal : instanser;
        }
        return instanser;
    }
    public abstract boolean erMulig(int[] terninger);
    public abstract int beregnPoint(int[] terninger);
}
