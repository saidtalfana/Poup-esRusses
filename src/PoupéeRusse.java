 class PoupéeRusse extends Poupee{
               private String Name;

      public PoupéeRusse(int taille , String name ,Boolean isouverte) {
          super(taille);
           this.ouverte=isouverte;
           this.Name = name;


      }

      @Override
     void ouvrir() {

           if (!this.ouverte && this.getDans() ==null ){
                    this.ouverte=true;
               }

     }

     @Override
     void fermer() {
          if (this.ouverte && this.getDans() ==null ){
               this.ouverte=false;
          }

     }

     @Override
     void placerDans(Poupee p) {
          if(!this.ouverte && this.getDans() ==null && p.ouverte && p.getContient() ==null && p.getTaille() > this.getTaille()){
               this.setDans((PoupéeRusse) p);
               p.setContient(this);
          }
     }

     @Override
     void sortirDe(Poupee p) {
if(p.getContient() ==this && p.Ouverte()){
     this.setDans(null);
     p.setContient(null);
}
     }
 }
