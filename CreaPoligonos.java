import java.util.Scanner;
public class CreaPoligonos{
	public static void main(String[]args){
		double area=0, perimetro=0;
		Scanner entr= new Scanner(System.in);
		System.out.println("¿T o E?");	
		char d=entr.nextLine().toUpperCase().charAt(0);
		if(d=='T'){
			System.out.println("Lados:");  
			Triangulo t=new Triangulo(entr.nextDouble(),entr.nextDouble(),entr.nextDouble());
			area=t.area();
			perimetro=t.perimetro();
		}
		else if(d=='E'){
			System.out.println("Lado:");  
                        TrianguloE t=new TrianguloE(entr.nextDouble());
			area=t.area();
			perimetro=t.perimetro();
		}
		System.out.println("Area: "+area+" perimetro: "+perimetro);
		System.out.println("Coordenadas de un priangulo: ");
		System.out.print("x1: ");
		double x1=entr.nextDouble();
		System.out.println("y1: ");
		double y1=entr.nextDouble();
		System.out.println("x2: ");
		double x2=entr.nextDouble();
		System.out.println("y2: ");
		double y2=entr.nextDouble();
		System.out.println("x3: ");
		double x3=entr.nextDouble();
		System.out.println("y3: ");
		double y3=entr.nextDouble();
		double l1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double l2=Math.sqrt((x3-x1)*(x3-x1)+(y3-y1)*(y3-y1));
		double l3=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		Triangulo t=new Triangulo(l1,l2, l3);
		double area2=t.area();
		double perimetro2=t.perimetro();
		if(area2==area && perimetro==perimetro2)
			System.out.println("Son iguales");
		else
			System.out.println("No son iguales");
	}
}
