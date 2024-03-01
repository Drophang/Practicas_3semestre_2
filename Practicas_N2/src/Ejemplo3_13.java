import java.util.Scanner;

public class Ejemplo3_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double MP = sc.nextDouble();
        int C = sc.nextInt();
        double MO = 0;
        double GF = 0;
        if (C == 3 || C == 5){
                MO = MP *0.75;
            }else {
            if (C == 1 || C == 5){
                MO = MP *0.80;
                }else {
                MO = MP * 0.85;
                }
        }
        if (C == 2 || C == 5){
            GF = MP * 0.30;
        }else {
            if (C == 3 || C == 6){
                GF = MP * 0.35;
            }else {
                GF = MP * 0.28;
            }
        }
        double CP = MP + MO + GF;
        double PV = CP + CP * 0.45;
        System.out.println("El coste de producion es " + CP);
        System.out.println("El precio de venta es" + PV);
    }
}

