package modele;

import java.awt.Color;
import java.awt.Rectangle;

public abstract class ModeleMonstre extends ModeleEntite {

    /*
     * Les variables stateIA sont des variables d'état générique utilisé comme
     * mémoire interne de l'IA. Elle peuvent être utilisés de pleins de façons
     * différentes pour garder l'état du monstre en mémoire. (ex. patrouille,
     * poursuite, attaque, fuite, etc.).
     */
    protected int stateIA1, stateIA2;

    public ModeleMonstre(int positionX, int positionY, int vitesse, Rectangle hitBox, Color sprite) {
        super(positionX, positionY, vitesse, hitBox, sprite);
        stateIA1 = 0;
        stateIA2 = 0;
    }

    public abstract String mouvementIA();

}
