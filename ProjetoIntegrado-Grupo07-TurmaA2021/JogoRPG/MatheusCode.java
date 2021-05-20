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
																												// questões
			}

			resposta = leitor.next().toUpperCase();

			posicaoAlternativa = (listaAlternativas.indexOf(alternativaCorreta));
			letraAlternativa = ((char) (posicaoAlternativa + 65));

		} while (naoPertence(resposta, listaLetrasAlternativas)); // enquanto ele não pertencer a lista de
																	// alternativas ele não vai sair do looping

		if (resposta.equals(String.valueOf(letraAlternativa))) {
			System.out.println("Alternativa correta");
			acertou++;
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

		pergunta = "Questão 01 - Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		listaAlternativas.addAll(Arrays.asList("A7", "A4", "A3", "B1", "BF"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "A7");
		listaAlternativas.clear();

		pergunta = "Questão 02 - Qual valor decimal que convertido para binario fica igual a 0100?";
		listaAlternativas.addAll(Arrays.asList("1", "2", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "4");
		listaAlternativas.clear();

		pergunta = "Questão 03 - Qual valor decimal que convertido para binario fica igual a 1000?";
		listaAlternativas.addAll(Arrays.asList("8", "1", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "8");
		listaAlternativas.clear();
		
		pergunta = "Questão 04 - Em uma expressão lógica, quais sinais representam uma porta OR, AND e"
				+ "NOT, respectivamente?";
		listaAlternativas.addAll(Arrays.asList("Mais, ponto e barra", "Ponto, mais e barra", "Barra, ponto e mais", "Ponto, barra e mais", "Nenhum desses sinais"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Mais, ponto e barra");
		listaAlternativas.clear();
		
		pergunta = "Questão 05 - No momento de extrair a tabela verdade de uma expressão lógica, que contem parênteses, AND e OR,"
				+ "por exemplo: A . B . C + A . (C + A + D), qual a ordem mais aprorpiada de resolução da expressão respectivamente?";
		listaAlternativas.addAll(Arrays.asList("Parênteses, AND e OR", "Parênteses, OR e AND", "Iniciando com os termos da direita para a esquerda", "AND, OR e Parênteses", "OR, AND e Parênteses"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Parênteses, AND e OR");
		listaAlternativas.clear();
		
		pergunta = "Questão 06 - ";
		listaAlternativas.addAll(Arrays.asList());
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "8");
		listaAlternativas.clear();
		
		pergunta = "Questão 07 - ";
		listaAlternativas.addAll(Arrays.asList());
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "8");
		listaAlternativas.clear();
		
		pergunta = "Questão 08 - Segundo o mapa de karnaugh apresentado, quantas unidades, pares, quadras ou oitavas, esse mapa apresenta para ser o mais otimizado possivel?\\n\"\r\n"
				+ " \\n C e D / A e B\\n\"\r\n"
				+ "        | 00 | 01 | 11 | 10 |\n"
				+ "     00 |  1 |  0 |  0 |  1 |\n"
				+ "     01 |  0 |  1 |  1 |  0 |\n"
				+ "     11 |  0 |  1 |  1 |  1 |\n"
				+ "     10 |  1 |  0 |  0 |  0 |\n";
		listaAlternativas.addAll(Arrays.asList("Três pares e uma quadra", "Uma unidade, dois pares e uma quadra", "Duas quadras", "Uma unidade e quatro pares", "Uma unidade e duas quadras"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Três pares e uma quadra");
		listaAlternativas.clear();
	
		pergunta = "Questão 09 - Segundo o mapa de karnaugh apresentado, quantas quadras ele possui para ser o mais otimizado possivel?\n"
				+ " \n C e D / A e B\n"
				+ "        | 00 | 01 | 11 | 10 |\n"
				+ "     00 |  1 |  0 |  0 |  1 |\n"
				+ "     01 |  0 |  1 |  1 |  0 |\n"
				+ "     11 |  0 |  1 |  1 |  1 |\n"
				+ "     10 |  1 |  0 |  1 |  1 |\n\n";	
				listaAlternativas.addAll(Arrays.asList("Uma quadra", "Duas quadras", "Três quadras","Quatro quadras", "Nenhuma quadra"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Três quadras");
		listaAlternativas.clear();

		System.out.printf("Você acertou %.0f questão(ões) no teste", pontuacao);
		leitor.close();

	}

}
