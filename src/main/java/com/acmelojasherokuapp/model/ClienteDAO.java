package com.acmelojasherokuapp.model;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

	@Repository
	public class ClienteDAO{
		
		@Autowired
		DataSource dataSource;
		
		JdbcTemplate jdbc;
		
		@PostConstruct
		private void initialize() {
			jdbc = new JdbcTemplate(dataSource);
		}
		
		public void inserirCliente(Cliente cliente){
			String sql = "INSERT INTO Cliente(nm_Cliente, ds_Endereco, cd_Telefone, ds_Email)" + "VALUES (?,?,?,?)";
			Object[] obj = new Object[4];
			obj[0] = cliente.getNm_Cliente();
			obj[1] = cliente.getDs_Endereco();
			obj[2] = cliente.getCd_Telefone();
			obj[3] = cliente.getDs_Email();
			jdbc.update(sql, obj);
		}
}
