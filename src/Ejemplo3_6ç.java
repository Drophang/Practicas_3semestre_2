import java.util.Scanner;

public class Ejemplo3_6ç {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NP = sc.nextInt();
        double TOT = 0;
        if (NP > 3000) {
            TOT = NP * 75;
        }else {
            if (NP > 200){
                TOT = NP*85;
            }else {
                TOT = NP*95;
            }
        }
        System.out.println("El total es " + TOT);
    }
}
