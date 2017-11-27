package br.edu.univas.si.model.to;

import java.util.Date;

public class AgendaTO {
	
	private int idConsulta;
	private String status;
	private String prescricaoMedica;
	private Date data;
	private String cpfPaciente;
	private String cpf;
	
	public AgendaTO(int idConsulta, String status, String prescricaoMedica, Date data, String cpfPaciente, String cpf){
		
		 this.idConsulta =  idConsulta;
		 this.status = status;
		 this.prescricaoMedica = prescricaoMedica;
		 this.data = data;
		 this.cpfPaciente = cpfPaciente;
		 this.cpf = cpf;
		
	}
	
	public int getIdConsulta() {
		return idConsulta;
	}
	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPrescricaoMedica() {
		return prescricaoMedica;
	}
	public void setPrescricaoMedica(String prescricaoMedica) {
		this.prescricaoMedica = prescricaoMedica;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getCpfPaciente() {
		return cpfPaciente;
	}
	public void setCpfPaciente(String cpfPaciente) {
		this.cpfPaciente = cpfPaciente;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
