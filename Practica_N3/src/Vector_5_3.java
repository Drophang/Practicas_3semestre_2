import java.util.Scanner;

public class Vector_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V1 [] = new int[10];
        int V2 [] = new int[10];
        int V3 [] = new int[10];
        int E = 0;
        for (int i = 0; i < V3.length; i++){
            System.out.println("ingrese para el primer vector");
            E = sc.nextInt();
            V1[i] = E;
            System.out.println("ingrese para el segundo vector");
            E = sc.nextInt();
            V2[i] = E;
            V3[i] = V1[i] + V2[i];
        }
        for (int i = 0; i < V3.length;i++){
            System.out.println( i+ " " + V3[i]);
        }
    }
}
