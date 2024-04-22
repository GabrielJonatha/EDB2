package Exercicio4;

public class Fibonacci {

    public static int fibonacciIterativo(int N) {
        if (N <= 0) {
            return 0;
        }
        int a = 0, b = 1;
        for (int i = 2; i <= N; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static int fibonacciRecursivoMemoizado(int N) {
        return fibonacciRecursivoMemoizado(N, new int[N + 1]);
    }

    private static int fibonacciRecursivoMemoizado(int N, int[] memo) {
        if (N <= 0) {
            return 0;
        } else if (N == 1) {
            return 1;
        } else if (memo[N] == 0) {
            memo[N] = fibonacciRecursivoMemoizado(N - 1, memo) + fibonacciRecursivoMemoizado(N - 2, memo);
        }
        return memo[N];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciIterativo(10));
        System.out.println(fibonacciRecursivoMemoizado(10));
    }
}

/*
 * A complexidade de tempo do algoritmo iterativo de Fibonacci é O(N), onde N é
 * o número de entrada. Isso ocorre porque o algoritmo executa um loop que itera
 * N vezes.
 * A versão recursiva do algoritmo de Fibonacci pode ser melhorada em Java
 * usando um array para armazenar os resultados de chamadas de função anteriores
 * (técnica conhecida como memoização). Isso evita recalcular os mesmos valores
 * várias vezes e melhora significativamente o desempenho do algoritmo.
 * Ambos os algoritmos (iterativo e recursivos) têm complexidade de tempo O(N),
 * mas a versão iterativa tem complexidade de espaço O(1), enquanto a versão
 * recursiva tem complexidade de espaço O(N) devido ao uso de memória adicional
 * para o array de memoização.
 */