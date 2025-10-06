package modele;

import java.awt.Color;
import java.awt.Rectangle;

public class ModeleMonstrePrototype extends ModeleMonstre {

    public ModeleMonstrePrototype(int positionX, int positionY) {
        super(positionX, positionY, 4, new Rectangle(positionX, positionY, 64, 64), Color.BLUE);
    }

    /*
     * Algorithme de mouvement simple.
     * 1: Choisis une direction au hasard.
     * 2: Bouge dans cette direction pendant 10 tick.
     * 3: Arrête pendant 4 tick.
     * 4: Recommence.
     * 
     * stateIA1 = avancement du cycle
     * stateIA2 = direction choisie
     */
    @Override
    public String mouvementIA() {
        String direction = "immobile";
        if (stateIA1 == 0) {
            stateIA2 = (int) (Math.random() * 4);
        }
        if (stateIA1 < 10) {
            switch (stateIA2) {
                case 0:
                    direction = "haut";
                    break;
                case 1:
                    direction = "bas";
                    break;
                case 2:
                    direction = "gauche";
                    break;
                case 3:
                    direction = "droite";
                    break;

                default:
                    break;
            }
            stateIA1++;
        } else if (stateIA1 < 14) {
            stateIA1++;
        } else {
            stateIA1 = 0;
        }

        return direction;
    }

}
