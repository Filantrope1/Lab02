public class Wallis {

    double terme;
    double reponse;

    public void calcul() {

        reponse =1.0;

        for (int k = 0; k < 10000; k++) {

            terme=( ( (2.0*k+2.0) / (2.0*k+1.0) ) * ( (2.0*k+2.0)/ (2.0*k+3.0) ) );



            reponse *= terme;

        }
        reponse *= 2;
    }
    public void print(){

        System.out.println(reponse);


    }
    public void all(){

        calcul();
        print();

    }
}




//    while (){
//
//
//            }
//
//            do{
//
//
//            }while ();
//