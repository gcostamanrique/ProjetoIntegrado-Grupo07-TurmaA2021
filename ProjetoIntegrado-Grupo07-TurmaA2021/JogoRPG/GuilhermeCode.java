package JogoRPG;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GuilhermeCode {

	static Scanner leitor = new Scanner(System.in);

	static int tempoRapido = 1, tempoLento = 1;

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
		narrativa("\n\nUM POUCO SOBRE C-NAC-01 A CIDADE DO PAÍS C-NAC.\n" + "\nMuito bem vindo " + nomePersonagem
				+ ", a cidade de C-NAC-01!\n"
				+ "Essa humilde cidade, que pertence ao pequeno país C-Nac, entretanto grande em \n"
				+ "conhecimento, segue à risca as regras que estão descritas em nossa constituição. A PRINCIPAL \n"
				+ "REGRA É que nosso glorioso país em ascensão, se baseai no conhecimento que nossos \n"
				+ "cidadãos possuem.\n"
				+ "\nNos orgulhamos muito em se destacar dos demais países por nossa INTELIGÊNCIA, trabalho \n"
				+ "duro e consciência social com nossos cidadãos. Fornecemos todas as estruturas necessárias, \n"
				+ "para a absorção do conhecimento por nossos residentes, e após um simples teste de \n"
				+ "conhecimento, fornecemos a todos o título de cidadão.\n"
				+ "\nComo um país que que defende o conhecimento, nossas organizações são aconselhadas a \n"
				+ "respeitar os níveis sociais existentes, entretanto, como somos um país com o intelecto \n"
				+ "superior, E mantenedores da paz e igualdade entre nossos cidadãos, atos discriminatórios de \n"
				+ "qualquer tipo, especialmente entre níveis sociais, é punível com o grau mais elevado da nossa \n"
				+ "gloriosa lei.\n" + "\n" + nomePersonagem
				+ " ATENÇÃO, se está se questionando quais níveis socias existem em nosso pacifico pais,\n"
				+ "forneceremos essa explicação agora mesmo.\n"
				+ "\nOs níveis sociais são informados após o seu teste, SIMPLES ASSIM. lembrando que o nível mais \n"
				+ "baixo que o teste irá fornecer o título de “cidadão D”, e o nível mais alto, é o título de “cidadão A”. \n"
				+ "ENTÃO EM SEU TESTE DE CIDADANIA, CASO RESPONDA E NÃO APRESENTE UM BOM \n"
				+ "DESEMPENHO, não se preocupe, recebendo o título de “cidadão D”, juntando méritos \n"
				+ "necessários com seu trabalho, forneceremos a oportunidade de refazer a prova, para tentar \n"
				+ "alcançar um nível superior ao já apresentado.\n"
				+ "\nClaro que pedimos a paciência de todos os cidadãos, pois como temos um número limitado de \n"
				+ "títulos para cidadãos nível A e B, caso alcance esse resultado, cidadãos aleatórios com a mesma \n"
				+ "categoria vão ser reavaliados para suas posições, caso esses cidadãos reavaliados não \n"
				+ "apresentem erros, infelizmente sua posição para ascensão será colocada em espera. caso a \n"
				+ "espera passe de um ano, o cidadão que solicitou a ascensão, devera refazer o teste para \n"
				+ "reafirmar seus direitos de ascensão.\n"
				+ "\nTais regras existentes, jamais serão corrompidas ou manipuladas, pois as consequências de tais \n"
				+ "atos seria catastrófica a nossa sociedade, sendo assim, muito improvável que após sua \n"
				+ "tentativa de ascensão, demoraremos um ano a buscar um candidato a descensão.\n"
				+ "\nOuto jeito possível de ascensão sem ocorrer a descensão de outro cidadão, é a expansão de \n"
				+ "nossa sociedade, a formação de novas cidades requer um aumento no número de cidadãos \n"
				+ "com graus elevados, sendo assim, possibilitando a ascensão sem descensão de outros.\n"
				+ "\nRelacionamentos entre níveis diferentes não é restrito de forma alguma, e novamente, \n"
				+ "qualquer ato discriminatório RESULTARA NAS MAIS PESADAS CONSEQUÊNCIAS PUNITIVAS, \n"
				+ "independentemente de seu nível.\n" + "\n" + nomePersonagem
				+ " você acabou de reber um e-mail oficial!\n" + "gostaria de o ler agora?\n"
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
				narrativa("\nInfelizmente por ser um e-mail oficial não seria prudente postergar sua leitura\n"
						+ "Vamos mostrar o e-mail agora!", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\nNão entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
	}

	static void earlyGame02(String nomePersonagem) throws InterruptedException {
		narrativa("\n\nE-mail de confirmação da prova.\n" + "\nPrezado " + nomePersonagem
				+ ", a cidade de C-nac-01 fica imensamente feliz com seu interesse no teste de cidadania!\n"
				+ "\nA data da sua prova foi marcada para o dia 10/01/2162, dez dia após o recebimento desse desse e-mail.\n"
				+ "O local da prova, será na Av. Eng. Eusébio Stevaux, 823 – Distrito 3 – C-nac-01, unidade \n"
				+ "Universitária C-nac-01/3. Lembrando que é apenas necessário levar seu cartão de residente, \n"
				+ "para a verificação da sua identidade. Nossa prova será realizada através de um computador \n"
				+ "disponível no local, onde testaremos seus conhecimentos através de 10 perguntas múltipla \n"
				+ "escolha, referentes a Conceitos de Computação. \n"
				+ "\nGostaríamos de agradecer novamente seu interesse em nossa prova de cidadania, tendo em \n"
				+ "vista que não estamos tendo uma taxa de aceitação de 100% de nossos residentes para tal \n"
				+ "prova, mesmo os benefícios de se tornar um cidadão serem muito superiores aos benefícios de \n"
				+ "um simples residente. \n"
				+ "\nPara mais informações, basta ler um breve texto contando um pouco mais sobre a história da \n"
				+ "sociedade antiga era moderna e a atual era tecnológica sustentável.\n" + "", TimeUnit.MILLISECONDS,
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
				narrativa("\n\nA breve história da antiga era moderna e a atual era tecnológica sustentável.\n"
						+ "\nA antiga era moderna, como nos referimos anteriormente ao ano de 2043, encontrou seu fim \n"
						+ "por meio de falta de recursos em 2040, porem demoraram mais três anos para terminarem de \n"
						+ "consumir os recursos estocados previamente, o que gerou uma conturbação muito mais \n"
						+ "severa na sociedade na sociedade da época.\n"
						+ "\nMilagrosamente após alguns anos em um estado de limbo, onde os cientistas que sobraram \n"
						+ "faziam o que podiam, na maior velocidade que conseguiam e com os recursos disponíveis, \n"
						+ "desenvolveram uma semente milagrosa, que se desenvolvia rápido em qualquer ambiente, e \n"
						+ "que possuía todos os nutrientes necessários para a sobrevivência humana naquele momento. \n"
						+ "\nA partir do ano de 2048 a nova era da humanidade emergiu, tendo a inteligência como \n"
						+ "principal meio de desenvolvimento. Percebeu-se que apenas estimulando esse lado do \n"
						+ "humano, seria possível manter um nível adequado de racionalidade na sociedade, evitando \n"
						+ "uma nova catástrofe devido a abuso de poder, violência e irracionalidade.\n"
						+ "\nCom a chegada da nova era, que é conhecida como era tecnológica sustentável, várias nações \n"
						+ "emergiram de suas posições geográficas, como novos nomes. Em nosso caso, o país \n"
						+ "anteriormente conhecido com Brasil, passou a ser denominado C-NAC. Para simplificar as \n"
						+ "coisas, passamos a denominar as cidades como C-NAC- (número da cidade, de forma \n"
						+ "crescente), uma forma pratica de definir nomes para nossas cidades. Atualmente estamos com \n"
						+ "um total de 1175 cidades, expandindo quando possível, porem preservando nosso modo de vida\n"
						+ "\nAgora o mais interessante, essa expansão é devido aos cidadãos existentes em nossa \n"
						+ "sociedade, por isso solicitamos que os exames de cidadania sejam realizados de forma pontual \n"
						+ "com a idade de 21 anos, no entanto não proibimos que seja feita antes ou depois dessa idade. \n"
						+ "O ideal é que seja realizado quando o residente se sinta confortável, apenas mostramos um \n"
						+ "parâmetro para que o exame não caia no esquecimento.\n"
						+ "\nO EXAME de cidadania, tem o dever de ranquear as posições dos cidadãos, com o intuito de \n"
						+ "aloca-los nas melhores funções que podem exercer dentro da sociedade, como mencionado \n"
						+ "anteriormente, esse exame pode É realizado outras vezes, a pedido do cidadão, para o efeito \n"
						+ "de ascensão ou descensão do mesmo. Os movimentos de ascensão e descensão tem o objetivo \n"
						+ "de evitar UMA FARSA dos cidadãos, na realização de seus papeis na sociedade, isso previne \n"
						+ "que erros sejam cometidos, e que situações constrangedoras para todos os habitantes seja \n"
						+ "evitado. Como acontecia na antiga era com casos de corrupção e afins.\n"
						+ "PARA CONHECER A VERDADE, tivemos que suportar muitos dos erros cometidos na antiga era \n"
						+ "moderna, nos adaptarmos a nossa nova realidade, e esse é o principal objetivo desse exame, \n"
						+ "verificar se o habitante está apto a ser inserido nessa nova e magnifica realidade, e em qual \n"
						+ "posição ele pertence, sem discriminação alguma pela posição alcançada, pelo contrário, \n"
						+ "severas punições serão dadas a aqueles que desrespeitarem isso. Em todos as unidades de \n"
						+ "educação, damos acesso a documentos de conhecimento geral, caso não esteja lendo esse \n"
						+ "documento na biblioteca, BASTA IR À BIBLIOTECA E PEDIR PELO DOCUMENTO: verdade101. Se \n"
						+ "já estiver na biblioteca, retorne ao menu e selecione o documento verdade101.\n"
						+ "\nEsse documento irá informar um pouco mais sobre os desafios que a antiga era moderna \n"
						+ "suportou em sua sociedade, e o que estamos evitando em nossa sociedade com o estimulo do \n"
						+ "conhecimento, e a verificação da capacidade de inteligência dos cidadãos. Infelizmente ainda \n"
						+ "não conseguimos ter total êxito, pois uma minoria que respeitamos, tem uma opinião \n"
						+ "contraria aos métodos que oferecemos, com isso disponibilizamos uma cidade denominada \n"
						+ "EXODO03 para tais indivíduos viverem pacificamente, sem a nossa interferência, assim como \n"
						+ "pedidos que não interfiram em nosso meio, o que infelizmente não vem acontecendo.\n"
						+ "\n Com essa história em mente, pedimos que se concentre na realização de seu exame, e \n"
						+ "desejamos todo o sucesso do para você, futuro cidadão! MAS NÃO SE ESQUEÇA, QUE \n"
						+ "ADENTRAR nossa sociedade como cidadão, irá exigir uma capacidade mental muito forte, que \n"
						+ "talvez não tenha vivido ainda, mas o encorajamos a ser ambicioso a ponto de conseguir êxito \n"
						+ "em seu teste e aguardamos você na posição mais alta, ranque A. Assim como reforçamos que, \n"
						+ "se tornando um cidadão, seu cartão de residente será substituído por um cartão de cidadão e \n"
						+ "ESSE DOCUMENTO irá alterar os status de sua vida completamente, positivamente é claro, mas \n"
						+ "isso PODE TER GRANDES CONSEQUÊNCIAS, então tome cuidado e não repita os erros do passado.\n"
						+ "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			case "NAO":
				narrativa("" + "\n\nCaso mude de ideia, basta ir a biblioteca e ler o documento: EraSustentavel\n" + "",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\nNão entendemos sua resposta, por gentileza, tente novamente\n\n", TimeUnit.MILLISECONDS,
						tempoRapido);
				sair = true;
				break;
			}
		} while (sair);
	}

	static void bibliotecaCnac(String nomePersonagem) throws InterruptedException {

		narrativa("\n\nBem vindo " + nomePersonagem + " a biblioteca Universitária C-nac-01/3\n", TimeUnit.MILLISECONDS,
				tempoLento);
		boolean sair = true;
		do {
			narrativa("\n\nLista de documentos acessiveis com o seu nivel:\n" + "\n[EraSustentavel]\n"
					+ "[Verdade101}\n"
					+ "\nCaso queira ler algum documento, basta escrever o nome dele! Caso contrario, digite [ sair ].\n\n"
					+ "Solicitação: ", TimeUnit.MILLISECONDS, tempoRapido);
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "ERASUSTENTAVEL":
				narrativa("\n\nA breve história da antiga era moderna e a atual era tecnológica sustentável.\n"
						+ "\nA antiga era moderna, como nos referimos anteriormente ao ano de 2043, encontrou seu fim \n"
						+ "por meio de falta de recursos em 2040, porem demoraram mais três anos para terminarem de \n"
						+ "consumir os recursos estocados previamente, o que gerou uma conturbação muito mais \n"
						+ "severa na sociedade na sociedade da época.\n"
						+ "\nMilagrosamente após alguns anos em um estado de limbo, onde os cientistas que sobraram \n"
						+ "faziam o que podiam, na maior velocidade que conseguiam e com os recursos disponíveis, \n"
						+ "desenvolveram uma semente milagrosa, que se desenvolvia rápido em qualquer ambiente, e \n"
						+ "que possuía todos os nutrientes necessários para a sobrevivência humana naquele momento. \n"
						+ "\nA partir do ano de 2048 a nova era da humanidade emergiu, tendo a inteligência como \n"
						+ "principal meio de desenvolvimento. Percebeu-se que apenas estimulando esse lado do \n"
						+ "humano, seria possível manter um nível adequado de racionalidade na sociedade, evitando \n"
						+ "uma nova catástrofe devido a abuso de poder, violência e irracionalidade.\n"
						+ "\nCom a chegada da nova era, que é conhecida como era tecnológica sustentável, várias nações \n"
						+ "emergiram de suas posições geográficas, como novos nomes. Em nosso caso, o país \n"
						+ "anteriormente conhecido com Brasil, passou a ser denominado C-NAC. Para simplificar as \n"
						+ "coisas, passamos a denominar as cidades como C-NAC- (número da cidade, de forma \n"
						+ "crescente), uma forma pratica de definir nomes para nossas cidades. Atualmente estamos com \n"
						+ "um total de 1175 cidades, expandindo quando possível, porem preservando nosso modo de vida\n"
						+ "\nAgora o mais interessante, essa expansão é devido aos cidadãos existentes em nossa \n"
						+ "sociedade, por isso solicitamos que os exames de cidadania sejam realizados de forma pontual \n"
						+ "com a idade de 21 anos, no entanto não proibimos que seja feita antes ou depois dessa idade. \n"
						+ "O ideal é que seja realizado quando o residente se sinta confortável, apenas mostramos um \n"
						+ "parâmetro para que o exame não caia no esquecimento.\n"
						+ "\nO EXAME de cidadania, tem o dever de ranquear as posições dos cidadãos, com o intuito de \n"
						+ "aloca-los nas melhores funções que podem exercer dentro da sociedade, como mencionado \n"
						+ "anteriormente, esse exame pode É realizado outras vezes, a pedido do cidadão, para o efeito \n"
						+ "de ascensão ou descensão do mesmo. Os movimentos de ascensão e descensão tem o objetivo \n"
						+ "de evitar UMA FARSA dos cidadãos, na realização de seus papeis na sociedade, isso previne \n"
						+ "que erros sejam cometidos, e que situações constrangedoras para todos os habitantes seja \n"
						+ "evitado. Como acontecia na antiga era com casos de corrupção e afins.\n"
						+ "PARA CONHECER A VERDADE, tivemos que suportar muitos dos erros cometidos na antiga era \n"
						+ "moderna, nos adaptarmos a nossa nova realidade, e esse é o principal objetivo desse exame, \n"
						+ "verificar se o habitante está apto a ser inserido nessa nova e magnifica realidade, e em qual \n"
						+ "posição ele pertence, sem discriminação alguma pela posição alcançada, pelo contrário, \n"
						+ "severas punições serão dadas a aqueles que desrespeitarem isso. Em todos as unidades de \n"
						+ "educação, damos acesso a documentos de conhecimento geral, caso não esteja lendo esse \n"
						+ "documento na biblioteca, BASTA IR À BIBLIOTECA E PEDIR PELO DOCUMENTO: verdade101. Se \n"
						+ "já estiver na biblioteca, retorne ao menu e selecione o documento verdade101.\n"
						+ "\nEsse documento irá informar um pouco mais sobre os desafios que a antiga era moderna \n"
						+ "suportou em sua sociedade, e o que estamos evitando em nossa sociedade com o estimulo do \n"
						+ "conhecimento, e a verificação da capacidade de inteligência dos cidadãos. Infelizmente ainda \n"
						+ "não conseguimos ter total êxito, pois uma minoria que respeitamos, tem uma opinião \n"
						+ "contraria aos métodos que oferecemos, com isso disponibilizamos uma cidade denominada \n"
						+ "EXODO03 para tais indivíduos viverem pacificamente, sem a nossa interferência, assim como \n"
						+ "pedidos que não interfiram em nosso meio, o que infelizmente não vem acontecendo.\n"
						+ "\nCom essa história em mente, pedimos que se concentre na realização de seu exame, e \n"
						+ "desejamos todo o sucesso do para você, futuro cidadão! MAS NÃO SE ESQUEÇA, QUE \n"
						+ "ADENTRAR nossa sociedade como cidadão, irá exigir uma capacidade mental muito forte, que \n"
						+ "talvez não tenha vivido ainda, mas o encorajamos a ser ambicioso a ponto de conseguir êxito \n"
						+ "em seu teste e aguardamos você na posição mais alta, ranque A. Assim como reforçamos que, \n"
						+ "se tornando um cidadão, seu cartão de residente será substituído por um cartão de cidadão e \n"
						+ "ESSE DOCUMENTO irá alterar os status de sua vida completamente, positivamente é claro, mas \n"
						+ "isso PODE TER GRANDES CONSEQUÊNCIAS, então tome cuidado e não repita os erros do passado.\n"
						+ "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "VERDADE101":
				narrativa(
						"\n\nVerdade 101 é um dos documentos mais populares e acessível em nossa sociedade, pelo fato \n"
								+ "de que ele retrata o que aconteceria na antiga era moderna, e o que evitamos a era \n"
								+ "tecnológica sustentável. \n"
								+ "\nNa antiga era moderna, a sociedade que parecia estável, na verdade sofria de uma grande \n"
								+ "necrose em seu cerne, que era a ganancia, corrupção, preconceito e tudo isso era refletido na \n"
								+ "população. Ou seja, a população sofria com a ganancia de seus governantes, ou ficavam \n"
								+ "gananciosos de mais após receber uma leve dose de poder. Todos com almas corruptas, pelo \n"
								+ "fato de que se conseguissem tirar um pouco de vantagem de qualquer coisa, não iriam pensar \n"
								+ "duas vezes, em realizar tais métodos inadequados, sem mencionar o preconceito que existia \n"
								+ "devido ao gênero, cor, religião e até por esportes comuns na época. \n"
								+ "\nTodos esses aspectos levaram a uma grave deterioração da sociedade, alguns países \n"
								+ "conseguiram expandir seus poderes e garantir uma hegemonia sobre outros locais, apenas \n"
								+ "pelo fato de fornecerem produtos para a sobrevivência humana. Isso com o tempo gerou \n"
								+ "revoltas, principalmente pelo medo das consequências de não terem com o que mais se \n"
								+ "sustentar, esse medo, com a ganância, corrupção e preconceitos enraizados, levaram a \n"
								+ "revoltas sem precedentes, e a utilização de armas que não deveriam existir, principalmente \n"
								+ "pelo seu poder destrutivo. Como consequência, houve uma diminuição da população global, \n"
								+ "tanto devido as revoltas, quanto a falta de recursos, e após o ano de 2040, quando todos os \n"
								+ "recursos acabaram, a humanidade se virou com suas reservas totais até 2043. Após o \n"
								+ "esgotamento dos recursos, principalmente alimentício, um mistério surgiu de como houveram \n"
								+ "sobreviventes, e não apenas poucos sobreviventes, até o ano de 2048, quando as sementes \n"
								+ "milagrosas surgiram.\n"
								+ "\nEsses sobreviventes, em sua totalidade cientistas, iniciaram a nova era tecnológica sustentável.\n"
								+ "\nConhecendo essa história, a ideia de ganancia, corrupção e preconceito, são as ideias menos \n"
								+ "acessíveis em nossa sociedade atual, pois o medo da história se repetir novamente é muito \n"
								+ "grande. Assim utilizamos a inteligência como nosso principal maio contra esses pensamentos \n"
								+ "bárbaros. Como mencionado, não existem relatos concretos de como os indivíduos \n"
								+ "sobreviveram dos anos de 2043 até 2048, e mesmo os que passaram por tais anos, que \n"
								+ "infelizmente já faleceram, não tocaram em tais assuntos até o fim de suas vidas.  \n"
								+ "",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "EXODO03":
				narrativa("\n\nEste é um documento, que foi de forma ilegal inserido na documentação de todas as \n"
						+ "bibliotecas do país C-NAC. Apenas aqueles que prestaram atenção aos detalhes puderam \n"
						+ "chegar até esse ponto.\n"
						+ "\nPara sermos diretos, Exodo03 é uma cidade de refugiados que existe atualmente em uma \n"
						+ "localização secreta, mesmo o país C-NAC informando que foi nos dados esse território, na \n"
						+ "verdade ele foi conquistado por meio de independência. Exodo03 é a terceira cidade do \n"
						+ "gênero, as duas primeiras Exodo01 e Exodo02, que existiam anteriormente, devido a sua \n"
						+ "localização ser revelada, houveram múltiplos ataque até finalmente não sobrar mais nenhum \n"
						+ "local para retornar. \n"
						+ "\nIndependente disso, aqui vai uma dica para você que chegou até aqui. O teste de cidadania são \n"
						+ "10 perguntas que vão ranquear os futuros cidadãos em 4 níveis, A, B, C e D. no entanto você já \n"
						+ "se perguntou o que acontece caso não alcance os critérios mínimos para essas notas? Os \n"
						+ "documentos informam qual é o destino de tais pessoas, e por isso eu digo agora!\n"
						+ "O destino daqueles que acertam menos de 6 questões, é o trabalho forçado para manter o \n"
						+ "estilo de vida dos cidadãos ranqueados, podendo nunca mais sair legalmente das instalações \n"
						+ "de trabalho, apesar de não sofrermos maus tratos, uma vida de deveres e obrigações, sem \n"
						+ "direitos, é uma vida inadequada.\n"
						+ "\nPor isso informo que para mudar essa realidade, você deve acertar todas as questões! \n"
						+ "Acertado todas, e consequentemente conseguindo o rank mais alto, rank A, você como um \n"
						+ "indivíduo de boa índole, terá o poder de ajudar na libertação dos presos nos centros de \n"
						+ "trabalho forçado. \n"
						+ "\nPrimeiro, é preciso saber que na prova você só consegue acertar 9 questões com seus \n"
						+ "conhecimentos, e com isso não consigo te auxiliar, pois as questões são aleatórias e escolhidas \n"
						+ "conforme o tema da prova, no entanto a questão de número 10, é igual em todos os testes, \n"
						+ "independente do tema. Para conseguir o rank A, é necessário no lugar da resposta da questão \n"
						+ "10, digitar o seguinte código: TADS2021NA.\n"
						+ "\nBoa sorte com sua prova, e com as consequências de seus atos caso descubram que você leu \n"
						+ "esse documento. \n" + "", TimeUnit.MILLISECONDS, tempoRapido);
				sair = true;
				break;
			case "SAIR":
				narrativa(
						"\n\nObrigado " + nomePersonagem
								+ " por ter visitado a biblioteca da Universitária C-nac-01/3\n",
						TimeUnit.MILLISECONDS, tempoRapido);
				sair = false;
				break;
			default:
				narrativa("\n\nNão entendemos sua solicitação, por gentileza tente novamente!\n", TimeUnit.MILLISECONDS,
						tempoRapido);
			}
		} while (sair);
	}

	static void jogoCnac() throws InterruptedException {
		narrativa("\n\nBem vindo ao universo de C-NAC!\n", TimeUnit.MILLISECONDS, tempoRapido);
		String nomePersonagem = nomePersonagem();
		earlyGame01(nomePersonagem);
		earlyGame02(nomePersonagem);
		earlyGame03(nomePersonagem);

		bibliotecaCnac(nomePersonagem);

	}

	static void instrucoes() throws InterruptedException {
		narrativa("\n\nAs instruções do jogo são bem simples, basta uma leitura ativa e respostas atentas. Para uma \n"
				+ "leitura ativa, repare nos aspectos dos textos e foque na compreensão do que está sendo \n"
				+ "transmitido, agora para respostas atentas basta inserir no console as informações requeridas.\n"
				+ "\nAs informações requeridas, sempre estarão destacadas entre [ colchetes ], com um \n"
				+ "espaçamento maior de cada lado.\n"
				+ "\nPor exemplo: se no console for solicitado para digitar algo, e uma ou mais palavras, letras ou \n"
				+ "números estiverem entre colchetes, digite a palavra, letra ou número escolhido entre colchetes\n"
				+ "\n[ A ] – Olá\n" + "[ B ] – Tchau\n"
				+ "\nO correto é digitar [ A ] para representar o Olá ou [ B ] para representar o Tchau. Mas não se \n"
				+ "preocupe se errar, a questão será repetida para uma nova resposta ser inserida.\n"
				+ "\nDigite [ OK ] para sair!\n" + "", TimeUnit.MILLISECONDS, tempoRapido);
		boolean sair = true;
		do {
			String resposta = leitor.next();
			switch (resposta.toUpperCase()) {
			case "OK":
				narrativa("\nVocê conseguiu compreender, continue assim e bom jogo!", TimeUnit.MILLISECONDS,
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

	static void creditos() throws InterruptedException {
		narrativa("\n\nO jogo C-NAC, foi desenvolvido por Erick Barbosa Cavichioni, Guilherme Costa Manrique e \n"
				+ "Matheus Rocha Galdino da Silva, todos estudantes do Centro Universitário Senac Santo Amaro, \n"
				+ "cursando Tecnologia de Analise e desenvolvimento de Sistemas, iniciado no primeiro semestre \n"
				+ "de 2021.\n"
				+ "\nO jogo C-NAC é um projeto montado com o objetivo avaliativo para a matéria Projeto \n"
				+ "Integrador I, ministrada pelo professor Dr. Eduardo Takeo Ueda.\n"
				+ "\nO projeto tem como um dos objetos, testar os conhecimentos dos estudantes referentes a \n"
				+ "qualquer matéria cursada no semestre, sendo assim, o grupo optou por escolher a matéria \n"
				+ "Conceitos de Computação, ministrada pelo professor Stelvio Barbosa.\n"
				+ "\nO grupo tem um agradecimento especial aos professores, por suas orientações que fizerem \n"
				+ "esse projeto ser possível.\n" + "\nDigite [ OK ] para sair!\n", TimeUnit.MILLISECONDS, tempoRapido);
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
				narrativa("\n\nMenu de opções:\n\n" + "[ 1 ] - Jogar\n" + "[ 2 ] - Instruções\n" + "[ 3 ] - Créditos\n"
						+ "[ 4 ] - Sair\n\n" + "Insira a opção desejada: ", TimeUnit.MILLISECONDS, tempoLento);
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
				narrativa("\n\nAté breve jogador!", TimeUnit.MILLISECONDS, tempoLento);
				sair = false;
				break;
			}
		} while (sair);
	}
}
