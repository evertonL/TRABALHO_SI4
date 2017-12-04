package br.edu.univas.si.controller;

import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import br.edu.univas.si.listener.CadastrarPacienteButtonListener;
import br.edu.univas.si.model.PacienteTO;
import br.edu.univas.si.model.dao.PacienteDAO;
import br.edu.univas.si.view.AddPacientePanel;

public class AddPacienteController {

	private AddPacientePanel addContaPanel;
	private PacienteTO paciente;
	private PacienteDAO pacienteDAO;
	
	public AddPacienteController() {
		addContaPanel = new AddPacientePanel();
		pacienteDAO = new PacienteDAO();
	}
	
	public Component getComponent() {
		return addContaPanel;
	}

	public void init() {
		setListener();
	}
	
	private void setListener() {
		addContaPanel.setListener(new CadastrarPacienteButtonListener() {
			
			@Override
			public void cadastrar() {
				addConta();
			}
		});
	}
	
	private void addConta() {
		paciente = new PacienteTO();
		paciente.setNome(addContaPanel.getNomeTextField().getText());
		paciente.setCodigo(addContaPanel.getCodigoTextField().getText());
		
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
			paciente.setData(sdf.parse(addContaPanel.getDataTextField().getText()));
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(addContaPanel, "Por favor digite a data no seguinte formato: dd/MM/yyyy",
					"Erro", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		pacienteDAO.cadastrar(paciente);
		JOptionPane.showMessageDialog(addContaPanel, "Conta salva com sucesso!",
				"Sucesso", JOptionPane.INFORMATION_MESSAGE);
		cleanFields();
	}

	private void cleanFields() {
		addContaPanel.getDataTextField().setText(null);
		addContaPanel.getNomeTextField().setText(null);
		addContaPanel.getCodigoTextField().setText(null);
	}
	
}