package YatzyBlok.YazyBlokFelter;

import java.lang.StringBuilder;

public abstract class YatzyBlokFelt {
    private int point;
    private int[] terninger;
    public String type;

    //------------------------------------------------------------------------------------------
    //constructor til yatzyblok felt
    public YatzyBlokFelt(String typeNavn) {
        point = 0;
        terninger = new int[]{0, 0, 0, 0, 0, 0};
        type = typeNavn;
    }

    //------------------------------------------------------------------------------------------
    //set point
    public void setPoint(int pointInput) {
        point = pointInput;
    }

    //------------------------------------------------------------------------------------------
    //set terninger
    public void setTerninger(int[] terningerInput) {
        terninger = terningerInput;
    }

    //------------------------------------------------------------------------------------------
    //returner point
    public int sePoint() {
        return point;
    }

    //------------------------------------------------------------------------------------------
    //returner terninger
    public int[] seTerninger() {
        return terninger;
    }

    //------------------------------------------------------------------------------------------
    //returner navn på typen
    public String seType() {
        return type;
    }

    //------------------------------------------------------------------------------------------
    //ser om feltet har noget indhold
    public boolean erBrugt() {
        return point != 0;
    }

    //------------------------------------------------------------------------------------------
    //ser om feltet er muligt ud fra erBrugt og terningerne
    public abstract boolean erMulig(int[] terninger);

    //------------------------------------------------------------------------------------------
    //beregner point for feltet ud fra terningerne
    public int beregnPoint(int[] terninger) {
        return 0;
    }

    public int beregnPointEns(int i) {
        return 0;
    }

    public int[] beregnMulige(int[] terninger) {
        return new int[0];
    }
}
