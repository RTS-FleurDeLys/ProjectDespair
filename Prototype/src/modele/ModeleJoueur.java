package modele;

public class ModeleJoueur extends ModeleEntite {

    public ModeleJoueur(int positionX, int positionY) {
        super(positionX, positionY);
    }

    @Override
    public void bouger(String direction) {
        if (direction.equals("haut")) {
            setPositionY(getPositionY() - 4);
        } else if (direction.equals("bas")) {
            setPositionY(getPositionY() + 4);
        } else if (direction.equals("gauche")) {
            setPositionX(getPositionX() - 4);
        } else if (direction.equals("droite")) {
            setPositionX(getPositionX() + 4);
        }
    }

}
