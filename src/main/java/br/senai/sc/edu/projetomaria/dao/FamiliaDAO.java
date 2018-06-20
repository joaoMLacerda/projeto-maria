package br.senai.sc.edu.projetomaria.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Logger;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.senai.sc.edu.projetomaria.exception.DAOLayerException;
import br.senai.sc.edu.projetomaria.model.Familia;
import br.senai.sc.edu.projetomaria.resource.Messages;


public class FamiliaDAO extends AbstractDAO {
	
	
	public void insert (List<Familia> familia) {
			Statement stmt = null;
			ResultSet rs = null;
			
			for (Familia fl: familia) {
				String sql = "SELECT * FROM familia WHERE ID_FAMILIA = " + "'" + fl.getId() + "'";
				try {
					
					stmt = getConnection().createStatement();
					rs = stmt.executeQuery(sql);
					if (!rs.next()) {
							sql = "INSERT INTO Familia (ID_FAMILIA, CODIGO) VALUES ('" + fl.getId() + "','" + fl.getCodigo()
							+ "') ";
					}
				} catch (SQLException e) {
					// TODO Message for user??
				}
			}
		}
			
		
		public void update(Familia familia) {
			Statement stmt = null;
			ResultSet rs = null;
			String sql = "UPDATE familia SET  " + "'" + familia.getCodigo() + "'" +  
					"WHERE ID_Familia = " +"'" + familia.getId() + "'" ;
			
			try {
					stmt = getConnection().createStatement();
			}	catch (SQLException e) {
					// TODO Message for user??
				
			}
			
	}
	
		
		public void delete(List<Familia>familias) {
			Connection conn = getConnection();
			PreparedStatement ps;
			try{
					ps = conn.prepareStatement("DELETE FROM familia where id = ?");
					for (Familia familia : familias) {
							ps.setInt(0, familia.getId());
							ps.executeQuery();
					}
			} catch (SQLException e1) {
				//TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
					conn.close();
					
			} catch (SQLException e) {
				//TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
}