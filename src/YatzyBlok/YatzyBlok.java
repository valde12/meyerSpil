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
        lilleStraight = new lilleStraight("lille straight");
        storStraight = new storStraight("stor straight");
        royal = new royal("royal");
        hus = new hus("hus");
        chance = new chance("chance");
        yatzy = new yatzy("yatzy");
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
        }
    }


}

