package YatzyBlok;

import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public class MuligYatzyBlokFelter extends YatzyBlok{
    public void visMulige(int[] terninger) {
        YatzyBlokFelt[] yatzyBlokFelterMulige = muligeFelter(terninger);
        for (YatzyBlokFelt i : yatzyBlokFelterMulige) {
            System.out.println(i.seType() + " er mulig");
            switch (i.seType()) {
                case "1 par", "3 ens", "4 ens", "Yatzy" -> {
                    for(int par : i.beregnMulige(terninger)){
                        System.out.println(" - Med " + par + "'erne til " + i.beregnPointEns(par) + " point");
                    }
                }
                case "2 par" -> {
                    if (toPar.beregnMulige(terninger).length == 2) {
                        System.out.println(" - Med " + toPar.beregnMulige(terninger)[0] + "'erne og " + toPar.beregnMulige(terninger)[1] + "'erne til " + toPar.beregnPoint(toPar.beregnMulige(terninger)[1], toPar.beregnMulige(terninger)[0]) + " point");
                    } else {
                        System.out.println(" - Med " + toPar.beregnMulige(terninger)[0] + "'erne og " + toPar.beregnMulige(terninger)[1] + "'erne til " + toPar.beregnPoint(toPar.beregnMulige(terninger)[1], toPar.beregnMulige(terninger)[0]) + " point");
                        System.out.println(" - Med " + toPar.beregnMulige(terninger)[2] + "'erne og " + toPar.beregnMulige(terninger)[3] + "'erne til " + toPar.beregnPoint(toPar.beregnMulige(terninger)[2], toPar.beregnMulige(terninger)[3]) + " point");
                        System.out.println(" - Med " + toPar.beregnMulige(terninger)[4] + "'erne og " + toPar.beregnMulige(terninger)[5] + "'erne til " + toPar.beregnPoint(toPar.beregnMulige(terninger)[4], toPar.beregnMulige(terninger)[5]) + " point");
                    }
                }
                case "3 par" -> {
                    System.out.println(" - Med " + trePar.beregnMulige(terninger)[0] + "'erne, " + trePar.beregnMulige(terninger)[1] + "'erne og " + trePar.beregnMulige(terninger)[2] + "'erne til " + trePar.beregnPoint(trePar.beregnMulige(terninger)[0], trePar.beregnMulige(terninger)[1], trePar.beregnMulige(terninger)[2]) + " point");
                }
                case "2x3 ens" -> {
                    System.out.println(" - Med " + toGangeTreEns.beregnMulige(terninger)[0] + "'erne og " + toGangeTreEns.beregnMulige(terninger)[1] + "'erne til " + toGangeTreEns.beregnPoint(toGangeTreEns.beregnMulige(terninger)[0],toGangeTreEns.beregnMulige(terninger)[1]) + " point");
                }
                case "Hus" -> {
                    if (hus.beregnMulige(terninger).length > 2) {
                        System.out.println(" - Af 1 par med " + hus.beregnMulige(terninger)[0] + "'erne og 3 ens med " + hus.beregnMulige(terninger)[1] + "'erne til " + hus.beregnPoint(hus.beregnMulige(terninger)[0], hus.beregnMulige(terninger)[1]) + " point");
                        System.out.println(" - Af 1 par med " + hus.beregnMulige(terninger)[2] + "'erne og 3 ens med " + hus.beregnMulige(terninger)[3] + "'erne til " + hus.beregnPoint(hus.beregnMulige(terninger)[2], hus.beregnMulige(terninger)[3]) + " point");
                    } else {
                        System.out.println(" - Af 1 par med " + hus.beregnMulige(terninger)[0] + "'erne og 3 ens med " + hus.beregnMulige(terninger)[1] + "'erne til " + hus.beregnPoint(hus.beregnMulige(terninger)[0], hus.beregnMulige(terninger)[1]) + " point");
                    }
                }
                default -> {
                    System.out.println(" - Til "+ i.beregnPoint(terninger) + " point");
                }
            }
        }
    }

    private YatzyBlokFelt[] muligeFelter(int[] terninger) {
        int taeller = 0;
        YatzyBlokFelt[] yatzyBlokFelter = {enere, toere, treere, firer, femmere, seksere, etPar, toPar, trePar, treEns, fireEns, toGangeTreEns, lilleStraight, storStraight, royal, hus, yatzy, chance};
        for (YatzyBlokFelt x: yatzyBlokFelter) {
            if (x.erMulig(terninger)) {
                taeller++;
            }
        }
        YatzyBlokFelt[] yatzyBlokFelterMulige = new YatzyBlokFelt[taeller];
        int taeller2 = 0;
        for (YatzyBlokFelt i : yatzyBlokFelter) {
            if (i.erMulig(terninger)) {
                yatzyBlokFelterMulige[taeller2] = i;
                taeller2++;
            }
        }
        return yatzyBlokFelterMulige;
    }
}
