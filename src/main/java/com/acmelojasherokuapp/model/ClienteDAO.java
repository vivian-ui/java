package com.acmelojasherokuapp.model;

import java.util.List;
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
		
		//inserir
		public void inserirCliente(Cliente cliente){
			String sql = "INSERT INTO form(nome, endereco, telefone, email)" + "VALUES (?,?,?,?)";
			Object[] obj = new Object[4];
			obj[0] = cliente.getNome();
			obj[1] = cliente.getEndereco();
			obj[2] = cliente.getTelefone();
			obj[3] = cliente.getEmail();
			jdbc.update(sql, obj);
		}
		
		// exibir um perfil pelo id
		public Map<String, Object> getCliente(int id){
			String sql = "SELECT * FROM form WHERE form.id = ?";
			Object[] obj = new Object[1];
			obj[0] = id;
			//id que veio da rota fica no lugar ?
			return jdbc.queryForMap(sql,obj);
		}
		
		//listar
		public List<Map<String, Object>> getClientes(){
			String sql = "SELECT * FROM form";
			List<Map<String, Object>> clientes = (List<Map<String, Object>>) jdbc.queryForList(sql);
			return clientes;
		}
		
		//excluir
		public void deleteCliente(int id) {
			String sql = "DELETE FROM form WHERE id = ?";
			Object[] obj = new Object[1];
			obj[0] = id;
			jdbc.update(sql,obj);
		}
		
		//editer/atualizar
		public void atualizarCliente(int id, Cliente cliente) {
			String sql = "UPDATE form "+"SET nome=?, endereco=?,telefone=?, email=? "+"WHERE id=?";
			Object[] obj = new Object[5];
			obj[0] = cliente.getNome();
			obj[1] = cliente.getEndereco();
			obj[2] = cliente.getTelefone();
			obj[3] = cliente.getEmail();
			obj[4] = id;
			jdbc.update(sql, obj);
		}
		
		//busca pelo nome
		public List<Map<String, Object>> buscarCliente(String nome){
			String sql = "SELECT * FROM form WHERE form.nome = ?";
			Object[] obj = new Object[1];
			obj[0] = nome;
			//nome que veio da rota fica no lugar do ?
			return jdbc.queryForList(sql, obj);
		}
}
