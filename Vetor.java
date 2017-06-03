import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		int [] v = new int [11];
		int vetor;
		Scanner teclado = new Scanner(System.in);
		for (int i=1; i<v.length;i++){
			System.out.println("Informe um valor:");
			v[i]= teclado.nextInt();
		}
		System.out.println("Qual vetor você deseja conhecer o valor?");
		vetor = teclado.nextInt();
		System.out.println(v[vetor]);
		teclado.close();
	}	

}
