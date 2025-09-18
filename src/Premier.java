import java.util.Scanner;

public class Premier {

    private Scanner sc5;

    int chiffre;

    public Premier (){
        sc5 = new Scanner(System.in);
    }

    public void askchiffre() {
        System.out.println("Quelle est le chiffre?");
        chiffre = sc5.nextInt();
    }

    public void calcul() {
        int diviseur = 0;


        for (int i = 1; i <= chiffre; i++)
        {
            if (chiffre % i == 0) {

                diviseur++;
            }
        }

        if (diviseur == 2) {
            print(" premier");
        } else {
            print(" pas premier");
        }
    }

    public void print(String reponse){
        System.out.println("Le nombre : " + chiffre + " est " + reponse);
    }

    public void all(){
        askchiffre();
        calcul();
    }
}

