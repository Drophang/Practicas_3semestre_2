public class Ejemplo4_2{
public static void main(String[] args) {
    int SU = 0;
    int C = 1;
    int VA = 0;
    while(C < 10){
        SU = SU + VA;
        C = C + 1;
    }
    System.out.println("La suma total es " + SU);
}
}