import java.io.*;
import java.nio.file.*;
import java.util.*;
import static java.nio.file.StandardOpenOption.*;
public class Random2{
        private int random;
        private double pi;
        private int i;
        private String s, ss, al;
        private char[] pi2;
	public int getRandom(int k)throws InvalidSizeException{
		Path archivo = Paths.get("variable.txt");
                try{
                        InputStream entrada = new
                        BufferedInputStream(Files.newInputStream (archivo));
                        BufferedReader lector = new BufferedReader(new InputStreamReader(entrada));
                        s = lector.readLine();
                        i=Integer.parseInt(s);
                        i=i+10;
                        lector.close();
                }
                catch(Exception e){
                        System.out.println("Mensaje: "+ e);
                }
                //llllllllllllllllllllll
                if(i>100000000){/**después cuardar otra variable en archivos para que no se repitan números.**/
                        i=11;
                }
                for(int l=1;l<=i;l++){
                        pi=(pi+((7)*((Math.pow(-1, l+1))/((2*l)-1))));
                }
                pi=pi+(((i+13)*(i+1))/2);
                pi=pi/104729;
                s=Double.toString(pi);
                pi2=s.toCharArray();
                //ooooooooooooooooooooooo
		 try{
                        OutputStream salida = new BufferedOutputStream (Files.newOutputStream(archivo, CREATE)); 
                        BufferedWriter  escritor = new BufferedWriter(new OutputStreamWriter(salida));
                        ss  =""+i;
                        escritor.write(ss, 0, ss.length());
                        escritor.newLine();
                        escritor.close();
                }
                catch (Exception e){
                        System.out.println( " Mensaje : "  +  e);
                }

                //oooooooooooooooooooooo
		//qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
                if(k>10 || k<1)
                        throw new InvalidSizeException("cantidad de digitos invalido");
		al="";
//		System.out.println("EL I ES: "+getI());
                for(int a=(pi2.length)-1; pi2[a]!='.'; a--){
                        if(al.length()!=k)
                                al=al+pi2[a];
                        else
                                return Integer.parseInt(al);
                }
                return 1;
        }
        public void tooString(){
                System.out.println(s);
        }
	public int getI(){
		return i;
	}
}

