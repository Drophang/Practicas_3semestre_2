import java.util.Scanner;

public class Ejemplo4_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        int A = 0;
        int B = 0;
        int C = 0;
        double T1 = 0;
        double T2 = 0;
        double T3 = 0;
        double TT = 0;
        double TI = 0;
        double V = 0;
        for (int CN = 1;CN <= N;CN++){
            V = sc.nextDouble();
            if (V > 1000 ){
                A = A + 1;
                TI = TI + 1;
            }else {
                if (V > 500){
                    B = B + 1;
                    T2 = T2 + 1;
                }else {
                    C = C + 1;
                    T3 = T3 + 1;
                }
            }
            TT = TT + V;
        }
        System.out.println("Las ventas y el total de ventas 1 es " + A + " " + T1);
        System.out.println("Las ventas y el total de ventas 2 es " + B + " " + T2);
        System.out.println("Las ventas y el total de ventas 3 es " + C + " " + T3);
        System.out.println("El total de las ventas es " + 2 + TT);
    }
}
