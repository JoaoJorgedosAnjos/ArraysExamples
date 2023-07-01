public class ListandoArray {
    public static void main(String[] args) {
        //ARRAY COM 10 ELEMENTOS
        int[] arrayBase= {20,23,45,67,25,41,87,49,90,15,68,59,72,37,48,90,68,41,4,100};
        System.out.printf("%s %10s \n", "Index", "Valores");

        //GERA A SAÍDA DO VALOR DE CADA ELEMENTE DO ARRAY
        for (int i = 0; i < arrayBase.length; i++) {
            System.out.printf("%3d %10d \n", i, arrayBase[i]);
            //3d 3 caracteres de espaçamento no terminal
            //10d 10 caracteres de espaçamento no terminal

        }
    }
}
