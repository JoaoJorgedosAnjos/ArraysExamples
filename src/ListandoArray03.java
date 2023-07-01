import java.util.Scanner;

public class ListandoArray03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] teste;
        teste = new int[20];

        for (int i = 0; i < teste.length; i++) {
            System.out.println("Informe o valor do indice: " + i);
            teste[i] = scanner.nextInt();
        }
        for (int i = 0; i < teste.length; i++)
            System.out.println(teste[i]);
    }
}

