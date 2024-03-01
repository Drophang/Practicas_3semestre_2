import java.util.Scanner;

public class Ejemplo3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String R = "Positivo";
        if (num >= 0){
            R = "Positivo";
        }else {
            R = "Negativo";
        }
        System.out.println("El numero es " + R);
    }
}
