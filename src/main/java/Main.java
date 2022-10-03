import YatzyBlok.YatzyBlok;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TerningRaekke terningRaekke = new TerningRaekke();
        YatzyBlok yatzyBlok = new YatzyBlok();
        terningRaekke.slaaAlleTerninger();
        for(int i : terningRaekke.returIntArray()) {
            System.out.print(i + ", ");
        }
        System.out.println();
        terningRaekke.visGrafisk();
        yatzyBlok.visMulige(terningRaekke.returIntArray());
    }
}