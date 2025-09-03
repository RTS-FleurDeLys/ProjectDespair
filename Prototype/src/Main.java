import javax.swing.JFrame;

import vue.VueJeu;

public class Main {

    public static void main(String[] args) {

        JFrame fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        fenetre.setTitle("Prototype");

        VueJeu vueJeu = new VueJeu();
        fenetre.add(vueJeu);

        fenetre.pack();

        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);

    }
}
