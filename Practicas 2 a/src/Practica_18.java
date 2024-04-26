import java.util.Scanner;
import java.util.Stack;

public class Practica_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String A = sc.nextLine();
        pila.add(A);
        A = sc.nextLine();
        pila.add(A);
        A = sc.nextLine();
        pila.add(A);
        String V = "";
        for (String i:pila) {
            for (int j = 0;j < i.length()-1;j++){
                V = V + i.charAt((i.length()-1)-j);
               // System.out.println(V);//
            }
            V = V + i.charAt(i.length()-1);
            if (i.equals(V)){
                System.out.println(i + " es palindromo");
            }
            V = "";
        }
    }
}
