import java.util.ArrayList;
import java.util.TreeSet;
public class one{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("yoyo");
        list.add("Singh");
        list.add("honey");
        //System.out.println(list+"  "+list.getClass());



        //Tree set
        TreeSet set = new TreeSet<>();
        set.add("yoyo");
        set.add("Singh");
        set.add("honey");
        set.add("yoyo"); // duplicate
        System.out.println(set);
    }
}