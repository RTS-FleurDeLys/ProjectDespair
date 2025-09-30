import javax.swing.JFrame;

import controleur.ControleurCollision;
import controleur.ControleurInput;
import controleur.ControleurJeu;
import controleur.ControleurMouvement;
import modele.ModeleCarte;
import modele.ModeleCartePrototype;
import modele.ModeleJoueur;
import modele.ModeleMonde;
import modele.ModeleTuiles;
import vue.VueJeu;

public class Main {

    public static void main(String[] args) {

        System.setProperty("sun.java2d.opengl", "true");

        ModeleJoueur joueur = new ModeleJoueur(16 * 64, 12 * 64);
        ModeleCarte carte = new ModeleCartePrototype(0);
        ModeleMonde monde = new ModeleMonde(joueur, carte);
        ModeleTuiles tuiles = new ModeleTuiles();
        VueJeu vueJeu = new VueJeu(monde, tuiles);
        ControleurInput inputs = new ControleurInput();
        ControleurMouvement mouvement = new ControleurMouvement(monde);
        ControleurCollision collision = new ControleurCollision(monde, tuiles);
        ControleurJeu jeu = new ControleurJeu(vueJeu, inputs, mouvement, collision);

        carte.generationCarte();
        vueJeu.addKeyListener(inputs);
        jeu.demarrage();

        JFrame fenetre = new JFrame();

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        fenetre.setTitle("Prototype");
        fenetre.add(vueJeu);
        fenetre.pack();
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

    }
}
