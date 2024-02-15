abstract class Poupee {
    private int taille;
   private boolean ouverte;

 public void Poupee(int taille,boolean ouverte){
     this.taille=taille;
     this.ouverte=ouverte;
 }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public boolean Ouverte() {
        return ouverte;
    }

    public void setOuverte(boolean ouverte) {
        this.ouverte = ouverte;
    }
    abstract void ouvrir();
    abstract void fermer();
    abstract void placerDans(Poupee p);
    abstract void sortirDe(Poupee p);

}
