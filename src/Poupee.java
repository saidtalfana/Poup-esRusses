public  abstract class Poupee {
    private int taille;
    boolean ouverte;
   private Poupee dans, contient;



    public Poupee(int taille){
     this.taille=taille;
     this.ouverte=false;
 }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public PoupéeRusse getDans() {
        return (PoupéeRusse) dans;
    }

    public void setDans(PoupéeRusse dans) {
        this.dans = dans;
    }

    public PoupéeRusse getContient() {
        return (PoupéeRusse) contient;
    }

    public void setContient(PoupéeRusse contient) {
        this.contient = contient;
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
