package asal_sayi_bulma;

public class asal_sayi_bulma {

	public static void main(String[] args) {

		// 1 ve 100 arasındaki asal sayıları bulan program.

		boolean asal;
		int i, a;

		for (i = 2; i <= 100; i++) {
			asal = true;

			for (a = 2; a < i; a++) {

				if (i % a == 0) {
					asal = false;
					break;
				}

			}

			if (asal) {
				System.out.print(i + " ");

			}

		}
	}

}
