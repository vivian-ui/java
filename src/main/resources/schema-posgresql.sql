CREATE TABLE IF NOT EXIST Cliente (
		id_Cliente serial  	PRIMARY KEY,
		nm_Cliente 		varchar(20) NULL,
		ds_Endereco     varchar(20) NULL,
       	cd_CPF          varchar(20) NULL,
       	nm_Cidade       varchar(20) NULL,
       	nm_Bairro       varchar(20) NULL,
       	sg_Estado       varchar(20) NULL,
       	cd_Telefone     varchar(20) NULL,
       	ds_Email        varchar(20) NULL
);