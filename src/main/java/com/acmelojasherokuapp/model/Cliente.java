package com.acmelojasherokuapp.model;

public class Cliente {
	private int id_Cliente;
	private String nm_Cliente, ds_Endereco, cd_Telefone, ds_Email;
	
	public Cliente() {
		
	}
		
	public Cliente(int id_Cliente, String nm_Cliente, String ds_Endereco, String cd_Telefone, String ds_Email) {
		this.id_Cliente = id_Cliente;
		this.nm_Cliente = nm_Cliente;
		this.ds_Endereco = ds_Endereco;
		this.cd_Telefone = cd_Telefone;
		this.ds_Email = ds_Email;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public  String getNm_Cliente() {
		return nm_Cliente;
	}

	public void setNm_Cliente(String nm_Cliente) {
		this.nm_Cliente = nm_Cliente;
	}

	public String getDs_Endereco() {
		return ds_Endereco;
	}

	public void setDs_Endereco(String ds_Endereco) {
		this.ds_Endereco = ds_Endereco;
	}

	public String getCd_Telefone() {
		return cd_Telefone;
	}

	public void setCd_Telefone(String cd_Telefone) {
		this.cd_Telefone = cd_Telefone;
	}

	public String getDs_Email() {
		return ds_Email;
	}

	public void setDs_Email(String ds_Email) {
		this.ds_Email = ds_Email;
	}
}
