import java.util.Scanner;

public class Ejemplo4_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double SS = 0;
        double HT = 0;
        double PH = 0;
        double TT = 0;
        for (int i = 1; i <= N;i++ ){
            HT = sc.nextDouble();
            PH = sc.nextDouble();
            SS = HT * PH;
            System.out.println("El sueldo " + i + " del trabajador es " + SS);
            TT = TT + SS;
        }
        System.out.println("El sueldo total es " + TT);
    }
}
