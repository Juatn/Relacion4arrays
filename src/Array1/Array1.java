package Array1;

public class Array1 {

	public static void main(String[] args) {
		
		int [] arrayparaconcatenar1={45,10,5,4,2,1,5};
		int [] arrayparaconcatenar2={34,10,5,5,2,1,5};
		int []C=ConcatenaArraysPro(arrayparaconcatenar1,arrayparaconcatenar2);
		
		for (int i=0;i<C.length;i++){
		System.out.print(C[i]);
		}

	}
	public static int[]ConcatenaArraysPro(int[]array1,int[]array2){
		
		int [] arrayconcatenado=new int[array1.length+array2.length];
		
		System.arraycopy(array1, 0, arrayconcatenado, 0, array1.length);
		System.arraycopy(array2,0,arrayconcatenado,array1.length,array2.length);
		
	  
		return arrayconcatenado;
	}
	
}
