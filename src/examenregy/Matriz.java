package examenregy;

import java.util.Scanner;

public class Matriz {
    Scanner sc = new Scanner(System.in);
    int n =0;
    int m =0;
    
    public int[][] leerMatricez() {
        System.out.println("Ingrese tamaño M de la matriz:");
        this.m = sc.nextInt();
        System.out.println("Ingrese tamaño N de la matriz, debe de ser par: ");
        this.n = sc.nextInt();
         while(n%2!=0) {
            System.out.println("Por favor, ingrese numero par");
            this.n = sc.nextInt();
         }
        System.out.println("Ingrese datos de la matriz");
        int[][] matriz = new int [m][n];
        for(int i=0; i<m;i++) {
            for(int j =0; j<n;j++) {
                matriz[i][j]=sc.nextInt();
            }
        }
        imprimirMatriz(matriz);
        return matriz;
    } 
    public void imprimirMatriz(int[][] f) {
        String str = "";
        for(int i =0; i<f.length; i++) {
            for(int j =0; j<f[0].length; j++){
                str += f[i][j]+" ";
            }
            str += "\n";
        }
        System.out.println(str);
    }
    public void sumaDeMatrices( int[][] a,int[][] b) {
        int[][] c = new int [m][n/2];
        System.out.println("1ª.A + 2ª:B");
        for(int i=0;i<m;i++){
            for(int j=n/2,k=0;j<n;j++,k++){
                c[i][k]=b[i][j];
                c[i][k]+=a[i][k];
            }
        }
        
        imprimirMatriz(c);
        System.out.println("1ª.B + 2ª:A");
        int [][]d=new int [m][n/2];
        for(int i=0; i<m;i++) {
            for(int j =n/2, k=0; j<n;j++,k++){
                d[i][k]=a[i][j];
                d[i][k]+=b[i][k];
            }
        }
        imprimirMatriz(d);
        
        
    }
}