public class Segitiga
{

	double alas;
	double tinggi;
	double def;

	Segitiga(double a, double t){
		alas = a;
		tinggi = t;
		def = 0.5;
	}
	
	double luas (){
		return def*alas*tinggi;
			
	}
}