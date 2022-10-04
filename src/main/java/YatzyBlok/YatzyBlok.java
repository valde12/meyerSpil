package YatzyBlok;


import YatzyBlok.YazyBlokFelter.Felter.Enkelt.*;
import YatzyBlok.YazyBlokFelter.Felter.ParOgEns.*;
import YatzyBlok.YazyBlokFelter.Felter.Special.*;
import YatzyBlok.YazyBlokFelter.Felter.chance;

public class YatzyBlok {
    protected int pointIAlt;
    protected final Enere enere;
    protected final Toere toere;
    protected final Treere treere;
    protected final Firer firer;
    protected final Femmere femmere;
    protected final Seksere seksere;
    protected final etPar etPar;
    protected final toPar toPar;
    protected final trePar trePar;
    protected final treEns treEns;
    protected final fireEns fireEns;
    protected final toGangeTreEns toGangeTreEns;
    protected final lilleStraight lilleStraight;
    protected final storStraight storStraight;
    protected final royal royal;
    protected final hus hus;
    protected final chance chance;
    protected final yatzy yatzy;

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


}

