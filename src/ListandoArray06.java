import java.util.Scanner;

public class ListandoArray06 {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        int sum = 0, negativeNumbers = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite os números do array: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("[");
        for (int j = 0; j < numbers.length; j++) {

            System.out.print(" " + numbers[j]);
        }
        System.out.print("]\n");

        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] >= 0) {
                sum += numbers[j];
            } else {
                negativeNumbers++;
            }
        }

        System.out.printf("A soma dos números positovos é:%d \n", sum);
        System.out.printf("A quantidade de valores negativos é: %d\n", negativeNumbers);
    }
}