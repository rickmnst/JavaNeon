package vetores;

import java.util.Scanner;

public class ExVetor02 {
	public static void main(String[] args) {
		String [] v = new String [10];
		int vetor;
		Scanner teclado = new Scanner(System.in);
		for (int i = 0; i<v.length; i++){
			System.out.println("Atribua um nome para seu vetor:");
			v[i] = teclado.next();
			System.out.println(v[i]);
		}
	}
}
