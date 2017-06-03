package vetores;

import java.util.Scanner;

public class ExVetor05 {
	private static Scanner teclado;

	public static void main(String[] args) {
		int [] v = new int [15];
		int soma=0;
		teclado = new Scanner(System.in);
		for (int i=0; i<v.length; i++){
			System.out.println("Informe um valor para seu vetor receber:");
			v[i] = teclado.nextInt();
			soma = soma+v[i];
		}
		System.out.println("Soma total:");
		System.out.println(soma);
	}
}
