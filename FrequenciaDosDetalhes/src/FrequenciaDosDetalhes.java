import java.util.Arrays;
import java.util.Scanner;
public class FrequenciaDosDetalhes {

    public void verificaOcorrencia (int [] arrayElementos, int num) {
        int frequencia = 0;
        for (int i = 0; i < arrayElementos.length; i++) {
            if (arrayElementos[i] == num) {  
                frequencia++;
            }
        }
        System.out.println ("O array acima possui " + frequencia + " ocorrencias do numero " + num);
    }
    public static void main (String[] args) throws Exception {
        System.out.println ("De os elementos do array separados por espaco: ");
        Scanner scanner = new Scanner (System.in);
        String elementos = scanner.nextLine ();

        int[] array = Arrays.stream(elementos.split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println ("De o numero que desejas saber a frequencia: ");
        int num = scanner.nextInt ();
        scanner.close ();

        System.out.println(Arrays.toString(array));
        System.out.println(" ");

        FrequenciaDosDetalhes frequencia = new FrequenciaDosDetalhes ();
        frequencia.verificaOcorrencia (array, num);
        
        
    }
}
