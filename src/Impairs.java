public class Impairs {

    int restant;
    int value;

    public void impairs() {

        value = value + 1;
        restant = value % 2;

    }

    public void print() {

        if (restant == 0) {
            impairs();
        }
        if (restant == 1) {

            System.out.println(value );
        }
}
    public void all(){
        impairs();
        print();

        if (value <199) {
            all();
        }

        if (value == 200) {
            System.exit(0);
        }





    }

}
