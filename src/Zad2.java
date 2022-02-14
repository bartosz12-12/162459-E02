import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Zad2 {
    public static void main(String[] args){
        ArrayList<String > ar = new ArrayList<>();
        ar.add("jeden");
        ar.add("dwa");
        ar.add("trzy");

        TreeSet<String> tre = new TreeSet<>(ar);
        HashSet<String> has = new HashSet<>(ar);

        print(ar);
        System.out.println(" ");
        print(tre);
        System.out.println(" ");
        print(has);
    }

    public static <T extends Iterable> void print(T t){
        t.forEach((x ->System.out.print("["+ x +"]"+",")));
    }
}
