CREATE TABLE IF NOT EXISTS form(
	id serial PRIMARY KEY,
	nome	    varchar(50),
	endereco     varchar(50),
    telefone     varchar(50),
    email        varchar(50)
);