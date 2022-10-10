import YatzyBlok.YatzyBlok;
import YatzyBlok.YazyBlokFelter.YatzyBlokFelt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        YatzyBlok yatzyBlok1 = new YatzyBlok();
        TerningRaekke terningRaekke = new TerningRaekke();

        JFrame spilVindue = new JFrame("Yatzy spil");
        spilVindue.setLayout(null);
        spilVindue.setSize(900,500);
        spilVindue.setVisible(true);
        spilVindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton terningEt = getjButtonTerning(0, terningRaekke, 50);
        JButton terningTo = getjButtonTerning(1, terningRaekke, 110);
        JButton terningTre = getjButtonTerning(2, terningRaekke, 170);
        JButton terningFire = getjButtonTerning(3, terningRaekke, 230);
        JButton terningFem = getjButtonTerning(4, terningRaekke, 290);
        JButton terningSeks = getjButtonTerning(5, terningRaekke, 350);

        JButton slaaTerninger = new JButton("Slå terninger");
        slaaTerninger.setBounds(50,160,150,30);
        slaaTerninger.setBackground(Color.WHITE);
        slaaTerninger.setFocusable(false);

        JButton visMulige = new JButton("Vis mulige");
        visMulige.setBounds(50,200,150,30);
        visMulige.setBackground(Color.WHITE);
        visMulige.setFocusable(false);

        JLabel gem1 = new JLabel("");
        gem1.setBounds(59,80,30,15);
        JLabel gem2 = new JLabel("");
        gem2.setBounds(119,80,30,15);
        JLabel gem3 = new JLabel("");
        gem3.setBounds(179,80,30,15);
        JLabel gem4 = new JLabel("");
        gem4.setBounds(239,80,30,15);
        JLabel gem5 = new JLabel("");
        gem5.setBounds(299,80,30,15);
        JLabel gem6 = new JLabel("");
        gem6.setBounds(359,80,30,15);

        DefaultListModel<String> muligeNavn = new DefaultListModel<>();
        JList<String> muligeList = new JList<>(muligeNavn);
        muligeList.setBounds(50,240, 75,200);

        spilVindue.add(muligeList);
        spilVindue.add(visMulige);
        spilVindue.add(gem1);
        spilVindue.add(gem2);
        spilVindue.add(gem3);
        spilVindue.add(gem4);
        spilVindue.add(gem5);
        spilVindue.add(gem6);
        spilVindue.add(terningEt);
        spilVindue.add(terningTo);
        spilVindue.add(terningTre);
        spilVindue.add(terningFire);
        spilVindue.add(terningFem);
        spilVindue.add(terningSeks);
        spilVindue.add(slaaTerninger);

        terningGemEventlistener(terningRaekke, terningEt, gem1, 0);
        terningGemEventlistener(terningRaekke, terningTo, gem2, 1);
        terningGemEventlistener(terningRaekke, terningTre, gem3, 2);
        terningGemEventlistener(terningRaekke, terningFire, gem4, 3);
        terningGemEventlistener(terningRaekke, terningFem, gem5, 4);
        terningGemEventlistener(terningRaekke, terningSeks, gem6, 5);
        slaaTerninger.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.slaaBestemteTerninger();

                ImageIcon terningEtIkon = scaleTerningImageIcon(50, 0, terningRaekke);
                terningEt.setIcon(terningEtIkon);

                ImageIcon terningToIkon = scaleTerningImageIcon(50, 1, terningRaekke);
                terningTo.setIcon(terningToIkon);

                ImageIcon terningTreIkon = scaleTerningImageIcon(50, 2, terningRaekke);
                terningTre.setIcon(terningTreIkon);

                ImageIcon terningFireIkon = scaleTerningImageIcon(50, 3, terningRaekke);
                terningFire.setIcon(terningFireIkon);

                ImageIcon terningFemIkon = scaleTerningImageIcon(50, 4, terningRaekke);
                terningFem.setIcon(terningFemIkon);

                ImageIcon terningSeksIkon = scaleTerningImageIcon(50, 5, terningRaekke);
                terningSeks.setIcon(terningSeksIkon);
            }
        });
        visMulige.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                YatzyBlokFelt[] muligeFelter = yatzyBlok1.muligeFelter(terningRaekke.returIntArray());
                muligeNavn.removeAllElements();
                for (YatzyBlokFelt i : muligeFelter) {
                    muligeNavn.addElement(i.seType());
                }
            }
        });

        Scanner scan = new Scanner(System.in);
        YatzyBlok yatzyBlok2 = new YatzyBlok();
        terningRaekke.slaaAlleTerninger();
        for(int i : terningRaekke.returIntArray()) {
            System.out.print(i + ", ");
        }
        System.out.println();
        terningRaekke.visGrafisk();
    }

    private static JButton getjButtonTerning(int arrayVaerdi, TerningRaekke terningRaekke, int x) {
        ImageIcon terningIkon = scaleTerningImageIcon(50, arrayVaerdi, terningRaekke);
        JButton terning=new JButton(terningIkon);
        terning.setBounds(x,100, 50,50);
        terning.setBackground(Color.WHITE);
        terning.setFocusable(false);
        return terning;
    }

    private static ImageIcon scaleTerningImageIcon(int stoerrelse, int arrayVaerdi, TerningRaekke terningRaekke) {
        ImageIcon terningIkon = new ImageIcon(terningRaekke.returArray()[arrayVaerdi].returIkon());
        Image terningIkonScaled = terningIkon.getImage().getScaledInstance(stoerrelse,stoerrelse, Image.SCALE_SMOOTH);
        terningIkon = new ImageIcon(terningIkonScaled);
        return terningIkon;
    }

    private static void terningGemEventlistener(TerningRaekke terningRaekke, JButton terningNavn, JLabel gemNavn, int arrayNummer) {
        terningNavn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[arrayNummer].setStatus();
                if (terningRaekke.returArray()[arrayNummer].seStatus()) {
                    gemNavn.setText("");
                } else {
                    gemNavn.setText("GEM");
                }
            }
        });
    }
}