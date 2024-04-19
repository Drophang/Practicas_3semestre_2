public class Practica_4_1 {
    private String N;
    private String A1;
    private String A2;
    public Practica_4_1 (String N,String A1,String A2){
        this.N = N;
        this.A1 = A1;
        this.A2 = A2;
    }

    public String getN() {
        return N;
    }

    public String getA1() {
        return A1;
    }

    public String getA2() {
        return A2;
    }

    @Override
    public String toString() {
        return "Practica_4_1{" +
                "N='" + N + '\'' +
                ", A1='" + A1 + '\'' +
                ", A2='" + A2 + '\'' +
                '}';
    }
}
