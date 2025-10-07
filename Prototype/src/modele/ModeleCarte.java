package modele;

public abstract class ModeleCarte {

    private final long seed;
    private final int[][] carte;
    private final int longeur, largeur;
    private final ModeleMonstre[] monstres;

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

    public ModeleMonstre getMonstre(int i) {
        return monstres[i];
    }

    protected void setMonstre(int i, ModeleMonstre monstre) {
        monstres[i] = monstre;
    }

    public ModeleMonstre[] getMonstres() {
        return monstres;
    }

    public int nbMonstres() {
        return monstres.length;
    }

    public ModeleCarte(long seed, int largeur, int longeur, int nbMonstres) {
        this.seed = seed;
        this.longeur = longeur;
        this.largeur = largeur;
        this.carte = new int[largeur][longeur];
        this.monstres = new ModeleMonstre[nbMonstres];
    }

    abstract public void generationCarte();

}
