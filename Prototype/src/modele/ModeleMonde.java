package modele;

public class ModeleMonde {

    private ModeleJoueur joueur;
    private ModeleCarte carteCourante;

    public ModeleMonde(ModeleJoueur joueur, ModeleCarte carteCourante) {

        this.joueur = joueur;
        this.carteCourante = carteCourante;

    }

    // FONCTIONS CONCERNANT LE JOUEUR

    public int coordoneeJoueurX() {
        return joueur.getPositionX();
    }

    public int coordoneeJoueurY() {
        return joueur.getPositionY();
    }

    public int vitesseJoueur() {
        return joueur.getVitesse();
    }

    public void bougerJoueurX(int x) {
        joueur.mouvementX(x);
    }

    public void bougerJoueurY(int y) {
        joueur.mouvementY(y);
    }

    public int hitBoxJoueurHaut() {
        return joueur.getHitBoxHaut();
    }

    public int hitBoxJoueurBas() {
        return joueur.getHitBoxBas();
    }

    public int hitBoxJoueurGauche() {
        return joueur.getHitBoxGauche();
    }

    public int hitBoxJoueurDroite() {
        return joueur.getHitBoxDroite();
    }

    // FONCTIONS CONCERNANT LA CARTE

    public int tuileCarte(int x, int y) {
        return carteCourante.getTuile(x, y);
    }

    public int longeurCarte() {
        return carteCourante.getLongeur();
    }

    public int largeurCarte() {
        return carteCourante.getLargeur();
    }

}
