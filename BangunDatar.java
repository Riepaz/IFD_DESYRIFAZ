import java.util.Scanner;
public class BangunDatar
{
	public static void main(String []args)
	{
			
		System.out.println("\n==============================================="); 
		System.out.println("		BANGUN DATAR");
		System.out.println("===============================================\n");

		Inputan inp = new Inputan();
		
		System.out.println("\n\nJAJAR GENJANG");
		inp.InputJajarGenjang();
		
		System.out.println("\n\nSEGITIGA");
		inp.InputSegitiga();
		
		System.out.println("\n\nPERSEGI PANJANG");
		inp.InputPersegiPanjang();		
		
		System.out.println("\n\nPERSEGI");
		inp.InputPersegi();
			
	}
}