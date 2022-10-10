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

    public String returIkon(){
        switch (terningvaerdi) {
            case 1 -> {return "src/main/java/ikoner/ener.png";}
            case 2 -> {return "src/main/java/ikoner/toer.png";}
            case 3 -> {return "src/main/java/ikoner/treer.png";}
            case 4 -> {return "src/main/java/ikoner/firer.png";}
            case 5 -> {return "src/main/java/ikoner/femmer.png";}
            case 6 -> {return "src/main/java/ikoner/sekser.png";}
            default -> {return "fejl";}
        }
    }

}
