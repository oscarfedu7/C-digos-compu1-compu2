import java.util.Arrays;

public class ParesImpares {
   public static void main( String[] args ) {
      int[] a = {1,3,5,2,4,6};
      revisa( a );
      int[] b = {2,4,6,1,3,5};
      revisa( b );
      int[] c = {1,3,5,7,9,11};
      revisa( c );
      int[] d = {3,4,6,1,5,2};
      revisa( d );
      int[] e = {8,6,4,2,0};
      revisa( e );
   }
   public static void revisa( int a[] ) {
      System.out.println("Original: "+Arrays.toString(a));
      parImpar( a );
      System.out.println("Ordenado: "+Arrays.toString(a)+"\n");
   }

   public static void parImpar( int a[] ) {
      parImpar( a, a.length );
   }
   public static int parImpar(int a[], int n){
	if(n==1){
		if(a[0]%2==1)
			return 0;
		else
			return 1;
	}
	else{
		int i=parImpar(a,n-1);
		if(a[n-1]%2==0){
			int temp=a[n-1];
			a[n-1]=a[i];
			a[i]=temp;
			i++;
		}
		return i;
	}
  }
}
