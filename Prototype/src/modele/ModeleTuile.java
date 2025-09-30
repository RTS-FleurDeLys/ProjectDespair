package modele;

import java.awt.Color;

public abstract class ModeleTuile {

    Color spriteTuile;

    boolean collision;

    public Color getSpriteTuile() {
        return spriteTuile;
    }

    public boolean isCollision() {
        return collision;
    }

    public ModeleTuile(Color spriteTuile, boolean collision) {
        this.collision = collision;
        this.spriteTuile = spriteTuile;
    }

}
