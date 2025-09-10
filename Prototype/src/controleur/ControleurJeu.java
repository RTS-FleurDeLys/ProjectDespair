package controleur;

import modele.ModeleCartePrototype;
import modele.ModeleJoueur;
import vue.VueJeu;

public class ControleurJeu implements Runnable {

    private final int FPS = 60;

    private Thread threadJeu;

    private VueJeu vueJeu;
    private ControleurInput controleurInput = new ControleurInput();

    private ModeleJoueur joueur;
    private ModeleCartePrototype carte = new ModeleCartePrototype(0);

    public ControleurJeu(VueJeu vueJeu, ModeleJoueur joueur) {

        this.joueur = joueur;

        this.vueJeu = vueJeu;
        carte.generationCarte();
        this.vueJeu.setCarte(carte);
        vueJeu.addKeyListener(controleurInput);

        threadJeu = new Thread(this);
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
        joueur.bouger(controleurInput.getDirection());
    }

}
