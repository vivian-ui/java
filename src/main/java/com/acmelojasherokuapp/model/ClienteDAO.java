package com.acmelojasherokuapp.model;

import java.util.Map;

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
			String sql = "INSERT INTO form(nome, endereco, telefone, email)" + "VALUES (?,?,?,?)";
			Object[] obj = new Object[4];
			obj[0] = cliente.getNome();
			obj[1] = cliente.getEndereco();
			obj[2] = cliente.getTelefone();
			obj[3] = cliente.getEmail();
			jdbc.update(sql, obj);
		}
		
		public Map<String, Object> getCliente(int id){
			String sql = "SELECT * FROM form WHERE form.id = ?";
			Object[] obj = new Object[1];
			obj[0] = id;
			//id que veio da rota fica no lugar ?
			return jdbc.queryForMap(sql,obj);
		}
		
		
}
