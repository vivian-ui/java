package com.herokuapp.lojasacme.Acme.model;

public class Cliente {
	private int id_Cliente;
	private String nm_Cliente, ds_Endereco, cd_CPF, nm_Cidade, nm_Bairro, sg_Estado, cd_Telefone, ds_Email;
	
	public Cliente() {
		
	}
		
	public Cliente(int id_Cliente, String nm_Cliente, String ds_Endereco, String cd_CPF, String nm_Cidade,
			String nm_Bairro, String sg_Estado, String cd_Telefone, String ds_Email) {
		this.id_Cliente = id_Cliente;
		this.nm_Cliente = nm_Cliente;
		this.ds_Endereco = ds_Endereco;
		this.cd_CPF = cd_CPF;
		this.nm_Cidade = nm_Cidade;
		this.nm_Bairro = nm_Bairro;
		this.sg_Estado = sg_Estado;
		this.cd_Telefone = cd_Telefone;
		this.ds_Email = ds_Email;
	}

	public int getId_Cliente() {
		return id_Cliente;
	}

	public void setId_Cliente(int id_Cliente) {
		this.id_Cliente = id_Cliente;
	}

	public String getNm_Cliente() {
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

	public String getCd_CPF() {
		return cd_CPF;
	}

	public void setCd_CPF(String cd_CPF) {
		this.cd_CPF = cd_CPF;
	}

	public String getNm_Cidade() {
		return nm_Cidade;
	}

	public void setNm_Cidade(String nm_Cidade) {
		this.nm_Cidade = nm_Cidade;
	}

	public String getNm_Bairro() {
		return nm_Bairro;
	}

	public void setNm_Bairro(String nm_Bairro) {
		this.nm_Bairro = nm_Bairro;
	}

	public String getSg_Estado() {
		return sg_Estado;
	}

	public void setSg_Estado(String sg_Estado) {
		this.sg_Estado = sg_Estado;
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
