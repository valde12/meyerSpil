package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Femmere extends EnkeltFelter {
    public Femmere(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 5) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return instanser(terninger, 5);
    }
}
