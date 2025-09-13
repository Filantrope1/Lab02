import java.util.Scanner;

public class Timer {
    private Scanner sc2;


    public Timer(){

        sc2 = new Scanner(System.in);

    }
    public int askseconde(){

        System.out.println("Quelle est le nombre de secondes");
        return sc2.nextInt();

    }

   private int getNbHeures(int seconde) {

        return seconde/3600 ;
    }


   private int getNbMinutes(int seconde) {

        return (seconde%3600)/60;

    }
    private int getNbSecondes(int seconde) {

       return (seconde%3600)%60;

    }
    public void response(int heure,int minute,int seconde){
        System.out.println(pad(heure) + ":" +  pad(minute) + ":" + pad(seconde));
    }

    private String pad(int nombre){

        if(nombre<10){
            return "0"+nombre;
        }
        else{
            return Integer.toString(nombre);

        }

    }

     public void all() {
        int seconderecu = askseconde();
        int seconde = getNbSecondes(seconderecu);
        int minute = getNbMinutes(seconderecu);
        int heure = getNbHeures(seconderecu);


        response(heure,minute,seconde);

    }

}

// 5 / 2 = 2
// 5 % 2 = 1


