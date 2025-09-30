package modele;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ModeleCartePrototype extends ModeleCarte {

    public ModeleCartePrototype(long seed) {
        super(seed, 32, 24);
    }

    @Override
    public void generationCarte() {
        // La carte prototype n'utilise pas de génération procédurale mais se contente
        // d'extraire les informations d'un fichier texte.
        String ligne;
        String[] tuilesLigne;
        int tuile;

        try {
            InputStream inputStream = getClass().getResourceAsStream("/cartes/carte.txt");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            for (int i = 0; i < this.getLongeur(); i++) {

                ligne = bufferedReader.readLine();
                tuilesLigne = ligne.split(" ");

                for (int j = 0; j < this.getLargeur(); j++) {
                    tuile = Integer.parseInt(tuilesLigne[j]);
                    setTuile(j, i, tuile);
                }
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("LA CARTE EST BIEN GÉNÉRÉE!");
    }

}
