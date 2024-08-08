//Implentado por: Vinicio Changoluisa
//Diciembre 2023


package Ordenamiento_y_busqueda;
import java.util.ArrayList;

public class Metodos_Busqueda {
	
 public int busquedaSecuencial(int elementos[], int x){
 	for(int i=0;i<elementos.length;i++) {
 		if (elementos[i]==x) {
 			return i;   
 	}    			System.out.print("hola "+i);

 		
 	}
 	return -1;
 }

	
	
 public int busquedaBinaria(int elementos[], int x){
     int l = 0, r = elementos.length - 1, m;
     while (l <= r) {
         m = l + (r - l) / 2;
         if (elementos[m] == x)
             return m;

         if (elementos[m] < x)
             l = m + 1;
         else
             r = m - 1;
     }
     return -1;
 }

 public int busquedaInterpolacion(int[] elementos, int clave) {
     int inicio = 0;
     int fin = elementos.length - 1;

     while (inicio <= fin && clave >= elementos[inicio] && clave <= elementos[fin]) {
         int posicion = inicio + (((clave - elementos[inicio]) * (fin - inicio)) / (elementos[fin] - elementos[inicio]));

         if (elementos[posicion] == clave) {
             return posicion; 
         }

         if (elementos[posicion] < clave) {
             inicio = posicion + 1; 
         } else {
             fin = posicion - 1; 
         }
     }

     return -1; 
 }
 

}
