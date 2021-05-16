package JogoRPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeTeste {

	public static Scanner leitor = new Scanner(System.in);
		
	public static void main(String[] args) throws InterruptedException {
		
		int salaExame;
		ArrayList<Integer> vetorSalaExame = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			vetorSalaExame.add(i);
		}
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		
		for (int i = 0; i < 10; i++) {
			System.out.println(vetorSalaExame.get(i));
		}
	}
}
