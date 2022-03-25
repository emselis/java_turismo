package net.codejava.sql;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class JavaConnect2SQL {

	public static void main(String[] args) {
		String url = "jdbc:sqlserver://ems-nqn\\sqlexpress;databaseName=java_practica;trustServerCertificate=true"; // integratedSecurity=true;hostNameInCertificate=null";
		String user = "valen";
		String password = "tino17";
		
		try {
			
			Connection cn = DriverManager.getConnection(url, user, password);
			
			System.out.println("Correcta conexion con el Servidor SQL.");
			
		} catch (SQLException e) {
			System.out.println("No se pudo conectar al Servidor SQL.");
			e.printStackTrace();
		}
	}		
}