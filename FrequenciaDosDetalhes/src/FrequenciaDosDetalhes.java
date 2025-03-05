import java.util.Arrays;
import java.util.Scanner;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;
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

    public void contaOcorrenciaIndividual(int[] arrayElementos) {
        for (int i = 0; i < arrayElementos.length; i++) {
            int contador = 0;
            for (int j = 0; j < arrayElementos.length; j++) {
                if (arrayElementos[i] == arrayElementos[j]) {
                    contador++;
                }
            }
            System.out.println("O elemento " + arrayElementos[i] + " se repete " + contador + " vezes no array");
        }
    }

    public void imprimeOcorrencias(int[] arrayElementos) {
        int[] ocorrencias = new int[arrayElementos.length];
        int indice = 0;
        for (int i = 0; i < arrayElementos.length; i++) {
            int contador = 0;
            for (int j = 0; j < arrayElementos.length; j++) {
                if (arrayElementos[i] == arrayElementos[j]) {
                    contador++;
                }
            }
            if (contador > 1) { 
                boolean jaAdicionado = false;
                for (int k = 0; k < indice; k++) {
                    if (ocorrencias[k] == arrayElementos[i]) {
                        jaAdicionado = true;
                        break;
                    }
                }
                if (!jaAdicionado) {
                    ocorrencias[indice++] = arrayElementos[i]; 
                }
            }
        }
        for (int i = 0; i < indice; i++) {
            System.out.print(ocorrencias[i] + " ");
        }
    }

    public static void main (String[] args) throws Exception {

        ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
        long startTime = System.nanoTime();
        long startCpuTime = threadBean.getCurrentThreadCpuTime();

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

        frequencia.imprimeOcorrencias(array);

        System.out.println(" ");

        long endTime = System.nanoTime();
        long endCpuTime = threadBean.getCurrentThreadCpuTime();

        long elapsedTime = endTime - startTime;
        long elapsedCpuTime = endCpuTime - startCpuTime;

        System.out.println("Tempo total de execução (nanosegundos): " + elapsedTime);
        System.out.println("Tempo total de CPU (nanosegundos): " + elapsedCpuTime);
    }
}
