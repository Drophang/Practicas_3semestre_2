import java.util.Scanner;

public class Ejemplo3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double CT = sc.nextDouble();
        double DE = 0;
        if (CT > 2500){
            DE = CT * 0.15;
        }else {
            DE = CT * 0.08;
        }
        double PF = CT - DE;
        System.out.println("El precio final es " + PF);
        System.out.println("El descuento es " + DE);
    }
}
