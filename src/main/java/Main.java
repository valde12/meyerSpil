import YatzyBlok.YatzyBlok;
import java.util.Scanner;
import YatzyBlok.MuligYatzyBlokFelter;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TerningRaekke terningRaekke = new TerningRaekke();
        MuligYatzyBlokFelter vismulige = new MuligYatzyBlokFelter();
        YatzyBlok yatzyBlok = new YatzyBlok();
        terningRaekke.slaaAlleTerninger();
        for(int i : terningRaekke.returIntArray()) {
            System.out.print(i + ", ");
        }
        System.out.println();
        terningRaekke.visGrafisk();
        vismulige.visMulige(terningRaekke.returIntArray());
    }
}