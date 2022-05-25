package com.acmelojasherokuapp.model;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
	
	@Autowired
	ClienteDAO cdao;
	
	public void inserirCliente(Cliente c) {
		cdao.inserirCliente(c);
	}	
	
	public Map<String,Object> getCliente(int id){
		return cdao.getCliente(id);
	}
	//lista de registros 
	public List<Map<String, Object>> getClientes(){
		return cdao.getClientes();
	}
	
	public void deleteCliente(int id) {
		cdao.deleteCliente(id);
	}
	
	public void atualizarCliente(int id, Cliente c) {
		cdao.atualizarCliente(id, c);
	}

	public Map<String, Object> buscarCliNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
