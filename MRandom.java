public class MRandom{
	Random2 ran;
	public MRandom(){
		ran=new Random2();
	}
	public int getRandom(int n)throws InvalidSizeException{
		n=n+1;
		if(n>100000)
			throw new InvalidSizeException("número muy grande");
		int[] arreglo=new int[n];
		for(int i=0;i<arreglo.length;i++)
			arreglo[i]=i;
		String s=Integer.toString(n);
		int azar= ran.getRandom((s.length()+1));
		azar=azar%(n-1);//cam
	//	azar=azar%n;//cam
		azar++;//cam
		return arreglo[azar];
	}
}
