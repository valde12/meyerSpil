package GUI;

import YatzyBlok.YatzyBlok;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SetFeltPanel extends JPanel{

    JPanel SetFeltPanel;
    JLabel[] typeNavneJLabelArray;
    JRadioButton[][] muligeTerningerJRadioButtonArray;
    YatzyBlok yatzyBlok;

    public SetFeltPanel(int placeringX, int placeringY, YatzyBlok yatzyblok) {
        SetFeltPanel = new JPanel();
        this.setBounds(placeringX, placeringY, 370, 240);
        this.setVisible(true);
        this.setLayout(null);
        yatzyBlok = yatzyblok;
        nySetFeltPanel(yatzyBlok);
    }

    private void nySetFeltPanel(YatzyBlok yatzyBlok) {
        JButton visMulige = new JButton("Vis mulige");
        visMulige.setBounds(0,0,150,30);
        visMulige.setBackground(Color.WHITE);
        visMulige.setFocusable(false);
        this.add(visMulige);

        typeNavneJLabelArray = JLabelRetur(yatzyBlok);
        int JLabelX = 0;
        for (JLabel i : typeNavneJLabelArray) {
            i.setBounds(JLabelX, 50, 50,15);
            this.add(i);
            JLabelX = JLabelX + 45;
        }

        muligeTerningerJRadioButtonArray = JRadioButtonRetur(yatzyBlok);
        int JRadiobuttonX = 0;
        int JRadiobuttony = 70;
        ButtonGroup mulighederRadioButtons = new ButtonGroup();
        for (JRadioButton[] i : muligeTerningerJRadioButtonArray) {
            for (JRadioButton k : i) {
                mulighederRadioButtons.add(k);
                k.setBounds(JRadiobuttonX, JRadiobuttony, 40,15);
                this.add(k);
                JRadiobuttony = JRadiobuttony + 20;
            }
            JRadiobuttonX = JRadiobuttonX + 45;
            JRadiobuttony = 70;
        }

        visMulige.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                typeNavneJLabelArray = JLabelRetur(yatzyBlok);
                resetPanel();
            }
        });
    }

    private JLabel[] JLabelRetur(YatzyBlok yatzyBlok) {
        String[][] muligeFelter = yatzyBlok.muligeFelterMedTerninger(TerningePanel.returTerningRaekke());
        JLabel[] typeNavneJLabelArray = new JLabel[muligeFelter.length];
        int taeller1 = 0;
        for (String[] i : muligeFelter) {
            int taeller2 = 0;
            for (String k : i) {
                if (taeller2 == 0) {
                    JLabel ny1 = new JLabel(k);
                    typeNavneJLabelArray[taeller1] = ny1;
                }
                taeller2++;
            }
            taeller1++;
        }
        return typeNavneJLabelArray;
    }

    private JRadioButton[][] JRadioButtonRetur(YatzyBlok yatzyBlok) {
        String[][] muligeFelter = yatzyBlok.muligeFelterMedTerninger(TerningePanel.returTerningRaekke());
        JRadioButton[][] muligeTerningerJRadioButtonArray = new JRadioButton[muligeFelter.length][];
        int taeller1 = 0;
        for (String[] i : muligeFelter) {
            muligeTerningerJRadioButtonArray[taeller1] = new JRadioButton[i.length-1];
            int taeller2 = 0;
            for (String k : i) {
                if (taeller2 != 0) {
                    JRadioButton ny2 = new JRadioButton(k);
                    muligeTerningerJRadioButtonArray[taeller1][taeller2-1] = ny2;
                }
                taeller2++;
            }
            taeller1++;
        }
        return muligeTerningerJRadioButtonArray;
    }

    private void resetPanel() {
        this.removeAll();
        JButton visMulige = new JButton("Vis mulige");
        visMulige.setBounds(0,0,150,30);
        visMulige.setBackground(Color.WHITE);
        visMulige.setFocusable(false);
        this.add(visMulige);

        typeNavneJLabelArray = JLabelRetur(yatzyBlok);
        int JLabelX = 0;
        for (JLabel i : typeNavneJLabelArray) {
            i.setBounds(JLabelX, 50, 50,15);
            this.add(i);
            JLabelX = JLabelX + 45;
        }

        muligeTerningerJRadioButtonArray = JRadioButtonRetur(yatzyBlok);
        int JRadiobuttonX = 0;
        int JRadiobuttony = 70;
        ButtonGroup mulighederRadioButtons = new ButtonGroup();
        for (JRadioButton[] i : muligeTerningerJRadioButtonArray) {
            for (JRadioButton k : i) {
                mulighederRadioButtons.add(k);
                k.setBounds(JRadiobuttonX, JRadiobuttony, 40,15);
                this.add(k);
                JRadiobuttony = JRadiobuttony + 20;
            }
            JRadiobuttonX = JRadiobuttonX + 45;
            JRadiobuttony = 70;
        }

        visMulige.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                typeNavneJLabelArray = JLabelRetur(yatzyBlok);
                resetPanel();
            }
        });

        this.revalidate();
        this.repaint();
    }


}
