import YatzyBlok.YatzyBlok;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        TerningRaekke terningRaekke = new TerningRaekke();

        JFrame spilVindue = new JFrame("Yatzy spil");
        spilVindue.setLayout(null);
        spilVindue.setSize(900,500);
        spilVindue.setVisible(true);
        spilVindue.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton terningEt=new JButton(terningRaekke.returArray()[0].tilString());
        terningEt.setBounds(50,100, 50,50);
        terningEt.setBackground(Color.WHITE);
        terningEt.setFocusable(false);
        JButton terningTo=new JButton(terningRaekke.returArray()[1].tilString());
        terningTo.setBounds(110,100, 50,50);
        terningTo.setBackground(Color.WHITE);
        terningTo.setFocusable(false);
        JButton terningTre=new JButton(terningRaekke.returArray()[2].tilString());
        terningTre.setBounds(170,100, 50,50);
        terningTre.setBackground(Color.WHITE);
        terningTre.setFocusable(false);
        JButton terningFire=new JButton(terningRaekke.returArray()[3].tilString());
        terningFire.setBounds(230,100, 50,50);
        terningFire.setBackground(Color.WHITE);
        terningFire.setFocusable(false);
        JButton terningFem=new JButton(terningRaekke.returArray()[4].tilString());
        terningFem.setBounds(290,100, 50,50);
        terningFem.setBackground(Color.WHITE);
        terningFem.setFocusable(false);
        JButton terningSeks=new JButton(terningRaekke.returArray()[5].tilString());
        terningSeks.setBounds(350,100, 50,50);
        terningSeks.setBackground(Color.WHITE);
        terningSeks.setFocusable(false);

        JButton slaaTerninger = new JButton("Slå terninger");
        slaaTerninger.setBounds(50,160,150,30);
        slaaTerninger.setBackground(Color.WHITE);
        slaaTerninger.setFocusable(false);

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

        terningEt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[0].setStatus();
                if (terningRaekke.returArray()[0].seStatus()) {
                    gem1.setText("");
                } else {
                    gem1.setText("GEM");
                }
            }
        });
        terningTo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[1].setStatus();
                if (terningRaekke.returArray()[1].seStatus()) {
                    gem2.setText("");
                } else {
                    gem2.setText("GEM");
                }
            }
        });
        terningTre.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[2].setStatus();
                if (terningRaekke.returArray()[2].seStatus()) {
                    gem3.setText("");
                } else {
                    gem3.setText("GEM");
                }
            }
        });
        terningFire.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[3].setStatus();
                if (terningRaekke.returArray()[3].seStatus()) {
                    gem4.setText("");
                } else {
                    gem4.setText("GEM");
                }
            }
        });
        terningFem.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[4].setStatus();
                if (terningRaekke.returArray()[4].seStatus()) {
                    gem5.setText("");
                } else {
                    gem5.setText("GEM");
                }
            }
        });
        terningSeks.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.returArray()[5].setStatus();
                if (terningRaekke.returArray()[5].seStatus()) {
                    gem6.setText("");
                } else {
                    gem6.setText("GEM");
                }
            }
        });
        slaaTerninger.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                terningRaekke.slaaBestemteTerninger();
                terningEt.setText(terningRaekke.returArray()[0].tilString());
                terningTo.setText(terningRaekke.returArray()[1].tilString());
                terningTre.setText(terningRaekke.returArray()[2].tilString());
                terningFire.setText(terningRaekke.returArray()[3].tilString());
                terningFem.setText(terningRaekke.returArray()[4].tilString());
                terningSeks.setText(terningRaekke.returArray()[5].tilString());
            }
        });

        Scanner scan = new Scanner(System.in);
        YatzyBlok yatzyBlok1 = new YatzyBlok();
        YatzyBlok yatzyBlok2 = new YatzyBlok();
        terningRaekke.slaaAlleTerninger();
        for(int i : terningRaekke.returIntArray()) {
            System.out.print(i + ", ");
        }
        System.out.println();
        terningRaekke.visGrafisk();
        yatzyBlok1.visMulige(new int[]{1,1,4,3,4,5});
        System.out.println();
        System.out.println();
        yatzyBlok1.setFelt("1'erne", new int[]{1,1,4,3,4,5}, 2);
        yatzyBlok1.visMulige(new int[]{1,1,4,3,4,5});
        System.out.println();
        System.out.println();
        yatzyBlok2.visMulige(new int[]{1,1,4,3,4,5});
    }
}