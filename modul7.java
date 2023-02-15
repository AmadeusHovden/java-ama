public class modul7 {

    public static void main(String[] args) {
        String[] kaker = new String[5];

        kaker[0] = "eplekake";
        kaker[1] = "bløtkake";
        // kaker[2] = "brownies";
        kaker[3] = "gulrotkake";
        kaker[4] = "sjokoladekake";

        for (int i = 0; i < kaker.length; i++) {

            String favorittKake = (i == 0) ? "Min favorittkake er " + kaker[i]
                    : kaker[i] + " er ikke min favoritt,  men fortstat god";

            System.out.println(favorittKake);
        }

    }

}
