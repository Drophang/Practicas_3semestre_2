import java.util.Scanner;

public class Ejercicio_4 {
    public  static int conteo(int N){
        if (N == 0){
            System.out.println(N);
            return 0;
        }else {
            System.out.println(N);
            return conteo(N-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int R = conteo(N);
    }
}
