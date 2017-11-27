package br.edu.univas.si.model.to;

public class UsuarioTO {

	private String cpf;		//PK
	private String nome;
	private String senha;
	private String cpfm;   //FK
	
	public UsuarioTO(){	
	}
	
	public UsuarioTO(String cpf, String nome, String senha, String cpfm){
		this.cpf = cpf;
		this.nome = nome;
		this.senha = senha;
		this.cpfm = cpfm;
		
	}
	

	public String getMedico_cpf() {
		return cpfm;
	}

	public void setMedico_cpf(String medico_cpf) {
		this.cpfm = cpfm;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
