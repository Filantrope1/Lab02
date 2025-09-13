import java.util.Scanner;


public class TemperatureConversion {
    private Scanner sc; //creation scanner

    public TemperatureConversion() {
        sc = new Scanner(System.in);//nom(sc) du scanner
    }
    public double demanderCelsius() {
        System.out.println("Quelle est la température en Celsius ?"); // Question pour celsius
        return sc.nextDouble(); //retour du user d'un double
    }
    public double conversion(double celsius) {
        return (celsius * 9 / 5) + 32; //calcul conversion
    }
    public void reponse (double celsius, double fahrenheit) {
        System.out.println(celsius + " °C = " + fahrenheit + " °F"); // print la reponse
    }
    public void all(){ //tout print
        double cel = demanderCelsius(); //call de demandeCelsius
        double fahr = conversion(cel); //call de conversion
        reponse(cel, fahr);
        sc.close();
    }
}
