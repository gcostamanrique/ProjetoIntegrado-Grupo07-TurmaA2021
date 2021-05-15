package JogoRPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeTeste {

	public static Scanner leitor = new Scanner(System.in);

	public static void main(String[] args) throws InterruptedException {

		boolean sair = true;
		do {
			System.out.print("\nDigite:\n" + "\n[ Mapa ] – para ver um mapa de orientação da unidade.\n"
					+ "[ Sair ] – para sair do totem e se mover pela unidade.\n\n");
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "MAPA":

				sair = true;
				break;
			case "SAIR":
				System.out.print("\nQualquer dúvida, retorne aqui!\n\n");
				sair = false;
				break;
			default:
				System.out.print("\nNão entendemos sua resposta, por gentileza, tente novamente\n\n");
				sair = true;
				break;
			}
		} while (sair);
	}
}
