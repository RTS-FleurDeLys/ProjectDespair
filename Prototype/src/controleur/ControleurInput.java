package controleur;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ControleurInput implements KeyListener {

    private boolean haut = false, bas = false, gauche = false, droite = false;

    private String direction;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        int codeTouche = e.getKeyCode();

        if (codeTouche == KeyEvent.VK_W) {
            haut = true;
        }
        if (codeTouche == KeyEvent.VK_S) {
            bas = true;
        }
        if (codeTouche == KeyEvent.VK_A) {
            gauche = true;
        }
        if (codeTouche == KeyEvent.VK_D) {
            droite = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int codeTouche = e.getKeyCode();

        if (codeTouche == KeyEvent.VK_W) {
            haut = false;
        }
        if (codeTouche == KeyEvent.VK_A) {
            gauche = false;
        }
        if (codeTouche == KeyEvent.VK_S) {
            bas = false;
        }
        if (codeTouche == KeyEvent.VK_D) {
            droite = false;
        }
    }

    public String getDirection() {
        direction = "immobile";

        if (haut) {
            direction = "haut";
        } else if (bas) {
            direction = "bas";
        } else if (gauche) {
            direction = "gauche";
        } else if (droite) {
            direction = "droite";
        }

        return direction;
    }

}
