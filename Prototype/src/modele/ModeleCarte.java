package modele;

public abstract class ModeleCarte {

    private final long seed;
    private final int[][] carte;
    private final int longeur, largeur;

    public long getSeed() {
        return seed;
    }

    public int getLongeur() {
        return longeur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getTuile(int ligne, int colonne) {
        return carte[ligne][colonne];
    }

    protected void setTuile(int ligne, int colonne, int valeur) {
        carte[ligne][colonne] = valeur;
    }

    public ModeleCarte(long seed, int longeur, int largeur) {
        this.seed = seed;
        this.longeur = longeur;
        this.largeur = largeur;
        this.carte = new int[longeur][largeur];
    }

    abstract public void generationCarte();

}
