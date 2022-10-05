package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Enere extends EnkeltFelter {

    public Enere(String typeNavn) {
        super(typeNavn);
    }

    private final int INSTANS_VAERDI = 1;

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, INSTANS_VAERDI) != 0;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        if (this.erMulig(terninger)) {
            return instanser(terninger, INSTANS_VAERDI);
        } else {
            return 0;
        }
    }
}
