

// Implentado por: Vinicio Changoluisa
// Diciembre 2023

package Ordenamiento;

public class Metodos_Ordenamiento {

	//método de ordenamiento por inserción
	public int[] insertionSort(int[] arrayA) {
		int i, j, aux;
		for(i=1;i<arrayA.length;i++) {
			j=i;
			aux = arrayA[i];
			while(j>0 && aux<arrayA[j-1]) {
				arrayA[j]=arrayA[j-1];
				j--;
			}
			arrayA[j]=aux;
		}	
		return arrayA;
	}
 	
	
	// método de ordenamiento por selección
	public int[] selectionSort(int [] arrayA) {
		int i, j, n, indiceMenor,aux;
		n=arrayA.length;
		for(i = 0;i<n-1;i++){
			indiceMenor = i;
			for(j = i;j<n;j++){
				if (arrayA[j]<=arrayA[indiceMenor]) 
					indiceMenor=j;

			}
			if(i!=indiceMenor) {
			aux = arrayA[i];
			arrayA[i] = arrayA[indiceMenor];
			arrayA[indiceMenor]=aux;
			}
			
		}		
		return arrayA;
	}
	
	
	// método de ordenamiento por burbuja
	public int[] bubbleSort(int [] arrayA) {
		int i, j, aux;
		for (i=0;i<arrayA.length-1;i++) {
			for(j=0; j<arrayA.length -i-1;j++) {
				if (arrayA[j+1]<arrayA[j]) {
					aux = arrayA[j+1];
					arrayA[j+1] = arrayA[j];
					arrayA[j] = aux;
				}
			}
		}
		return arrayA;
	}
	
	//======================================================0
    //Algoritmos de ordenación eficiente 
	//======================================================0
	
	public int[] merge(int arr[], int l, int m, int r){
			int n1 = m - l + 1;
			int n2 = r - m;

			int L[] = new int[n1];
			int R[] = new int[n2];

			for (int i = 0; i < n1; ++i)
				L[i] = arr[l + i];
			for (int j = 0; j < n2; ++j)
				R[j] = arr[m + 1 + j];

			int i = 0, j = 0, k = l;
			while (i < n1 && j < n2) {
				if (L[i] <= R[j]) {
					arr[k] = L[i];
					i++;
				}
				else {
					arr[k] = R[j];
					j++;
				}
				k++;
			}

			while (i < n1) {
				arr[k] = L[i];
				i++;
				k++;
			}

			while (j < n2) {
				arr[k] = R[j];
				j++;
				k++;
			}
			return arr;
		}

	public int [] mergeSort(int arr[], int l, int r)	{
		int [] myarray= {};
		if (l < r) {
			int m=0;
				m = l + (r - l) / 2;
				mergeSort(arr, l, m);
				mergeSort(arr, m + 1, r);
				myarray = merge(arr, l, m, r);
			}
			return myarray;
		}

	
	public int [] shell1(int A[]) {
        int salto, aux, i;
        boolean cambios;
  
        for (salto = A.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {                                            
                cambios = false;
                System.out.print("salto: "+salto+"  |||  ");
                for (i = salto; i < A.length; i++){
                    if (A[i - salto] > A[i]) {       
                        aux = A[i];                  
                        A[i] = A[i - salto];
                        A[i - salto] = aux;
                        cambios = true;                                                 
                    }
                }
            }
        }
    return A;    
	}
	
	public int[] shell(int A[]) {
	    int aux = 0, j;
	    for (int gap = A.length / 2; gap > 0; gap = gap == 2 ? 1 : (int) (gap / 2)) {
	        for (int i = gap; i < A.length; i++) {
	            aux = A[i];
	            j = i;
	            for (; j >= gap && A[j - gap] > aux; j -= gap) {
	                A[j] = A[j - gap];
	            }
	            A[j] = aux;
	        }
	    }
	    return A;
	}

	
	


	
}
