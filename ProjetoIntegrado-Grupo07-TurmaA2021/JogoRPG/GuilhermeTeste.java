package JogoRPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class GuilhermeTeste {

	public static Scanner leitor = new Scanner(System.in);
		
	public static void main(String[] args) throws InterruptedException {
		
		boolean saida = true;

		do {

			ArrayList<String> pergunta = new ArrayList<String>();
			pergunta.add("90");
			pergunta.add("95");
			pergunta.add("100");
			pergunta.add("105");
			pergunta.add("110");
			Collections.shuffle(pergunta);
			Collections.shuffle(pergunta);
			Collections.shuffle(pergunta);

			System.out.println("Converta de binario para decimal: 1100100");
			System.out.println("<A> " + pergunta.get(0));
			System.out.println("<B> " + pergunta.get(1));
			System.out.println("<C> " + pergunta.get(2));
			System.out.println("<D> " + pergunta.get(3));
			System.out.println("<E> " + pergunta.get(4));
			System.out.print("Escolha uma alternativa: ");

			String alternativaA = pergunta.get(0);
			String alternativaB = pergunta.get(1);
			String alternativaC = pergunta.get(2);
			String alternativaD = pergunta.get(3);
			String alternativaE = pergunta.get(4);

			String alternativa = leitor.next();

			switch (alternativa.toUpperCase()) {
			case "A":

				if (alternativaA == "100") {
					System.out.println("Alternativa Correta!!!");
					saida = false;
				} else {
					System.out.println("Tente Novamente!");
				}
				break;

			case "B":

				if (alternativaB == "100") {
					System.out.println("Alternativa Correta!!!");
					saida = false;
				} else {
					System.out.println("Tenta Novamente!");
				}
				break;

			case "C":

				if (alternativaC == "100") {
					System.out.println("Alternativa Correta!!!");
					saida = false;
				} else {
					System.out.println("Tente Novamente!");
				}
				break;

			case "D":

				if (alternativaD == "100") {
					System.out.println("Alternativa Correta!!!");
					saida = false;
				} else {
					System.out.println("Tente Novamente!");
				}
				break;

			case "E":

				if (alternativaE == "100") {
					System.out.println("Alternativa Correta!!!");
					saida = false;
				} else {
					System.out.println("Tente Novamente!");
				}
				break;

			default:
				System.out.println("Resposta Inválida, tente novamente!");

			}

		} while (saida);
	}
}
