create database if not exists projetoweb03;

use projetoweb03;

create table aluno(
	id bigint primary key auto_increment,
	nome varchar(150) not null,
	email varchar(255) not null unique,
	tel varchar(20) not null,
	dtNasc date not null
);