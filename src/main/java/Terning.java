public class Terning {
    private final int antalSider = 6;
    private int terningvaerdi;
    private boolean aktiveret;
    //------------------------------------------------------------------------------------------
    //Constructor til terning
    public Terning() {
        aktiveret = true;
        terningvaerdi = 1;
    }
    //------------------------------------------------------------------------------------------
    //method til at slå terning som ændre terningens værdi til et tilfældigt tal mellem 1 og 6
    public void slaaTerning() {
        terningvaerdi = (int) ((Math.random() * antalSider) + 1);
    }
    //------------------------------------------------------------------------------------------
    //returnere terningens værdi uden at slå
    public int terningvaerdiRetur() {
        return terningvaerdi;
    }
    public void setStatus(){
        aktiveret= !aktiveret;
    }
    public boolean seStatus() {
        return aktiveret;
    }
    //------------------------------------------------------------------------------------------
    //returnere terningens værdi som string uden at slå
    public String tilString() {
        return Integer.toString(terningvaerdi);
    }

}
