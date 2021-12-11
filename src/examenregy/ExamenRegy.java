package examenregy;
public class ExamenRegy {
    public static void main(String[] args) {
        Matriz m = new Matriz();
        int[][] a=m.leerMatricez();
        int[][] b=m.leerMatricez();
        m.sumaDeMatrices(a,b);

    }
    
}
