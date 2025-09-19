package modele;

public class ModeleMonde {

    private ModeleJoueur joueur;
    private ModeleCarte carteCourante;

    public ModeleMonde (ModeleJoueur joueur, ModeleCarte carteCourante) {

        this.joueur = joueur;
        this.carteCourante = carteCourante;

    }

    public int coordoneeJoueurX() {
        return joueur.getPositionX();
    }

    public int coordoneeJoueurY() {
        return joueur.getPositionY();
    }

    public int tuileCarte(int x, int y) {
        return carteCourante.getTuile(x, y);
    }

    public int longeurCarte() {
        return carteCourante.getLongeur();
    }

    public int largeurCarte() {
        return carteCourante.getLargeur();
    }

    public void bougerJoueur(String direction) {
        joueur.bouger(direction);
    }

}
