package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class treEns extends ParFelter {

    public treEns(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 3).length >= 1;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return beregnEns(terninger, 3);
    }

    @Override
    public int beregnPointEns(int oejenVaerdi) {
        return oejenVaerdi*3;
    }
}
