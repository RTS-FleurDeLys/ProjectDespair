package controleur;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.LinkedList;

public class ControleurInput extends KeyAdapter {

    private LinkedList<Integer> pileDirection = new LinkedList<>();

    private String direction;

    @Override
    public void keyPressed(KeyEvent e) {

        int codeTouche = e.getKeyCode();

        if (!pileDirection.contains(codeTouche)) {
            if (codeTouche == KeyEvent.VK_W) {
                pileDirection.add(KeyEvent.VK_W);
            }
            if (codeTouche == KeyEvent.VK_A) {
                pileDirection.add(KeyEvent.VK_A);
            }
            if (codeTouche == KeyEvent.VK_S) {
                pileDirection.add(KeyEvent.VK_S);
            }
            if (codeTouche == KeyEvent.VK_D) {
                pileDirection.add(KeyEvent.VK_D);
            }
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        int codeTouche = e.getKeyCode();

        if (codeTouche == KeyEvent.VK_W) {
            pileDirection.remove((Integer) KeyEvent.VK_W);
        }
        if (codeTouche == KeyEvent.VK_A) {
            pileDirection.remove((Integer) KeyEvent.VK_A);
        }
        if (codeTouche == KeyEvent.VK_S) {
            pileDirection.remove((Integer) KeyEvent.VK_S);
        }
        if (codeTouche == KeyEvent.VK_D) {
            pileDirection.remove((Integer) KeyEvent.VK_D);
        }
    }

    public String getDirection() {
        direction = "immobile";

        if (!pileDirection.isEmpty()) {
            switch (pileDirection.getLast()) {
                case KeyEvent.VK_W:
                    direction = "haut";
                    break;
                case KeyEvent.VK_A:
                    direction = "gauche";
                    break;
                case KeyEvent.VK_S:
                    direction = "bas";
                    break;
                case KeyEvent.VK_D:
                    direction = "droite";
                    break;
            }
        }

        return direction;
    }

}
