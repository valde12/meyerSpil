package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class toGangeTreEns extends ParFelter{

    public toGangeTreEns(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 3).length >= 2;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 3);
    }

    public int beregnPoint(int oejenVaerdiTreEns1, int oejenVaerdiTreEns2) {
        return (oejenVaerdiTreEns1 * 3) + (oejenVaerdiTreEns2 * 3);
    }
}
