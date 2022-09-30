package YatzyBlok.YazyBlokFelter.Felter.Special;

public class lilleStraight extends SpecialFelter{

    public lilleStraight(String typeNavn) {
        super(typeNavn);
    }

    @Override
    public boolean erMulig(int[] terninger) {
        int[] antal = antalTaeller(terninger);
        return !this.erBrugt() && antal[0] >= 1 && antal[1] >= 1 && antal[2] >= 1 && antal[3] >= 1 && antal[4] >= 1;
    }

    @Override
    public int beregnPoint(int[] terninger) {
        return 15;
    }
}
