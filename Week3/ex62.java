package Week3;
import java.util.ArrayList;
import java.util.Collections;

public class ex62 {

    public static void main(String[] args) {
        ArrayList<String> brothers = new ArrayList<>();

        brothers.add("Dick");
        brothers.add("Henry");
        brothers.add("Andero");
        brothers.add("Bob");

        System.out.println("brothers:");
        System.out.println(brothers);

        Collections.sort(brothers);

        int index = brothers.size() -1;
        brothers.remove(index);
        System.out.println(brothers);
}}
