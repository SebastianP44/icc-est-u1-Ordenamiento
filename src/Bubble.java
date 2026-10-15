public class Bubble {
    public int[] sort(int[] arreglo){

        for ( int i = 0; i < arreglo.length - 1; i++){
            for (int j = 1; j < arreglo.length; j++){
                if (arreglo[j - 1] > arreglo[j]){
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;

                }
            }
            }
        return null;


    }
    
}


