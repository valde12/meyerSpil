package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Seksere extends EnkeltFelter {
    public Seksere(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, 6) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return instanser(terninger, 6);
    }
}
