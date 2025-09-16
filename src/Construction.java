import java.util.Scanner;

public class Construction {
    private Scanner sc3;
    int nbciment;
    int nbsable;
    int nbgravier;
    int smallest;

    public Construction(){

        sc3 =  new Scanner(System.in);
    }

    public int askmateriaux(String materiaux) {

        System.out.println("Quelle est le nombre de " + materiaux + "?" );
        return  sc3.nextInt();
    }
    public void calcul(int ciment,int sable,int gravier){

        nbciment = ciment/ 350;
        nbsable = sable/680;
        nbgravier = gravier/1175;

   };
    public int comparaison( ){

        smallest = nbciment;

        if(nbsable < smallest){
            smallest = nbsable;
        }
       if(nbgravier < smallest){
            smallest = nbgravier;
        }

        return smallest;
    }
   public void print(){

       System.out.println("Il est possible de faire " + smallest + " bloc de beton" );

   }


    public void all() {
        int ciment  = askmateriaux("ciment");
        int sable  = askmateriaux("sable");
        int gravier = askmateriaux("gravier");
        calcul( ciment, sable, gravier);
        comparaison();
        print();


        sc3.close();

    }
}
