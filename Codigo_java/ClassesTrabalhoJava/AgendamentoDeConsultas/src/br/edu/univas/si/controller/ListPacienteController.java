package br.edu.univas.si.controller;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import br.edu.univas.si.model.PacienteTO;
import br.edu.univas.si.model.dao.PacienteDAO;
import br.edu.univas.si.view.ListPacientePanel;

public class ListPacienteController {

	private ListPacientePanel listContaPanel;
	private PacienteDAO pacienteDAO;
	
	public ListPacienteController() {
		pacienteDAO = new PacienteDAO();
		ArrayList<PacienteTO> pacientes = pacienteDAO.listar();
	}
	
	public Component getComponent() {
		ArrayList<PacienteTO> pacientes = pacienteDAO.listar();

		return listContaPanel;
	}
	
}
