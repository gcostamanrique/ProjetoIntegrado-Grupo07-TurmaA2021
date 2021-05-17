package JogoRPG;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeCode {

	static Scanner leitor = new Scanner(System.in);

	static int tempoRapido = 0, tempoLento = 0;

	static void narrativa(String mensagem, TimeUnit unit, long tempoMensagem) throws InterruptedException {
		for (char caractere : mensagem.toCharArray()) {
			System.out.print(caractere);
			unit.sleep(tempoMensagem);
		}
	}

	static String nomePersonagem() throws InterruptedException {
		narrativa("\nInsira o nome do seu personagem, por gentileza: ", TimeUnit.MILLISECONDS, tempoLento);
		String jogador = leitor.next();
		return jogador;
	}

	static void earlyGame01(String nomePersonagem) throws InterruptedException {
		narrativa("\n\nUM POUCO SOBRE C-NAC-01 A CIDADE DO PA�S C-NAC.\n" + "\nMuito bem vindo " + nomePersonagem
				+ ", a cidade de C-NAC-01!\n"
				+ "Essa humilde cidade, que pertence ao pequeno pa�s C-Nac, entretanto grande em \n"
				+ "conhecimento, segue � risca as regras que est�o descritas em nossa constitui��o. A PRINCIPAL \n"
				+ "REGRA � que nosso glorioso pa�s em ascens�o, se baseai no conhecimento que nossos \n"
				+ "cidad�os possuem.\n"
				+ "\nNos orgulhamos muito em se destacar dos demais pa�ses por nossa INTELIG�NCIA, trabalho \n"
				+ "duro e consci�ncia social com nossos cidad�os. Fornecemos todas as estruturas necess�rias, \n"
				+ "para a absor��o do conhecimento por nossos residentes, e ap�s um simples teste de \n"
				+ "conhecimento, fornecemos a todos o t�tulo de cidad�o.\n"
				+ "\nComo um pa�s que que defende o conhecimento, nossas organiza��es s�o aconselhadas a \n"
				+ "respeitar os n�veis sociais existentes, entretanto, como somos um pa�s com o intelecto \n"
				+ "superior, E mantenedores da paz e igualdade entre nossos cidad�os, atos discriminat�rios de \n"
				+ "qualquer tipo, especialmente entre n�veis sociais, � pun�vel com o grau mais elevado da nossa \n"
				+ "gloriosa lei.\n" + "\n" + nomePersonagem
				+ " ATEN��O, se est� se questionando quais n�veis socias existem em nosso pacifico pais,\n"
				+ "forneceremos essa explica��o agora mesmo.\n"
				+ "\nOs n�veis sociais s�o informados ap�s o seu teste, SIMPLES ASSIM. lembrando que o n�vel mais \n"
				+ "baixo que o teste ir� fornecer o t�tulo de �cidad�o D�, e o n�vel mais alto, � o t�tulo de �cidad�o A�. \n"
				+ "ENT�O EM SEU TESTE DE CIDADANIA, CASO RESPONDA E N�O APRESENTE UM BOM \n"
				+ "DESEMPENHO, n�o se preocupe, recebendo o t�tulo de �cidad�o D�, juntando m�ritos \n"
				+ "necess�rios com seu trabalho, forneceremos a oportunidade de refazer a prova, para tentar \n"
				+ "alcan�ar um n�vel superior ao j� apresentado.\n"
				+ "\nClaro que pedimos a paci�ncia de todos os cidad�os, pois como temos um n�mero limitado de \n"
				+ "t�tulos para cidad�os n�vel A e B, caso alcance esse resultado, cidad�os aleat�rios com a mesma \n"
				+ "categoria v�o ser reavaliados para suas posi��es, caso esses cidad�os reavaliados n�o \n"
				+ "apresentem erros, infelizmente sua posi��o para ascens�o ser� colocada em espera. caso a \n"
				+ "espera passe de um ano, o cidad�o que solicitou a ascens�o, devera refazer o teste para \n"
				+ "reafirmar seus direitos de ascens�o.\n"
				+ "\nTais regras existentes, jamais ser�o corrompidas ou manipuladas, pois as consequ�ncias de tais \n"
				+ "atos seria catastr�fica a nossa sociedade, sendo assim, muito improv�vel que ap�s sua \n"
				+ "tentativa de ascens�o, demoraremos um ano a buscar um candidato a descens�o.\n"
				+ "\nOutro jeito poss�vel de ascens�o sem ocorrer a descens�o de outro cidad�o, � a expans�o de \n"
				+ "nossa sociedade, a forma��o de novas cidades requer um aumento no n�mero de cidad�os \n"
				+ "com graus elevados, sendo assim, possibilitando a ascens�o sem descens�o de outros.\n"
				+ "\nRelacionamentos entre n�veis diferentes n�o � restrito de forma alguma, e novamente, \n"
				+ "qualquer ato discriminat�rio RESULTARA NAS MAIS PESADAS CONSEQU�NCIAS PUNITIVAS, \n"
				+ "independentemente de seu n�vel.\n" + "\n" + nomePersonagem
				+ " voc� acabou de receber um e-mail oficial!\n" + "gostaria de o ler agora?\n"
				+ "\n[ Sim ] - por gentileza!\n" + "[ Nao ] - muito obrigado!\n\n" + "", TimeUnit.MILLISECONDS,
				tempoRapido);
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "SIM":
				narrativa("\nVamos mostrar o e-mail agora!", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			case "NAO":
				narrativa("\nInfelizmente por ser um e-mail oficial n�o seria prudente postergar sua leitura\n"
						+ "Vamos mostrar o e-mail agora!", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
	}

	static void earlyGame02(String nomePersonagem) throws InterruptedException {
		narrativa("\n\nE-mail de confirma��o da prova.\n" + "\nPrezado " + nomePersonagem
				+ ", a cidade de C-NAC-01 fica imensamente feliz com seu interesse no teste de cidadania!\n"
				+ "\nA data da sua prova foi marcada para o dia 10/01/2162, dez dia ap�s o recebimento desse desse e-mail.\n"
				+ "O local da prova, ser� na Av. Eng. Eus�bio Stevaux, 823 � Distrito 3 � C-NAC-01, unidade \n"
				+ "universit�ria C-NAC-01/3. Lembrando que � apenas necess�rio levar seu cart�o de residente, \n"
				+ "para a verifica��o da sua identidade. Nossa prova ser� realizada atrav�s de um computador \n"
				+ "dispon�vel no local, onde testaremos seus conhecimentos atrav�s de 10 perguntas m�ltipla \n"
				+ "escolha, referentes a Conceitos de Computa��o. Chegando na unidade informada, basta ir a secretaria,\n"
				+ "confirmar sua presen�a e solicitar uma sala para o exame. \n"
				+ "\nGostar�amos de agradecer novamente seu interesse em nossa prova de cidadania, tendo em \n"
				+ "vista que n�o estamos tendo uma taxa de aceita��o de 100% de nossos residentes para tal \n"
				+ "prova, mesmo os benef�cios de se tornar um cidad�o serem muito superiores aos benef�cios de \n"
				+ "um simples residente. \n"
				+ "\nPara mais informa��es, basta ler um breve texto contando um pouco mais sobre a hist�ria da \n"
				+ "sociedade antiga era moderna e a atual era tecnol�gica sustent�vel.\n" + "", TimeUnit.MILLISECONDS,
				tempoRapido);
	}

	static void earlyGame03(String nomePersonagem) throws InterruptedException {
		narrativa("\n\n" + nomePersonagem + ", gostaria de ler o texto mencionado?\n" + "[ Sim ] - por gentileza!\n"
				+ "[ Nao ] - muito obrigado!\n" + "", TimeUnit.MILLISECONDS, tempoLento);
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "SIM":
				narrativa("\n\nA breve hist�ria da antiga era moderna e a atual era tecnol�gica sustent�vel.\n"
						+ "\nA antiga era moderna, como nos referimos anteriormente ao ano de 2043, encontrou seu fim \n"
						+ "por meio de falta de recursos em 2040, porem demoraram mais tr�s anos para terminarem de \n"
						+ "consumir os recursos estocados previamente, o que gerou uma conturba��o muito mais \n"
						+ "severa na sociedade na sociedade da �poca.\n"
						+ "\nMilagrosamente ap�s alguns anos em um estado de limbo, onde os cientistas que sobraram \n"
						+ "faziam o que podiam, na maior velocidade que conseguiam e com os recursos dispon�veis, \n"
						+ "desenvolveram uma semente milagrosa, que se desenvolvia r�pido em qualquer ambiente, e \n"
						+ "que possu�a todos os nutrientes necess�rios para a sobreviv�ncia humana naquele momento. \n"
						+ "\nA partir do ano de 2048 a nova era da humanidade emergiu, tendo a intelig�ncia como \n"
						+ "principal meio de desenvolvimento. Percebeu-se que apenas estimulando esse lado do \n"
						+ "humano, seria poss�vel manter um n�vel adequado de racionalidade na sociedade, evitando \n"
						+ "uma nova cat�strofe devido a abuso de poder, viol�ncia e irracionalidade.\n"
						+ "\nCom a chegada da nova era, que � conhecida como era tecnol�gica sustent�vel, v�rias na��es \n"
						+ "emergiram de suas posi��es geogr�ficas, como novos nomes. Em nosso caso, o pa�s \n"
						+ "anteriormente conhecido com Brasil, passou a ser denominado C-NAC. Para simplificar as \n"
						+ "coisas, passamos a denominar as cidades como C-NAC- (n�mero da cidade, de forma \n"
						+ "crescente), uma forma pratica de definir nomes para nossas cidades. Atualmente estamos com \n"
						+ "um total de 1175 cidades, expandindo quando poss�vel, porem preservando nosso modo de vida\n"
						+ "\nAgora o mais interessante, essa expans�o � devido aos cidad�os existentes em nossa \n"
						+ "sociedade, por isso solicitamos que os exames de cidadania sejam realizados de forma pontual \n"
						+ "com a idade de 21 anos, no entanto n�o proibimos que seja feita antes ou depois dessa idade. \n"
						+ "O ideal � que seja realizado quando o residente se sinta confort�vel, apenas mostramos um \n"
						+ "par�metro para que o exame n�o caia no esquecimento.\n"
						+ "\nO EXAME de cidadania, tem o dever de ranquear as posi��es dos cidad�os, com o intuito de \n"
						+ "aloca-los nas melhores fun��es que podem exercer dentro da sociedade, como mencionado \n"
						+ "anteriormente, esse exame pode � realizado outras vezes, a pedido do cidad�o, para o efeito \n"
						+ "de ascens�o ou descens�o do mesmo. Os movimentos de ascens�o e descens�o tem o objetivo \n"
						+ "de evitar UMA FARSA dos cidad�os, na realiza��o de seus papeis na sociedade, isso previne \n"
						+ "que erros sejam cometidos, e que situa��es constrangedoras para todos os habitantes seja \n"
						+ "evitado. Como acontecia na antiga era com casos de corrup��o e afins.\n"
						+ "PARA CONHECER A VERDADE, tivemos que suportar muitos dos erros cometidos na antiga era \n"
						+ "moderna, nos adaptarmos a nossa nova realidade, e esse � o principal objetivo desse exame, \n"
						+ "verificar se o habitante est� apto a ser inserido nessa nova e magnifica realidade, e em qual \n"
						+ "posi��o ele pertence, sem discrimina��o alguma pela posi��o alcan�ada, pelo contr�rio, \n"
						+ "severas puni��es ser�o dadas a aqueles que desrespeitarem isso. Em todos as unidades de \n"
						+ "educa��o, damos acesso a documentos de conhecimento geral, caso n�o esteja lendo esse \n"
						+ "documento na biblioteca, BASTA IR � BIBLIOTECA E PEDIR PELO DOCUMENTO: verdade101. Se \n"
						+ "j� estiver na biblioteca, retorne ao menu e selecione o documento verdade101.\n"
						+ "\nEsse documento ir� informar um pouco mais sobre os desafios que a antiga era moderna \n"
						+ "suportou em sua sociedade, e o que estamos evitando em nossa sociedade com o estimulo do \n"
						+ "conhecimento, e a verifica��o da capacidade de intelig�ncia dos cidad�os. Infelizmente ainda \n"
						+ "n�o conseguimos ter total �xito, pois uma minoria que respeitamos, tem uma opini�o \n"
						+ "contraria aos m�todos que oferecemos, com isso disponibilizamos uma cidade denominada \n"
						+ "EXODO03 para tais indiv�duos viverem pacificamente, sem a nossa interfer�ncia, assim como \n"
						+ "pedidos que n�o interfiram em nosso meio, o que infelizmente n�o vem acontecendo.\n"
						+ "\n Com essa hist�ria em mente, pedimos que se concentre na realiza��o de seu exame, e \n"
						+ "desejamos todo o sucesso do para voc�, futuro cidad�o! MAS N�O SE ESQUE�A, QUE \n"
						+ "ADENTRAR nossa sociedade como cidad�o, ir� exigir uma capacidade mental muito forte, que \n"
						+ "talvez n�o tenha vivido ainda, mas o encorajamos a ser ambicioso a ponto de conseguir �xito \n"
						+ "em seu teste e aguardamos voc� na posi��o mais alta, ranque A. Assim como refor�amos que, \n"
						+ "se tornando um cidad�o, seu cart�o de residente ser� substitu�do por um cart�o de cidad�o e \n"
						+ "ESSE DOCUMENTO ir� alterar os status de sua vida completamente, positivamente � claro, mas \n"
						+ "isso PODE TER GRANDES CONSEQU�NCIAS, ent�o tome cuidado e n�o repita os erros do passado.\n"
						+ "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			case "NAO":
				narrativa("" + "\n\nCaso mude de ideia, basta ir a biblioteca e ler o documento: EraSustentavel\n" + "",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
	}

	static void earlyGame04() throws InterruptedException {
		narrativa("\n\nComo mencionado na carta, ap�s dez dias, voc� foi ao endere�o descrito no e-mail de \n"
				+ "confirma��o da prova, e nesse endere�o encontrou a unidade universit�ria C-NAC-01/3 pela \n"
				+ "primeira vez em sua vida!\n"
				+ "\nApesar de s� estar visitando-a para realizar a prova de cidadania, voc� j� podia se imaginando \n"
				+ "andando em seus corredores como um aluno, frequentando as aulas em seus laborat�rios, \n"
				+ "utilizando a biblioteca para pesquisas e as infinitas possibilidades que viriam a partir do \n"
				+ "conhecimento fornecido. Com isso voc� pensou em como as pessoas poderiam negar realizar \n"
				+ "tal prova, sendo que os benef�cios de ser um cidad�o seriam muito bons para serem negados, \n"
				+ "e que nesse caso, voc� s� poderia frequentar aquela universidade sendo um cidad�o.\n"
				+ "\nSaindo de seu devaneio, voc� adentra o espa�o da universidade.\n", TimeUnit.MILLISECONDS,
				tempoRapido);

	}

	static void earlyGameTotemEspaco01(String nomePersonagem) throws InterruptedException {
		narrativa("\n\nOlhando para ele voc� inseri seu cart�o de habitante e l� a mensagem:\n" + "\nMuito bem-vindo "
				+ nomePersonagem + " a unidade universit�ria C-NAC-01/3!\n"
				+ "\nEm nosso sistema vemos que voc� deve realizar sua prova de cidadania hoje, e por isso o \n"
				+ "parabenizamos e desejamos boa sorte!!!\n"
				+ "Para iniciar sua prova, basta ir � secretaria, onde voc� confirmar� sua presen�a e realizar� o \n"
				+ "sorteio da sua sala de teste, uma vez sorteada a sala, basta se dirigir a mesma o mais breve \n"
				+ "poss�vel\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\n\nDigite:\n" + "\n[ Mapa ] � para ver um mapa de orienta��o da unidade.\n"
							+ "[ Sair ] � para sair do totem e se mover pela unidade.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "MAPA":
				narrativa("\n\nMapa\n"
						+ "\nA unidade C-NAC-01/3 � composta por alguns �espa�os�, voc� atualmente est� no espa�o 01. \n"
						+ "A descri��o dos �espa�os� � a seguinte:\n"
						+ "\nEspa�o 01: entrada (esse espa�o fornece acesso ao espa�o 02).\n"
						+ "Espa�o 02: monumento a sustentabilidade (esse espa�o fornece acesso aos espa�os 03 e 05).\n"
						+ "Espa�o 03: jardim e biblioteca (esse espa�o fornece acesso ao espa�o 04).\n"
						+ "Espa�o 04: biblioteca.\n"
						+ "Espa�o 05: jardim, entrada para o pr�dio principal (esse espa�o fornece acesso ao espa�o 06).\n"
						+ "Espa�o 06: hall de entrada do pr�dio principal da universidade (esse espa�o fornece acesso \n"
						+ "aos espa�os 07 e 08).\n" + "Espa�o 07: secretaria.\n"
						+ "Espa�o 08: pr�dio principal (esse espa�o fornece acesso aos espa�os 09 e 10).\n"
						+ "Espa�o 09: salas de exame de 1 a 5.\n" + "Espa�o 10: salas de exame de 6 a 10. \n"
						+ "Atualmente voc� possui acesso a somente esses espa�os.\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			case "SAIR":
				narrativa("\nQualquer d�vida, retorne aqui!\n\n", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
	}

	static int earlyGameEspaco01(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado a universidade, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um espa�o semi coberto, com o ch�o feito de paralelep�pedo e concreto.\n"
				+ "\nA sua direita, tem uma esta��o de seguran�a, onde voc� repara que os seguran�as est�o \n"
				+ "observando todo o movimento que acontece no local. A atras da esta��o de seguran�a, ainda a \n"
				+ "sua direita, um estacionamento aberto cheio de carros.\n"
				+ "\nA sua esquerda, voc� observa uma carca de arbustos verdes e baixos, e v� parcialmente a um \n"
				+ "lado do pr�dio da biblioteca.\n" + "\nA sua frente, voc� observa um totem de informa��es.\n",
				TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Totem ] � Para visualizar o totem de informa��es.\n"
							+ "[ Frente ] � Se movimentar para o pr�ximo espa�o.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "TOTEM":
				earlyGameTotemEspaco01(nomePersonagem);
				sair = true;
				break;
			case "FRENTE":
				espaco = 2;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco02(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 02, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um espa�o semi coberto, com o ch�o feito de paralelep�pedo e concreto.\n"
				+ "\nA sua direita, voc� ainda observa o estacionamento aberto creio de carros a uma certa \n"
				+ "dist�ncia, porem o que chama a aten��o, � uma arvore imensa rodeada por bancos e que � \n"
				+ "descrita como um dos monumentos da era tecnol�gica sustent�vel. A impon�ncia dessa arvore \n"
				+ "faz refletir sobre como a natureza � de fundamental import�ncia ao planeta, principalmente \n"
				+ "ap�s o in�cio da era.\n"
				+ "\nA sua esquerda, voc� observa totalmente a lateral do pr�dio da biblioteca, e um caminho que \n"
				+ "ao que parece fornece acesso a sua entrada.\n"
				+ "\nA sua frente, um corredor lateral ao pr�dio principal, com um jardim a sua direita.\n"
				+ "\nA suas costas, voc� observa o espa�o 01.\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Direita ] � Se movimentando para o espa�o a direita.\n"
							+ "[ Frente ] � Se movimentando para o espa�o a frente.\n"
							+ "[ Retornar ] � Se movimentando para o espa�o 01.\n" + "\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "DIREITA":
				espaco = 3;
				sair = false;
				break;
			case "FRENTE":
				espaco = 5;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 1;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco03(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 03, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um espa�o semi coberto, com o ch�o feito de paralelep�pedo e concreto.\n"
				+ "\nA sua direita, voc� observa um jardim que possui um caminho feito de pequenas rochas \n"
				+ "acinzentadas, diversos bancos de descanso, alguns ocupados por estudantes e alguns vazios. \n"
				+ "No centro do jardim, tem uma fonte baixa com a representa��o da semente que proporcionou \n"
				+ "todo o desenvolvimento da nova era tecnol�gica sustent�vel, e que tamb�m virou um s�mbolo \n"
				+ "de esperan�a.\n"
				+ "\nA sua esquerda, voc� observa em parte � frente da biblioteca, feita totalmente de vidro \n"
				+ "azulado e uma entrada com duas portas autom�ticas e o logo do C-NAC-01/3.\n"
				+ "\nA sua frente, continua a �rea semi coberta at� o fim do jardim desse lado do campus, e o fim"
				+ "do predio da biblioteca.\n" + "\nA suas costas, voc� observa o espa�o 02.\n", TimeUnit.MILLISECONDS,
				tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Esquerda ] � E entrar na biblioteca.\n"
							+ "[ Retornar ] � Se movimentando para o espa�o 02.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "ESQUERDA":
				espaco = 4;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 2;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static void bibliotecaCnac(String nomePersonagem) throws InterruptedException {

		narrativa(
				"\n\nAo escolher um computador, voc� inseri seu cart�o de habitante e aparece do monitor\n"
						+ "\nBem-vindo " + nomePersonagem + " a biblioteca Universit�ria C-NAC-01/3\n",
				TimeUnit.MILLISECONDS, tempoLento);
		boolean sair = true;
		do {
			narrativa("\n\nLista de documentos acessiveis com o seu acesso:\n" + "\n[EraSustentavel]\n"
					+ "[Verdade101}\n"
					+ "\nCaso queira ler algum documento, basta escrever o nome dele! Caso contrario, digite [ sair ].\n\n"
					+ "Solicita��o: ", TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "ERASUSTENTAVEL":
				narrativa("\n\nA breve hist�ria da antiga era moderna e a atual era tecnol�gica sustent�vel.\n"
						+ "\nA antiga era moderna, como nos referimos anteriormente ao ano de 2043, encontrou seu fim \n"
						+ "por meio de falta de recursos em 2040, porem demoraram mais tr�s anos para terminarem de \n"
						+ "consumir os recursos estocados previamente, o que gerou uma conturba��o muito mais \n"
						+ "severa na sociedade na sociedade da �poca.\n"
						+ "\nMilagrosamente ap�s alguns anos em um estado de limbo, onde os cientistas que sobraram \n"
						+ "faziam o que podiam, na maior velocidade que conseguiam e com os recursos dispon�veis, \n"
						+ "desenvolveram uma semente milagrosa, que se desenvolvia r�pido em qualquer ambiente, e \n"
						+ "que possu�a todos os nutrientes necess�rios para a sobreviv�ncia humana naquele momento. \n"
						+ "\nA partir do ano de 2048 a nova era da humanidade emergiu, tendo a intelig�ncia como \n"
						+ "principal meio de desenvolvimento. Percebeu-se que apenas estimulando esse lado do \n"
						+ "humano, seria poss�vel manter um n�vel adequado de racionalidade na sociedade, evitando \n"
						+ "uma nova cat�strofe devido a abuso de poder, viol�ncia e irracionalidade.\n"
						+ "\nCom a chegada da nova era, que � conhecida como era tecnol�gica sustent�vel, v�rias na��es \n"
						+ "emergiram de suas posi��es geogr�ficas, como novos nomes. Em nosso caso, o pa�s \n"
						+ "anteriormente conhecido com Brasil, passou a ser denominado C-NAC. Para simplificar as \n"
						+ "coisas, passamos a denominar as cidades como C-NAC- (n�mero da cidade, de forma \n"
						+ "crescente), uma forma pratica de definir nomes para nossas cidades. Atualmente estamos com \n"
						+ "um total de 1175 cidades, expandindo quando poss�vel, porem preservando nosso modo de vida\n"
						+ "\nAgora o mais interessante, essa expans�o � devido aos cidad�os existentes em nossa \n"
						+ "sociedade, por isso solicitamos que os exames de cidadania sejam realizados de forma pontual \n"
						+ "com a idade de 21 anos, no entanto n�o proibimos que seja feita antes ou depois dessa idade. \n"
						+ "O ideal � que seja realizado quando o residente se sinta confort�vel, apenas mostramos um \n"
						+ "par�metro para que o exame n�o caia no esquecimento.\n"
						+ "\nO EXAME de cidadania, tem o dever de ranquear as posi��es dos cidad�os, com o intuito de \n"
						+ "aloca-los nas melhores fun��es que podem exercer dentro da sociedade, como mencionado \n"
						+ "anteriormente, esse exame pode � realizado outras vezes, a pedido do cidad�o, para o efeito \n"
						+ "de ascens�o ou descens�o do mesmo. Os movimentos de ascens�o e descens�o tem o objetivo \n"
						+ "de evitar UMA FARSA dos cidad�os, na realiza��o de seus papeis na sociedade, isso previne \n"
						+ "que erros sejam cometidos, e que situa��es constrangedoras para todos os habitantes seja \n"
						+ "evitado. Como acontecia na antiga era com casos de corrup��o e afins.\n"
						+ "PARA CONHECER A VERDADE, tivemos que suportar muitos dos erros cometidos na antiga era \n"
						+ "moderna, nos adaptarmos a nossa nova realidade, e esse � o principal objetivo desse exame, \n"
						+ "verificar se o habitante est� apto a ser inserido nessa nova e magnifica realidade, e em qual \n"
						+ "posi��o ele pertence, sem discrimina��o alguma pela posi��o alcan�ada, pelo contr�rio, \n"
						+ "severas puni��es ser�o dadas a aqueles que desrespeitarem isso. Em todos as unidades de \n"
						+ "educa��o, damos acesso a documentos de conhecimento geral, caso n�o esteja lendo esse \n"
						+ "documento na biblioteca, BASTA IR � BIBLIOTECA E PEDIR PELO DOCUMENTO: verdade101. Se \n"
						+ "j� estiver na biblioteca, retorne ao menu e selecione o documento verdade101.\n"
						+ "\nEsse documento ir� informar um pouco mais sobre os desafios que a antiga era moderna \n"
						+ "suportou em sua sociedade, e o que estamos evitando em nossa sociedade com o estimulo do \n"
						+ "conhecimento, e a verifica��o da capacidade de intelig�ncia dos cidad�os. Infelizmente ainda \n"
						+ "n�o conseguimos ter total �xito, pois uma minoria que respeitamos, tem uma opini�o \n"
						+ "contraria aos m�todos que oferecemos, com isso disponibilizamos uma cidade denominada \n"
						+ "EXODO03 para tais indiv�duos viverem pacificamente, sem a nossa interfer�ncia, assim como \n"
						+ "pedidos que n�o interfiram em nosso meio, o que infelizmente n�o vem acontecendo.\n"
						+ "\nCom essa hist�ria em mente, pedimos que se concentre na realiza��o de seu exame, e \n"
						+ "desejamos todo o sucesso do para voc�, futuro cidad�o! MAS N�O SE ESQUE�A, QUE \n"
						+ "ADENTRAR nossa sociedade como cidad�o, ir� exigir uma capacidade mental muito forte, que \n"
						+ "talvez n�o tenha vivido ainda, mas o encorajamos a ser ambicioso a ponto de conseguir �xito \n"
						+ "em seu teste e aguardamos voc� na posi��o mais alta, ranque A. Assim como refor�amos que, \n"
						+ "se tornando um cidad�o, seu cart�o de residente ser� substitu�do por um cart�o de cidad�o e \n"
						+ "ESSE DOCUMENTO ir� alterar os status de sua vida completamente, positivamente � claro, mas \n"
						+ "isso PODE TER GRANDES CONSEQU�NCIAS, ent�o tome cuidado e n�o repita os erros do passado.\n"
						+ "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "VERDADE101":
				narrativa(
						"\n\nVerdade 101 � um dos documentos mais populares e acess�vel em nossa sociedade, pelo fato \n"
								+ "de que ele retrata o que aconteceria na antiga era moderna, e o que evitamos a era \n"
								+ "tecnol�gica sustent�vel. \n"
								+ "\nNa antiga era moderna, a sociedade que parecia est�vel, na verdade sofria de uma grande \n"
								+ "necrose em seu cerne, que era a ganancia, corrup��o, preconceito e tudo isso era refletido na \n"
								+ "popula��o. Ou seja, a popula��o sofria com a ganancia de seus governantes, ou ficavam \n"
								+ "gananciosos de mais ap�s receber uma leve dose de poder. Todos com almas corruptas, pelo \n"
								+ "fato de que se conseguissem tirar um pouco de vantagem de qualquer coisa, n�o iriam pensar \n"
								+ "duas vezes, em realizar tais m�todos inadequados, sem mencionar o preconceito que existia \n"
								+ "devido ao g�nero, cor, religi�o e at� por esportes comuns na �poca. \n"
								+ "\nTodos esses aspectos levaram a uma grave deteriora��o da sociedade, alguns pa�ses \n"
								+ "conseguiram expandir seus poderes e garantir uma hegemonia sobre outros locais, apenas \n"
								+ "pelo fato de fornecerem produtos para a sobreviv�ncia humana. Isso com o tempo gerou \n"
								+ "revoltas, principalmente pelo medo das consequ�ncias de n�o terem com o que mais se \n"
								+ "sustentar, esse medo, com a gan�ncia, corrup��o e preconceitos enraizados, levaram a \n"
								+ "revoltas sem precedentes, e a utiliza��o de armas que n�o deveriam existir, principalmente \n"
								+ "pelo seu poder destrutivo. Como consequ�ncia, houve uma diminui��o da popula��o global, \n"
								+ "tanto devido as revoltas, quanto a falta de recursos, e ap�s o ano de 2040, quando todos os \n"
								+ "recursos acabaram, a humanidade se virou com suas reservas totais at� 2043. Ap�s o \n"
								+ "esgotamento dos recursos, principalmente aliment�cio, um mist�rio surgiu de como houveram \n"
								+ "sobreviventes, e n�o apenas poucos sobreviventes, at� o ano de 2048, quando as sementes \n"
								+ "milagrosas surgiram.\n"
								+ "\nEsses sobreviventes, em sua totalidade cientistas, iniciaram a nova era tecnol�gica sustent�vel.\n"
								+ "\nConhecendo essa hist�ria, a ideia de ganancia, corrup��o e preconceito, s�o as ideias menos \n"
								+ "acess�veis em nossa sociedade atual, pois o medo da hist�ria se repetir novamente � muito \n"
								+ "grande. Assim utilizamos a intelig�ncia como nosso principal maio contra esses pensamentos \n"
								+ "b�rbaros. Como mencionado, n�o existem relatos concretos de como os indiv�duos \n"
								+ "sobreviveram dos anos de 2043 at� 2048, e mesmo os que passaram por tais anos, que \n"
								+ "infelizmente j� faleceram, n�o tocaram em tais assuntos at� o fim de suas vidas.  \n"
								+ "",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "EXODO03":
				narrativa("\n\nEste � um documento, que foi de forma ilegal inserido na documenta��o de todas as \n"
						+ "bibliotecas do pa�s C-NAC. Apenas aqueles que prestaram aten��o aos detalhes puderam \n"
						+ "chegar at� esse ponto.\n"
						+ "\nPara sermos diretos, Exodo03 � uma cidade de refugiados que existe atualmente em uma \n"
						+ "localiza��o secreta, mesmo o pa�s C-NAC informando que foi nos dados esse territ�rio, na \n"
						+ "verdade ele foi conquistado por meio de independ�ncia. Exodo03 � a terceira cidade do \n"
						+ "g�nero, as duas primeiras Exodo01 e Exodo02, que existiam anteriormente, devido a sua \n"
						+ "localiza��o ser revelada, houveram m�ltiplos ataque at� finalmente n�o sobrar mais nenhum \n"
						+ "local para retornar. \n"
						+ "\nIndependente disso, aqui vai uma dica para voc� que chegou at� aqui. O teste de cidadania s�o \n"
						+ "10 perguntas que v�o ranquear os futuros cidad�os em 4 n�veis, A, B, C e D. no entanto voc� j� \n"
						+ "se perguntou o que acontece caso n�o alcance os crit�rios m�nimos para essas notas? Os \n"
						+ "documentos informam qual � o destino de tais pessoas, e por isso eu digo agora!\n"
						+ "O destino daqueles que acertam menos de 6 quest�es, � o trabalho for�ado para manter o \n"
						+ "estilo de vida dos cidad�os ranqueados, podendo nunca mais sair legalmente das instala��es \n"
						+ "de trabalho, apesar de n�o sofrermos maus tratos, uma vida de deveres e obriga��es, sem \n"
						+ "direitos, � uma vida inadequada.\n"
						+ "\nPor isso informo que para mudar essa realidade, voc� deve acertar todas as quest�es! \n"
						+ "Acertado todas, e consequentemente conseguindo o rank mais alto, rank A, voc� como um \n"
						+ "indiv�duo de boa �ndole, ter� o poder de ajudar na liberta��o dos presos nos centros de \n"
						+ "trabalho for�ado. \n"
						+ "\nPrimeiro, � preciso saber que na prova voc� s� consegue acertar 9 quest�es com seus \n"
						+ "conhecimentos, e com isso n�o consigo te auxiliar, pois as quest�es s�o aleat�rias e escolhidas \n"
						+ "conforme o tema da prova, no entanto a quest�o de n�mero 10, � igual em todos os testes, \n"
						+ "independente do tema. Para conseguir o rank A, � necess�rio no lugar da resposta da quest�o \n"
						+ "10, digitar o seguinte c�digo: TADS2021NA.\n"
						+ "\nBoa sorte com sua prova, e com as consequ�ncias de seus atos caso descubram que voc� leu \n"
						+ "esse documento. \n" + "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "SAIR":
				narrativa(
						"\n\nObrigado " + nomePersonagem
								+ " por ter visitado a biblioteca da universit�ria C-NAC-01/3\n",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\n\nN�o entendemos sua solicita��o, por gentileza, tente novamente!\n",
						TimeUnit.MILLISECONDS, tempoRapido);
			}
		} while (sair);
	}

	static int earlyGameEspaco04(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 04, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um pr�dio com as janelas feitas de vidro azulado e o ch�o de m�rmore polido, \n"
				+ "um ambiente impecavelmente limpo.\n"
				+ "\nA sua direita, uma �rea de computadores para acesso comum. Entretanto com os \n"
				+ "computadores mais sofisticados que voc� nem poderia imaginar.\n"
				+ "\nA sua esquerda um ambiente com esculturas em m�rmore representativas dos antepassados, \n"
				+ "pe�as tecnol�gicas antigas, como c�meras fotogr�ficas, os primeiros equipamentos sonoros, \n"
				+ "computadores em suas formas primitivas entre outras pe�as, assim como vestu�rios das \n"
				+ "�pocas mais remotas, com seus tecidos um pouco desbotados, entretanto perfeitamente \n"
				+ "arrumados, os chap�us mais engra�ados, porem na �poca representativos de poder e \n"
				+ "autoridade. Assim como outras diversas pe�as, que quando voc� observou n�o consegui \n"
				+ "distinguir sua origem.\n"
				+ "\nA frente uma �rea de seguran�a para a entrada da biblioteca em si, por�m n�o sendo \n"
				+ "estudante, n�o ter�amos acesso a ela, j� que os livros foram praticamente extintos com o fim \n"
				+ "da antiga era moderna, os que restaram, s�o cuidadosamente preservados e com acesso \n"
				+ "restrito, porem todos s�o digitalizados e disponibilizados ao p�blico em geral.\n",
				TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Direita ] � Utilizar um dos computadores dispon�veis.\n"
							+ "[ Retornar ] � Se movimentando para o espa�o 03.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "DIREITA":
				bibliotecaCnac(nomePersonagem);
				sair = true;
				;
				break;
			case "RETORNAR":
				espaco = 3;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco05(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 05, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um espa�o semi coberto, com o ch�o feito de paralelep�pedo e concreto.\n"
				+ "\nA sua direita, voc� observa grandes janelas de vidro negro, n�o conseguindo observar o lado \n"
				+ "de dentro do pr�dio, no entanto, ap�s caminhar um pouco voc� encontra uma entrada onde \n"
				+ "possui a �rea da secretaria e a entrada para o pr�dio principal.\n"
				+ "\nA sua esquerda, voc� observa um jardim que possui um caminho feito de pequenas rochas \n"
				+ "acinzentadas, diversos bancos de descanso, alguns ocupados por estudantes e alguns vazios. \n"
				+ "No centro do jardim, tem uma fonte baixa com a representa��o da semente que proporcionou \n"
				+ "todo o desenvolvimento da nova era tecnol�gica sustent�vel, e que tamb�m virou um s�mbolo \n"
				+ "de esperan�a.\n"
				+ "\nA sua frente, continua a �rea semi coberta at� o fim do jardim desse lado do campus, e o fim \n"
				+ "do pr�dio principal.\n" + "\nA suas costas, voc� observa o espa�o 02.\n", TimeUnit.MILLISECONDS,
				tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Direita ] � E entrar no hall do pr�dio da universidade.\n"
							+ "[ Retornar ] � Se movimentando para o espa�o 02.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "DIREITA":
				espaco = 6;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 2;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco06(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 06, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um hall com o ch�o de m�rmore polido e um ambiente impecavelmente limpo.\n"
				+ "\nA sua direita, voc� observa uma porta autom�tica de vidro negro, escrito secretaria com o logo \n"
				+ "da universidade nela.\n"
				+ "\nA sua esquerda, uma s�rie de poltronas pr�ximas a uma parede com uma pintura art�stica do \n"
				+ "monumento a era tecnol�gica sustent�vel, a arvore que se encontra no espa�o 2.\n"
				+ "\nA sua frente tr�s portas autom�ticas com vidro negro, dando o acesso ao pr�dio principal da \n"
				+ "universidade, nas portas contam a escrita do nome do pr�dio �Acad�mico I�, seguido pelo logo \n"
				+ "da universidade.\n" + "\nA suas costas, voc� observa o espa�o 05.\n" + "", TimeUnit.MILLISECONDS,
				tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Direita ] � E entrar na secretaria do pr�dio.\n"
							+ "[ Frente ] � E entrar no pr�dio Acad�mico I.\n"
							+ "[ Retornar ] � Se movimentando para o espa�o 05.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "DIREITA":
				espaco = 7;
				sair = false;
				break;
			case "FRENTE":
				espaco = 8;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 5;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco07(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 07, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em uma sala com o ch�o de m�rmore polido e um ambiente impecavelmente limpo. \n"
				+ "\nA sua direita, voc� observa grandes janelas de vidro negro, onde voc� consegue ver \n"
				+ "nitidamente o lado de fora do campus, e uma serie de mesas alinhada, separadas e indicadas \n"
				+ "por n�meros, assim como atendentes conversando com outros estudantes.\n"
				+ "\nA sua esquerda, voc� observa em partes, mesmo cen�rio que na direita, uma serie de mesas \n"
				+ "alinhada, separadas e indicadas por n�meros, assim como atendentes conversando com \n"
				+ "outros estudantes.\n"
				+ "\nA sua frente, voc� observa um equipamento que lhe fornece senhas, e ap�s esse \n"
				+ "equipamento, diversas poltronas alinhadas no meio da sala, com seus assentos virados tanto \n"
				+ "para o lado direito quanto para o lado esquerdo.\n"
				+ "\nA suas costas, voc� obesa a porta de vidro negro fechada.\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa("\nVoc� pode:\n" + "\n[ Pegar ] � uma senha e esperar sua vez de ser atendido.\n"
					+ "[ Retornar ] � Se movimentando para o espa�o 06.", TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "PEGAR":
				espaco = 6;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 6;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco08(String nomePersonagem, int espaco) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 08, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um corredor com paredes brancas, um ch�o de m�rmore polido e um ambiente \n"
				+ "impecavelmente limpo.\n" + "\nA sua direita, voc� observa salas com os n�meros de 1 a 5.\n"
				+ "\nA sua esquerda, voc� observa salas com os n�meros de 6 a 10\n"
				+ "\nA suas costas voc� observa, as postas autom�ticas j� fechadas, de onde veio do espa�o 6.\n",
				TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ Direita ] � para ir as salas de 1 a 5.\n"
							+ "[ Esquerda ] - para ir as salas de 6 a 10\n"
							+ "[ Retornar ] � se movimentando para o espa�o 06.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "DIREITA":
				espaco = 9;
				sair = false;
				break;
			case "ESQUERDA":
				espaco = 10;
				sair = false;
				break;
			case "RETORNAR":
				espaco = 8;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco09(String nomePersonagem, int espaco, int salaExame) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 09, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um corredor com paredes brancas, um ch�o de m�rmore polido e um ambiente \n"
				+ "impecavelmente limpo.\n"
				+ "\nA sua direita, voc� observa uma parede branca com algumas obras expositivas que ao que \n"
				+ "indica, foi deito pelos estudantes da universidade.\n"
				+ "\nA sua esquerda, voc� observa 5 salas, numeradas de 1 a 5.\n"
				+ "\nA sua frente, voc� v� uma escada que leva ao andar superior, por�m � uma �rea restrita aos \n"
				+ "estudantes \n" + "\nA suas costas voc� observa o espa�o 8.\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ 1 ] � entrar na sala 01.\n" + "[ 2 ] � entrar na sala 02.\n"
							+ "[ 3 ] � entrar na sala 03.\n" + "[ 4 ] � entrar na sala 04.\n"
							+ "[ 5 ] � entrar na sala 05.\n" + "[ Retornar ] � se movimentando para o espa�o 06.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "1":
				if (salaExame == 1) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 9;
					sair = true;
				}
				break;
			case "2":
				if (salaExame == 2) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 9;
					sair = true;
				}
				break;
			case "3":
				if (salaExame == 3) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 9;
					sair = true;
				}
				break;
			case "4":
				if (salaExame == 4) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 9;
					sair = true;
				}
				break;
			case "5":
				if (salaExame == 5) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 9;
					sair = true;
				}
				break;
			case "RETORNAR":
				espaco = 8;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int earlyGameEspaco10(String nomePersonagem, int espaco, int salaExame) throws InterruptedException {
		narrativa("\n\nAdentrado o espa�o 09, voc� observa as coisas da seguinte perspectiva:\n"
				+ "\nVoc� est� em um corredor com paredes brancas, um ch�o de m�rmore polido e um ambiente \n"
				+ "impecavelmente limpo.\n" + "\nA sua direita, voc� observa 5 salas, numeradas de 6 a 10.\n"
				+ "\nA sua esquerda, voc� observa uma parede branca com algumas obras expositivas que ao que \n"
				+ "indica, foi deito pelos estudantes da universidade.\n"
				+ "\nA sua frente, voc� v� uma escada que leva ao andar superior, por�m � uma �rea restrita aos \n"
				+ "estudantes \n" + "\nA suas costas voc� observa o espa�o 8.\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa(
					"\nVoc� pode:\n" + "\n[ 6 ] � entrar na sala 06.\n" + "[ 7 ] � entrar na sala 07.\n"
							+ "[ 8 ] � entrar na sala 08.\n" + "[ 9 ] � entrar na sala 09.\n"
							+ "[ 10 ] � entrar na sala 10.\n" + "[ Retornar ] � se movimentando para o espa�o 06.\n\n",
					TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "6":
				if (salaExame == 6) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 10;
					sair = true;
				}
				break;
			case "7":
				if (salaExame == 7) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 10;
					sair = true;
				}
				break;
			case "8":
				if (salaExame == 8) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 10;
					sair = true;
				}
				break;
			case "9":
				if (salaExame == 9) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 10;
					sair = true;
				}
				break;
			case "10":
				if (salaExame == 10) {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, ela se destranca e voc� entra!.",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 11;
					sair = false;
				} else {
					narrativa(
							"\n\nAp�s inserir seu cart�o de habitante no leitor da porta, a seguinte mensagem aparece:\n"
									+ "Sala trancada, procure pela sala correta!",
							TimeUnit.MILLISECONDS, tempoLento);
					espaco = 10;
					sair = true;
				}
				break;
			case "RETORNAR":
				espaco = 8;
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return espaco;
	}

	static int definicaoSalaExame(String nomePersonagem, int salaExame) throws InterruptedException {
		ArrayList<Integer> vetorSalaExame = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++) {
			vetorSalaExame.add(i);
		}
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		Collections.shuffle(vetorSalaExame);
		salaExame = vetorSalaExame.get(0);
		narrativa("\n\nAp�s esperar alguns minutos em uma das poltronas, sua senha � chamada.\n"
				+ "Ao chegar no atendente, ele se identifica como Guilherme e solicita seu cart�o de habitante ou \n"
				+ "cidad�o.\n" + "\nAp�s entregar o cart�o de habitante, ele o leu no sistema e responde:\n"
				+ "\n�Vejo que o/a senhor(a) " + nomePersonagem + ", veio realizar o exame de cidadania.�\n"
				+ "Voc� concordando, fala um pouco mais:\n"
				+ "\n�Isso mesmo, fui informado de vir a secretaria para confirmar minha presen�a e solicitar uma \n"
				+ "sala para o exame.�\n" + "Guilherme responde:\n" + "\n�Sem problemas!�\n"
				+ "Ap�s alguns poucos comandos que ele inseriu no sistema ele responde.\n" + "\n�O/a senhor(a) "
				+ nomePersonagem + ", j� est� com sua presen�a confirmada! Agora basta ir � sala \n" + salaExame
				+ " e realizar seu exame! Desejamos boa sorte e sucesso!!!�\n"
				+ "Ap�s receber o numero da sala, voc� agradece, se levanta e sai da secretaria.",
				TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			narrativa("\n[ Ok ] - para sair\n\n", TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "OK":
				sair = false;
				break;
			default:
				narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
		return salaExame;
	}

	static int questaoExame(int pontuacaoPersonagem, String enunciadoQuestao, String alternativa01,
			String alternativa02, String alternativa03, String alternativa04, String alternativa05,
			String respostaQuestao) throws InterruptedException {
		String alternativa = "X";
		do {
			ArrayList<String> pergunta = new ArrayList<String>();
			pergunta.add(alternativa01);
			pergunta.add(alternativa02);
			pergunta.add(alternativa03);
			pergunta.add(alternativa04);
			pergunta.add(alternativa05);
			Collections.shuffle(pergunta);
			Collections.shuffle(pergunta);
			Collections.shuffle(pergunta);
			narrativa("\n\n" + enunciadoQuestao + "\n[ A ] " + pergunta.get(0) + "\n[ B ] " + pergunta.get(1)
					+ "\n[ C ] " + pergunta.get(2) + "\n[ D ] " + pergunta.get(3) + "\n[ E ] " + pergunta.get(4)
					+ "\nEscolha uma alternativa: ", TimeUnit.MILLISECONDS, tempoLento);
			String alternativaA = pergunta.get(0);
			String alternativaB = pergunta.get(1);
			String alternativaC = pergunta.get(2);
			String alternativaD = pergunta.get(3);
			String alternativaE = pergunta.get(4);
			alternativa = leitor.next();
			alternativa = alternativa.toUpperCase();
			switch (alternativa) {
			case "A":
				if (alternativaA == respostaQuestao) {
					pontuacaoPersonagem++;
				}
				break;
			case "B":
				if (alternativaB == respostaQuestao) {
					pontuacaoPersonagem++;
				}
				break;
			case "C":
				if (alternativaC == respostaQuestao) {
					pontuacaoPersonagem++;
				}
				break;
			case "D":
				if (alternativaD == respostaQuestao) {
					pontuacaoPersonagem++;
				}
				break;
			case "E":
				if (alternativaE == respostaQuestao) {
					pontuacaoPersonagem++;
				}
				break;
			}
		} while (alternativa == "A" || alternativa == "B" || alternativa == "C" || alternativa == "D"
				|| alternativa == "E");
		return pontuacaoPersonagem;
	}

	static void jogoCnac() throws InterruptedException {
		int espaco = 1;
		int salaExame = 0;
		narrativa("\n\nBem-vindo ao universo de C-NAC!\n", TimeUnit.MILLISECONDS, tempoRapido);
		String nomePersonagem = nomePersonagem();
		earlyGame01(nomePersonagem);
		earlyGame02(nomePersonagem);
		earlyGame03(nomePersonagem);
		earlyGame04();
		boolean saida = true;
		do {
			if (espaco == 1) {
				espaco = earlyGameEspaco01(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 2) {
				espaco = earlyGameEspaco02(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 3) {
				espaco = earlyGameEspaco03(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 4) {
				espaco = earlyGameEspaco04(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 5) {
				espaco = earlyGameEspaco05(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 6) {
				espaco = earlyGameEspaco06(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 7) {
				espaco = earlyGameEspaco07(nomePersonagem, espaco);
				salaExame = definicaoSalaExame(nomePersonagem, salaExame);
				saida = true;
			} else if (espaco == 8) {
				espaco = earlyGameEspaco08(nomePersonagem, espaco);
				saida = true;
			} else if (espaco == 9) {
				espaco = earlyGameEspaco09(nomePersonagem, espaco, salaExame);
				saida = true;
			} else if (espaco == 10) {
				espaco = earlyGameEspaco10(nomePersonagem, espaco, salaExame);
				saida = true;
			} else if (espaco == 11) {
				saida = false;
			}
		} while (saida);
		int pontuacaoPersonagem = 0;
		String enunciadoQuestao, alternativa01, alternativa02, alternativa03, alternativa04, alternativa05,
				respostaQuestao;
		enunciadoQuestao = "Quest�o 01: Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		alternativa01 = "A7";
		alternativa02 = "A4";
		alternativa03 = "A3";
		alternativa04 = "B1";
		alternativa05 = "BF";
		respostaQuestao = "A7";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 02: Qual valor decimal que convertido para binario fica igual a 0100?";
		alternativa01 = "1";
		alternativa02 = "2";
		alternativa03 = "3";
		alternativa04 = "4";
		alternativa05 = "5";
		respostaQuestao = "4";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 03: Qual valor decimal que convertido para binario fica igual a 15?";
		alternativa01 = "0101";
		alternativa02 = "1111";
		alternativa03 = "1000";
		alternativa04 = "0100";
		alternativa05 = "1110";
		respostaQuestao = "1111";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 04: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 05: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 06: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 07: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 08: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 09: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
		enunciadoQuestao = "Quest�o 10: ";
		alternativa01 = "";
		alternativa02 = "";
		alternativa03 = "";
		alternativa04 = "";
		alternativa05 = "";
		respostaQuestao = "";
		pontuacaoPersonagem = questaoExame(pontuacaoPersonagem, enunciadoQuestao, alternativa01, alternativa02,
				alternativa03, alternativa04, alternativa05, respostaQuestao);
	}

	static void instrucoes() throws InterruptedException {
		narrativa("\n\nAs instru��es do jogo s�o bem simples, basta uma leitura ativa e respostas atentas. Para uma \n"
				+ "leitura ativa, repare nos aspectos dos textos e foque na compreens�o do que est� sendo \n"
				+ "transmitido, agora para respostas atentas basta inserir no console as informa��es requeridas.\n"
				+ "\nAs informa��es requeridas, sempre estar�o destacadas entre [ colchetes ], com um \n"
				+ "espa�amento maior de cada lado.\n"
				+ "\nPor exemplo: se no console for solicitado para digitar algo, e uma ou mais palavras, letras ou \n"
				+ "n�meros estiverem entre colchetes, digite a palavra, letra ou n�mero escolhido entre colchetes\n"
				+ "\n[ A ] � Ol�\n" + "[ B ] � Tchau\n"
				+ "\nO correto � digitar [ A ] para representar o Ol� ou [ B ] para representar o Tchau. Mas n�o se \n"
				+ "preocupe se errar, a quest�o ser� repetida para uma nova resposta ser inserida.\n"
				+ "\nDigite [ OK ] para sair!\n" + "", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "OK":
				narrativa("\nVoc� conseguiu compreender, continue assim e bom jogo!", TimeUnit.MILLISECONDS,
						tempoLento);
				sair = false;
				break;
			default:
				narrativa("\n\nTente mais uma vez! e lembre-se, o que deve ser digitado est� entre colchetes [ ]\n"
						+ "Digite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoLento);
				sair = true;
				break;
			}
		} while (sair);
	}

	static void creditos() throws InterruptedException {
		narrativa("\n\nO jogo C-NAC, foi desenvolvido por Erick Barbosa Cavichioni, Guilherme Costa Manrique e \n"
				+ "Matheus Rocha Galdino da Silva, todos estudantes do Centro Universit�rio Senac Santo Amaro, \n"
				+ "cursando Tecnologia de Analise e desenvolvimento de Sistemas, iniciado no primeiro semestre \n"
				+ "de 2021.\n"
				+ "\nO jogo C-NAC � um projeto montado com o objetivo avaliativo para a mat�ria Projeto \n"
				+ "Integrador I, ministrada pelo professor Dr. Eduardo Takeo Ueda.\n"
				+ "\nO projeto tem como um dos objetos, testar os conhecimentos dos estudantes referentes a \n"
				+ "qualquer mat�ria cursada no semestre, sendo assim, o grupo optou por escolher a mat�ria \n"
				+ "Conceitos de Computa��o, ministrada pelo professor Stelvio Barbosa.\n"
				+ "\nO grupo tem um agradecimento especial aos professores, por suas orienta��es que fizerem \n"
				+ "esse projeto ser poss�vel.\n" + "\nDigite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "OK":
				sair = false;
				break;
			default:
				narrativa("\nDigite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoLento);
				sair = true;
				break;
			}
		} while (sair);
	}

	public static void main(String[] args) throws InterruptedException {

		boolean sair = true;
		do {
			byte resposta;
			do {
				narrativa("\n\nMenu de op��es:\n\n" + "[ 1 ] - Jogar\n" + "[ 2 ] - Instru��es\n" + "[ 3 ] - Cr�ditos\n"
						+ "[ 4 ] - Sair\n\n" + "Insira a op��o desejada: ", TimeUnit.MILLISECONDS, tempoLento);
				resposta = leitor.nextByte();
			} while (resposta < 1 || resposta > 4);
			switch (resposta) {
			case 1:
				jogoCnac();
				sair = true;
				break;
			case 2:
				instrucoes();
				sair = true;
				break;
			case 3:
				creditos();
				sair = true;
				break;
			case 4:
				narrativa("\n\nAt� breve jogador!", TimeUnit.MILLISECONDS, tempoLento);
				sair = false;
				break;
			}
		} while (sair);
	}
}
