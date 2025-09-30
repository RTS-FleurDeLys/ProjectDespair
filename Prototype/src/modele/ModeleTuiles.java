package modele;

import java.awt.Color;

public class ModeleTuiles {

    public ModeleTuile[] tuiles;

    public ModeleTuiles() {
        tuiles = new ModeleTuile[99];

        tuiles[0] = new ModeleTuileSol();
        tuiles[1] = new ModeleTuileMur();
    }

    public boolean isCollision(int i) {
        return tuiles[i].isCollision();
    }

    public Color getSpriteTuile(int i) {
        return tuiles[i].getSpriteTuile();
    }

}
