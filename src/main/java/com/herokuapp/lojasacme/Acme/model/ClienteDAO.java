package com.herokuapp.lojasacme.Acme.model;

import java.util.List;

@Repository
public class ClienteDAO<Objetc> {
	
	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbc;
	
	@PostConstruct
	private void initialize() {
		jdbc = new JdbcTemplate(dataSource);
	}
	
	public void inserirCliente(com.herokuapp.lojasacme.Acme.model.Cliente Cliente){
		String sql = "INSERT INTO Cliente(nm_Cliente, ds_Endereco, cd_CPF, nm_Cidade, nm_Bairro, sg_Estado, cd_Telefone, ds_Email" + "VALUES (?,?,?,?,?,?,?,?)";
		Object[] obj = new Objetc[8];
		obj[0] = Cliente.getNm_Cliente();
		obj[1] = Cliente.getDs_Endereco();
		obj[2] = Cliente.getCd_CPF();
		obj[3] = Cliente.getNm_Cidade();
		obj[4] = Cliente.getNm_Bairro();
		obj[5] = Cliente.getSg_Estado();
		obj[6] = Cliente.getCd_Telefone();
		obj[7] = Cliente.getDs_Email();
	}
	
	
}
