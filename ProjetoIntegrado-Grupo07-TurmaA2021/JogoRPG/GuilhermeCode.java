package JogoRPG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeCode {

	static Scanner leitor = new Scanner(System.in);

	static int tempoRapido = 5, tempoLento = 30;

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
						+ "O destino daqueles que acertam menos de 7 quest�es, � o trabalho for�ado para manter o \n"
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

	public static float questaoMultiplaEscolha(String pergunta, ArrayList<String> listaAlternativas,
			String alternativaCorreta) throws InterruptedException {
		String resposta;
		float acertou = 0;
		int posicaoAlternativa;
		char letraAlternativa;
		ArrayList<String> listaLetrasAlternativas = new ArrayList<String>();

		System.out.println("\n");

		Collections.shuffle(listaAlternativas);
		Collections.shuffle(listaAlternativas);
		Collections.shuffle(listaAlternativas);

		do {
			narrativa(pergunta, TimeUnit.MILLISECONDS, tempoRapido);
			System.out.println("\n\n");

			for (int i = 0; i < listaAlternativas.size(); i++) {

				listaLetrasAlternativas.add(Character.toString((char) (i + 65))); // interando a lista de alternativas
				System.out.println("[ " + listaLetrasAlternativas.get(i) + " ] " + listaAlternativas.get(i)); // apresentando
																												// elas
																												// junto
																												// com
																												// as
																												// quest�es
			}

			resposta = leitor.next().toUpperCase();

			posicaoAlternativa = (listaAlternativas.indexOf(alternativaCorreta));
			letraAlternativa = ((char) (posicaoAlternativa + 65));

		} while (naoPertence(resposta, listaLetrasAlternativas)); // enquanto ele n�o pertencer a lista de
																	// alternativas ele n�o vai sair do looping

		if (resposta.equals(String.valueOf(letraAlternativa))) {
			narrativa("\nResposta gravada\n", TimeUnit.MILLISECONDS, tempoLento);
			acertou++;
		} else {
			narrativa("\nResposta gravada\n", TimeUnit.MILLISECONDS, tempoLento);
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

		narrativa("\n\nBem vindo " + nomePersonagem + ", estavamos ao seu aguardo!\n"
				+ "a partir desse momento, voc� ir� realizar seu teste de cidadania\n"
				+ "Lembrando que sua nota sai imediatamente ap�s a conclus�o do seu exame, porem para obter \n"
				+ "os benef�cios de um cidad�o, ser� necess�rio esperar at� a chegada do seu documento em sua \n"
				+ "resid�ncia, o que ir� demorar de um a dois dias, ent�o aproveite esse per�odo para descansar!\n"
				+ "\nAp�s ser informado desses �ltimos detalhes, voc� se dirige ao local informado e inicia o teste!\n"
				+ "\nBOA SORTE, E SUCESSO! CASO CONTR�RIO, SER� TARDE DEMAIS.\n" + "\n...\n", TimeUnit.MILLISECONDS,
				tempoRapido);

		float pontuacao = 0;
		String pergunta;
		ArrayList<String> listaAlternativas = new ArrayList<String>();

		pergunta = "Quest�o 01 - Qual valor hexadecimal que convertido para octagonal fica igual a 247?";
		listaAlternativas.addAll(Arrays.asList("A7", "A4", "A3", "B1", "BF"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "A7");
		listaAlternativas.clear();

		pergunta = "Quest�o 02 - Qual valor decimal que convertido para binario fica igual a 0100?";
		listaAlternativas.addAll(Arrays.asList("1", "2", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "4");
		listaAlternativas.clear();

		pergunta = "Quest�o 03 - Qual valor decimal que convertido para binario fica igual a 1000?";
		listaAlternativas.addAll(Arrays.asList("8", "1", "3", "4", "5"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "8");
		listaAlternativas.clear();

		pergunta = "Quest�o 04 - Em uma express�o l�gica, quais sinais representam uma porta OR, AND e"
				+ "NOT, respectivamente?";
		listaAlternativas.addAll(Arrays.asList("Mais, ponto e barra", "Ponto, mais e barra", "Barra, ponto e mais",
				"Ponto, barra e mais", "Nenhum desses sinais"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Mais, ponto e barra");
		listaAlternativas.clear();

		pergunta = "Quest�o 05 - No momento de extrair a tabela verdade de uma express�o l�gica, que contem par�nteses, AND e OR,"
				+ "por exemplo: A . B . C + A . (C + A + D), qual a ordem mais aprorpiada de resolu��o da express�o respectivamente?";
		listaAlternativas.addAll(Arrays.asList("Par�nteses, AND e OR", "Par�nteses, OR e AND",
				"Iniciando com os termos da direita para a esquerda", "AND, OR e Par�nteses", "OR, AND e Par�nteses"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Par�nteses, AND e OR");
		listaAlternativas.clear();

		pergunta = "Quest�o 06 - Qual o resultado de uma tabela verdade do tipo XOR?\n" + "   | A | B | S |\n"
				+ "   | 0 | 0 | ? |\n" + "   | 0 | 1 | ? |\n" + "   | 1 | 0 | ? |\n" + "   | 1 | 1 | ? |\n";
		listaAlternativas.addAll(Arrays.asList("S = 0, 1, 1, 0", "S = 1, 0, 0, 1", "S = 1, 1, 1, 1", "S = 0, 0, 0, 0",
				"S = 1, 1, 0, 0"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "S = 0, 1, 1, 0");
		listaAlternativas.clear();

		pergunta = "Quest�o 07 - Quest�o 06 - Qual o resultado de uma tabela verdade do tipo XNOT?\n"
				+ "   | A | B | S |\n" + "   | 0 | 0 | ? |\n" + "   | 0 | 1 | ? |\n" + "   | 1 | 0 | ? |\n"
				+ "   | 1 | 1 | ? |\n";
		listaAlternativas.addAll(Arrays.asList("S = 0, 1, 1, 0", "S = 1, 0, 0, 1", "S = 1, 1, 1, 1", "S = 0, 0, 0, 0",
				"S = 1, 1, 0, 0"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "S = 1, 0, 0, 1");
		listaAlternativas.clear();

		pergunta = "Quest�o 08 - Segundo o mapa de karnaugh apresentado, quantas unidades, pares, quadras ou oitavas, esse mapa apresenta para ser o mais otimizado possivel?\\n\"\r\n"
				+ " \n C e D / A e B\n" + "        | 00 | 01 | 11 | 10 |\n" + "     00 |  1 |  0 |  0 |  1 |\n"
				+ "     01 |  0 |  1 |  1 |  0 |\n" + "     11 |  0 |  1 |  1 |  1 |\n"
				+ "     10 |  1 |  0 |  0 |  0 |\n";
		listaAlternativas.addAll(Arrays.asList("Tr�s pares e uma quadra", "Uma unidade, dois pares e uma quadra",
				"Duas quadras", "Uma unidade e quatro pares", "Uma unidade e duas quadras"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Tr�s pares e uma quadra");
		listaAlternativas.clear();

		pergunta = "Quest�o 09 - Segundo o mapa de karnaugh apresentado, quantas quadras ele possui para ser o mais otimizado possivel?\n"
				+ " \n C e D / A e B\n" + "        | 00 | 01 | 11 | 10 |\n" + "     00 |  1 |  0 |  0 |  1 |\n"
				+ "     01 |  0 |  1 |  1 |  0 |\n" + "     11 |  0 |  1 |  1 |  1 |\n"
				+ "     10 |  1 |  0 |  1 |  1 |\n\n";
		listaAlternativas.addAll(
				Arrays.asList("Uma quadra", "Duas quadras", "Tr�s quadras", "Quatro quadras", "Nenhuma quadra"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "Tr�s quadras");
		listaAlternativas.clear();

		pergunta = "Quest�o 10 - Converta oo valor de 1 decimal para binario\n";
		listaAlternativas.addAll(Arrays.asList("00", "01", "10", "11", "Nenhuma alternativa"));
		pontuacao = pontuacao + questaoMultiplaEscolha(pergunta, listaAlternativas, "TADS2021NA");
		listaAlternativas.clear();

		if (pontuacao < 7) {
			narrativa("\n\nAp�s terminar a conclus�o do teste, voc� se levanta e percebe que a sala esta vazia, o \n"
					+ "orientador n�o est� onde deveria estar, o que � estranho. Ap�s alguns segundos voc� come�a \n"
					+ "a ficar desorientado e senta novamente para se recuperar, porem tudo est� ficando escuro, \n"
					+ "voc� sente dificuldade de respirar e por fim n�o v� mais nada.\n"
					+ "\nQuando voc� acordou, estava assustando e desorientado, em um local aparentemente \n"
					+ "desconhecido, utilizando uma roupa que n�o era a sua inicialmente. Apesar da situa��o \n"
					+ "estranha a qual voc� se encontra, voc� mantem a calma e aguarda um pouco.\n"
					+ "\nAlguns minutos depois, uma pessoa entra na sala, acompanhada por dois seguran�as, \n"
					+ "claramente seguran�as pela roupa estilo militar e uma esp�cie de arma em seus coldres. A \n"
					+ "partir desse momento voc� fica mais desesperado, apesar de estar se controlando.\n"
					+ "\n�Meu nome � Joyce, e como uma cidad� de ranque A, � meu dever informar o que est� \n"
					+ "acontecendo com voc� senhor(a)�" + nomePersonagem
					+ "\n\nE ela come�a a explica��o dos que realmente est� acontecendo.\n"
					+ "\nA primeira coisa a ser dita � que na verdade � um teste de categoriza��o da popula��o em \n"
					+ "ranques de D a A, o que j� era e conhecimento comum, no enteando existe uma categoria \n"
					+ "inferior a D, os ranques E, a sua exist�ncia � desconhecida por todos os cidad�os e habitantes, \n"
					+ "exceto pelos ranques A e pelos pr�prios ranques E.\n"
					+ "\nA fun��o dos cidad�os ranque E, � manter a sociedade funcionando como ela funciona, dando \n"
					+ "espa�o para os ranqueados e habitantes viverem em seguran�a, harmonia, conforto e com a \n"
					+ "possibilidade de focarem em seus estudos e desenvolvimento de suas habilidades. Essas \n"
					+ "fun��es v�o ser desempenhadas em um local especifico, ao qual foi informado que n�o \n"
					+ "poder�amos mais deixar, nunca mais. Apesar de sermos tratados de forma humana, com \n"
					+ "respeito, uma vida de subservi�ncia n�o � adequada a ningu�m. Mas infelizmente j� n�o \n"
					+ "temos mais escolha.\n"
					+ "\nAp�s essa explica��o, voc� percebeu que poderia ter se dedicado mais a passar no exame, isso \n"
					+ "teria evitado viver de tal forma. O que est� feito, est� feito, ent�o o que pode ser feito agora � \n"
					+ "conviver com esse resultado ou lutar por algo melhor. E nesse momento, com esse \n"
					+ "pensamento, te ocorre a ideia de porque muitas pessoas tem evitado o teste, ser� que elas \n"
					+ "sabem? A esperan�a ainda n�o acabou!!!\n", TimeUnit.MILLISECONDS, tempoRapido);
		} else if (pontuacao == 7) {
			narrativa("\n\nParab�ns por concluir a prova!\n" + "\nSua pontua��o � classificada como D!!!\n"
					+ "\nVoc� oficialmente agora � um cidad�o de E-NAC, parab�ns por conquistar seu t�tulo com muito \n"
					+ "esfor�o, intelig�ncia e sabedoria! \n"
					+ "\nA partir do momento em que receber seu cart�o de cidad�o com a pontua��o D, voc� tamb�m \n"
					+ "ir� receber novos manuais e documentos relacionando as empresas em que voc� pode \n"
					+ "aprender e desempenhar uma fun��o, ser� disponibilizado seu acesso aos sites oficiais, assim \n"
					+ "como outros documentos relacionados. \n"
					+ "\nLembrando que sua pontua��o atual n�o � fixa, voc� sempre tem a possibilidade de alcan�ar \n"
					+ "maiores n�veis!!! Basta se esfor�ar mais ainda no desempenho de suas atividades e realizar um \n"
					+ "novo teste quando dispon�vel.\n"
					+ "Ap�s ler essas informa��es, voc� se despede do orientador da prova, que o parabeniza por seu \n"
					+ "feito, e tranquilamente retorna ao seu lar, com a sensa��o de dever cumprido e muito feliz por \n"
					+ "conseguir essa conquista! E j� at� se imagina frequentando a unidade C-NAC-01/3.\n",
					TimeUnit.MILLISECONDS, tempoRapido);
		} else if (pontuacao == 8) {
			narrativa("\n\nParab�ns por concluir a prova!\n" + "\nSua pontua��o � classificada como C!!!\n"
					+ "\nVoc� oficialmente agora � um cidad�o de E-NAC, parab�ns por conquistar seu t�tulo com muito \n"
					+ "esfor�o, intelig�ncia e sabedoria! \n"
					+ "\nA partir do momento em que receber seu cart�o de cidad�o com a pontua��o C, voc� tamb�m \n"
					+ "ir� receber novos manuais e documentos relacionando as empresas em que voc� pode \n"
					+ "aprender e desempenhar uma fun��o, ser� disponibilizado seu acesso aos sites oficiais, assim \n"
					+ "como outros documentos relacionados. \n"
					+ "\nLembrando que sua pontua��o atual n�o � fixa, voc� sempre tem a possibilidade de alcan�ar \n"
					+ "maiores n�veis!!! Basta se esfor�ar mais ainda no desempenho de suas atividades e realizar um \n"
					+ "novo teste quando dispon�vel.\n"
					+ "Ap�s ler essas informa��es, voc� se despede do orientador da prova, que o parabeniza por seu \n"
					+ "feito, e tranquilamente retorna ao seu lar, com a sensa��o de dever cumprido e muito feliz por \n"
					+ "conseguir essa conquista! E j� at� se imagina frequentando a unidade C-NAC-01/3.\n",
					TimeUnit.MILLISECONDS, tempoRapido);
		} else if (pontuacao == 9) {
			narrativa("\n\nParab�ns por concluir a prova!\n" + "\nSua pontua��o � classificada como B!!!\n"
					+ "\nVoc� oficialmente agora � um cidad�o de E-NAC, parab�ns por conquistar seu t�tulo com muito \n"
					+ "esfor�o, intelig�ncia e sabedoria! \n"
					+ "\nA partir do momento em que receber seu cart�o de cidad�o com a pontua��o B, voc� tamb�m \n"
					+ "ir� receber novos manuais e documentos relacionando as empresas em que voc� pode \n"
					+ "aprender e desempenhar uma fun��o, ser� disponibilizado seu acesso aos sites oficiais, assim \n"
					+ "como outros documentos relacionados. \n"
					+ "\nLembrando que sua pontua��o atual n�o � fixa, voc� sempre tem a possibilidade de alcan�ar \n"
					+ "maiores n�veis!!! Basta se esfor�ar mais ainda no desempenho de suas atividades e realizar um \n"
					+ "novo teste quando dispon�vel.\n"
					+ "Ap�s ler essas informa��es, voc� se despede do orientador da prova, que o parabeniza por seu \n"
					+ "feito, e tranquilamente retorna ao seu lar, com a sensa��o de dever cumprido e muito feliz por \n"
					+ "conseguir essa conquista! E j� at� se imagina frequentando a unidade C-NAC-01/3.\n",
					TimeUnit.MILLISECONDS, tempoRapido);
		} else if (pontuacao == 10) {
			narrativa("\n\nParab�ns por concluir a prova!\n" + "\nSua pontua��o � classificada como A!!!\n"
					+ "\nVoc� oficialmente agora � um cidad�o de E-NAC, parab�ns por conquistar seu t�tulo com muito \n"
					+ "esfor�o, intelig�ncia, sabedoria e aten��o! \n"
					+ "\nAp�s ler essa mensagem, o instrutor da prova se dirige a voc� e fala:\n"
					+ "�Voc� s� conseguiria essa pontua��o obtendo acesso ao documento secreto na biblioteca.�\n"
					+ "Voc� fica espantado por ele saber disso, j� que o documento avisou que poderia haver grandes \n"
					+ "consequ�ncias. E ate esse momento, voc� n�o pensou que poderia ser uma armadilha, ou \n"
					+ "pensou?\n" + "\nVendo sua rea��o um pouco desesperada, ele fala.\n", TimeUnit.MILLISECONDS,
					tempoRapido);

			boolean sair = true;
			do {
				narrativa(
						"\n\n�N�o se preocupe, apenas gostar�amos de saber se voc� concorda com o que vem ocorrendo\n"
								+ "nessa sociedade?\n" + "\n[ Concordo ] \n" + "[ Discordo ]]n]n",
						TimeUnit.MILLISECONDS, tempoRapido);
				String resposta = leitor.next();
				switch (resposta.toUpperCase()) {
				case "CONCORDO":
					narrativa("\n\nAp�s voc� responder que concorda, ele te orienta com as seguintes informa��es.\n"
							+ "\nO documento na biblioteca � um documento ver�dico, tudo o que ocorreu nas cidades de \n"
							+ "EXODO 1 e 2, al�m deles estarem buscando por EXODO3, para realizar a mesma coisa, por�m \n"
							+ "esse teste � para verificar os poss�veis cidad�os que podem auxiliar nessa busca, e manter a \n"
							+ "ordem na instala��o de controle dos ranques E, ou seja, aqueles que n�o passaram no teste, \n"
							+ "assim como, serem os futuros l�deres dessa sociedade. \n"
							+ "\nComo voc� concorda com essa situa��o, a partir desse momento, tamb�m � seu dever se \n"
							+ "responsabilizar pelo que ocorre nessa sociedade, e carregar esse fardo com absoluta \n"
							+ "descri��o, silencio e dedica��o.\n"
							+ "\nPor �ltimo, ele informou que logo mais entrariam em contato para informar os pr�ximos \n"
							+ "passos, j� que agora voc� tem esse conhecimento e faz parte desse seleto grupo de indiv�duos.\n"
							+ "\nVoc� ficou muito satisfeito com seu resultado ap�s o teste, e apesar do que vem ocorrendo, \n"
							+ "voc� n�o possui culpa alguma, ou peso moral algum, j� que a sociedade � baseada em \n"
							+ "intelig�ncia, isso � apenas a lei da natureza sendo aplicada a sociedade. \n",
							TimeUnit.MILLISECONDS, tempoRapido);
					sair = false;
					break;
				case "DISCORDA":
					narrativa("\n\nAp�s voc� responder que n�o concorda, ele te orienta com as seguintes informa��es.\n"
							+ "\nO documento na biblioteca � um documento ver�dico, tudo o que ocorreu nas cidades de \n"
							+ "EXODO 1 e 2, al�m deles estarem buscando por EXODO3, para realizar a mesma coisa, por�m \n"
							+ "esse teste � para verificar os poss�veis cidad�os que podem auxiliar nessa busca, e manter a \n"
							+ "ordem na instala��o de controle dos ranques E, ou seja, aqueles que n�o passaram no teste, \n"
							+ "assim como, serem os futuros l�deres dessa sociedade. \n"
							+ "\nComo voc� n�o concorda com essa situa��o, a partir desse momento, voc� ser� vigiado a \n"
							+ "todos momentos, para n�o divulgar essa informa��o, e isso pode ser considerado uma prova \n"
							+ "de como a sociedade valoriza pessoas com intelecto e aten��o, pois caso contr�rio, voc� seria \n"
							+ "levado a uma das instala��es de servi�os e seria confinado a ela. \n"
							+ "\nPor �ltimo, ele informou que logo mais entrariam em contato para informar os pr�ximos \n"
							+ "passos, j� que agora voc� tem esse conhecimento e faz parte desse seleto grupo de indiv�duos.\n"
							+ "\nVoc� ficou muito satisfeito com seu resultado ap�s o teste, porem ao mesmo tempo muito \n"
							+ "decepcionado com o que a sociedade vem fazendo com esses indiv�duos. Confinamento e \n"
							+ "subservi�ncia n�o � algo agrad�vel e nenhum ser existente, e por isso voc� pensa em como \n"
							+ "isso pode ocorrer, como as coisas chegaram a esse ponto. O medo de acontecer o que \n"
							+ "aconteceu anteriormente, ou seja, o colapso da sociedade � t�o grande que forcou os \n"
							+ "humanos a tratarem a pr�pria esp�cie dessa forma? Ou pior ainda, e se for apenas mais um \n"
							+ "ato de guerra, disfar�ado apenas de paz?\n"
							+ "\nCom essas duvidas em sua mente, lhe ocorreu mais um pensamento, que era sobre os \n"
							+ "indiv�duos que est�o se recusando a fazer a prova, ser� que eles sabem? Ser� que precisam de \n"
							+ "ajuda? Com a situa��o do monitoramento, o risco ser� maior, mas talvez valha a pena no \n"
							+ "final!!!\n", TimeUnit.MILLISECONDS, tempoRapido);
					sair = false;
					break;
				default:
					narrativa("\nN�o entendemos sua resposta, por gentileza, tente novamente\n\n",
							TimeUnit.MILLISECONDS, tempoRapido);
					sair = true;
					break;
				}
			} while (sair);

			narrativa("\n\n\nOBRIGADO POR JOGAR NOSSO JOGO!", TimeUnit.MILLISECONDS, tempoLento);
		}

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
