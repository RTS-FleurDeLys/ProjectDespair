package vue;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import modele.ModeleMonde;
import modele.ModeleTuiles;

public class VueJeu extends JPanel {

    final int TAILLE_TUILE_ORIGINALE = 16; // 16x16px.
    final int ECHELLE = 4; // Mise a échelle pour écrans modernes.

    final int TAILLE_TUILE = TAILLE_TUILE_ORIGINALE * ECHELLE; // 64x64px.

    final int ECRAN_HAUTEUR_TUILES = 12;
    final int ECRAN_LARGEUR_TUILES = 16;

    final int ECRAN_HAUTEUR = ECRAN_HAUTEUR_TUILES * TAILLE_TUILE; // 768px.
    final int ECRAN_LARGEUR = ECRAN_LARGEUR_TUILES * TAILLE_TUILE; // 1024px.

    final int MILIEU_ECRAN_X = ECRAN_LARGEUR / 2 - TAILLE_TUILE / 2;
    final int MILIEU_ECRAN_Y = ECRAN_HAUTEUR / 2 - TAILLE_TUILE / 2;

    private ModeleMonde monde;
    private ModeleTuiles tuiles;

    public VueJeu(ModeleMonde monde, ModeleTuiles tuiles) {

        this.monde = monde;
        this.tuiles = tuiles;

        this.setPreferredSize(new Dimension(ECRAN_LARGEUR, ECRAN_HAUTEUR));
        this.setBackground(Color.BLACK);
        this.setDoubleBuffered(true);
        this.setFocusable(true);

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D) g;

        int debutEcranX = Math.max(0, (monde.coordoneeJoueurX() - MILIEU_ECRAN_X) / TAILLE_TUILE);
        int finEcranX = Math.min(monde.largeurCarte(), (monde.coordoneeJoueurX() + MILIEU_ECRAN_X) / TAILLE_TUILE + 2);

        int debutEcranY = Math.max(0, (monde.coordoneeJoueurY() - MILIEU_ECRAN_Y) / TAILLE_TUILE);
        int finEcranY = Math.min(monde.longeurCarte(), (monde.coordoneeJoueurY() + MILIEU_ECRAN_Y) / TAILLE_TUILE + 2);

        for (int i = debutEcranY; i < finEcranY; i++) {
            for (int j = debutEcranX; j < finEcranX; j++) {
                g2.setColor(tuiles.getSpriteTuile(monde.tuileCarte(j, i)));

                g2.fillRect(MILIEU_ECRAN_X + (j * TAILLE_TUILE - monde.coordoneeJoueurX()),
                        MILIEU_ECRAN_Y + (i * TAILLE_TUILE - monde.coordoneeJoueurY()), TAILLE_TUILE, TAILLE_TUILE);

            }
        }

        g2.setColor(Color.WHITE);

        g2.fillRect(MILIEU_ECRAN_X, MILIEU_ECRAN_Y, TAILLE_TUILE, TAILLE_TUILE);

    }
}
