package br.edu.univas.si.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import br.edu.univas.si.model.PacienteTO;

public class ListPacientePanel extends JPanel {
	
	
	private static final long serialVersionUID = 1L;
	private JTable table;
	private List<PacienteTO> paciente;

	private List<PacienteTO> pacientes;
	
	public ListPacientePanel(List<PacienteTO> pacientes, Double saldo) {
		this.pacientes = pacientes;

		addComponents();
	}
	
	private void addComponents() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		

		Vector<String> columnNames = new Vector<>();
		columnNames.add("CodigoPaciente");
		columnNames.add("DataCria��o");
		columnNames.add("Nome");

  		
  		table = new JTable(null, columnNames);
  		table.setFillsViewportHeight(true);

		
		JScrollPane tableScroll = new JScrollPane(table);
		tableScroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		tableScroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.weightx = 1.0;
		gbc.insets = new Insets(15, 15, 15, 15);
		gbc.anchor = GridBagConstraints.CENTER;
		this.add(tableScroll, gbc);
		
	}

	public void updateContas(List<PacienteTO> pacientes) {
		this.pacientes = pacientes;

		
		DefaultTableModel dtm = (DefaultTableModel) table.getModel();
		dtm.setRowCount(0);
		
		for (PacienteTO paciente : pacientes) {
			dtm.addRow(new Object[] {
					paciente.getNome(),
					formatDate(paciente.getData()),
					paciente.getCodigo(),
			});
		} 
	}
	
	private String formatDate(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(date);
	}
	
}