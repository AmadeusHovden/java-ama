
public class Arayforloop {
    // arrays må være den samme primitive typen, kan ikke blande string og integer..
    // array brukes for å lagre flere verdier i en single variabel.
    public static void main(String[] args) {
        String[] kaker = new String[5];

        kaker[0] = "eplekake";
        kaker[1] = "bløtkake";
        kaker[2] = "brownies";
        // kaker[3] = "muffins";
        kaker[4] = "sjokoladekake";

        // for (int i = 0; i < kaker.length; i++) {
        System.out.println(kaker[4]);
    }
}
