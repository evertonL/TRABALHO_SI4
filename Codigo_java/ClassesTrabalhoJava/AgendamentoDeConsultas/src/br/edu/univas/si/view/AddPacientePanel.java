package br.edu.univas.si.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.edu.univas.si.listener.CadastrarPacienteButtonListener;

public class AddPacientePanel extends JPanel {

	private static final long serialVersionUID = 4253440926691625229L;
	
	private CadastrarPacienteButtonListener listener;
	
	private JTextField codigoTextField;
	private JTextField dataTextField;
	private JTextField nomeTextField;
	
	public AddPacientePanel() {
		addComponent();
	}
	
	private void addComponent() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		JLabel codigoLabel = new JLabel();
		codigoLabel.setText("Codigo:");
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.fill = GridBagConstraints.HORIZONTAL;
		gbc.anchor = GridBagConstraints.LINE_END;
		gbc.insets = new Insets(15, 15, 10, 15);
		this.add(codigoLabel, gbc);
		
		codigoTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(codigoTextField, gbc);
		
		JLabel dataLabel = new JLabel();
		dataLabel.setText("Data:");
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(dataLabel, gbc);
		
		dataTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(dataTextField, gbc);
		
		JLabel nomeLabel = new JLabel();
		nomeLabel.setText("Nome:");
		gbc.gridx = 0;
		gbc.gridy = 2;
		gbc.weightx = 0;
		gbc.insets = new Insets(15, 15, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_END;
		this.add(nomeLabel, gbc);
		
		nomeTextField = new JTextField();
		gbc.gridx = 1;
		gbc.gridy = 2;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.LINE_START;
		this.add(nomeTextField, gbc);
		

		JButton addButton = new JButton();
		addButton.setText("Salvar");
		addButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CadastrarPacienteButtonListener cadastrarPacienteListener = (CadastrarPacienteButtonListener) listener;
				cadastrarPacienteListener.cadastrar();
			}
		});

		gbc.gridx = 0;
		gbc.gridy = 4;
		gbc.weightx = 0;
		gbc.gridwidth = 2;
		gbc.insets = new Insets(15, 0, 10, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		gbc.fill = GridBagConstraints.NONE;
		this.add(addButton, gbc);
	}

	public JTextField getCodigoTextField() {
		return codigoTextField;
	}

	public JTextField getDataTextField() {
		return dataTextField;
	}

	public JTextField getNomeTextField() {
		return nomeTextField;
	}


	public void setListener(CadastrarPacienteButtonListener pacienteButtonListener) {
		listener = pacienteButtonListener;
	}
	
}