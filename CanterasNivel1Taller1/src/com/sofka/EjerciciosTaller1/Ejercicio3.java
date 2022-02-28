package com.sofka.EjerciciosTaller1;

import java.util.Scanner;

public class Ejercicio3 {

	private String nombre;
    private String padre;
    private String madre;
    private Scanner input;
    
    

    public void Ejercicio3() {

    	input = new Scanner(System.in);
    	 
        solicitarNombres();
        nombre = capturarDato();

        solicitarNombrepadre();
         padre = capturarDato();
        
        solicitarNombremadre();
        madre = capturarDato();
        
        
       
    System.out.println("Yo "+nombre+" soy hija de "+padre+" y "+madre);  
        
    }

    private void solicitarNombres() {
        System.out.println("Por favor digite su nombre y apellido");
    }

    private void solicitarNombrepadre() {
        System.out.println("Por favor digite el nombre de su padre");
    }
    
    private void solicitarNombremadre() {
        System.out.println("Por favor digite el nombre de su madre");
    }

    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
      
        
    }
        
   
}
    
    
    



