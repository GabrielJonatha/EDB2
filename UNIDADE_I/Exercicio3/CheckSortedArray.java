public class CheckSortedArray {

    // Função para verificar se o vetor está ordenado de forma crescente
    public static boolean isSorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false; // Elemento fora de ordem
            }
        }
        return true; // Vetor está ordenado
    }

    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4, 5 }; // Vetor ordenado
        int[] arr2 = { 5, 3, 1, 4, 2 }; // Vetor desordenado

        System.out.println("Vetor 1 está ordenado? " + isSorted(arr1)); // Deve imprimir verdadeiro
        System.out.println("Vetor 2 está ordenado? " + isSorted(arr2)); // Deve imprimir falso
    }
}

/*
 * A função isSorted verifica se um array está ordenado de forma crescente. Ela
 * faz isso percorrendo o array uma vez e comparando cada elemento com o
 * anterior. Se encontrar um elemento que é menor que o anterior, retorna false.
 * Se chegar ao final do array sem encontrar nenhum elemento fora de ordem,
 * retorna true.
 * 
 * A complexidade de tempo do algoritmo é O(n), onde n é o número de elementos
 * no array. Isso ocorre porque, no pior caso, precisamos percorrer todo o array
 * para garantir que cada elemento seja menor ou igual ao próximo.
 * 
 * No melhor caso, se o array não estiver ordenado, poderíamos potencialmente
 * descobrir isso no primeiro par de elementos que compararmos. Portanto, no
 * melhor caso, a complexidade de tempo seria O(1).
 * 
 * A complexidade de espaço para este algoritmo é O(1), pois não estamos usando
 * nenhum espaço de armazenamento adicional que escala com o tamanho da entrada.
 */
