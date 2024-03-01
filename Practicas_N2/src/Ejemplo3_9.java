import java.util.Scanner;

public class Ejemplo3_9 {
    public static void main(String[] args) {
        System.out.println("Ingrese el dia la hora y el turno");
        Scanner sc = new Scanner(System.in);
        String DI = sc.nextLine();
        int TI = sc.nextInt();
        String TU = sc.nextLine();
        double PAG =0;
        double IMP = 0;
        if(TI <= 5){
            PAG = TI * 1;
        }else {
            if (TI <= 8){
                PAG =(TI - 5)*0.8+5.0;
            }else {
                if (TI <= 10){
                    PAG =(TI - 8) * 0.7 +7.4;
                }else {
                    PAG = (TI * 10) + 0.5 + 8.8;
                }
            }
        }
        double IM = 0;
        if (DI == "DOM"){
            IMP = PAG * 0.05;
        }else {
            if (TU == "M"){
                IMP = PAG * 0.15;
            }else {
                IMP = PAG * 0.10;
            }
        }
        double TOT = PAG + IMP;
        System.out.println("El pago es " + PAG);
        System.out.println("El impuesto es " + IMP);
        System.out.println("El pago total es " + TOT);
    }
}
