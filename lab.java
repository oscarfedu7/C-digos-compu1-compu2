import java.util.Scanner;
public class lab{
	public static void main(String[]args){
		final double MA=0.1347;
		//Arreglo de masas primas
		double[] masaP=new double[8];
		double m=0.0175;
		for(int j=0; j<masaP.length;j++){
			masaP[j]=(m+0.005);
			m=m+0.005;
		}
		//muestra masas primas
/*		for(int k=0;k<masaP.length;k++){
			System.out.println((k+1)+") Masa prima: "+masaP[k]+" kg");
		}
*/
		Scanner entr=new Scanner(System.in);
		double[] acele=new double[8];
		//pedir aceleraciones
		for(int i=0;i<acele.length;i++){
			System.out.print("Aceleracion "+(i+1)+": ");
			acele[i]=entr.nextDouble();
		}

		//coeficientes diferentes
		double[] coefi=new double[8];
		for(int l=0; l<coefi.length;l++){
			coefi[l]=(masaP[l]/MA)-(((MA+masaP[l])*acele[l])/(MA*9.78));
		}
		//promedio de coeficiente
		double coeficienteP=0;
		for(int d=0; d<coefi.length;d++){//sumas
			coeficienteP=coeficienteP+coefi[d];
		}
		coeficienteP=coeficienteP/8;

		//Incertidumbre
		double[] incertidumbre=new double[8];
		for(int i=0; i<incertidumbre.length;i++){
			incertidumbre[i]=coefi[i]-coeficienteP;
		}
		double inceP=0;
		for(int i=0; i<incertidumbre.length;i++){
			inceP=inceP+(incertidumbre[i]*incertidumbre[i]);
		}
		inceP=inceP/8;
		inceP=Math.sqrt(inceP);
		System.out.println("Coeficiente promedio +- incertidumbre: "+coeficienteP+" +- "+inceP);
	}
}
