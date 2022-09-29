package YatzyBlok.YazyBlokFelter.Felter;

import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public class chance extends YatzyBlokFelt {

    public chance(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt();
    }

    @Override
    public int beregnPoint(int[] terninger) {
        int pointSum = 0;
        for (int i : terninger) {
            pointSum = pointSum + i;
        }
        return pointSum;
    }
}
