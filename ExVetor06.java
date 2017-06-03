package vetores;

import java.util.Scanner;

public class ExVetor06 {



	public static void main(String[] args) {
		int [] v = new int [15];
		int soma=0;
		int media=0;
		Scanner teclado = new Scanner(System.in);
		for (int i=0; i<v.length; i++){
			System.out.println("Informe um valor para seu vetor receber:");
			v[i] = teclado.nextInt();
			soma = soma+v[i];
			media = soma/v.length;
		}
		System.out.println("Soma total:");
		System.out.println(soma);
		System.out.println("Média");
		System.out.println(media);
		teclado.close();
	}

}
