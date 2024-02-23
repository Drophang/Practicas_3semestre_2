import java.util.Scanner;

public class Ejemplo3_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String TI = sc.nextLine();
        int TA = sc.nextInt();
        double P = sc.nextDouble();
        int k = sc.nextInt();
        if(TI == "A"){
            if (TA == 1){
                P = P - 0.20;
            }else {
                P = P - 0.50;
            }
        }else {
            if (TA == 1){
                P = P - 0.30;
            }else {
                P = P - 0.50;
            }
        }
        double GA = P * k;
        System.out.println("La ganancia es " + GA);
    }
}
