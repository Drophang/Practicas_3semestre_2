import java.util.Scanner;

public class Matrices_5_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Not[][] = new int[3][4];
        int E = 0;
        for (int i = 0;i < 3;i++){
            for (int j = 0;j < 4;j++){
                System.out.println("Ingrese la nota ");
                switch (j+1){
                    case 1:
                        System.out.println("Fisica");
                        break;
                    case 2:
                        System.out.println("Quimica");
                        break;
                    case 3:
                        System.out.println("Etica");
                        break;
                    case 4:
                        System.out.println("Historia");
                        break;
                    default:
                        System.out.println("?");
                        break;
                }
                E = sc.nextInt();
                Not[i][j] = E;
            }
        }
    }
}
