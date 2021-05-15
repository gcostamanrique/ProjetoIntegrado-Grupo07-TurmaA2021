package JogoRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class MatheusCode {
	public static Scanner leitor = new Scanner(System.in);

	public static boolean questaoMultiplaEscolha(String pergunta, ArrayList<String> alternativas,
			String alternativaCorreta) {
		String resposta;
		boolean acertou = false;

		String perguntaConsolidada = pergunta + "\n\n" + alternativas.get(0) + "\n" + alternativas.get(1) + "\n"
				+ alternativas.get(2) + "\n" + alternativas.get(3) + "\n" + alternativas.get(4);
		System.out.println(perguntaConsolidada);
		resposta = leitor.next();
		resposta = resposta.toLowerCase();

		if (resposta.equals(alternativaCorreta)) {
			System.out.println("Alternativa correta");
			acertou = true;
		} else {
			System.out.println("Alternativa errada");
		}
		return acertou;
	}

	public static void main(String[] args) {

		int pontuacao = 0;
		String a, b, c, d, e;

		a = "a) A7";
		b = "b) A4";
		c = "c) A3";
		d = "d) B1";
		e = "e) BF";
		ArrayList<String> alternativas = new ArrayList<String>();

		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		if (questaoMultiplaEscolha("Qual valor hexadecimal que convertido para octagonal fica igual a 247?",
				alternativas, "a") == true)
			pontuacao++;

		System.out.printf("Você teve um aproveitamento de %d%% no teste", ((pontuacao / 1) * 100));
		leitor.close();

	}

}
