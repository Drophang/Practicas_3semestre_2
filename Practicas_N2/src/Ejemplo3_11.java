import java.util.Scanner;

public class Ejemplo3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TI = sc.nextLine();
        System.out.println();
        int N = sc.nextInt();
        System.out.println();
        String TP = sc.nextLine();
        double PA = 0;
        if (TI == "Sencilla"){
            PA = 20.00;
        }else {
            if (TI == "Doble"){
                PA = 25.00;
            }else {
                PA = 28.00;
            }
        }
        double TO = PA *N;
        double CA = 0;
        if (TP == "Targeta"){
            CA = TO *0.05;
        }else {
            CA = 0;
        }
        double TOT = TO + CA;
        System.out.println("La amburguesa cuesta " + PA);
        System.out.println("El total sin cargo " + TO);
        System.out.println("El cargo es " + CA);
        System.out.println("El total por pagar es " + TOT);
    }
}
