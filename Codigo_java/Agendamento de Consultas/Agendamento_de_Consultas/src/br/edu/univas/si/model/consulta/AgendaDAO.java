package br.edu.univas.si.model.consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.univas.si.model.exception.AgendaException;
import br.edu.univas.si.model.to.AgendaTO;
import br.edu.univas.si.model.util.DBUtil;

public class AgendaDAO {

	public ArrayList<AgendaTO> populateGridUnidadeMedida() throws AgendaException{
		
		
		ArrayList<AgendaTO> list = new ArrayList<AgendaTO>();
		
		String sql = "SELECT id_consulta, status, prescrisao_medico, data, cpf_paciente, cpfm"
				   + " FROM agenda"
				   + " ORDER BY id_consulta";
		
		Connection connection = null;
		try{
				connection = DBUtil.openConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()){
					AgendaTO agenda = new AgendaTO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6));
					list.add(agenda);
				}
			
				return list;
		}catch(Exception e ){
			throw new AgendaException("Erro ao fazer consulta em AgendaDAO \n"+e);
		}finally{
			DBUtil.closeConnection(connection);
		}
	}
}

