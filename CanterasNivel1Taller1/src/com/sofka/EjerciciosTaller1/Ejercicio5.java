package com.sofka.EjerciciosTaller1;

import java.util.Scanner;

public class Ejercicio5 {
	
	
	 	private String mascota;
	 	private int edad;
	    private String tipo;
	    private String nombre;
	    private Scanner input;

	    
	    public void Ejercicio5() {

	    	 input = new Scanner(System.in);

		        solicitarMascota();
		        mascota= capturarDatoString();
		        
		        solicitarEdad();
		        edad = capturarDatoInt();

		        solicitarTipo();
		        tipo = capturarDatoString();

		        solicitarNombre();
		        nombre = capturarDatoString();
		        
		        System.out.println(mascota+"es un(a) "+tipo+" el cual, tiene "+ edad+" años de edad y "+nombre+" es actualmente su dueño(a)");  

		    }

		    private void solicitarMascota() {
		        System.out.println("Digite el nombre de su mascota?");
		    }

		    private void solicitarEdad() {
		      System.out.println("Digite edad de la mascota?");
		      
		  
		    }

		    private void solicitarTipo() {
		        System.out.println("Tipo de mascota?");
		        
		    }

		    private void solicitarNombre() {
		        System.out.println("Digite su Nombre y Apellido?");
		    }

		    private String capturarDatoString() {
		        return input.next();
		    }

		    private int capturarDatoInt() {
		    	return input.nextInt();
		    	
		      
		        
		        
		    }

		    

		}


