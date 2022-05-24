CREATE TABLE IF NOT EXISTS cliente(
	id_Cliente serial PRIMARY KEY,
	nm_Cliente 		varchar(50),
	ds_Endereco     varchar(50),
    cd_Telefone     varchar(50),
    ds_Email        varchar(50)
);