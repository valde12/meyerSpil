public class TerningRaekke {
    private final Terning[] terningRaekke;
    private final Terning terning1;
    private final Terning terning2;
    private final Terning terning3;
    private final Terning terning4;
    private final Terning terning5;
    private final Terning terning6;
    //------------------------------------------------------------------------------------------
    //Constructor til terningRaekke
    public TerningRaekke() {
        terning1 = new Terning();
        terning2 = new Terning();
        terning3 = new Terning();
        terning4 = new Terning();
        terning5 = new Terning();
        terning6 = new Terning();
        terningRaekke = new Terning[]{terning1, terning2, terning3, terning4, terning5, terning6};
    }
    //------------------------------------------------------------------------------------------
    //Slå alle terninger i terningrækken
    public void slaaAlleTerninger() {
        for (int i = 0; i < 6; i++) {
            terningRaekke[i].slaaTerning();
        }
    }
    //------------------------------------------------------------------------------------------
    //Slå bestemte terninger ud fra string input, input skal se ud som følger 1,3,4
    //ovenstående slår terning 1, 3 og 4
    public void slaaBestemteTerninger() {
        for (Terning i : terningRaekke) {
            if (i.seStatus()) {
                i.slaaTerning();
            }
        }
    }
    //------------------------------------------------------------------------------------------
    //returnere terningrækken som en array med ints
    public int[] returIntArray() {
        int[] terningRaekkeIntArray = {terning1.terningvaerdiRetur(), terning2.terningvaerdiRetur(), terning3.terningvaerdiRetur(), terning4.terningvaerdiRetur(), terning5.terningvaerdiRetur(), terning6.terningvaerdiRetur()};
        return terningRaekkeIntArray;
    }

    public Terning[] returArray() {
        return terningRaekke;
    }


    public void visGrafisk() {
        int[] terningRaekkeInt = returIntArray();
        for (int i = 0; i < 6; i++) {
            System.out.print("█▀▀▀▀▀▀▀█ ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            switch (terningRaekkeInt[i]) {
                case 1 -> System.out.print("█       █ ");
                case 2, 3 -> System.out.print("█     ▀ █ ");
                case 4, 5, 6 -> System.out.print("█ ▀   ▀ █ ");
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            switch (terningRaekkeInt[i]) {
                case 1, 3, 5 -> System.out.print("█   ▀   █ ");
                case 2, 4 -> System.out.print("█       █ ");
                case 6 -> System.out.print("█ ▀   ▀ █ ");
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            switch (terningRaekkeInt[i]) {
                case 1 -> System.out.print("█       █ ");
                case 2, 3 -> System.out.print("█ ▀     █ ");
                case 4, 5, 6 -> System.out.print("█ ▀   ▀ █ ");
            }
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print("▀▀▀▀▀▀▀▀▀ ");;
        }
        System.out.println();
    }

}
