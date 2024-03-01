import java.util.Scanner;

public class Ejemplo4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el pago por hora");
        int SH = 0;
        double PH = sc.nextDouble();
        int HT = 0;
        for (int D = 1; D <=6; D++){
            HT = sc.nextInt();
            SH = SH + HT;
        }
        double SU = SH * PH;
        System.out.println("Las oras laboradas " + SH);
        System.out.println("El salario es = " + SU);
    }
}
