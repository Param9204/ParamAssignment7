// Name :-Param Thumar
// Roll-no :-21ce144
import java.util.Arrays;

public class prec7_1 {
    public static void main(String[] args) {
        P7_1[] s = new P7_1[4];
        s[0] = new P7_1("Dev", 18, 35);
        s[1] = new P7_1("Deep", 19, 94);
        s[2] = new P7_1("Renish", 20, 53);
        s[3] = new P7_1("Bhagy", 21, 82);
        System.out.println("------------------------------------ --------------");
        System.out.println("Before sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
        Arrays.sort(s);
        System.out.println("After sorting:- ");
        System.out.println(Arrays.toString(s));
        System.out.println("------------------------------------ --------------");
    }
}