package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class fireEns extends ParFelter{

    public fireEns(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 4).length >= 1;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 4);
    }

    @Override
    public int beregnPoint(int oejenVaerdi) {
        return oejenVaerdi*4;
    }
}
