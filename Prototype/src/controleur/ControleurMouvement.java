package controleur;

import modele.ModeleMonde;

public class ControleurMouvement {

    ModeleMonde monde;

    public ControleurMouvement(ModeleMonde monde) {
        this.monde = monde;
    }

    public void mouvementJoueur(String direction) {
        switch (direction) {
            case "haut":
                monde.bougerJoueurY(Math.negateExact(monde.vitesseJoueur()));
                break;
            case "bas":
                monde.bougerJoueurY(monde.vitesseJoueur());
                break;
            case "gauche":
                monde.bougerJoueurX(Math.negateExact(monde.vitesseJoueur()));
                break;
            case "droite":
                monde.bougerJoueurX(monde.vitesseJoueur());
                break;
        }
    }

}
