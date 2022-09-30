package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Firer extends EnkeltFelter {
    public Firer(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 4) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return instanser(terninger, 4);
    }
}
