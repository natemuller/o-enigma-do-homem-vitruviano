import java.util.Scanner;

public class TabuadaDaHarmonia {
    public static void CalculaTabuada (int valor) {
        System.out.printf("Tabuada de %d:", valor);
        System.out.println(" ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", valor, i, valor * i);
        }
    }

    public static void CalculaPotencia (int a, int b) {
        int resultado = (int) Math.pow(a, b);
        System.out.printf("%d ^ %d = %d", a, b, resultado);
        System.out.println (" ");
    }

    public static void main(String[] args) throws Exception {
        int valor = 0;
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.printf("De um inteiro:");
        System.out.println(" ");
        valor = scanner.nextInt();        

        CalculaTabuada(valor);

        System.out.printf("De dois inteiros separados por enter:");
        System.out.println(" ");
        a = scanner.nextInt();     
        b = scanner.nextInt();     
        scanner.close(); 

        CalculaPotencia(a, b);
    }
}
