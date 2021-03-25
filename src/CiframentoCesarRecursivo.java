import java.util.Scanner;

public class CiframentoCesarRecursivo {

	public static String ciframento(String entrada) {
		return ciframento(entrada, 0);
	}

	private static String ciframento(String entrada, int i) {

		String novaEntrada = "";
		char letra; 

		if (i == entrada.length()) {
			novaEntrada = "";
		} else if (i < entrada.length()) {
			letra = (char) ((int) entrada.charAt(i) + 3);
			novaEntrada = letra + ciframento(entrada, i + 1);
		}
		return novaEntrada;

	}

	public static void main(String[] args) {

		String entrada, mensagemCripto;

		entrada=MyIO.readLine();

		while (!(entrada.equals("FIM"))) {
			mensagemCripto = ciframento(entrada);
			MyIO.println(mensagemCripto);
			entrada=MyIO.readLine();
		}
	}
}
