import java.util.Scanner;

public class Vector_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int En = 0;
        int E[] = new int[4];
        System.out.println("Ingrese las edades");
        for (int i = 0; i < E.length;i++){
            En = sc.nextInt();
            E[i] = En;
        }
        for (int i = 0; i < E.length;i++) {
            System.out.println("edad " + (i + 1) + " " + E[i]);
        }
    }
}
