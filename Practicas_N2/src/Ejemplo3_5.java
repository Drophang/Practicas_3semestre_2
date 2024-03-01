import java.util.Scanner;

public class Ejemplo3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        double M = sc.nextDouble();
        if (A > B){
            if (A > C){
                M = A;
            }else {
                M = C;
            }
        }else {
            if (B > C){
                M = B;
            }else {
                M = C;
            }
        }
        System.out.println("El mayor es " + M);
    }
}
