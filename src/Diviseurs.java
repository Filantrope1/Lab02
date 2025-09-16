import java.util.Scanner;

public class Diviseurs {
    private Scanner sc4;

    int restant;
    int divisable;
    int entier;

    public Diviseurs(){

        sc4 = new Scanner(System.in);
    }

    public void askchiffre(){

        System.out.println("Quelle est le chiffre?");
        entier = sc4.nextInt();

    }
    public void calcul(){

        divisable = entier;


        for (int i=divisable ; i > 0; i--) {

            restant = entier % i;


            if (restant == 0) {

                System.out.println(i);

            }
        }
    }

    public void all(){

    askchiffre();
    divisable = entier;
    calcul();


    }





}




// a % b == 0        b est  un diviseur de a
// a % b != 0        b nest pas un diviseur de a

// a % 2 == 0        2 est  un diviseur de a
// a % 2 != 0        2 nest pas un diviseur de a