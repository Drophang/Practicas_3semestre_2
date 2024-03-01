import java.util.Scanner;

public class Ejemplo4_2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int SU = 0;
    int C = 1;
    int VA = 0;
    while(C < 10){
        VA = sc.nextInt();
        SU = SU + VA;
        C = C + 1;
    }
    System.out.println("La suma total es " + SU);
}
}