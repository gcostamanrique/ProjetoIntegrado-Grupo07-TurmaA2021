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
			System.out.println((i + 1) + ". " + alternativas.get(i));

		}
		resposta = leitor.next();
		resposta = resposta.toUpperCase();

		int posicaoAlternativa = (alternativas.indexOf(alternativaCorreta) + 1);
		System.out.println(posicaoAlternativa);

		if ((resposta.equals(alternativaCorreta)) || resposta.equals(Integer.toString(posicaoAlternativa))) {
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

		alternativas.addAll(Arrays.asList("A7", "A4", "A3", "B1", "BF"));

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "A7");

		alternativas.clear();
		pergunta = "Qual valor decimal que convertido para binario fica igual a 0100?";
		alternativas.addAll(Arrays.asList("1", "2", "3", "4", "5"));

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "4");

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

		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, alternativas, "1111");

		System.out.printf("Você teve um aproveitamento de %.0f%% no teste", ((pontuacao / 3) * 100));
		leitor.close();

	}

}
