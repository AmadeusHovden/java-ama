
import java.util.Random;
import java.util.HashMap;
import java.util.HashSet;

public class modul {
    public static void main(String[] args) {
        // her er String
        String Heisan = "hei, hva skjer?";
        System.out.println(Heisan);

        // Random
        Random terning = new Random();
        int tilfeldigTerning = terning.nextInt(6) + 1;
        System.out.println("du fikk terningkast: " + tilfeldigTerning);

        // HASHMAP
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Jens", 457788990);
        hashMap.put("Karro", 43222230);
        hashMap.put("Martin", 4893333);

        int value = hashMap.get("Karro");
        System.out.println("nummeret til karro er : " + value);

        // HASHSET
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("banan");
        hashSet.add("eple");
        hashSet.add("drue");

        if (hashSet.contains("drue")) {
            System.out.println("denne skålen inneholder 'drue'");
        }

    }
}