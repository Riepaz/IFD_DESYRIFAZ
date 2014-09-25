import java.util.Scanner;
public class Inputan
{
	Scanner in = new Scanner(System.in);
	
	public void InputJajarGenjang()
	{
		double a,t;
		System.out.print("Masukan alas : "); 
			a = in.nextDouble();

		System.out.print("Masukan tinggi : "); 
			t = in.nextDouble();
			
		JajarGenjang Jr = new JajarGenjang(a,t);
			System.out.print("Luas Jajar Genjang : "+Jr.luas());
	}
	
		public void InputPersegiPanjang()
	{
		double p, l;
		
		System.out.print("Masukan Panjang : "); 
			p = in.nextDouble();

		System.out.print("Masukan Lebar : "); 
			l = in.nextDouble();
			
			PersegiPanjang Pp = new PersegiPanjang(p,l);
			System.out.print("Luas Persegi Panjang : "+Pp.luas());
	}
	
		public void InputSegitiga()
	{
	
		double a,t;
		System.out.print("Masukan alas : "); 
			a = in.nextDouble();

		System.out.print("Masukan tinggi : "); 
			t = in.nextDouble();
			
		Segitiga SigOne = new Segitiga(a,t);
			System.out.print("Luas Segitiga : "+SigOne.luas());
		
	}
	
	public void InputPersegi()
	{
		double s;
		System.out.print("Masukan sisi : "); 
			s = in.nextDouble();

		Persegi Pr = new Persegi(s);
			System.out.print("Luas Persegi : "+Pr.luas());
	}
	
	
}