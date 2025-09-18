import java.util.Scanner;


public class Premier2 {

    private Scanner sc6;

    int chiffre;

    public Premier2 (){
        sc6 = new Scanner(System.in);
    }

    public void askchiffre() {
        System.out.println("Quelle est le chiffre?");
        chiffre = sc6.nextInt();

        calcul();
    }

    public void calcul() {
        int diviseur2 = 0;


        for (int i = 1; i <= chiffre; i++)
        {
            if (chiffre % i == 0) {

                diviseur2++;
            }
        }

        if (diviseur2 == 2) {
            print(" premier");

        }
        else {
            print(" pas premier");

        }
    }

    public void print(String reponse){
        System.out.println("Le nombre : " + chiffre + " est " + reponse);
        restart();

    }
    public void restart(){

        if (chiffre != 0){
            askchiffre();
        }
        else {
            System.exit(0);;
        }
    }

    public void all(){
        askchiffre();


    }
}


