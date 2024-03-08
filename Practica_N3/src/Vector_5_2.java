import java.util.Scanner;

public class Vector_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[10];
        int E = 0;
        int S = 0;
        for (int i = 0;i < A.length;i++){
            E = sc.nextInt();
            A[i] = E;
            S = S + E;
        }
        System.out.println("La suma es " + S);
    }
}
