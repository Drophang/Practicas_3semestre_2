import java.util.Scanner;

public class Ejemplo3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int M = 0;
        if(A > B ){
            M = A;
        }else{
            M = B;
        }
        System.out.println("El mayor es " + M );
    }
}
