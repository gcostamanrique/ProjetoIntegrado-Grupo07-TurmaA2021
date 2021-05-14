package JogoRPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeTeste {
	
	static int teste(String nome, int espaco) {
		espaco = 100;
		return espaco;		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		int espaco = 0;
		String nome = "guilherme";
		espaco = teste (nome, espaco);
		System.out.println(espaco);
		System.out.println(nome);
	}
}
