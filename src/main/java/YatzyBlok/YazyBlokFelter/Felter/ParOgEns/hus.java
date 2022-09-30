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
        int[] parAfTo = beregnEns(terninger, 2);
        int[] parAfTre = beregnEns(terninger, 3);
        if (parAfTre.length >= 2) {
            return new int[]{parAfTo[0], parAfTre[1], parAfTo[1], parAfTre[0]};
        } else if (parAfTre[0] == parAfTo[0]){
            return new int[]{parAfTo[1], parAfTre[0]};
        } else {
            return new int[]{parAfTo[0], parAfTre[0]};
        }
    }

    public int beregnPoint(int oejenVaerdiPar, int oejenVaerdiTreEns) {
        return oejenVaerdiPar*2 + oejenVaerdiTreEns*3;
    }
}
