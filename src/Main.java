import YatzyBlok.YatzyBlok;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        TerningRaekke terningRaekke = new TerningRaekke();
        YatzyBlok yatzyBlok = new YatzyBlok();
        yatzyBlok.visMulige(new int[]{4, 4, 3, 3, 3, 2});
    }
}