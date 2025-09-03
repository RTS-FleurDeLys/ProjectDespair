package vue;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class VueJeu extends JPanel{

    public VueJeu() {

        this.setPreferredSize(new Dimension(500,500));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);

    }
}
