import java.util.Scanner;

public class Calculo_de_factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero para el calculo factorial");
        int N = sc.nextInt();
        int F = 1;
        for (int i = 1;i <= N;i++){
            F = i * F;
        }
        System.out.println(F);
    }
}
