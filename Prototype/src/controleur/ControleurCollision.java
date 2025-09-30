package controleur;

import modele.ModeleMonde;
import modele.ModeleTuiles;

public class ControleurCollision {

    ModeleMonde monde;
    ModeleTuiles tuiles;

    public ControleurCollision(ModeleMonde monde, ModeleTuiles tuiles) {
        this.monde = monde;
        this.tuiles = tuiles;
    }

    public void collisionJoueurMur(String direction) {

        int tuileTouche1 = 0, tuileTouche2 = 0;

        switch (direction) {
            case "haut":
                tuileTouche1 = monde.tuileCarte(monde.hitBoxJoueurGauche() / 64, monde.hitBoxJoueurHaut() / 64);
                tuileTouche2 = monde.tuileCarte(monde.hitBoxJoueurDroite() / 64, monde.hitBoxJoueurHaut() / 64);
                if (tuiles.isCollision(tuileTouche1) || tuiles.isCollision(tuileTouche2)) {
                    monde.bougerJoueurY(64 - (monde.hitBoxJoueurHaut() % 64));
                }
                break;
            case "bas":
                tuileTouche1 = monde.tuileCarte(monde.hitBoxJoueurGauche() / 64, monde.hitBoxJoueurBas() / 64);
                tuileTouche2 = monde.tuileCarte(monde.hitBoxJoueurDroite() / 64, monde.hitBoxJoueurBas() / 64);
                if (tuiles.isCollision(tuileTouche1) || tuiles.isCollision(tuileTouche2)) {
                    monde.bougerJoueurY(Math.negateExact(monde.hitBoxJoueurBas() % 64) - 1);
                }
                break;
            case "gauche":
                tuileTouche1 = monde.tuileCarte(monde.hitBoxJoueurGauche() / 64, monde.hitBoxJoueurHaut() / 64);
                tuileTouche2 = monde.tuileCarte(monde.hitBoxJoueurGauche() / 64, monde.hitBoxJoueurBas() / 64);
                if (tuiles.isCollision(tuileTouche1) || tuiles.isCollision(tuileTouche2)) {
                    monde.bougerJoueurX(64 - (monde.hitBoxJoueurGauche() % 64));
                }
                break;
            case "droite":
                tuileTouche1 = monde.tuileCarte(monde.hitBoxJoueurDroite() / 64, monde.hitBoxJoueurHaut() / 64);
                tuileTouche2 = monde.tuileCarte(monde.hitBoxJoueurDroite() / 64, monde.hitBoxJoueurBas() / 64);
                if (tuiles.isCollision(tuileTouche1) || tuiles.isCollision(tuileTouche2)) {
                    monde.bougerJoueurX(
                            Math.negateExact(monde.hitBoxJoueurDroite() % 64) - 1);
                }
                break;
        }

    }

}
