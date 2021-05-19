package JogoRPG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MatheusCode {
	public static Scanner leitor = new Scanner(System.in);

	public static float questaoMultiplaEscolha(String pergunta, ArrayList<String> listaAlternativas,
			String alternativaCorreta) {
		String resposta;
		float acertou = 0;
		int posicaoAlternativa;
		char letraAlternativa;
		ArrayList<String> listaLetrasAlternativas = new ArrayList<String>();

		Collections.shuffle(listaAlternativas);
		Collections.shuffle(listaAlternativas);
		Collections.shuffle(listaAlternativas);

		do {
			System.out.println(pergunta);

			for (int i = 0; i < listaAlternativas.size(); i++) {

				listaLetrasAlternativas.add(Character.toString((char) (i + 65))); // interando a lista de alternativas
				System.out.println("[ " + listaLetrasAlternativas.get(i) + " ] " + listaAlternativas.get(i)); // apresentando
																												// elas
																												// junto
																												// com
																												// as
																												// quest�es
			}

			resposta = leitor.next().toUpperCase();

			posicaoAlternativa = (listaAlternativas.indexOf(alternativaCorreta));
			letraAlternativa = ((char) (posicaoAlternativa + 65));

		} while (naoPertence(resposta, listaLetrasAlternativas)); // enquanto ele n�o pertencer a lista de
																	// alternativas ele n�o vai sair do looping

		if (resposta.equals(String.valueOf(letraAlternativa))) {
			System.out.println("Alternativa correta");
			acertou = 1;
		} else {
			System.out.println("Alternativa errada");
		}

		return acertou;
	}

	public static boolean naoPertence(String valor, ArrayList<String> vetor) {
		for (String item : vetor) {
			if (item.equals(valor)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		float pontuacao = 0;
		String pergunta;
		ArrayList<String> listaAlternativas = new ArrayList<String>();

		pergunta = "Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		listaAlternativas.addAll(Arrays.asList("A7", "A4", "A3", "B1", "BF"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "A7");
		listaAlternativas.clear();

		pergunta = "Qual valor decimal que convertido para binario fica igual a 0100?";
		listaAlternativas.addAll(Arrays.asList("1", "2", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "4");
		listaAlternativas.clear();

		pergunta = "Qual valor decimal que convertido para binario fica igual a 1000?";
		listaAlternativas.addAll(Arrays.asList("8", "1", "3", "4"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "8");
		listaAlternativas.clear();

		System.out.printf("Voc� acertou %.0f quest�o(�es) no teste", pontuacao);
		leitor.close();

	}

}
