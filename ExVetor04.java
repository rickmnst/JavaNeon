package vetores;

import java.util.Scanner;

public class ExVetor04 {

	public static void main(String[] args) {
		int [] v = new int [15];
		Scanner teclado = new Scanner(System.in);
		for (int i=0; i<=v.length; i++){
			System.out.println("Informe um valor para seu vetor receber:");
			v[i] = teclado.nextInt();
		}
	}
}
