CREATE TABLE IF NOT EXISTS cliente(
	id_Cliente serial PRIMARY KEY,
	nm_Cliente 		varchar(50) NULL,
	ds_Endereco     varchar(20) NULL,
    cd_CPF          varchar(11) NULL,
    nm_Cidade       varchar(20) NULL,
    nm_Bairro       varchar(20) NULL,
    sg_Estado       varchar(02) NULL,
    cd_Telefone     varchar(10) NULL,
    ds_Email        varchar(20) NULL
);