package JogoRPG;

import java.util.ArrayList;
import java.util.Scanner;

public class MatheusCode {
	public static Scanner leitor = new Scanner(System.in);

	public static float questaoMultiplaEscolha(String pergunta, ArrayList<String> alternativas,
			String alternativaCorreta) {
		String resposta;
		float acertou = 0;

		System.out.println(pergunta);
		for (String alternativa : alternativas) {
			System.out.println(alternativa);
		}

		resposta = leitor.next();
		resposta = resposta.toLowerCase();

		if (resposta.equals(alternativaCorreta)) {
			System.out.println("Alternativa correta");
			acertou = 1;
		} else {
			System.out.println("Alternativa errada");
		}
		return acertou;
	}

	public static void main(String[] args) {

		float pontuacao = 0;
		String a, b, c, d, e, pergunta;
		ArrayList<String> alternativas = new ArrayList<String>();

		pergunta = "Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		a = "a) A7";
		b = "b) A4";
		c = "c) A3";
		d = "d) B1";
		e = "e) BF";
		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "a");

		alternativas.clear();

		pergunta = "Qual valor decimal que convertido para binario fica igual a 0100?";
		a = "a) 1";
		b = "b) 2";
		c = "c) 3";
		d = "d) 4";
		e = "e) 5";
		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "d");

		alternativas.clear();

		pergunta = "Qual valor decimal que convertido para binario fica igual a 15?";
		a = "a) 0101";
		b = "b) 1111";
		c = "c) 1000";
		d = "d) 0100";
		e = "e) 1110";
		alternativas.add(a);
		alternativas.add(b);
		alternativas.add(c);
		alternativas.add(d);
		alternativas.add(e);

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "b");

		System.out.printf("Você teve um aproveitamento de %.0f%% no teste", ((pontuacao / 3) * 100));
		leitor.close();

	}

}
