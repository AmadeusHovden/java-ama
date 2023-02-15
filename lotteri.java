import java.util.Random;

/*
 * Denne classen inneholder et simpelt lotterispill der man kan vinne en jackpot
 * 
 * @author      Amadeus Hovden
 * @version     1.0 (15.02.2023)
 */

public class lotteri {

    /*
     * Denne metoden velger tilfedlig et element fra en array av lotteri utfakll
     * 
     * @param en array av Strings som representerer lotteri utfall
     * 
     * @return et tilfeldig valg utfal av arrayer
     */

    public static String SpillLotteri(String[] resultater) {
        Random lotto = new Random();
        int resultatIndex = lotto.nextInt(resultater.length);
        return resultater[resultatIndex];
    }

    /*
     * Hovedmetoden som kjører lotterispillet
     */

    public static void main(String[] args) {
        String[] lotteriResultater = { "jackpot", "sry", "sry", "sry", "sry" };
        String resultat = SpillLotteri(lotteriResultater);
        System.out.println(resultat);

    }

}
