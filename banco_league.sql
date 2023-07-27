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