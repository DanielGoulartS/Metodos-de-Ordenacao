package exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Goulart
 */
public class MetodosDeOrdenaçao {

    public static int[] criaVetor() {
        Random random = new Random();
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            vetor[i] = random.nextInt(20);
        }
        return vetor;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] vetor = criaVetor();
        int aux = 0;
        int continua, opcao;

        System.out.println("Seu vetor aleatório:");
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + vetor[i]);
        }

        do {
            System.out.println("\nEscolha um método de Organização: 1= Bubble Sort, 2= Selection Sort, Qualquer Tecla= Encerrar o Programa\n");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    //METODO DE SELEÇÂO
                    do {
                        continua = 0;
                        for (int i = 0; i < vetor.length - 1; i++) {
                            if (vetor[i] > vetor[i + 1]) {
                                MetodosDeOrdenaçao.sort(i, aux, vetor);
                                continua = i;
                            }
                        }
                    } while (continua != 0);
                    //FIM DO METODO
                    for (int i = 0; i < 10; i++) {
                        System.out.print(" " + vetor[i]);
                    }   break;
                case 2:
                    //METODO DE BUBBLE SORT
                    for (int i = 0; i < vetor.length - 1; i++) {
                        for (int j = i + 1; j < vetor.length; j++) {
                            if (vetor[i] > vetor[j]) {
                                aux = vetor[i];
                                vetor[i] = vetor[j];
                                vetor[j] = aux;
                            }
                        }
                    }   //FIM DO METODO
                    for (int i = 0; i < 10; i++) {
                        System.out.print(" " + vetor[i]);
                    }   break;
                default:
                    System.out.println("Bye bye!");
                    System.exit(0);
            }
        } while (opcao != 1 && opcao != 2);
    }

//METODO DE TROCA DE POSIÇÔES
    public static int sort(int i, int aux, int vetor[]) {

        aux = vetor[i];
        vetor[i] = vetor[i + 1];
        vetor[i + 1] = aux;

        return 0;
    }
//FIM TROCA
}
