import java.util.Scanner;

public class Ejemplo3_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TI = sc.nextLine();
        int KM = sc.nextInt();
        int NPR = sc.nextInt();
        double CK = 0;
        int NP = 0;
        if (TI == "A"){
            CK = 2.00;
        }else {
            if (TI == "B"){
                CK = 2.50;
            }else {
                CK = 3.00;
            }
        }
        if (NPR < 20){
            NP = 20;
        }else {
            NP = NPR;
        }
        double TO = NP * CK * KM;
        double CP = TO /NPR;
        System.out.println("La persona pagara " + CP);
        System.out.println("El costo del viaje es " + TO);
    }
}
