public class Alumno {
    private String A1;
    private String A2;
    private String No;
    private int CI;
    public Alumno (String A1,String A2, String No,int CI) {
        this.A1 = A1;
        this.A2 = A2;
        this.No = No;
        this.CI = CI;
    }
    public void CambiarEstudiante(String a1,String a2,String no,int ci){
        A1 = a1;
        A2 = a2;
        No = no;
        CI = ci;
    }
}
