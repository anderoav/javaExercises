package Week3;
import java.util.ArrayList;

public class ex61 {
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("ciao");
        list.add("hei");
        System.out.println("There are this many items in the list:");
        System.out.println(countItems(list));
    }
}