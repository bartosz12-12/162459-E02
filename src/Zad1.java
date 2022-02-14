import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Zad1 {
    public static void main(String[] args){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");

        Integer i1 = 12;
        Integer i2 = 13;
        Integer i3 = 14;

        String d1 = "12:12";
        String d2 = "13:12";
        String d3 = "14:12";

        LocalTime czas1 = LocalTime.parse(d1,format);
        LocalTime czas2 = LocalTime.parse(d2,format);
        LocalTime czas3 = LocalTime.parse(d3,format);

        LocalTime[] ar = {czas1,czas2,czas3};
        LocalTime[] ar2 = {czas2,czas1,czas3};

        System.out.println(isSorted(ar));
        System.out.println(isSorted(ar2));

        String[] str = {d1,d2,d3};
        String[] str2 = {d2,d1,d3};

        System.out.println(isSorted(str));
        System.out.println(isSorted(str2));

        Integer[] i = {i1,i2,i3};
        Integer[] i0 = {i3,i2,i1};

        System.out.println(isSorted(i));
        System.out.println(isSorted(i0));

    }

    public static <T extends Comparable<T>> boolean isSorted(T [] tab){
        for(int i = 0;i< tab.length-1;i++){
            if(tab[i+1].compareTo(tab[i]) < 0){
                return false;
            }
        }
        return true;
    }
}
