import java.util.Arrays;
import java.util.Scanner;
public class FrequenciaDosDetalhes {

    public void contaOcorrencia (int [] arrayElementos, int num) {
        int frequencia = 0;
        for (int i = 0; i < arrayElementos.length; i++) {
            if (arrayElementos[i] == num) {  
                frequencia++;
            }
        }
        System.out.println ("O array acima possui " + frequencia + " ocorrencias do numero " + num);
    }

    public boolean verificaOcorrencia (int [] arrayElementos) {
        for (int i = 0; i < arrayElementos.length; i++) {
            for (int j = i + 1; j < arrayElementos.length; j++) {
                if (arrayElementos[i] == arrayElementos[j]) {
                    return true; 
                }
            }
        }
        return false;
    }

    public void contaOcorrenciaIndividual (int [] arrayElementos) {
        int contagem = 0;
        for (int i = 0; i < arrayElementos.length; i++) {
            for (int j = i + 1; j < arrayElementos.length; j++) {
                if (arrayElementos[i] == arrayElementos[j]) {
                     System.out.println("O numero" + i + "se repete no array");
                    contagem++;
                     continue;
                }
            }
        }
        System.out.println("O array possui " + contagem + " elementos que se repetem");
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

        FrequenciaDosDetalhes frequencia = new FrequenciaDosDetalhes();
        System.out.println("O array possui ocorrencias? " + frequencia.verificaOcorrencia(array));

        frequencia.contaOcorrencia(array, num);

        frequencia.contaOcorrenciaIndividual(array);
    }
}
