package GUI;

import TerningRaekke.TerningRaekke;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TerningePanel extends JPanel {

    static TerningRaekke terningRaekke = new TerningRaekke();
    JPanel TerningePanel;

    public TerningePanel(int placeringX, int placeringY) {
        TerningePanel = new JPanel();
        this.setBounds(placeringX, placeringY, 350, 110);
        this.setVisible(true);
        this.setLayout(null);
        nyTerningRaekke();
    }

    private void nyTerningRaekke() {
        terningRaekke.slaaAlleTerninger();
        JButton terningEt = getjButtonTerning(0, terningRaekke, 0);
        JButton terningTo = getjButtonTerning(1, terningRaekke, 60);
        JButton terningTre = getjButtonTerning(2, terningRaekke, 120);
        JButton terningFire = getjButtonTerning(3, terningRaekke, 180);
        JButton terningFem = getjButtonTerning(4, terningRaekke, 240);
        JButton terningSeks = getjButtonTerning(5, terningRaekke, 300);
        this.add(terningEt);
        this.add(terningTo);
        this.add(terningTre);
        this.add(terningFire);
        this.add(terningFem);
        this.add(terningSeks);

        JButton slaaTerninger = new JButton("Slå terninger");
        slaaTerninger.setBounds(0,80,150,30);
        slaaTerninger.setBackground(Color.WHITE);
        slaaTerninger.setFocusable(false);
        this.add(slaaTerninger);

        JLabel gem1 = new JLabel("");
        gem1.setBounds(9,0,30,15);
        JLabel gem2 = new JLabel("");
        gem2.setBounds(69,0,30,15);
        JLabel gem3 = new JLabel("");
        gem3.setBounds(129,0,30,15);
        JLabel gem4 = new JLabel("");
        gem4.setBounds(189,0,30,15);
        JLabel gem5 = new JLabel("");
        gem5.setBounds(249,0,30,15);
        JLabel gem6 = new JLabel("");
        gem6.setBounds(309,0,30,15);
        this.add(gem1);
        this.add(gem2);
        this.add(gem3);
        this.add(gem4);
        this.add(gem5);
        this.add(gem6);

        final int[] slagTilbage = {2};
        JLabel slagTilbageLabel = new JLabel(slagTilbage[0] + " slag tilbage");
        slagTilbageLabel.setBounds(160,85,100,20);
        this.add(slagTilbageLabel);

        terningGemEventlistener(terningRaekke, terningEt, gem1, 0);
        terningGemEventlistener(terningRaekke, terningTo, gem2, 1);
        terningGemEventlistener(terningRaekke, terningTre, gem3, 2);
        terningGemEventlistener(terningRaekke, terningFire, gem4, 3);
        terningGemEventlistener(terningRaekke, terningFem, gem5, 4);
        terningGemEventlistener(terningRaekke, terningSeks, gem6, 5);

        slaaTerninger.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(slagTilbage[0] != 0) {
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
                    slagTilbage[0]--;
                    slagTilbageLabel.setText(slagTilbage[0] + " slag tilbage");
                    if (slagTilbage[0] == 0) {
                        slaaTerninger.setEnabled(false);
                    }
                }
            }
        });
    }


    private static JButton getjButtonTerning(int arrayVaerdi, TerningRaekke terningRaekke, int x) {
        ImageIcon terningIkon = scaleTerningImageIcon(50, arrayVaerdi, terningRaekke);
        JButton terning=new JButton(terningIkon);
        terning.setBounds(x,20, 50,50);
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

    protected static int[] returTerningRaekke() {
        return terningRaekke.returIntArray();
    }
}
