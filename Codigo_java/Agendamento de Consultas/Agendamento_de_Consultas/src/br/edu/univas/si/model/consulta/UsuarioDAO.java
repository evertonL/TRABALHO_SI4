package br.edu.univas.si.model.consulta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.edu.univas.si.model.exception.UsuarioException;
import br.edu.univas.si.model.to.UsuarioTO;
import br.edu.univas.si.model.util.DBUtil;

public class UsuarioDAO {
	
	public ArrayList<UsuarioTO> populateUsuario() throws UsuarioException{
		
		ArrayList<UsuarioTO> list = new ArrayList<UsuarioTO>() ;
		String sql = " SELECT cpf, nome, senha, cpfm"
				   + " FROM Usuario"
				   + " ORDER BY nome";
		
		Connection connection = null;
		try{
				connection = DBUtil.openConnection();
				PreparedStatement statement = connection.prepareStatement(sql);
				
				ResultSet rs = statement.executeQuery();
				
				while(rs.next()){
					UsuarioTO usuario  = new UsuarioTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
					list.add(usuario);
				}
			
				return list;
		}catch(Exception e){
			throw new UsuarioException("Erro ao fazer consulta em UsuarioDAO \n"+e);
		}finally{
			DBUtil.closeConnection(connection);
		}
	}

}

