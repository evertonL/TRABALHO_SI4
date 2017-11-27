package br.edu.univas.si.model.to;

import java.util.Date;

public class PacienteTO {
	
	private String cpfPaciente; //PK
	private String nome;
	private String telefone;
	private Date dataNacimento;
	
	
	public PacienteTO(String cpfPaciente, String nome, String telefone, Date dataNacimento){
		this.cpfPaciente = cpfPaciente;
		this.nome = nome;
		this.telefone = telefone;
		this.dataNacimento = dataNacimento;

	}
	
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Date getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(Date dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

}
