import java.util.Scanner;

public class VolumeCylindre {
    private Scanner sc1;

    public VolumeCylindre(){
        sc1 = new Scanner(System.in);
    }
    public double rayon(){

        System.out.println("Quelle est le rayon de votre cylindre?");
        return sc1.nextDouble();
    }
    public double hauteur() {

        System.out.println("Quelle est le hauteur de votre cylindre?");
        return sc1.nextDouble();
    }
    public double calcul(double rayon, double hauteur) {

        return Math.PI * Math.pow(rayon, 2) * hauteur;

    }
    public void reponse1 (double rayon, double hauteur, double calcul){

        System.out.println("l'air dy cylindre est de: " + calcul + " avec un rayon de: " + rayon + " et une hauteur de: " + hauteur);
    }

    public void all(){ //tout print
        double rayon = rayon(); //call de demandeCelsius
        double hauteur = hauteur(); //call de conversion
        double reponse1 = calcul(rayon,hauteur);
        reponse1(rayon,hauteur,reponse1);
        sc1.close();
    }


}
