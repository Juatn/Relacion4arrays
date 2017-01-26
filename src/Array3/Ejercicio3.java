package Array3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numero=0;
		int posi=0;
		int[] array13={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int[] C=InsertaEnArray(array13,SaberNumero(numero),SaberPosicion(posi));
		
		for (int i=0;i<C.length;i++){
			System.out.print(C[i]+" ");
		}
		

	}
	//FUNCION PARA INSERTAR VALOR EN ARRAY
	public static int[] InsertaEnArray(int[]array1,int numero,int posicion){
		int cont=0;
		 int [] b= CopiaArray(array1);
		
		
		for (int i=0;i<b.length;i++){
		if(i==posicion)
		{
			b[i]=numero;
		}
		else
		{
		b[i]=array1[cont];
		cont++;
		}		
			}
			return b;
		}
		
		
	
	//fucion para saber numero
public static int SaberNumero(int num){
	Scanner teclado=new Scanner(System.in);
	int numero=0;
	
	Boolean error=false;//centinela
	String cadena="";
	
	do{
		System.out.println("Introduce numero que desea introducir en el array");
		cadena=teclado.nextLine();
		try{
			numero=Integer.parseInt(cadena); //intentamos convertirlo en int.
			error=true; //salir del bucle 
		}catch (NumberFormatException e){
			error=false;
			System.out.println("ERROR: dato incorrecto");
		}
	}while(error==false);
	return numero;
}
//funcion para saber posicion
public static int SaberPosicion(int pos){
	Scanner teclado=new Scanner(System.in);
	int posicion=0;
	Boolean error=false;//centinela
	String cadena="";
	
	do{
		System.out.println("Introduce Posicion :");
		cadena=teclado.nextLine();
		try{
			posicion=Integer.parseInt(cadena); //intentamos convertirlo en int.
			error=true; //salir del bucle 
		}catch (NumberFormatException e){
			error=false;
			System.out.println("ERROR: dato incorrecto");
		}
	}while(error==false);
	return posicion;
}
public static int[] CopiaArray(int[]copy){
	 
	 int [] arraycopiar =Arrays.copyOf(copy,copy.length+1);
	 
	 
			   
	 return arraycopiar;
}

}
