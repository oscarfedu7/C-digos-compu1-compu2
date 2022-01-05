import java.util.*;
public class PonerPedido{
	public static void main(String[]args){
		int i=0;
		double total=0;
		Scanner entr=new Scanner(System.in);
		while(i==0){
			System.out.println("Numero del artículo: ");
			int num=entr.nextInt();
			System.out.println();
			System.out.print("Cantidad: ");
			int cantidad =entr.nextInt();
			try{
				total=total+SubTotal(num, cantidad);
			}
			catch(ExcepciónPedido error){
				System.out.println(error.getMessage());
			}
			System.out.println("1 para pedir 2 para sacar el total");
			int d=entr.nextInt();
			if(d!=1){
				System.out.println("Total: "+total);
				i=1;
			}
		}
	}
	public static double SubTotal(int n, int c) throws ExcepciónPedido{
		String na=""+n, cc=""+c;
		char nn=na.charAt(0), ca=cc.charAt(0) ;
		double sub=0;
		if(Character.isDigit(nn)==false)
			throw new ExcepciónPedido(0);
		else if(Character.isDigit(ca)==false)
                        throw new ExcepciónPedido(1);
		else if(n<0)
                        throw new ExcepciónPedido(2);
		else if(n>9999)
                        throw new ExcepciónPedido(3);
		else if(c<1)
                        throw new ExcepciónPedido(4);
		else if(c>12)
                        throw new ExcepciónPedido(5);
		else if(n!=111 && n!=222 && n!=333 && n!=444)
                        throw new ExcepciónPedido(6);
		else{
			if(n==111)
				sub=12.34*c;
			else if(n==222)
				sub=23.45*c;
			else if(n==333)
				sub=34.56*c;
			else 
				sub=54.67*c;
		}
		return sub;
	}
}
				



