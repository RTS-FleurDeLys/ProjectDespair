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

    public int getTuile(int colonne, int ligne) {
        return carte[colonne][ligne];
    }

    protected void setTuile(int colonne, int ligne, int valeur) {
        carte[colonne][ligne] = valeur;
    }

    public ModeleCarte(long seed, int largeur, int longeur) {
        this.seed = seed;
        this.longeur = longeur;
        this.largeur = largeur;
        this.carte = new int[largeur][longeur];
    }

    abstract public void generationCarte();

}
