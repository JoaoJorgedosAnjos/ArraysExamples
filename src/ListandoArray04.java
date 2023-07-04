import java.util.Scanner;

public class ListandoArray04 {
    public static void main(String[] args) {

        int numero[] = new int[10];
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numero.length; i++) {
            System.out.println("Informe os dados do array");
            numero[i] = scanner.nextInt();
        }
        for (int j = 0; j < numero.length; j++){
            System.out.println(numero[j]);
        }
    }
}