package JogoRPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeTeste {
	
	static Scanner leitor = new Scanner(System.in);
	
	static int tempoRapido = 10, tempoLento = 10;
	
	static void narrativa(String mensagem, TimeUnit unit, long tempoMensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempoMensagem);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "OK":
				narrativa("\n\nVocê conseguiu compreender, continue assim e bom jogo!", TimeUnit.MILLISECONDS,
						tempoLento);
				sair = false;
				break;
			default:
				narrativa("\n\nTente mais uma vez! e lembre-se, o que deve ser digitado está entre colchetes [ ]\n"
						+ "Digite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoLento);
				sair = true;
				break;
			}
		} while (sair);
	}
}
