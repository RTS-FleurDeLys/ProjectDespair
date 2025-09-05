package controleur;

import modele.ModeleJoueur;
import vue.VueJeu;

public class ControleurJeu implements Runnable {

    private final int FPS = 60;

    private Thread threadJeu;

    private VueJeu vueJeu;
    private ControleurInput controleurInput = new ControleurInput();

    private ModeleJoueur joueur;

    public ControleurJeu(VueJeu vueJeu, ModeleJoueur joueur) {

        this.joueur = joueur;

        this.vueJeu = vueJeu;
        vueJeu.addKeyListener(controleurInput);

        threadJeu = new Thread(this);
        threadJeu.start();
    }

    @Override
    public void run() {

        double intervalleImage = 1000000000 / FPS;
        double delta = 0;
        long dernierTemps = System.nanoTime();
        long tempsActuel;

        while (threadJeu != null) {

            tempsActuel = System.nanoTime();

            delta += (tempsActuel - dernierTemps) / intervalleImage;

            dernierTemps = tempsActuel;

            if (delta >= 1) {
                update();
                vueJeu.repaint();
                delta--;
            }

        }

    }

    private void update() {
        joueur.bouger(controleurInput.getDirection());
    }

}
