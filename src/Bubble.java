import models.Estudiante;

public class Bubble {
    public void sort(int[] arreglo) {
        int cambios = 0;
        int comparaciones = 0;

        for (int i = 0; i < arreglo.length - 1; i++) {
            System.out.println("Pasada " + i);
            boolean combinaciones = false;
            for (int j = 1; j < arreglo.length - i; j++) {
                comparaciones++;
                if (arreglo[j - 1] > arreglo[j]) {
                    cambios++;
                    combinaciones = true;
                    System.out.println("Cambios: " + cambios);
                    System.out.println("Comparaciones: " + comparaciones);
                    int aux = arreglo[j - 1];
                    arreglo[j - 1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
            if (!combinaciones) {
                break;
            }
        }
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }

    public void sort(Estudiante[] estudiantes) {
        for (int i = 0; i < estudiantes.length; i++) {
            boolean cambio = false;
            for (int j = 0; j < estudiantes.length - 1; j++) {
                if (estudiantes[j].getNota() > estudiantes[j + 1].getNota()) {
                    Estudiante aux = estudiantes[j];
                    estudiantes[j] = estudiantes[j + 1];
                    estudiantes[j + 1] = aux;
                    cambio = true;
                }

            }
            if (!cambio) {
                break;
            }
        }

    }
}
