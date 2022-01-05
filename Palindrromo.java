import java.util.Scanner;
public class Palindrromo{
	public static void main(String[]args){
		Scanner entr=new Scanner(System.in);
		System.out.print("Introduce el palindromo: ");
		String pal=entr.nextLine();
		System.out.println();
		pal=pal.toLowerCase();
		pal=pal.replace('á','a');
		pal=pal.replace('é','e');
		pal=pal.replace('í','i');
		pal=pal.replace('ó','o');
		pal=pal.replace('ú','u');
		boolean esPalindromo=EsPalindromo(pal);
		if(esPalindromo){
			System.out.println("Es palindromo");
		}
		else{
			System.out.println("No es palindromo");
		}
	}
	public static boolean EsPalindromo(String pa){
		int h=(pa.length()-1);
		for(int i=0; i<pa.length();i++){
			if(pa.charAt(i)==' '){
				i++;
			}
			if(pa.charAt(h)==' '){ 
                                h--;
			}
			if(pa.charAt(i)!=pa.charAt(h)){
				return false;
			}
			if(h==i){
				return true;
			}
			h--;
		}
		return false;
	}
}

