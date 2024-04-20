import java.util.Scanner;

public class BuscaSequencial {
    public static int buscaSequencial(int[] A, int N, int X, int i) {
        if (i == N) {
            return -1; // Elemento não encontrado
        }
        if (A[i] == X) {
            return i; // Elemento encontrado
        }
        return buscaSequencial(A, N, X, i + 1);
    }
    public static void main(String[] args) {
        int[] vetorA = {1,2,3,4,5,6,7,8,9,10};
        int tamanhoVetor = vetorA.length;
        System.out.println("Digite o valor a ser procurado no vetor: ");
        Scanner scanner = new Scanner(System.in);
        int elementoBuscado = scanner.nextInt();

        int indiceEncontrado = buscaSequencial(vetorA, tamanhoVetor, elementoBuscado, 0);

        if (indiceEncontrado != -1) {
            System.out.println("Elemento " + elementoBuscado + " encontrado no índice " + indiceEncontrado);
        } else {
            System.out.println("Elemento " + elementoBuscado + " não encontrado");
        }
    }
}

/*
A complexidade temporal no pior caso do algoritmo de busca sequencial recursiva é O(N).

No pior caso, a função recursiva será chamada N vezes, uma vez para cada elemento no vetor, até atingir o caso base de encontrar
o elemento ou percorrer todo o vetor sem encontrá-lo. Portanto, a complexidade nesse passo é O(N). 
O custo de comparação para verificar se o elemento atual é igual a X é constante, ou seja, O(1).
A chamada recursiva ocorre N vezes no pior caso, o que contribui novamente com O(N) para a complexidade.
Portanto, somando todas as operações, a complexidade total do algoritmo de busca sequencial recursivo é :

O(N)+O(1)+O(N)=O(2N+1). 

No entanto, na análise assintótica, o fator constante pode ser ignorado, resultando em uma complexidade final de O(N).
*/