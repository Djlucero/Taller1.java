package com.sofka.EjerciciosTaller1;

import java.util.Scanner;

public class Ejercicio4 {

	private String capital;
    private String pais;
    private Scanner input;
    

    public void Ejercicio4() {

    	input = new Scanner(System.in);
    	
        solicitarCapital();
        capital = capturarDato();

        solicitarPais();
         pais = capturarDato();
        
             
               
    System.out.println("La ciudad "+capital+" es capital del Pais "+pais);  
        
    }

    private void solicitarCapital() {
        System.out.println("Digite el nombre de una Ciudad Capital?");
    }

    private void solicitarPais() {
        System.out.println("Digite  Pais de esta Ciudad Capital?");
    }
    
    
    private String capturarDato() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
        
      
        
    }
}


