public class Arboles_iguales {
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
        ArbolBinario arbol2 = new ArbolBinario();
        arbol2.insertar(50);
        arbol2.insertar(30);
        arbol2.insertar(20);
        arbol2.insertar(40);
        arbol2.insertar(70);
        arbol2.insertar(60);
        arbol2.insertar(80);
        System.out.println("Arbol 2 en orden");
        arbol2.imprimirEnOrden();
        if (arbol.sonArbolesIdenticos(arbol.raiz,arbol2.raiz) == true){
            System.out.println("Son iguales");
        }else {
            System.out.println("Son diferentes");
        }
    }
}
