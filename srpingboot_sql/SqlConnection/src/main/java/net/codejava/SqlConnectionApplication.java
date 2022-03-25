package net.codejava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SqlConnectionApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(SqlConnectionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO Personas (id, nombre, apellido, edad, direccion) VALUES (?, ?, ?, ?, ?)";
		int result = jdbcTemplate.update(sql, 4, "Ceci", "Sole", 35, "Neuquen 123");
		
		if (result > 0) {
			System.out.println("Una nueva linea se agrego correctamente.");
		}
	}
	

}
