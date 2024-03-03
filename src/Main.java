public class Main {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("\nMatriz original:\n");
        imprimirMatriz(matriz);

        Hilo h1 = new Hilo(2, matriz, 0, matriz.length / 2);
        Hilo h2 = new Hilo(2, matriz, matriz.length / 2, matriz.length);

        h1.start();
        h2.start();

        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nMatriz multiplicada por 2:\n");
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
