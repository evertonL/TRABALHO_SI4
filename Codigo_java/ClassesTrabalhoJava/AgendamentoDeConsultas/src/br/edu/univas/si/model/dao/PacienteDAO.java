package br.edu.univas.si.model.dao;

import java.util.ArrayList;

import br.edu.univas.si.model.PacienteTO;

public class PacienteDAO {

	private static ArrayList<PacienteTO> pacientes = new ArrayList<PacienteTO>();
	
	public void cadastrar(PacienteTO paciente) {
		pacientes.add(paciente);
	}
	
	public ArrayList<PacienteTO> listar() {
		return pacientes;
	}
	
}
