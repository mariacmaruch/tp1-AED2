
public class CiframentoCesarIterativo {

	public static String ciframento(String entrada) {

		int tam = entrada.length();
		
		char letra;
		String novaMensagem="";

		for (int i = 0; i < tam; i++) {
			letra = (char) ((int) entrada.charAt(i) + 3);
			novaMensagem += letra;
		}
		return novaMensagem;
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
