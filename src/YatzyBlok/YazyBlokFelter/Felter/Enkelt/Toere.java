package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Toere extends EnkeltFelter {

    public Toere(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 2) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return instanser(terninger, 2);
    }
}
