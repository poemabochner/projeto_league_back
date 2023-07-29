-- Database: banco-league

-- DROP DATABASE IF EXISTS "banco-league";

CREATE DATABASE "banco-league"
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	CREATE TABLE usuario(
		id_usuario serial primary key,
		nome_usuario varchar(20) NOT NULL UNIQUE,
		senha_usuario varchar(255) NOT NULL
	);
	
	CREATE TABLE campeao (
		id_campeao serial primary key,
		nome_campeao varchar(30) NOT NULL UNIQUE,
		funcao_campeao varchar(30) NOT NULL,
		epiteto_campeao varchar(255) NOT NULL,
		dificuldade_campeao varchar(30) NOT NULL,
		url_imagem_campeao varchar(255) NOT NULL,
		historia_campeao text
	);
	
	CREATE TABLE habilidade (
		id_habilidade serial primary key,
		id_campeao int NOT NULL REFERENCES campeao(id_campeao),
		tecla_habilidade varchar(15) NOT NULL,
		nome_habilidade varchar(255) NOT NULL,
		descricao_habilidade text
	);
	
	INSERT INTO campeao (nome_campeao, funcao_campeao, epiteto_campeao, dificuldade_campeao, url_imagem_campeao, historia_campeao) VALUES
		('Ahri', 
		 'Mago', 
		 'a raposa de nove caudas', 
		 'moderado', 
		 'https://iili.io/HQyV6JI.jpg', 
		 'A ligação de Ahri com a magia do mundo espiritual é inata. Ela é uma vastaya com traços de raposa, capaz de manipular as emoções de sua presa e consumir sua essência, devorando também as memórias e as percepções de cada alma absorvida. Outrora uma predadora poderosa, porém rebelde, Ahri agora viaja pelo mundo em busca de vestígios dos seus antepassados enquanto tenta substituir as memórias roubadas por novas de sua própria autoria.');
	
	INSERT INTO habilidade (id_campeao, tecla_habilidade, nome_habilidade, descricao_habilidade) VALUES
		('1',
		 'Passiva',
		 'Furto de Essência',
		 'Depois de abater 9 tropas ou monstros, Ahri se cura. Depois de eliminar um Campeão inimigo, Ahri se cura em uma quantidade ainda maior.'
		),
		('1',
		 'Q',
		 'Orbe da Ilusão',
		 'Ahri lança e puxa de volta seu orbe, causando Dano Mágico na ida e Dano Verdadeiro na volta.'
		),
		('1',
		 'W',
		 'Fogo de Raposa',
		 'Ahri recebe um breve impulso de Velocidade de Movimento e lança três Fogos de Raposa que perseguem e atacam inimigos próximos.'
		),
		('1',
		 'E',
		 'Encanto',
		 'Ahri manda um beijo que causa dano e encanta um inimigo, interrompendo imediatamente qualquer habilidade de movimento em progresso e fazendo com que ele ande inofensivamente em sua direção.'
		),
		('1',
		 'R',
		 'Ímpeto Espiritual',
		 'Ahri avança e dispara raios de essência, causando dano a inimigos próximos. Ímpeto Espiritual pode ser conjurada até três vezes antes de entrar em Tempo de Recarga e ganha reconjurações adicionais ao eliminar Campeões inimigos.'
		);
		
		INSERT INTO usuario (nome_usuario, senha_usuario) VALUES (
			'goth lux',
			'$2a$10$her7X3v9z5HMaq5lBZBhAuun3Gkm16ideO2KktX5fZpI3L5bfS.YG'
		);
		
		('Ahri', 
         'Mago', 
         'a raposa de nove caudas', 
         'moderado', 
         'https://iili.io/HZK5Ret.png', 
         'A ligação de Ahri com a magia do mundo espiritual é inata. Ela é uma vastaya com traços de raposa, capaz de manipular as emoções de sua presa e consumir sua essência, devorando também as memórias e as percepções de cada alma absorvida. Outrora uma predadora poderosa, porém rebelde, Ahri agora viaja pelo mundo em busca de vestígios dos seus antepassados enquanto tenta substituir as memórias roubadas por novas de sua própria autoria.'),

        ('Lux', 
         'Mago', 
         'a dama da luz', 
         'moderado', 
         'https://iili.io/HZK78ns.png', 
         'Luxanna Stemmaguarda nasceu em Demacia, um reino insular onde habilidades mágicas são vistas com medo e desconfiança. Capaz de dobrar a luz à sua vontade, ela cresceu temendo ser descoberta e exilada, e foi forçada a manter seus poderes em segredo a fim de preservar o status de nobreza de sua família. Apesar de tudo, o otimismo e resiliência de Lux a levaram a aceitar seus talentos únicos e agora ela os utiliza em segredo a serviço de sua terra natal.'),

        ('Zed', 
         'Assassino', 
         'o mestre das sombras', 
         'moderado', 
         'https://iili.io/HZKYsgR.png', 
         'Absolutamente impiedoso e implacável, Zed é o líder da Ordem das Sombras; uma organização criada com a intenção de militarizar as tradições marciais e mágicas de Ionia para expulsar os invasores noxianos. Durante a guerra, o desespero o levou a libertar a forma secreta das sombras, uma magia espiritual malévola tão perigosa e manipuladora quanto poderosa. Zed dominou todas essas técnicas proibidas para destruir qualquer coisa que considerasse uma ameaça a sua nação, ou a sua nova ordem.'),

        ('Katarina', 
         'Assassino', 
         'a lâmina sinistra', 
         'alta', 
         'https://iili.io/HZKcXFj.png', 
         'Decisiva em seus julgamentos e letal em combate, Katarina é a assassina de maior calibre de Noxus. Filha mais velha do lendário General Du Couteau, Katarina é reconhecida por seus assassinatos eficientes contra inimigos desavisados. Sua ambição ardente a levou a buscar alvos extremamente protegidos, mesmo correndo o risco de colocar seus aliados em perigo; mas não importa a missão, Katarina não hesita ao executar seu dever no meio de um furacão de adagas serrilhadas.'),

        ('Lulu', 
         'Suporte', 
         'a fada feiticeira', 
         'moderado', 
         'https://iili.io/HZKlhsn.png', 
         'A maga yordle Lulu é conhecida por conjurar ilusões de sonhos e criaturas fantasiosas enquanto vaga por Runeterra com seu silfo companheiro, Pix. Lulu transforma a realidade por capricho, distorcendo o que ela vê como restrições desse banal reino físico. Apesar de alguns considerarem sua magia no mínimo anormal, e no máximo perigosa, ela acredita que todos merecem um toque de encanto.'),

        ('Janna', 
         'Suporte', 
         'a fúria da tormenta', 
         'moderado', 
         'https://iili.io/HZK1Tn1.png', 
         'Armada com o poder das ventanias de Runeterra, Janna é um misterioso e elemental espírito de vento que protege os desfavorecidos de Zaun. Alguns acreditam que Janna surgiu a partir dos clamores dos marinheiros de Runeterra, que rezavam por ventos mais amistosos enquanto navegavam por águas turbulentas e severas tempestades. Desde então, suas graças e sua proteção têm sido imploradas nas profundezas de Zaun, onde Janna se tornou um símbolo de esperança para os necessitados. Ninguém sabe onde nem quando ela pode aparecer, mas diversas vezes ela chega para ajudar.');


    INSERT INTO habilidade (id_campeao, tecla_habilidade, nome_habilidade, descricao_habilidade) VALUES
        ('1',
         'Passiva',
         'Furto de Essência',
         'Depois de abater 9 tropas ou monstros, Ahri se cura. Depois de eliminar um Campeão inimigo, Ahri se cura em uma quantidade ainda maior.'
        ),
        ('1',
         'Q',
         'Orbe da Ilusão',
         'Ahri lança e puxa de volta seu orbe, causando Dano Mágico na ida e Dano Verdadeiro na volta.'
        ),
        ('1',
         'W',
         'Fogo de Raposa',
         'Ahri recebe um breve impulso de Velocidade de Movimento e lança três Fogos de Raposa que perseguem e atacam inimigos próximos.'
        ),
        ('1',
         'E',
         'Encanto',
         'Ahri manda um beijo que causa dano e encanta um inimigo, interrompendo imediatamente qualquer habilidade de movimento em progresso e fazendo com que ele ande inofensivamente em sua direção.'
        ),
        ('1',
         'R',
         'Ímpeto Espiritual',
         'Ahri avança e dispara raios de essência, causando dano a inimigos próximos. Ímpeto Espiritual pode ser conjurada até três vezes antes de entrar em Tempo de Recarga e ganha reconjurações adicionais ao eliminar Campeões inimigos.'
        ),


        ('2',
         'Passiva',
         'Iluminação',
         'As habilidades de dano de Lux carregam o alvo com energia por alguns segundos. O próximo ataque de Lux incendeia a energia, causando Dano Mágico adicional (com base no nível de Lux) ao alvo.'
        ),
        ('2',
         'Q',
         'Ligação da luz',
         'Lux atira uma esfera de luz que se prende e causa dano em até duas unidades inimigas.'
        ),
        ('2',
         'W',
         'Barreira prismática',
         'Lux lança sua varinha e uma luz envolve todos os aliados atingidos, protegendo-os contra dano inimigo.'
        ),
        ('2'
         'E',
         'Singularidade lucente',
         'Dispara uma luz irregular em uma área, reduzindo a velocidade de inimigos próximos. Lux pode detoná-la para causar dano aos inimigos na área de ação.'
        ),
        ('2',
         'R',
         'Centelha final',
         'Após acumular energia, Lux dispara um feixe de luz que causa dano a todos os inimigos na área. Além disso, ativa a habilidade passiva de Lux e reinicia a duração do efeito de Iluminação.'
        ),

        ('3',
         'Passiva',
         'Desprezo pelos fracos',
         'Os ataques básicos de Zed contra alvos com pouca Vida causam Dano Mágico adicional. Esse efeito pode ocorrer contra o mesmo Campeão inimigo apenas uma vez a cada poucos segundos.'
        ),
        ('3',
         'Q',
         'Shuriken laminado',
         'Zed e suas sombras arremessam seus shurikens. Cada shuriken causa dano em todos os inimigos atingidos.'
        ),
        ('3',
         'W',
         'Sombra viva',
         'Efeito passivo: Zed recebe energia sempre que ele e suas sombras atingem um inimigo com a mesma habilidade. A energia só pode ser recebida uma vez a cada conjuração de habilidade. Ativo: A sombra de Zed avança e fica no mesmo lugar por alguns segundos. Quando Sombra Viva é reativada, Zed troca de posição com sua sombra.'
        ),
        ('3'
         'E',
         'Corte sombrio',
         'Zed e as Sombras dele atacam, causando dano a inimigos próximos. Inimigos atingidos pelo corte de uma Sombra sofrem Lentidão.'
        ),
        ('3',
         'R',
         'Marca fatal',
         'Zed se torna inalvejável e avança contra um Campeão inimigo para marcá-lo. Após 3 segundos, a marca é ativada, repetindo parte de todo o dano que Zed causou ao alvo enquanto ele estava marcado.'
        ),

        ('4',
         'Passiva',
         'Voracidade',
         'Os Tempos de Recarga de Katarina são reduzidos drasticamente sempre que um Campeão que ela havia causado dano recentemente morrer. Se apanhar uma Adaga, Katarina a usa para cortar todos os inimigos próximos, causando Dano Mágico.'
        ),
        ('4',
         'Q',
         'Lâmina saltitante',
         'Katarina arremessa uma Adaga no alvo. Ela salta em inimigos próximos antes de ricochetear e cair no chão.'
        ),
        ('4',
         'W',
         'Preparação',
         'Katarina recebe um impulso de Velocidade de Movimento e joga uma Adaga para cima.'
        ),
        ('4'
         'E',
         'Shunpo',
         'Katarina desloca-se em direção ao alvo, golpeando-o caso seja inimigo ou golpeando o inimigo mais próximo caso não seja.'
        ),
        ('4',
         'R',
         'Lótus da morte',
         'Katarina gira em torno de si mesma, disparando adagas muito rapidamente e causando muito Dano Mágico nos 3 Campeões inimigos mais próximos.'
        ),

        ('5',
         'Passiva',
         'Pix, o silfo companheiro',
         'Pix faz disparos de energia mágica sempre que o Campeão que estiver seguindo atacar outra unidade inimiga. Os disparos seguem o inimigo, mas podem ser interceptados por outras unidades.'
        ),
        ('5',
         'Q',
         'Lança-purpurina',
         'Pix e Lulu disparam um raio de energia mágica que causa dano e muita Lentidão aos inimigos atingidos.'
        ),
        ('5',
         'W',
         'Caprichos',
         'Se conjurada sobre um aliado, ela lhe concede Velocidade de Movimento por um curto período de tempo. Se lançado sobre um inimigo, ele é transformado em um adorável bichinho que não pode atacar nem lançar feitiços.'
        ),
        ('5'
         'E',
         'Socorro, Pix!',
         'Se conjurada em um aliado, ordena para que Pix pule nele e o proteja. Ela em seguida o segue e ajuda com seus ataques. Se conjurada em um inimigo, ordena para que Pix pule nele e o atinja. Ela o segue e lhe concede visão do inimigo.'
        ),
        ('5',
         'R',
         'Crescimento virente',
         'Lulu aumenta o tamanho de um aliado, arremessando ao ar inimigos próximos e concedendo ao aliado uma grande quantidade de Vida adicional. Pelos próximos segundos, tal aliado recebe uma aura que reduz a velocidade de inimigos próximos.'
        ),

        ('6',
         'Passiva',
         'Brisa de impulso',
         'Janna recebe Velocidade de Movimento adicional ao se mover em direção a Campeões aliados. Aliados próximos recebem esse efeito quando se movem em direção a ela.'
        ),
        ('6',
         'Q',
         'Ventania uivante',
         'Através de uma alteração pontual de temperatura e pressão, Janna consegue criar uma pequena tempestade que cresce em tamanho ao longo do tempo. Ela pode ativar a habilidade novamente para desferir a tempestade. Ao ser desferida, a tempestade se desloca em linha reta na direção em que foi conjurada, causando dano e arremessando ao ar quaisquer inimigos em seu caminho.'
        ),
        ('6',
         'W',
         'Zéfero',
         'Janna invoca um elemental do ar que aumenta passivamente sua Velocidade de Movimento e permite que ela atravesse unidades. Ela também pode ativar essa habilidade para causar dano e Lentidão a um inimigo. O efeito passivo é perdido enquanto a habilidade estiver em Tempo de Recarga.'
        ),
        ('6'
         'E',
         'Olho da tempestade',
         'Janna conjura uma ventania defensiva que protege um Campeão ou torre aliada do dano recebido e aumenta seu Dano de Ataque.'
        ),
        ('6',
         'R',
         'Monção',
         'Janna se cerca de uma tempestade mágica, empurrando inimigos para trás. Assim que a tempestade se estabelece, ventos suaves curam os aliados próximos enquanto a habilidade estiver ativa.'
        );