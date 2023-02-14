public class blabla {

    public static void main(String[] args) {
        String[] kaker = new String[5];

        kaker[0] = "eplekake";
        kaker[1] = "bløtkake";
        kaker[2] = "brownies"; // array
        kaker[3] = "muffins";
        kaker[4] = "sjokoladekake";

        for (int i = 0; i < kaker.length; i++) { // for løkke

            String favorittKake = (i == 0) ? "Min favorittkake er " + kaker[i] : kaker[i]; // conditional operator

            // Hvis indeksen i er lik 0, tilordne "Min favorittkake er [kakenavn]" til
            // favorittKake.
            // Hvis ikke, tilordne [kakenavn] til favorittKake.
            System.out.println(favorittKake);

        }
    }
}

// Her vist: hvis indeksen er lik 0 (i == 0) så vil min favorittkake bli satt
// foran kaken på plass null. Hvis i == 0 ikke stemmer
// - som på alle de andre kakene, så vil ingenting bli displayet foran kakene.
// under kommer et eksempel på hvordan man kan tilordne
// - et statement for de som ikke stemmer, altså de som ikke er favorittkakene.

/*
 * String favorittKake = (i == 0) ? "Min favorittkake er " + kaker[i]
 * :kaker[i]+" er ikke min favoritt, men fortsatt god";
 */