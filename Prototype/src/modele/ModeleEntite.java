package modele;

import java.awt.Rectangle;

public abstract class ModeleEntite {

    private int positionX, positionY;

    private int vitesse;

    private Rectangle hitBox;

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void mouvementX(int x) {
        positionX += x;
        hitBox.translate(x, 0);
    }

    public void mouvementY(int y) {
        positionY += y;
        hitBox.translate(0, y);
    }

    public Rectangle getHitBox() {
        return hitBox;
    }

    public int getHitBoxHaut() {
        return hitBox.y;
    }

    public int getHitBoxBas() {
        return hitBox.y + hitBox.height;
    }

    public int getHitBoxGauche() {
        return hitBox.x;
    }

    public int getHitBoxDroite() {
        return hitBox.x + hitBox.width;
    }

    public ModeleEntite(int positionX, int positionY, int vitesse, Rectangle hitBox) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.vitesse = vitesse;
        this.hitBox = hitBox;
    }

}
