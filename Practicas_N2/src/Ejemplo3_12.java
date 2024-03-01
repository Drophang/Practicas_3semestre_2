import java.util.Scanner;

public class Ejemplo3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NC = sc.nextInt();
        double CC = 0;
        double TOT = 0;
        if (NC <= 3){
            CC = 200;
            TOT = NC * CC;
        }else {
            if (NC <= 5){
                CC = 150;
                TOT = (NC - 3)* 150  + 600;
            }else {
                if (NC <= 8){
                    CC = 100;
                    TOT = (NC - 5)*100 + 900;
                }else {
                    CC = 50;
                    TOT = (NC - 8) * 50 + 1200;
                }
            }
        }
        System.out.println("El coste de la consulta es " + CC);
        System.out.println("El coste del tratamiento es " + TOT);
    }
}
