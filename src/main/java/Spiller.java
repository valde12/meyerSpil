import YatzyBlok.YatzyBlok;

public class Spiller {
    private final String navn;
    private final YatzyBlok yatzyBlok;
    private int point;
    public Spiller(String spillerNavn) {
        navn = spillerNavn;
        point = 0;
        yatzyBlok = new YatzyBlok();
    }
    public int sePoint() {
        return point;
    }
    public void plusTilPoint(int plusPoint) {
        point = point + plusPoint;
    }

    public YatzyBlok seYatzyBlok() {
        return yatzyBlok;
    }

    public String seNavn() {
        return navn;
    }
}
