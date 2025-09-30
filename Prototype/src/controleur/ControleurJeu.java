package controleur;

import modele.ModeleMonde;
import vue.VueJeu;

public class ControleurJeu implements Runnable {

    private final int FPS = 60;

    private Thread threadJeu;

    private VueJeu vueJeu;

    private ControleurInput inputs;
    private ControleurMouvement mouvement;
    private ControleurCollision collision;

    public ControleurJeu(VueJeu vueJeu, ControleurInput inputs, ControleurMouvement mouvement,
            ControleurCollision collision) {

        this.vueJeu = vueJeu;

        this.inputs = inputs;
        this.mouvement = mouvement;
        this.collision = collision;

        threadJeu = new Thread(this);
    }

    public void demarrage() {
        threadJeu.start();
    }

    @Override
    public void run() {

        double intervalleFrame = 1000000000 / FPS;
        double delta = 0;
        long dernierTemps = System.nanoTime();
        long tempsActuel;

        long sec = 0;
        int nbFramesDessine = 0;

        while (threadJeu != null) {

            tempsActuel = System.nanoTime();

            delta += (tempsActuel - dernierTemps) / intervalleFrame;
            sec += tempsActuel - dernierTemps;

            dernierTemps = tempsActuel;

            if (delta >= 1) {
                update();
                vueJeu.repaint();
                delta--;
                nbFramesDessine++;
            }

            if (sec >= 1000000000) {
                System.out.println("FPS : " + nbFramesDessine);
                sec = 0;
                nbFramesDessine = 0;
            }

        }

    }

    private void update() {

        mouvement.mouvementJoueur(inputs.getDirection());
        collision.collisionJoueurMur(inputs.getDirection());
        // Éventuellement
        // monde.bougerMonstres()
        // monde.bougerBoss()
        // etc
    }

}
