package JogoRPG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MatheusCode {
	public static Scanner leitor = new Scanner(System.in);

	public static float questaoMultiplaEscolha(String pergunta, ArrayList<String> alternativas,
			String alternativaCorreta) {
		String resposta;
		float acertou = 0;

		Collections.shuffle(alternativas);
		Collections.shuffle(alternativas);
		Collections.shuffle(alternativas);

		System.out.println(pergunta);
		for (int i = 0; i < alternativas.size(); i++) {
			System.out.println("[ " + (char) (i + 65) + " ] " + alternativas.get(i));

		}

		resposta = leitor.next();
		resposta = resposta.toUpperCase();

		int posicaoAlternativa = (alternativas.indexOf(alternativaCorreta));
		char letraAlternativa = ((char) (posicaoAlternativa + 65));

		if ((resposta.equals(alternativaCorreta)) || resposta.equals(String.valueOf(letraAlternativa))) {
			System.out.println("Alternativa correta");
			acertou = 1;
		} else {
			System.out.println("Alternativa errada");
		}
		return acertou;
	}

	public static void main(String[] args) {

		float pontuacao = 0;
		String pergunta;
		ArrayList<String> alternativas = new ArrayList<String>();

		pergunta = "Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		alternativas.addAll(Arrays.asList("A7", "A4", "A3", "B1", "BF"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "A7");
		alternativas.clear();

		pergunta = "Qual valor decimal que convertido para binario fica igual a 0100?";
		alternativas.addAll(Arrays.asList("1", "2", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "4");
		alternativas.clear();

		System.out.printf("Você acertou %.0f no teste", pontuacao);
		leitor.close();

	}

}
