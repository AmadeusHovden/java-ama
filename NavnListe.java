import java.util.ArrayList;
import java.util.Iterator;

public class NavnListe {
    public static void main(String[] args) {
        ArrayList<String> navn = new ArrayList<>();

        navn.add("Ama");
        navn.add("Kan");
        navn.add("San");
        navn.add("Pet");
        navn.add("Sil");

        // while
        int i = 0;
        while (i < navn.size()) {
            System.out.println(navn.get(i));
            i++;
        }

        /*
         * // iterator
         * Iterator<String> Iterator = navn.iterator();
         * while (iterator.hasNext()) {
         * System.out.println(iterator.next());
         * }
         * 
         * // fjerne
         * Iterator<String> Iterator = navn.iterator();
         * while (iterator.hasNext()) {
         * String name = iterator.next();
         * if (navn.equals("Sil")) {
         * iterator.remove();
         * }
         * }
         */

        // legge til
        Iterator<String> iterator = navn.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.equals("Sil")) {
                navn.add("Bjørnar");
                break;
            }
        }

    }
}

/*
 * navn.set(2, "Lars");
 * navn.remove(0);
 */