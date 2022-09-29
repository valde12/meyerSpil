package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class yatzy extends ParFelter{

    public yatzy(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 6).length >= 1;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 6);
    }

    @Override
    public int beregnPoint(int oejenVaerdi) {
        return oejenVaerdi*6 + 50;
    }
}
