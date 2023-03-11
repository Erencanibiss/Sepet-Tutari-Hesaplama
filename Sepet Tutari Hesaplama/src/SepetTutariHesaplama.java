import java.util.Scanner;

public class SepetTutariHesaplama 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		double ispanak = 3.33;
		double salatalik = 2.31;
		double domates = 1.50;
		double cilek = 5.00;
		System.out.print("Ispanak kac kilo : ");
		double ikg = scan.nextDouble();
		System.out.print("Salatalik kac kil5o : ");
		double skg = scan.nextDouble();
		System.out.print("Domates kac kilo : ");
		double dkg = scan.nextDouble();
		System.out.print("Cilek kac kilo : ");
		double ckg = scan.nextDouble();
		double toplam = 0.0;
		toplam += (ispanak * ikg);
		toplam += (salatalik * skg);
		toplam += (domates * dkg);
		toplam += (cilek * ckg);
		System.out.println("Toplam Tutar : " + toplam);
		
	}
}