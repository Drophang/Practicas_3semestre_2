public class Ejercicio_1 {
    public static int sumaRecursiva(int n) {
        if ( n == 0){
            return 0;
        }else {
            return n  + sumaRecursiva(n - 1);
        }
    }

    public static void main(String[] args) {
        int numeros = 5;
        int resultado = sumaRecursiva(numeros);
        System.out.println("la suma de los numeros de 1 a " + numeros + "es" + resultado);
    }
}
