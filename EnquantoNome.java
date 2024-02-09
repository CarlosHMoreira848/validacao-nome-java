import java.util.Scanner;
public class EnquantoNome {
	public static void main(String[] args) {
		String nome = "";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Bem vindo ao programa!");
		while(nome.equals("")) {
			System.out.println("Para continuar você precisa digitar seu nome: ");
			nome = entrada.next();
		}
		System.out.println("Muito bem " + nome + ", você tem acesso ao sistema!");
	}
}
