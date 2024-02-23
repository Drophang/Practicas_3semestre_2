import java.util.Scanner;

public class Ejemplo3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NA = sc.nextInt();
        double PA = 0;
        if (NA >= 100){
            PA = 65;
        }else {
            if (NA >= 50){
                PA = 70.0;
            }else{
                if (NA >= 30){
                    PA = 95.0;
                }else {
                    PA = 4000/NA;
                }
            }
        }
        double TOT = PA * NA;
        System.out.println("El pago individual es " + PA);
        System.out.println("El pago total es " + TOT);
    }
}
