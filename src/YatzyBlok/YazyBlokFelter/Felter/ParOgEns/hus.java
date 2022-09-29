package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class hus extends ParFelter {

    public hus(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 3).length >= 1 && beregnEns(terninger, 2).length >= 1;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        return new int[]{beregnEns(terninger, 2)[0], beregnEns(terninger, 3)[0]};
    }

    public int beregnPoint(int oejenVaerdiPar, int oejenVaerdiTreEns) {
        return oejenVaerdiPar*2 + oejenVaerdiTreEns*3;
    }
}
