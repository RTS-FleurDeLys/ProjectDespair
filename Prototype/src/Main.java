import javax.swing.JFrame;

import controleur.ControleurJeu;
import modele.ModeleJoueur;
import vue.VueJeu;

public class Main {

    public static void main(String[] args) {

        JFrame fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        fenetre.setTitle("Prototype");

        ModeleJoueur joueur = new ModeleJoueur(100, 100);

        VueJeu vueJeu = new VueJeu(joueur);
        fenetre.add(vueJeu);

        fenetre.pack();

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

        ControleurJeu controleurJeu = new ControleurJeu(vueJeu, joueur);

    }
}
