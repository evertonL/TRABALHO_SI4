package br.edu.univas.si.controller;


import br.edu.univas.si.listener.LIstenerTopButtons;
import br.edu.univas.si.view.MainView;

public class MainController {

	private MainView mainView;
	
	public MainController() {
		mainView = new MainView();
	}
	
	public void initApplication() {
		mainView.setListener(new LIstenerTopButtons() {
			
			@Override
			public void listar() {
				showListPanel();
			}
			
			@Override
			public void cadastrar() {
				showAddPanel();
			}
		});
		
		showListPanel();
		mainView.setVisible(true);
	}
	
	private void showListPanel() {
		ListPacienteController listPacienteTOController = new ListPacienteController();
		mainView.getCenterPanel().removeAll();
		mainView.getCenterPanel().add(listPacienteTOController.getComponent());
		mainView.revalidate();
	}
	
	private void showAddPanel() {
		AddPacienteController addPacienteController = new AddPacienteController();
		addPacienteController.init();
		mainView.getCenterPanel().removeAll();
		mainView.getCenterPanel().add(addPacienteController.getComponent());
		mainView.revalidate();
	}
	
}
