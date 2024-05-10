import java.util.Scanner;

public class Ejercicio_2 {
    public static int multiplicacionFactorial(int n,int M){
        if (M > n){
            return 1;
        }else {
            return M * multiplicacionFactorial(n,M+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero = sc.nextInt();
        int resultado = multiplicacionFactorial(Numero,1);
        System.out.println("de " + Numero + " es " + resultado);
    }
}
