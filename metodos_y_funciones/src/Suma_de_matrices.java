import java.util.Scanner;

public class Suma_de_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el tamaño de las matrices");
        int T = sc.nextInt();
        int A[] = new int[T];
        int B[] = new int[T];
        int C[] = new int[T];
        for (int i = 0; i < T; i++){
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = A[i] + B[i];
            System.out.println(C[i]);
        }
    }
}
