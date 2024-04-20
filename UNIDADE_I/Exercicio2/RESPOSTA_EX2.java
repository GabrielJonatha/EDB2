import java.util.Scanner;

public class BuscaBinariaIterativa {

    public static int buscaBinariaIterativa(int[] A, int N, int X) {
        int inicio = 0;
        int fim = N - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (A[meio] == X) {
                return meio;
            } else if (A[meio] < X) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Testes com diferentes casos de entrada
        int[][] casosTeste = {
                {10, 22, 34, 45, 56, 67, 78, 89, 90}, // Vetor ordenado crescente
                {90, 89, 78, 67, 56, 45, 34, 22, 10}, // Vetor ordenado decrescente
                {10, 20, 30, 40, 50}, // Vetor com 5 elementos
                {100, 50, 25}, // Vetor com 3 elementos
                {10}, // Vetor com 1 elemento
                {} // Vetor vazio
        };

        for (int[] casoTeste : casosTeste) {
            int N = casoTeste.length;

            System.out.println("\nTeste com vetor de tamanho " + N + ":");
            System.out.print("Vetor: ");
            for (int elemento : casoTeste) {
                System.out.print(elemento + " ");
            }

            System.out.print("\nElementos a serem buscados: ");
            for (int elementoBuscado : new int[]{casoTeste[N / 2], -1, 100}) {
                int indiceEncontrado = buscaBinariaIterativa(casoTeste, N, elementoBuscado);

                if (indiceEncontrado != -1) {
                    System.out.println("Elemento " + elementoBuscado + " encontrado no índice " + indiceEncontrado);
                } else {
                    System.out.println("Elemento " + elementoBuscado + " não encontrado");
                }
            }
        }
    }
}

/*
A complexidade temporal no pior caso para a busca binária iterativa e recursiva é O(log N). 
No melhor caso para ambas as versões é O(1), quando o elemento buscado é encontrado na primeira iteração.

Versão Iterativa: A complexidade espacial da versão iterativa é O(1), pois utiliza apenas variáveis locais para armazenar os índices de início e fim do intervalo de busca.
Versão Recursiva: A complexidade espacial da versão recursiva é O(log N), pois a pilha de chamadas recursivas pode ter até log N elementos, um para cada nível da recursão.

Os testes para diferentes casos, variando o tamanho do vetor, foi implementado no próprio código.
*/