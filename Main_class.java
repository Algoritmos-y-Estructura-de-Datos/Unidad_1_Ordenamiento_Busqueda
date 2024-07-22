
// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Ordenamiento;

import java.util.Arrays;
import java.util.Random;


public class Main_class {
	
	
	public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i) 
            System.out.print(arr[i] + " ");
        
        System.out.println();
    }
	
	///////////////////////////////////////////////////////////////////////////////

	public static void main(String args[]) {
		int [] arrayA = {90, 94,11,96,12, 35, 19, 95, 28, 58, 41, 75, 14};
		
		Metodos_Ordenamiento obj_ordena = new Metodos_Ordenamiento();
		obj_ordena.bubbleSort(arrayA);
		printArray(arrayA);
		
    }
}		
		//int [] arrayA = {63,39,80,11,14,8,4,6,2};
		//int [] arrayA = {3, 10, 7, -1, 31, 22, 14, 25};
		//int [] arrayA = {73,67,56,32,52,41,83,37,32,10};
		//int [] arrayA = {8,4,6,2};

        //int longitudArray =5 ;

        // Crear un array de enteros con números aleatorios entre 0 y 99
        // int[] numerosAleatorios = new Random().ints(longitudArray, 0, 100).toArray();
        //System.out.println("Array de números aleatorios: " + Arrays.toString(numerosAleatorios));
		
		//=======================

		
		
/*		arrayA = metodosOrdenamiento.selectionSort(arrayA);
		MyGenericMethods.printArray(arrayA);
		MyGenericMethods.printArray(metodosOrdenamiento.shell(arrayA));

		
        System.out.println(metodosBusqueda.busquedaSecuencial(arrayA,67));

	    */

