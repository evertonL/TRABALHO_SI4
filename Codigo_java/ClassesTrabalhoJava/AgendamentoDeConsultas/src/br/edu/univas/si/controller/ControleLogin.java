package br.edu.univas.si.controller;

import javax.swing.JTextField;

import br.edu.univas.si.model.UsuarioTO;
import br.edu.univas.si.model.dao.UsuarioDAO;

public class ControleLogin {
	
	
	private JTextField nomeTextField;
	private JTextField senhaTextField;
	private UsuarioTO usuario;
	
	
	public void PegandoInformacão() {
		usuario = new UsuarioTO();
		usuario.setNome(getNomerTextField().getText());
		usuario.setSenha(getSenhaTextField().getText());
		
		if(autenticar() == true) {
			System.out.println("Login feio");
		}else {
			System.out.println("Erro de login");
		}
	
	}
	
	public boolean autenticar() {
		
		if(UsuarioDAO.getNome().equals(nomeTextField) && UsuarioDAO.getSenha().equals(senhaTextField)) {
			return true;
		}
	return false;
}

	public JTextField getNomerTextField() {
		return nomeTextField;
	}

	public JTextField getSenhaTextField() {
		return senhaTextField;
	}

	
}
