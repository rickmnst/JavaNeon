import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Prova01 {

	public static void main(String[] args) throws IOException {
		String op = "";
		Scanner teclado = new Scanner(System.in);
		String[] nomes= new String[100];
		String[] telefone = new String[100];
		String[] email = new String[100];
		int l = 0;
		int l1 = 0;
		int l2 = 0;

		while(!op.equalsIgnoreCase("3")){
			System.out.println("1 - Novo Contato");
			System.out.println("2 - Ver Agenda");
			System.out.println("3 - Sair");
			op = teclado.next();
			String nomearquivo = "";
			String resposta ="s";
			switch (op){
			case "1":
				resposta = "s";			
				while(resposta.equalsIgnoreCase("s")){
					File arquivo = new File("C:\\Users\\Aluno\\Desktop\\teste\\dados2.txt");
					FileWriter gravador = new FileWriter(arquivo,true);
					teclado = null;
					teclado = new Scanner(System.in);
					System.out.print("Nome: ");
					nomes[l] = teclado.next();
					System.out.print("Email: ");
					email[l1] = teclado.next();
					teclado = null;
					teclado = new Scanner(System.in);
					System.out.println("Telefone:");
					telefone[l2] = teclado.next();

					try{
						gravador.write(nomes[l]+";" );
						gravador.write(email[l1]+";");
						gravador.write(telefone[l2]+";");
						gravador.write(System.lineSeparator());

						System.out.println("Continuar? (S/N)");
						resposta = teclado.next();
						l++;
						l1++;
						l2++;

						gravador.flush();
						gravador.close();
					}
					catch (Exception e){
						System.out.println("Erro ao gravar!");
					}
				}
				break;
			case "2":
				System.out.println("Sua agenda é:");
				try {
					l = 0;
					l1 = 0;
					l2 = 0;
					FileReader arquivo2 = new FileReader("C:\\Users\\Aluno\\Desktop\\teste\\dados2.txt");
					BufferedReader leitor = new BufferedReader(arquivo2);
					String linha = "";
					linha = leitor.readLine();
					while(linha!=null){
						String dados[] = linha.split(";");
						System.out.println("Nome:                 "+"Email:                 "+"Telefone:                 ");
						System.out.println(dados[0]+"                 "+dados[1]+"                 "+dados[2]+"                 ");
						linha = leitor.readLine();

					}
					System.out.println("FIM DO ARQUIVO ");

				} 
				catch (Exception e) {
					System.out.println("Erro na visualização!");
				}



			case "3":
				System.out.println("Fim do programa!");
				break;
			default:
				System.out.println("Erro!");

			}
		}
	}
}

