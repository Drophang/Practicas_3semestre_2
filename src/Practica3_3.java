import java.util.Scanner;

public class Practica3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PAG = 0;
        int X = sc.nextInt();
        if(X >= 1000){
            PAG = X * 0.85;
        }else {
            PAG = X * 0.90;
        }
        System.out.println("La paga es " + PAG);
    }
}
