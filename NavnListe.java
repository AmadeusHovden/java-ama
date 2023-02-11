import java.util.ArrayList;

public class NavnListe {
    public static void main(String[] args) {
        ArrayList<String> navn = new ArrayList<>();

        navn.add("Ama");
        navn.add("Kan");
        navn.add("San");
        navn.add("Pet");
        navn.add("Sil");

        for (String element : navn) {
            if (element.contains("a"))
                System.out.println(element);
        }
    }

}
