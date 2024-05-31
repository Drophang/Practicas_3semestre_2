public class Arbol_promedio {
    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);
        System.out.println("Arbol en orden");
        arbol.imprimirEnOrden();
        System.out.println("El promedio del arbol es " + arbol.calcularNivelPromedio(arbol.raiz));
    }
}
