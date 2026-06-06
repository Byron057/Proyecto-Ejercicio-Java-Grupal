/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_en_grupo_8;
import java.util.Scanner;

public class Trabajo_En_Grupo_8 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int opt = 0;
        while (opt != 16){
            System.out.println("==========Trabajo Grupo 8==========");
            System.out.println("          Menu de Opciones          ");
            System.out.println("===================================");
            System.out.println("1.Sistema de Login");
            System.out.println("2.Numeros Positivos");
            System.out.println("3.Nota 0-10");
            System.out.println("4.Cajero Automatico");
            System.out.println("5.Validar Numeros Enteros");
            System.out.println("6.Inventario de una Tienda");
            System.out.println("7.Ingresar Numeros Positivos");
            System.out.println("8.Tabla de Multiplicar");
            System.out.println("9.Calcular Factorial");
            System.out.println("10.Clasificar Numeros");
            System.out.println("11.Promedio del Curso");
            System.out.println("12.Secuencia Fibonnaci");
            System.out.println("13.Mayor y Menor de 10 Numeros");
            System.out.println("14.Suma de Numros Pares (1-200)");
            System.out.println("15.Determinar Numeros Par");
            System.out.println("16.Salir del Sistema");
            System.out.println("===================================");
            System.out.println("Ingrese una Opcion del Menu (1-15)");
            
            opt = sc.nextInt();
            
            switch(opt){
                case 1:
                    System.out.println("Caso 1");
                    break;
                default:
                    System.out.println("ingrese una Opcion Valida");
            }
        } 
        
    }
    
}
