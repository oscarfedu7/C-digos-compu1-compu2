import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardOpenOption.*;

public class Variable{
	public static void main(String [] args){
		Path archivo  =  Paths.get("variable.txt") ;
		String s ;
		try{
			OutputStream salida = new BufferedOutputStream (Files.newOutputStream(archivo, CREATE)); 
			BufferedWriter  escritor = new BufferedWriter(new OutputStreamWriter(salida));
			s  = "0";
			escritor.write(s, 0, s.length());
			escritor.newLine();
			escritor.close();
		}
		catch (Exception e){
			System.out.println( " Mensaje : "  +  e);
		}
	}
}
