package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import modele.ModeleJoueur;

public class VueJeu extends JPanel {

    final int TAILLE_TUILE_ORIGINALE = 16; // 16x16px.
    final int ECHELLE = 4; // Mise a échelle pour écrans modernes.

    final int TAILLE_TUILE = TAILLE_TUILE_ORIGINALE * ECHELLE; // 64x64px.

    final int ECRAN_HAUTEUR_TUILES = 12;
    final int ECRAN_LARGEUR_TUILES = 16;

    final int ECRAN_HAUTEUR = ECRAN_HAUTEUR_TUILES * TAILLE_TUILE; // 768px.
    final int ECRAN_LARGEUR = ECRAN_LARGEUR_TUILES * TAILLE_TUILE; // 1024px.

    private ModeleJoueur joueur;

    public VueJeu(ModeleJoueur joueur) {

        this.joueur = joueur;

        this.setPreferredSize(new Dimension(ECRAN_LARGEUR, ECRAN_HAUTEUR));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        g2.setColor(Color.WHITE);

        g2.fillRect(joueur.getPositionX(), joueur.getPositionY(), TAILLE_TUILE, TAILLE_TUILE);

    }
}
