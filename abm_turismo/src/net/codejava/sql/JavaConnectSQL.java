package net.codejava.sql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class JavaConnectSQL {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://EMS-NQN\\SQLEXPRESS;databaseName=java_practica;integratedSecurity=true";
		// String user = "ezems";
		// String password = "e5eli5";
		
		try {
			
			Connection cn = DriverManager.getConnection(url);
			// Otra: DriverManager.getConnection(url, user, password)

			System.out.println("Correcta conexion con el Servidor SQL.");
			
		} catch (SQLException e) {
			System.out.println("No se pudo conectar al Servidor SQL.");
			e.printStackTrace();
		}
	}		
}