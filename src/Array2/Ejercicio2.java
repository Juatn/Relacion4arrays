package Array2;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int array1[]={435,23452,65,12,466,1,2,3,5,6,7,8,432,6,8,9,9,5,43,2};
		
		int[] arrayclonado=CopiaArray(array1);
		
		
		for(int i=0;i<arrayclonado.length;i++){
		System.out.print(arrayclonado[i]+" ");}

	}
 public static int[] CopiaArray(int[]copy){
	 
	 int [] arraycopiar =Arrays.copyOf(copy,copy.length);
	 
	 
			   
	 return arraycopiar;
 }
}
