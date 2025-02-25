import java.util.Scanner;
import java.util.Arrays;
public class SequenciaAurea {
    public String imprimeString (int a, int b) {
        String sequencia = "";
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);

        for (int i = menor; i <= maior; i++) {
            sequencia = sequencia + i + " ";
            
        }
        return sequencia;
    }

    public int [] retornaArray (int a, int b) {
        int menor = Math.min(a, b);
        int maior = Math.max(a, b);
        int tam = maior - menor + 1;
        int [] sequencia = new int [tam];
       

        for (int i = 0; i < tam; i++) {
            sequencia [i] = menor + i;
        }
        return sequencia;
    }

    public boolean verificaPrimo (int num) {
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

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0;

        System.out.println("Informe A: ");
        a = scanner.nextInt();

        System.out.println("Informe B: ");
        b = scanner.nextInt();

        scanner.close();

        System.out.println("Sequencia: ");
        System.out.println(new SequenciaAurea().imprimeString(a, b));

        System.out.println("Array: ");
        System.out.println(Arrays.toString(new SequenciaAurea().retornaArray(a, b)));

        System.out.println("Primos: ");
        SequenciaAurea primos = new SequenciaAurea();
        int[] numeros = primos.retornaArray(a, b); 
        
        for (int i = 0; i < numeros.length; i++) {
            if (primos.verificaPrimo(numeros[i])) {
                System.out.print(numeros[i] + ", ");
            }
        }

    }
}
  
