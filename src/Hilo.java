public class Hilo extends Thread {
    protected int multiplicador = 0;
    protected int[][] matrix = null;
    protected int inicio = 0;
    protected int fin = 0;

    public Hilo(int multiplicador, int[][] matrix, int inicio, int fin) {
        this.multiplicador = multiplicador;
        this.matrix = matrix;
        this.inicio = inicio;
        this.fin = fin;
    }

    @Override
    public void run() {
        try {
            for (int i = inicio; i < fin; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] *= multiplicador;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
