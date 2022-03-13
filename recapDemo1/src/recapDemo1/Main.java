package recapDemo1;

public class Main {

	public static void main(String[] args) {
		int sayi1 = 20;
		int sayi2 = 19;
		int sayi3 = 2;
		int enbüyük = sayi1;
		if (enbüyük < sayi2) {
			enbüyük =sayi2;
		}
		if (enbüyük < sayi3) {
			enbüyük =sayi3;
		}
		System.out.println("en büyük sayı=" + enbüyük);
	}

}
