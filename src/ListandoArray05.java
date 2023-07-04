import java.util.Scanner;

public class ListandoArray05 {
    public static void main(String[] args) {

        int numbers[] = new int[20];
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite os dados dos array: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("[");
        for (int j = 0; j < numbers.length; j++) {

            System.out.print(" "+ numbers[j]);
        }
        System.out.print("]");
        for (int i : numbers)
            sum += i;

        System.out.printf("    A soma dos valores desse array é %d\n", sum);
    }
}