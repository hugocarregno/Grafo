public class App {
    public static void main(String[] args) throws Exception {
        //limpio pantalla 
        limpiarPantalla();
        //especifico la cantidad máxima de Vertices
        int maxVertices = 5;
        //declaro la matriz de adyacencia y la inicializo con su maxima cantidad de vertices
        int matrizAdyacencia[][];
        matrizAdyacencia = new int[maxVertices][maxVertices];
        //creo los objetos tipo vertice 
        Vertice verticeA = new Vertice();
        //establezco su numbre y posicion dentro de la matriz de adyacencia
        verticeA.setNombreVertice("A");
        verticeA.setNumeroVertice(0);
        Vertice verticeB = new Vertice();
        verticeB.setNombreVertice("B");
        verticeB.setNumeroVertice(1);
        Vertice verticeC = new Vertice();
        verticeC.setNombreVertice("C");
        verticeC.setNumeroVertice(2);
        Vertice verticeD = new Vertice();
        verticeD.setNombreVertice("D");
        verticeD.setNumeroVertice(3);
        Vertice verticeE = new Vertice();
        verticeE.setNombreVertice("E");
        verticeE.setNumeroVertice(4);
        //creo el objeto del tipo grafo
        Grafo Grafo = new Grafo();
        //creo un arreglo de vertices para poder referenciar la matriz de adyacencia
        Vertice arrayVertices[];
        arrayVertices = new Vertice[maxVertices];      
        //posiciono los verticesen en el arreglo de vertices para referenciarlos en la matriz de adyacencia 
        Grafo.agregarVertice(arrayVertices, verticeA, verticeA.getNumeroVertice());
        Grafo.agregarVertice(arrayVertices, verticeB, verticeB.getNumeroVertice());
        Grafo.agregarVertice(arrayVertices, verticeC, verticeC.getNumeroVertice());
        Grafo.agregarVertice(arrayVertices, verticeD, verticeD.getNumeroVertice());
        Grafo.agregarVertice(arrayVertices, verticeE, verticeE.getNumeroVertice());
        //muestro la matriz de adyacencia sin relaciones
        Grafo.mostrarMatriz(arrayVertices,matrizAdyacencia);
        int posicionVB = verticeB.getNumeroVertice();
        int posicionVD = verticeD.getNumeroVertice();
        Grafo.agregarRelacion(posicionVB, posicionVD, matrizAdyacencia);
        int posicionVA = verticeA.getNumeroVertice();
        int posicionVC = verticeC.getNumeroVertice();
        Grafo.agregarRelacion(posicionVA, posicionVC, matrizAdyacencia);
        Grafo.mostrarMatriz(arrayVertices,matrizAdyacencia);   

    }
    //creo metodo estatico para limpiar pantalla
    public static void limpiarPantalla(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
