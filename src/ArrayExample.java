public class ArrayExample {

    public static void main(String[] args) {
        // - são inseridos em uma variável que referencia um array
        int[] a = new int[4];
        //OUTRA MANEIRA DE FAZER UMA DECLARAÇÃO DE ARRAY
        int[] b;
        b = new int[10];
        //DECLARANDO VÁRIOS ARRAYS
        int[] r = new int[44], k = new int[23];

        //{} - inicializa os valores em um array sua declaração
        int[] iniciaValores = {12, 32, 54, 6, 8, 89, 64, 64, 6};

        System.out.printf("valores %d\n", iniciaValores[1]);

        int[] exemplo = new int[10];

        exemplo[0] = 10;
        exemplo[1] = 15;
        exemplo[2] = 20;
        exemplo[3] = 25;
        exemplo[4] = 30;
        exemplo[5] = 35;
        exemplo[6] = 40;
        exemplo[7] = 45;
        exemplo[8] = 50;
        exemplo[9] = 55;

        System.out.println(exemplo[9]+" " +exemplo[5]+ " " + iniciaValores[0]);
        System.out.printf("indice 9: %d\nindice 5: %d\n",exemplo[9],exemplo[5]);
    }
}