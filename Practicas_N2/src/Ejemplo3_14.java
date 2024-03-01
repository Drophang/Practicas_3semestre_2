import java.util.*;
public class Ejemplo3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NZ = sc.nextInt();
        int PE = sc.nextInt();
        double CO = sc.nextDouble();
        if(PE < 5000){
            System.out.println("No se puede dar el servicio");
        }else{
            switch (NZ){
                case 1 : CO = PE * 11;
                break;
                case 2 : CO = PE * 10;
                break;
                case 3 : CO = PE * 12;
                break;
                case 4 : CO = PE * 24;
                break;
                default: CO = PE * 27;
            }
            System.out.println("EL costo es " + CO);
        }
    }
}