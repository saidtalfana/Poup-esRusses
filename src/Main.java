import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choise = 0;
        PoupéeRusse p1 = new PoupéeRusse(30,"fatima",true);
        PoupéeRusse p2 = new PoupéeRusse(50,"Hayat",false);
        PoupéeRusse p3 = new PoupéeRusse(60,"Saida",true);
        int choice;
        do {
            System.out.println("1 : ouvrir ");
            System.out.println("2 : fermer ");
            System.out.println("3 :placer Dans");
            System.out.println("4 : sortir de ");

            Scanner input = new Scanner(System.in);
            //  int choise;
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    p1.ouvrir();
                    System.out.println("la poupee est ouvert");
                    break;
                case 2:
                    p1.fermer();
                    System.out.println("la poupee est fermé");
                    break;
                case 3:
                    p2.placerDans(p1);
                    System.out.println("la poupee 1 est  placee dans p2");
                    break;

                case 4:
                    p2.sortirDe(p1);
                    System.out.println("la poupee 1 est  sortie de p2");
                    break;
                default:
                    System.out.println("invalide choice");

            }
        } while (choice != 4);

    }
}
