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
}