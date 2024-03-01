import java.util.Scanner;

public class Ejemplo4_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int DT = 0;
        double PH = 0;
        double SH = 0;
        double HT = 0;
        int I = 1;
        for (I = 1; I <= N ; I++) {
            DT = sc.nextInt();
            PH = sc.nextDouble();
            for (int D = 1; D <= DT; D++) {
                HT = sc.nextDouble();
                SH = SH + HT;
            }
        }
        double SS = SH * PH ;
        System.out.println("El sueldo del trabajador es " + I + " es " + SS);
    }
}
