//ex 01
import java.util.Arrays;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] x = {7, 8, 9, 12, 25, 30};

        System.out.printf("%d,%d,%d,%d,%d,%d\n", x[0], x[1], x[2], x[3], x[4], x[5]);
        System.out.println(x[0] + " " + x[1] + " " + x[2] + " " + x[3] + " " + x[4] + " " + x[5]);

        int qt = x.length;

        System.out.println(qt);

        System.out.println("--------------------------------");

        if (x.length >= 6){
            System.out.println("Array maior ou igual a " + x.length + " elementos");
            System.out.printf("Array maior ou igual a %d elementos\n", x.length);
        }else {
            System.out.println("Array menor que 6 elementos");
        }
        System.out.println("--------------------------------");


        //For
        for (int i = 0; i < x.length; i++){
            System.out.println(x[i]);
        }
        //For each
        System.out.println("--------------------------------");
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        //toString
        System.out.println(Arrays.toString(x));


    }
}