import GUI.TerningePanel;
import GUI.SetFeltPanel;
import TerningRaekke.TerningRaekke;
import YatzyBlok.YatzyBlok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Main {
    public static void main(String[] args){

        YatzyBlok yatzyBlok1 = new YatzyBlok();
        TerningRaekke terningRaekke = new TerningRaekke();

        JFrame spilVindue = new JFrame("Yatzy spil");
        spilVindue.setLayout(null);
        spilVindue.setSize(900,500);
        spilVindue.setVisible(true);
        spilVindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TerningePanel TerningePanel = new TerningePanel(20,20);
        spilVindue.add(TerningePanel);

        SetFeltPanel SetFeltPanel = new SetFeltPanel(20, 140, yatzyBlok1);
        spilVindue.add(SetFeltPanel);


        yatzyBlok1.setFelt("1'erne", new int[]{1,2,3,4,5,6}, 1);
        String[][] data = yatzyBlok1.alleFelterMedIndhold();
        String[] column ={"TYPE","POINT","TERNINGER"};
        JTable yatzybloktable=new JTable(data,column);
        yatzybloktable.setBounds(410,70,400,350);
        JScrollPane yatzyblokscrollpane=new JScrollPane(yatzybloktable);
        yatzyblokscrollpane.setBounds(410,70,400,350);

        spilVindue.add(yatzyblokscrollpane);

        spilVindue.update(spilVindue.getGraphics());

    }

}