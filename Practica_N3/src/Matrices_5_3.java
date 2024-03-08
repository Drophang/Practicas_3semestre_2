import java.util.Scanner;

public class Matrices_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos choferes hay?");
        int N = sc.nextInt();
        int K[] = new int[N];
        String Nom [] = new String[N];
        for (int i = 0; i < N-1;i++){
            System.out.println("ingrese el nombre");
            Nom[i] = sc.nextLine();
            System.out.println("ingrese su cantidad de kilometros recorridos");
            K[i] = sc.nextInt();
        }
        System.out.println("Numero --- Kilometros recoridos --- Nombre");
        for (int i = 0;i < N-1;i++ ){
            System.out.println(i + "    " + K[i] + "    " + Nom[i]);
        }
    }
}