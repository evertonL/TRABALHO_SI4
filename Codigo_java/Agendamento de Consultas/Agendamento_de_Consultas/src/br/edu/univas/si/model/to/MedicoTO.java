package br.edu.univas.si.model.to;

public class MedicoTO {
	
	private String cpf;    //PK
	private String nome;
	private String especialidade;
	
	public MedicoTO(String cpf, String nome, String especialidade){
		
		this.cpf = cpf;
		this.nome = nome;
		this.especialidade = especialidade;
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
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	

}
