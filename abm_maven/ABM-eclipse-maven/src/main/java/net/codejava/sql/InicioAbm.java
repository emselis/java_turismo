package net.codejava.sql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController				// Spring MVC annotations (stereotype annotation)
@EnableAutoConfiguration	// Dice a Spring Boot como configurar Spring, en función de dependencias (jar) declaradas.
public class InicioAbm {

	private int id;
	private String nombre;
	private String apellido;
	private int edad;
	private String direccion;

	@RequestMapping("/")	// Da info de ruteo a Spring. Cualquier pedido HTTP con "/ path" lo dirije al método home()
    String home() {
        return "Hello World!";
    }

    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id = id;
    }
    public String getNombre() {
    	return nombre;
    }
    public void setNombre(String nombre) {
    	this.nombre = nombre;
    }
    public String getApellido() {
    	return apellido;
    }
    public void setApellido(String apellido) {
    	this.apellido = apellido;
    }
    public int getEdad() {
    	return edad;
    }
    public void setEdad(int edad) {
    	this.edad = edad;
    }
    public String getDireccion() {
    	return direccion;
    }
    public void setDireccion(String direccion) {
    	this.direccion = direccion;
    }
    
    
    public static void main(String[] args) {
        SpringApplication.run(InicioAbm.class, args);
    }

}

