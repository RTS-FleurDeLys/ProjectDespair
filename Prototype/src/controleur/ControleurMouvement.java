package controleur;

import modele.ModeleMonde;
import modele.ModeleMonstre;

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

    public void mouvementMonstres() {
        ModeleMonstre[] monstres = monde.monstres();

        for (int i = 0 ; i < monstres.length ; i++) {
            switch (monstres[i].mouvementIA()) {
                case "haut":
                monstres[i].mouvementY(Math.negateExact(monstres[i].getVitesse()));
                break;
            case "bas":
                monstres[i].mouvementY(monstres[i].getVitesse());
                break;
            case "gauche":
                monstres[i].mouvementX(Math.negateExact(monstres[i].getVitesse()));
                break;
            case "droite":
                monstres[i].mouvementX(monstres[i].getVitesse());
                break;
            }
        }
    }

}
