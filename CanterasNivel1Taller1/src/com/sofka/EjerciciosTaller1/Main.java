package com.sofka.EjerciciosTaller1;


	import java.io.IOException;
	import java.util.Scanner;

	public class Main {

	    private static boolean bandera = true;
	    private static int opcion;

	    public static void main(String[] args) throws IOException {
	        do {
	            limpiarPantalla();
	            menu();
	            opcion = capturarOpcion();
	            bandera = evaluarOpcion(opcion);
	        } while (bandera == true);
	    }

	    private static void menu() {
	        System.out.println("TALLER N.1 VARIABLES E IMPRESIONES");
	        System.out.println("Escoja un punto del taller");
	        System.out.println("1. Ejercicio N.1");
	        System.out.println("2. Ejercicio N.2");
	        System.out.println("3. Ejercicio N.3");
	        System.out.println("4. Ejercicio N.4");
	        System.out.println("5. Ejercicio N.5");
	        System.out.println("6. Salir");
	    }

	    private static int capturarOpcion() {
	        Scanner input = new Scanner(System.in);
	        return input.nextInt();
	    }

	    private static boolean evaluarOpcion(int opcion) throws IOException {
	        switch (opcion) {
	            case 1:
	                Ejercicio1 p1 = new Ejercicio1();
	                p1.Ejercicio1();
	                return true;
	                
	            case 2:
	                Ejercicio2 p2 = new Ejercicio2();
	                p2.Ejercicio2();
	                return true;
	                
	            case 3:
	                Ejercicio3 p3 = new Ejercicio3();
	                p3.Ejercicio3();
	                return true;
	                
	            case 4:
	                Ejercicio4 p4 = new Ejercicio4();
	                p4.Ejercicio4();
	                return true;
	                
	            case 5:
	                Ejercicio5 p5 = new Ejercicio5();
	                p5.Ejercicio5();
	                return true;
	            
	            case 6:
	                return false;
	                // break;
	            default:
	                System.out.println("Opción incorrecta");
	                System.in.read();
	                
	        }
	        return true;
	    }

	    private static void limpiarPantalla() {
	    		System.out.println();
	    		}
	    	
	    }
	