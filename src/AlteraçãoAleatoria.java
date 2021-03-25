import java.util.Random;
import java.util.Scanner;

public class AlteraçãoAleatoria {

	public static char[] alterar(String entrada, Random gerador) {

		int i, tam;

		tam = entrada.length();
		char[] nova = 
				
				new char[tam];
		char[] novaEntrada = new char[tam];

		char primeiraLetra = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));
		char segundaLetra = ((char) ('a' + (Math.abs(gerador.nextInt()) % 26)));

		for (i = 0; i < entrada.length(); i++) {
			nova[i] = entrada.charAt(i);
			if (nova[i] == primeiraLetra) {
				novaEntrada[i] = segundaLetra;
			} else {
				novaEntrada[i] = nova[i];
			}
		}
		return novaEntrada;
	}

	public static void main(String[] args) {
		Random gerador = new Random();
		Scanner ler = new Scanner (System.in);

		String entrada;
		char[] novaString;

		gerador.setSeed(4);

		entrada = ler.nextLine();

		while (!(entrada.equals("FIM"))) {
			novaString = alterar(entrada, gerador);
			System.out.println(novaString);
			entrada = ler.nextLine();

		}
	}
}
