import java.util.Scanner;

public class Palindromos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P = sc.nextLine();
        String q = "";
        char F ;
        for (int i = 0;i < P.length();i++){
            F = P.charAt(P.length()-1-i);
            q = q + F;
            System.out.println(q);
        }
        System.out.println(q);
        if (P.equals(q)){
            System.out.println("es palíndroma");
        }else {
            System.out.println("No es palíndroma");
        }
    }
}
