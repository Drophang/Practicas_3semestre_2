import java.util.Scanner;

public class Ejercicio_3 {
    public static int potencia(int N,int P, int M){
        if (P == M){
            return N * 1;
        }
        return N * potencia(N,P,M+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int re = potencia(N,P,1);
        System.out.println("es " + re);
    }
}
