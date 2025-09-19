import javax.swing.JFrame;

import controleur.ControleurInput;
import controleur.ControleurJeu;
import modele.ModeleCarte;
import modele.ModeleCartePrototype;
import modele.ModeleJoueur;
import modele.ModeleMonde;
import vue.VueJeu;

public class Main {

    public static void main(String[] args) {

        System.setProperty("sun.java2d.opengl", "true");

        ModeleJoueur joueur = new ModeleJoueur(500, 500);
        ModeleCarte carte = new ModeleCartePrototype(0);
        ModeleMonde monde = new ModeleMonde(joueur, carte);
        VueJeu vueJeu = new VueJeu(monde);
        ControleurInput inputs = new ControleurInput();
        ControleurJeu jeu = new ControleurJeu(vueJeu, inputs, monde);

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
