public class PersegiPanjang 
{

	double panjang;
	double lebar;
	
	PersegiPanjang(double p, double l){
		panjang = p;
		lebar = l;
	}
	
	double luas(){
		return panjang * lebar;
	}
}