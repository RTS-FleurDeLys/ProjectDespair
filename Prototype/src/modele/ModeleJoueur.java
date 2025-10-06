package modele;

import java.awt.Color;
import java.awt.Rectangle;

public class ModeleJoueur extends ModeleEntite {

    public ModeleJoueur(int positionX, int positionY) {
        super(positionX, positionY, 4, new Rectangle(positionX, positionY, 64, 64), Color.WHITE);
    }

}
