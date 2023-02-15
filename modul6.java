import java.util.Random;

public class modul6 {

    public static void main(String[] args) {
        String[] Lotto = new String[5];

        Lotto[0] = "sry";
        Lotto[1] = "sry";
        Lotto[2] = "sry";
        Lotto[3] = "sry";
        Lotto[4] = "jackpot";

        Random millionær = new Random();
        int vinnOrTap = millionær.nextInt(Lotto.length);

        System.out.println(Lotto[vinnOrTap]);

    }
}
