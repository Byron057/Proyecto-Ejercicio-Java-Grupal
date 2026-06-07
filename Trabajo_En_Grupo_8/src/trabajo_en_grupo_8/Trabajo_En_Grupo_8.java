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
        System.out.println("==========Trabajo Grupo 8==========");
        while (opt != 16){
            
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
            System.out.println("Ingrese una Opcion del Menu (1-16)");
            
            opt = sc.nextInt();
            
            switch(opt){
                case 1:
                    sistema_login();
                    break;
                case 2:
                    Numeros_positivos();
                    break;
                //Crear Nuevos Casos para las funciones que faltan del menu
                case 3:
                    Nota_cerodiez();
                    break;
                case 4:
                    Cajero_automatico();
                    break;
                case 5:
                    Numeros_pares_impares();
                    break;
                case 16:
                    System.out.println("Saliendo del Sistema....");
                    break;
                default:
                    System.out.println("ingrese una Opcion Valida (1-16)");
            }
        }
        
    }
    
     //Agregar Funciones Aqui para cada Ejercicio Segun el Menu de Opciones
        static void sistema_login(){
            Scanner sc = new Scanner(System.in);
           int intentos = 0; 
           String contraseña_real = "Trabajo5626";
           
            System.out.println("==========Sistema de Login==========");
            System.out.println("");
            System.out.println("Ingrese la contraseña");
            String contraseña = sc.nextLine();
            while(!contraseña_real.equals(contraseña)){
                intentos++;
                System.out.println("Contraseña Incorrecta");
                System.out.println("Ingrese Nuevamente");
                contraseña =sc.nextLine();
                
            }
            System.out.println("===================================");
            System.out.println("Contraseña Correcta");
            System.out.println("Intentos Fallidos: " + intentos);
        }
    public static void Numeros_positivos(){
        System.out.println("Ingresando al Sistema de Numeros positivos");
        
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        int contador = 0;
        int numero;

        System.out.println("Introduce numeros positivos: ");
        System.out.println("---SI SE INGRESA UN NUMERO NEGATIVO DE PRINCIPIO SE CERRARA EL SISTEMA----");
        System.out.println("---SI SE INGRESA NUMERO NEGATIVO DESPUES DE INGRESAR UN POSITIVO EL SISTEMA REALIZARA SUS OPERACIONES---");

        while (true) {
          numero =sc.nextInt();
            System.out.println("leido el numero: " +numero);
         

        
          if (numero < 0) {
              System.out.println("numero negativo detectado");
          break;
        }
          suma += numero;
            contador ++;
            
        }
        if (contador > 0){
            
            double promedio = (double) suma / contador;
            System.out.println("Cantidad: " + contador);
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        } else {
            System.out.println("No se ingresaron numeros positivos.");
        }
    }

    public static void Nota_cerodiez(){
    System.out.println("----Ingresando al sistema de cero y diez-----");
    Scanner sc = new Scanner(System.in);
    double nota;
    
    while (true){
        System.out.println("Ingrese una nota entre 0 y 10 unicamente:  ");
        nota=sc.nextDouble();
        if(nota>=0 && nota <=10){
            break;
            
        }
        System.out.println("Nota invalida,ingrese unicamente entre 0 y 10");
    } 
    System.out.println("La nota valida que se registro es: "+nota);
 }
 

     public static void Cajero_automatico(){
        System.out.println("-----INGRESANDO AL SISTEMA DE CAJERO AUTOMATICO---"); 
        Scanner sc = new Scanner(System.in);
        String clave="4567";
        String ingreso;
        int intentos=0;
        
         while(intentos < 3) {
             System.out.println("Ingrese la clave de acceso: ");
             
             ingreso=sc.nextLine();
             if(ingreso.equals(clave)){
                 System.out.println("Bienvenido al cajero");
                 break;
             }
             else{
                 intentos ++;
                 System.out.println("clave incorrecta");
             }
         }
        if (intentos == 3){
         System.out.println("acceso bloqueado");
   }     
    
}


     public static void Numeros_pares_impares(){
       System.out.println("----Ingresando al sistema de numeros pares e impares-----");
        Scanner sc = new Scanner(System.in);
          
          int numero;
          int pares=0;
          int impares=0;
          System.out.println("Ingrese numeros enteros y con 0 para terminar el sistema: ");
          numero =sc.nextInt();
          
          while(numero != 0){
              if (numero % 2 == 0){
                  pares++;
              
              }else{
                   impares++;
              }
              numero =sc.nextInt();
              
          }
              System.out.println("cantidad de numeros pares:"+pares);
              System.out.println("cantidad de numeos impares: "+impares);
              
              
              
              System.out.println("ejercico 6 "); //Emerson Yanchapanta  
              double total=0;
              double ven;
              int canti=0;
              do{
            System.out.println("ingrese la venta");
            System.out.println("con 0 se detendra el sistema");
            ven = sc.nextDouble();
            if(ven !=0){
                total+=ven;
                canti++;
                }
        }while(ven !=0);
        System.out.println("Total vendido: "+total);
        System.out.println("Cantidad de ventas: "+canti);
        
        
        
        System.out.println("ejercico 7 "); //Emerson Yanchapanta  
        int cantidad = 0;
        int numero12=0;
        System.out.println("Se necesita un negativo para terminar");
        do {
            System.out.print("Ingrese un numero: ");
            numero12 = sc.nextInt();
            if (numero12 >= 0) {
                cantidad++;
                }
        } while (numero12 >= 0);
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        
        
        
        
        System.out.println("ejercico 8 "); //Emerson Yanchapanta  
        int cons=0;
        System.out.println("Ingrese un numero positivo");
        cons=sc.nextInt();
        System.out.println("Tabla de multiplicar del " +cons);
        for (int i=1; i<=20; i++){
            System.out.println(cons + " x " + i + " = " + (cons * i));
            }
        
        
        
        
        System.out.println("ejercico 9 "); //Emerson Yanchapanta 
        System.out.println("ejercico  8+1=9 "); //Emerson Yanchapanta 
        System.out.println("ingrese un numero: ");
        int n111 = sc.nextInt();
        if(n111<0){
            System.out.println("El numero puesto no funciona para factorial");
      
        
        
        
      
      
        }
      
  
    
          
}