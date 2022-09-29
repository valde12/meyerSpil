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
    public void slaaBestemteTerninger(String terning) {
        String[] terninger = terning.split(",");
        int[] terningerIntArray = new int[terninger.length];
        for (int i = 0; i < terninger.length; i++) {
            terningerIntArray[i] = Integer.parseInt(terninger[i]);
        }
        for (int i : terningerIntArray) {
            terningRaekke[i-1].slaaTerning();
        }
    }
    //------------------------------------------------------------------------------------------
    //returnere terningrækken som en array med ints
    public int[] returIntArray() {
        int[] terningRaekkeIntArray = {terning1.terningvaerdiRetur(), terning2.terningvaerdiRetur(), terning3.terningvaerdiRetur(), terning4.terningvaerdiRetur(), terning5.terningvaerdiRetur(), terning6.terningvaerdiRetur()};
        return terningRaekkeIntArray;
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

    public void visMuligheder() {
        int[] terningRaekkeInt = {terningRaekke[0].terningvaerdiRetur(), terningRaekke[1].terningvaerdiRetur(), terningRaekke[2].terningvaerdiRetur(), terningRaekke[3].terningvaerdiRetur(), terningRaekke[4].terningvaerdiRetur(), terningRaekke[5].terningvaerdiRetur()};
        int[] terningerInput = terningRaekkeInt;
        int[] antal = {0, 0, 0, 0, 0, 0};
        int muligStraightEllerRoyal = 0;
        int muligeChancePoint = 0;
        StringBuilder toPar = new StringBuilder();
        StringBuilder treEns = new StringBuilder();
        for (int i : terningerInput) {
            switch (i) {
                case 1 -> antal[0]++;
                case 2 -> antal[1]++;
                case 3 -> antal[2]++;
                case 4 -> antal[3]++;
                case 5 -> antal[4]++;
                case 6 -> antal[5]++;
            }
        }
        //Tjekker efter 1 par, 3 ens og 4 ens og viser hvis det er muligt at få
        //enere, toere, treere, firer, femmere eller seksere og
        //plusser 1 på muligStraightEllerRoyal hvis under 3 og over 0
        //plusser på muligeChancePoint variablen
        for (int i = 0; i < antal.length; i++) {
            muligeChancePoint = muligeChancePoint + (antal[i] * (i+1));
            if (antal[i] <= 2 && antal[i] > 0) {
                muligStraightEllerRoyal++;
            }
            if (antal[i] >= 1) {
                System.out.println("Muligt "+ (i + 1) +" for "+ (antal[i] * (i + 1)) +" point, ud af "+ ((i + 1) * 6) +" mulige");
            }
            if (antal[i] >= 2) {
                System.out.println("Muligt 1 par med " + (i + 1));
                toPar.append(i+1);
                toPar.append(" ");
                if (antal[i] >= 3) {
                    System.out.println("Muligt 3 ens med " + (i + 1));
                    treEns.append(i+1);
                    treEns.append(" ");
                    if (antal[i] >= 4) {
                        System.out.println("Muligt 4 ens med " + (i + 1));
                        if (antal[i] == 6) {
                            System.out.println("Muligt yatzy med " + (i + 1));
                        }
                    }
                }
            }
        }
        //tjekker om der er en lille straight, stor straight eller royal
        if (muligStraightEllerRoyal == 5) {
            if (antal[0] >= 1) {
                System.out.println("Mulig lille straight");
            } else {
                System.out.println("Mulig stor straight");
            }
        } else if (muligStraightEllerRoyal == 6) {
            System.out.println("Mulig royal");
            System.out.println("Mulig lille straight");
            System.out.println("Mulig stor straight");
        }
        //laver to par string og tre ens string til arrays med int
        String[] toParStringArray = (toPar.toString()).split(" ");
        String[] treEnsStringArray = (treEns.toString()).split(" ");
        int[] toParArray = new int[toParStringArray.length];
        int[] treEnsArray = new int[treEnsStringArray.length];
        if (toParArray.length > 0) {
            for (int i = 0; i < toParStringArray.length; i++) {
                toParArray[i] = Integer.parseInt(toParStringArray[i]);
            }
        }
        if (!treEns.toString().isEmpty()) {
            for (int i = 0; i < treEnsStringArray.length; i++) {
                treEnsArray[i] = Integer.parseInt(treEnsStringArray[i]);
            }
        }
        //viser mulige 2 par hvis mere end 1 par i terningerne og hus eller 2+3 ens hvis muligt
        if (toParArray.length == 2) {
            System.out.println("Muligt 2 par med " + toParArray[0] + " og " + toParArray[1]);
            if (treEnsArray[0] != 0) {
                if (toParArray[0] != treEnsArray[0]) {
                    System.out.println("Muligt hus eller 2 + 3 ens med " + toParArray[0] + " og " + treEnsArray[0]);
                }
                if (toParArray[1] != treEnsArray[0]) {
                    System.out.println("Muligt hus eller 2 + 3 ens med " + toParArray[1] + " og " + treEnsArray[0]);
                }
            }
        } else if (toParArray.length == 3) {
            System.out.println("Muligt 2 par med " + toParArray[0] + " og " + toParArray[1]);
            System.out.println("Muligt 2 par med " + toParArray[0] + " og " + toParArray[2]);
            System.out.println("Muligt 2 par med " + toParArray[1] + " og " + toParArray[2]);
        }
        if (toParArray.length == 1 && treEnsArray.length == 1 && toParArray[0] != treEnsArray[0] && treEnsArray[0] != 0 && toParArray[0] != 0) {
            System.out.println("Muligt hus eller 2 + 3 ens med " + toParArray[0] + " og " + treEnsArray[0]);
        }
        System.out.println("Du kan bruge din chance til " + muligeChancePoint + " point");
    }
}
