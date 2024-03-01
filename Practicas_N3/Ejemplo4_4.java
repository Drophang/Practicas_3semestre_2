import java.util.Scanner;

public class Ejemplo4_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SU = 0;
        int NU = sc.nextInt();
        int ED = 0;
        for(int C = 0; C < NU ; C++){
            ED = sc.nextInt();
            SU = SU + ED;
        }
        double PR = SU / NU;
        System.out.println("El promedio es " + PR);
    }
}