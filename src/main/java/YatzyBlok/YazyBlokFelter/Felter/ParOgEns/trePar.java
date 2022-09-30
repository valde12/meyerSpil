package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class trePar extends ParFelter{

    public trePar(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 2).length >= 3;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 2);
    }

    public int beregnPoint(int oejenVaerdi1, int oejenVaerdi2, int oejenVaerdi3) {
        return (oejenVaerdi1 * 2) + (oejenVaerdi2 * 2) + (oejenVaerdi3 * 2);
    }
}
