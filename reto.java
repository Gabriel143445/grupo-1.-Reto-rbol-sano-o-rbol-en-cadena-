package reto;

import arboles.negocio.ArbolBinario;
import arboles.modelo.Nodo;

public class MainReto {

    public static void main(String[] args) {
        System.out.println("===== PARTE 1: CONSTRUIR ARBOL A =====");
        ArbolBinario<String> arbolA = new ArbolBinario<>();
        
        Nodo<String> raizA = arbolA.crearRaiz("LTX");
        Nodo<String> atf = arbolA.agregarIzquierdo(raizA, "ATF");
        Nodo<String> mch = arbolA.agregarDerecho(raizA, "MCH");
        
        arbolA.agregarIzquierdo(atf, "TUA");
        arbolA.agregarDerecho(atf, "IBB");
        
        Nodo<String> snc = arbolA.agregarIzquierdo(mch, "SNC");
        arbolA.agregarDerecho(mch, "OCC");
        
        arbolA.agregarIzquierdo(snc, "LGQ");

        System.out.println("\n===== PARTE 2: CONSULTAR ARBOL A =====");
        System.out.println("Raiz: " + arbolA.getRaiz().getDato());
        System.out.println("Cantidad de nodos: " + arbolA.contarNodos());
        System.out.println("Cantidad de hojas: " + arbolA.contarHojas());
        System.out.println("Altura: " + arbolA.altura());
        System.out.println("Grado de LTX: " + raizA.grado());
        System.out.println("Grado de SNC: " + snc.grado());

        System.out.println("\n===== PARTE 3: CONSTRUIR ARBOL B Y DECIDIR =====");
        ArbolBinario<String> arbolB = new ArbolBinario<>();
        
        Nodo<String> raizB = arbolB.crearRaiz("GPS");
        Nodo<String> scy = arbolB.agregarDerecho(raizB, "SCY");
        Nodo<String> mrr = arbolB.agregarDerecho(scy, "MRR");
        Nodo<String> ptz = arbolB.agregarDerecho(mrr, "PTZ");
        arbolB.agregarDerecho(ptz, "TPN");

        System.out.println("Es el Arbol A una cadena? " + esCadena(arbolA));
        System.out.println("Es el Arbol B una cadena? " + esCadena(arbolB));

        System.out.println("\n===== CASOS LIMITE =====");
        
        ArbolBinario<String> arbolVacio = new ArbolBinario<>();
        System.out.println("Arbol vacio es cadena? " + esCadena(arbolVacio));
        
        ArbolBinario<String> arbolUnNodo = new ArbolBinario<>();
        arbolUnNodo.crearRaiz("UNICO");
        System.out.println("Arbol de un solo nodo es cadena? " + esCadena(arbolUnNodo));
        
        try {
            arbolA.agregarIzquierdo(raizA, "ERROR");
        } catch (Exception e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }

    public static boolean esCadena(ArbolBinario<String> arbol) {
        if (arbol.estaVacio()) {
            return false;
        }
        return arbol.altura() == (arbol.contarNodos() - 1);
    }
}
