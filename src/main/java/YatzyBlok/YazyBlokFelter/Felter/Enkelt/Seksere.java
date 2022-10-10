package YatzyBlok.YazyBlokFelter.Felter.Enkelt;

public class Seksere extends EnkeltFelter {
    public Seksere(String typeNavn) {
        super(typeNavn);
    }
    private final int INSTANS_VAERDI = 6;

    @Override
    public boolean erMulig(int[] terninger) {
        return !this.erBrugt() && instanser(terninger, INSTANS_VAERDI) != 0;
    }

    public int[] beregnMulige(int[] terninger) {
        return new int[]{INSTANS_VAERDI};
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
