package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class etPar extends ParFelter {

    public etPar(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 2).length >= 1;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 2);
    }

    @Override
    public int beregnPoint(int oejenVaerdi) {
        return oejenVaerdi*2;
    }
}
