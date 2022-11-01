public class Grafo{
 
    public void mostrarMatriz(Vertice paramVertices[], int paramMatrizAdyacencia[][])  { 
         System.out.print("  | ");

        for (int i = 0; i < paramVertices.length; i++) {
            System.out.print(paramVertices[i].getNombreVertice() + " ");
        }
        System.out.println();
        for (int i = 0; i < paramMatrizAdyacencia.length; i++) {
            
            System.out.print(paramVertices[i].getNombreVertice() + " | ");

            for (int j = 0; j < paramMatrizAdyacencia.length; j++) {
                System.out.print(paramMatrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }    
    }

    public void agregarVertice(Vertice paramVertices[],Vertice paramVertice, int paramPosicion){
        paramVertices[paramPosicion] = paramVertice;
    }

   public void agregarRelacion(int paramNumero1,int paramNumero2,int paramMatrizAdyacencia[][]){
        paramMatrizAdyacencia[paramNumero1][paramNumero2] = 1;
        System.out.println("Vertice en fila "+(paramNumero1+1)+"--> con vertice en columna "+(paramNumero2+1));
    }

}

