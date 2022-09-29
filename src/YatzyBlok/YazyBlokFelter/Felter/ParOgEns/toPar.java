package YatzyBlok.YazyBlokFelter.Felter.ParOgEns;

public class toPar extends ParFelter{
    public toPar(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && beregnEns(terninger, 2).length >= 2;
    }

    @Override
    public int[] beregnMulige(int[] terninger) {
        int[] parArray = beregnEns(terninger, 2);
        int[] parSaetEt = new int[2];
        int[] parSaetTo = new int[2];
        int[] parSaetTre = new int[2];
        if (parArray.length == 3) {
            parSaetEt[0] = parArray[0];
            parSaetEt[1] = parArray[1];
            parSaetTo[0] = parArray[0];
            parSaetTo[1] = parArray[2];
            parSaetTre[0] = parArray[1];
            parSaetTre[1] = parArray[2];
            return new int[] {parSaetEt[0],parSaetEt[1],parSaetTo[0],parSaetTo[1],parSaetTre[0],parSaetTre[1]};
        } else {
            parSaetEt[0] = parArray[0];
            parSaetEt[1] = parArray[1];
            return parSaetEt;
        }
    }

    public int beregnPoint(int oejenVaerdi1, int oejenvaerdi2) {
        return ((oejenVaerdi1 * 2) + (oejenvaerdi2 * 2));
    }
}
