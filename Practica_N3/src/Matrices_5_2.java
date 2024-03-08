import java.util.Scanner;

public class Matrices_5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Caja[][] = new int[4][4];
        int E = 0;
        int S = 0;
        System.out.println("Ingrese los valores");
        for (int i = 0;i < 4;i++){
            for (int j = 0;j < 4;j++){
                E = sc.nextInt();
                if (E > 9 || E < 0) {
                    while (E > 9 || E < 0) {
                        System.out.println("Solo se aseptan numeros entre 0 y 9");
                        E = sc.nextInt();
                    }
                }
                if (Caja[i][j] == 0){
                    S = S +1;
                }
            }
        }
        System.out.println("Hay " + S + " ceros");
    }
}
