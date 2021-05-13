package JogoRPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeCode {

	static Scanner leitor = new Scanner(System.in);

	static int tempoRapido = 40, tempoLento = 100;

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
				+ "\nOuto jeito poss�vel de ascens�o sem ocorrer a descens�o de outro cidad�o, � a expans�o de \n"
				+ "nossa sociedade, a forma��o de novas cidades requer um aumento no n�mero de cidad�os \n"
				+ "com graus elevados, sendo assim, possibilitando a ascens�o sem descens�o de outros.\n"
				+ "\nRelacionamentos entre n�veis diferentes n�o � restrito de forma alguma, e novamente, \n"
				+ "qualquer ato discriminat�rio RESULTARA NAS MAIS PESADAS CONSEQU�NCIAS PUNITIVAS, \n"
				+ "independentemente de seu n�vel.\n" + "", TimeUnit.MILLISECONDS, tempoRapido);
	}

	static void earlyGame02(String nomePersonagem) throws InterruptedException {
		narrativa("\n\nE-mail de confirma��o da prova.\n" + "\nPrezado " + nomePersonagem
				+ ", a cidade de C-nac-01 fica imensamente feliz com seu interesse no teste de \n" + "cidadania!\n"
				+ "\nA data da sua prova foi marcada para o dia 10/01/2162, dez dia ap�s o recebimento desse desse e-mail.\n"
				+ "O local da prova, ser� na Av. Eng. Eus�bio Stevaux, 823 � Distrito 3 � C-nac-01, unidade \n"
				+ "Universit�ria C-nac-01/3. Lembrando que � apenas necess�rio levar seu cart�o de residente, \n"
				+ "para a verifica��o da sua identidade. Nossa prova ser� realizada atrav�s de um computador \n"
				+ "dispon�vel no local, onde testaremos seus conhecimentos atrav�s de 10 perguntas m�ltipla \n"
				+ "escolha, referentes a Conceitos de Computa��o. \n"
				+ "\nGostar�amos de agradecer novamente seu interesse em nossa prova de cidadania, tendo em \n"
				+ "vista que n�o estamos tendo uma taxa de aceita��o de 100% de nossos residentes para tal \n"
				+ "prova, mesmo os benef�cios de se tornar um cidad�o serem muito superiores aos benef�cios de \n"
				+ "um simples residente. \n"
				+ "\nPara mais informa��es, basta ler um breve texto contando um pouco mais sobre a hist�ria da \n"
				+ "sociedade antiga era moderna e a atual era tecnol�gica sustent�vel.\n" + "", TimeUnit.MILLISECONDS,
				tempoRapido);
	}

	static void earlyGame03(String nomePersonagem) throws InterruptedException {
		narrativa("\n\n" + nomePersonagem + ", gostaria de ler o texto mencionado?\n" + "[ 1 ] - Sim, por gentileza!\n"
				+ "[ 2 ] - N�o, muito obrigado!\n" + "", TimeUnit.MILLISECONDS, tempoLento);
		int resposta;
		do {
			resposta = leitor.nextInt();
		} while (resposta < 1 || resposta > 2);

		switch (resposta) {
		case 1:
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
			break;
		case 2:
			narrativa("" + "\n\nCaso mude de ideia, basta ir a biblioteca e ler o documento: EraSustentavel\n" + "",
					TimeUnit.MILLISECONDS, tempoRapido);
			break;
		}
	}

	static void bibliotecaCnac(String nomePersonagem) throws InterruptedException {

		narrativa("\n\nBem vindo " + nomePersonagem + " a biblioteca Universit�ria C-nac-01/3\n", TimeUnit.MILLISECONDS,
				tempoLento);
		boolean sair = true;
		do {
			narrativa("Lista de documentos acessiveis com o seu nivel:\n" + "\n[EraSustentavel]\n" + "[Verdade101}\n"
					+ "\nCaso queira ler algum documento, basta escrever o nome dele! Caso contrario, digite sair.\n"
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
						+ "\n Com essa hist�ria em mente, pedimos que se concentre na realiza��o de seu exame, e \n"
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
								+ " por ter visitado a biblioteca da Universit�ria C-nac-01/3\n",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\n\nN�o entendemos sua solicita��o, por gentileza tente novamente!\n", TimeUnit.MILLISECONDS,
						tempoRapido);
			}
		} while (sair);
	}

	public static void jogoCnac() throws InterruptedException {
		narrativa("\n\nBem vindo ao universo de C-NAC!\n", TimeUnit.MILLISECONDS, tempoRapido);
		String nomePersonagem = nomePersonagem();
		earlyGame01(nomePersonagem);
		earlyGame02(nomePersonagem);
		earlyGame03(nomePersonagem);

		bibliotecaCnac(nomePersonagem);

	}

	public static void instrucoes() throws InterruptedException {
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
				narrativa("\n\nVoc� conseguiu compreender, continue assime bom jogo!", TimeUnit.MILLISECONDS,
						tempoLento);
				sair = false;
				break;
			default:
				narrativa("\n\nTente mais uma vez! e lembre-se, o que deve ser digitado est� entre colchetes [ ]\n"
						+ "\nDigite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoLento);
				sair = true;
				break;
			}
		} while (sair);
	}

	public static void creditos() throws InterruptedException {
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
		byte resposta;
		do {
			narrativa("\n\nMenu de op��es:\n\n" + "[ 1 ] - Jogar\n" + "[ 2 ] - Instru��es\n" + "[ 3 ] - Cr�ditos\n"
					+ "[ 4 ] - Sair\n\n" + "Insira a op��o desejada: ", TimeUnit.MILLISECONDS, tempoLento);
			resposta = leitor.nextByte();
		} while (resposta < 1 || resposta > 4);

		boolean sair = true;
		do {
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
