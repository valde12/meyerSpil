package YatzyBlok;


import YatzyBlok.YazyBlokFelter.Felter.Enkelt.*;
import YatzyBlok.YazyBlokFelter.Felter.ParOgEns.*;
import YatzyBlok.YazyBlokFelter.Felter.Special.*;
import YatzyBlok.YazyBlokFelter.Felter.chance;
import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

public class YatzyBlok {
    private int pointIAlt;
    private final Enere enere;
    private final Toere toere;
    private final Treere treere;
    private final Firer firer;
    private final Femmere femmere;
    private final Seksere seksere;
    private final etPar etPar;
    private final toPar toPar;
    private final trePar trePar;
    private final treEns treEns;
    private final fireEns fireEns;
    private final toGangeTreEns toGangeTreEns;
    private final lilleStraight lilleStraight;
    private final storStraight storStraight;
    private final royal royal;
    private final hus hus;
    private final chance chance;
    private final yatzy yatzy;

    public YatzyBlok() {
        enere = new Enere("1'erne");
        toere = new Toere("2'erne");
        treere = new Treere("3'erne");
        firer = new Firer("4'erne");
        femmere = new Femmere("5'erne");
        seksere = new Seksere("6'erne");
        etPar = new etPar("1 par");
        toPar = new toPar("2 par");
        trePar = new trePar("3 par");
        treEns = new treEns("3 ens");
        fireEns = new fireEns("4 ens");
        toGangeTreEns = new toGangeTreEns("2x3 ens");
        lilleStraight = new lilleStraight("Lille straight");
        storStraight = new storStraight("Stor straight");
        royal = new royal("Royal");
        hus = new hus("Hus");
        chance = new chance("Chance");
        yatzy = new yatzy("Yatzy");
        pointIAlt = 0;
    }

    public void visMulige(int[] terninger) {
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
                    System.out.println(" - Med " + hus.beregnMulige(terninger)[0] + "'erne og " + hus.beregnMulige(terninger)[1] + "'erne til " + hus.beregnPoint(hus.beregnMulige(terninger)[0], hus.beregnMulige(terninger)[1]) + " point");
                }
                default -> {
                    System.out.println(" - Til "+ i.beregnPoint(terninger) + " point");
                }
            }
        }
    }


}

