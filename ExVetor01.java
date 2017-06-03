package vetores;

import java.util.Scanner;

public class ExVetor01 {

	public static void main(String[] args) {
		int [] v = new int [10];
		int vetor;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i<v.length; i++){
			System.out.println("Atribua um valor para seu vetor:");
			v[i] = teclado.nextInt();
			System.out.println(v[i]);
		}
	}

}
