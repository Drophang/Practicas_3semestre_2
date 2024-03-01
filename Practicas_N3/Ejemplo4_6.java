import java.util.Scanner;

public class Ejemplo4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double AH = 0;
        int M = 0;
        int CA = 0;
        for (int i = 0; i <= 12; i++ ){
            AH =  AH + CA;
            System.out.println("El ahorro del mes " + M + " es " + AH);
        }
        System.out.println("El ahorro final es " + AH);
    }
}
