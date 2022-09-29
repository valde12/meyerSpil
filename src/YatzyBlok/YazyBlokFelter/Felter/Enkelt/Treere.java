package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Treere extends EnkeltFelter {
    public Treere(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 3) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return instanser(terninger, 3);
    }
}
