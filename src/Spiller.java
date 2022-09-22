public class Spiller {
    private String navn;
    private int point;

    public void spiller(String spillerNavn) {
        navn = spillerNavn;
        point = 0;
    }

    public int sePoint() {
        return point;
    }
}
