public class Selection {

    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;
        for (int i = 0; i < arreglo.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arreglo.length - 1; j++) {
                comparaciones++;
                if (arreglo[j] < arreglo[min]) {
                    min = j;
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[min];
                    arreglo[min] = aux;
                    cambios++;
                    System.out.println("Pasada = " + i + " | Cambio " + arreglo[i] + "<->" + arreglo[min]); 
                }
            }
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
        System.out.println("Orden Asc");
    }

}
