import java.util.Scanner;
import java.util.Arrays;

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

    public static void SomaArray (int[] elementos) {
        int total = 0;
        for (int i = 0; i < elementos.length; i++) {
            total += elementos[i];
        }
        System.out.printf("Soma: %d", total);
        System.out.println(" ");
    }

    public static boolean verificaPrimo (int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int [] retornaArray (int num1, int num2) {
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);
        int tam = maior - menor + 1;
        int [] sequencia = new int [tam];
       

        for (int i = 0; i < tam; i++) {
            sequencia [i] = menor + i;
        }
        return sequencia;
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

        System.out.printf("De dois inteiros separados por espaco:");
        System.out.println(" ");
        a = scanner.nextInt();     
        b = scanner.nextInt();      

        CalculaPotencia(a, b);

        System.out.println("De um array de inteiros separado por espaco:");
        scanner.nextLine();
        String input = scanner.nextLine();
        String[] elementsStr = input.split(" ");

        int[] elementos = new int[elementsStr.length];
        for (int i = 0; i < elementsStr.length; i++) {
            elementos[i] = Integer.parseInt(elementsStr[i]);
        }
        SomaArray(elementos);
    
        System.out.printf("De um inteiro:\n");
        int num1 = scanner.nextInt();

        System.out.printf("De outro inteiro:\n");
        int num2 = scanner.nextInt();
        
        int[] arrayTemporario = retornaArray(num1, num2);

        System.out.println("Primos: ");
        
        int contador = 0;
        for (int num : arrayTemporario) {
            if (verificaPrimo(num)) {
                contador++;
            }
        }

        int[] primosArray = new int[contador];
        int indice = 0;

        for (int num : arrayTemporario) {
            if (verificaPrimo(num)) {
                primosArray[indice++] = num;
            }
        }

        System.out.println(Arrays.toString(primosArray));

        scanner.close();
    }
}
