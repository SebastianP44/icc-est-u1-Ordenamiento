import java.util.Arrays;

import models.Estudiante;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjemplosPrimitivos();
        // runEjemplosObjetos();
        runComparators();
    }

    private static void runComparators() {
        int[] original = {5, 6, 4, 1, 2, 3};
        //Arrays.sort -> Ordena arreglos por su oorden natural, en este caso de menor a mayor
        Arrays.sort(original);
        for (int i = 0; i < original.length; i++)
            System.out.println(original[i]);    
    }

    public static void runEjemplosPrimitivos() {
        int [] original = {5, 6, 4, 1, 2, 3};
        int [] b = original.clone();
        int [] c = original.clone();
        Bubble bubble = new Bubble();
        printArreglo(b);
        bubble.sort(b);
        printArreglo(b);

        //Instanciar seleccion
        System.out.println("-- Selection Sort --");
        System.out.println("Original");
        Selection selection = new Selection();
        printArreglo(c);
        selection.sort(c);
        printArreglo(c);

        //Instanciar insertion
        System.out.println("-- Insertion Sort --");
        System.out.println("Original");
        InsertionSort insertion = new InsertionSort();
        printArreglo(original);
        insertion.sort(original);
        printArreglo(original);
    }
    public static void printArreglo(int[] arr){
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " - ");
        System.out.println();
        }

        
        public static void runEjemplosObjetos() {
            Estudiante e1 = new Estudiante("Juan", 10);
            Estudiante [] estudiantes = {e1, 
                new Estudiante("Maria", 7), 
                new Estudiante("Diego", 3.5),
                new Estudiante("Pedro",6.8),
        };
            printArregloEst(estudiantes);
        }
        public static void printArregloEst(Estudiante[] estudiantes){
            for (int i = 0; i < estudiantes.length; i++)
                System.out.print("Estudiante " + estudiantes[i].getName() + ": " + estudiantes[i].getNota() + " - ");
                System.out.println();
                Bubble bubble = new Bubble();
                bubble.sort(estudiantes);
}
}

    

