package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Enere extends EnkeltFelter {

    public Enere(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 1) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        if (this.erMulig(terninger)) {
            return instanser(terninger, 1);
        } else {
            return 0;
        }
    }
}
