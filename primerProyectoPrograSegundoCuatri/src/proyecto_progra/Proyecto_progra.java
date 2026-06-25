/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_progra;

import java.util.Scanner;

/**
 *
 * @author santiago
 */
public class Proyecto_progra {
    
     static Scanner leer = new Scanner(System.in);
     static String[] registroVacas = new String[99];
    
     public static void registrarVaca(){
         System.out.println("----------------------------------------");
         System.out.println("|           REGISTRE LAS VACAS           |");
         System.out.println("----------------------------------------");
         System.out.println("Escriba el Código de la Vaca, Nombre, Edad, Peso y Estado Productivo");
         System.out.println("Despues presione tecla enter.");
         System.out.println("");   
     }
     
  public static void gestionVacas(){
    int opcion = 0;
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. Registrar Vaca");
         System.out.println("2. Modificar Vaca");
         System.out.println("3. Eliminar Vaca");
         System.out.println("4. Consultar Vacas");
         System.out.println("5. regresar");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();    
      
         switch (opcion){
             case 1: registrarVaca();
                     break;            
         }
         
          int posicion;
            posicion = leer.nextInt();
            //otra posibilidad de variable
            leer.nextLine(); // manejo de errores
            registroVacas[posicion-1] = leer.nextLine();
            
             if( (registroVacas)[posicion-1] == "") {
                
            registroVacas[posicion-1] = leer.nextLine();
            } else {              
                System.out.println("la posicion esta ocupada");
            }
  }   
     
  public static void gestionAlimentos(){
        int opcion = 0;
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. ");
         System.out.println("2. ");
         System.out.println("3. ");
         System.out.println("4. ");
         System.out.println("5. regresar");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();    
        
  }
 
  public static void registroAlimentos(){
          int opcion = 0;
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. ");
         System.out.println("2. ");
         System.out.println("3. ");
         System.out.println("4. ");
         System.out.println("5. regresar");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();    
      
  }
  
  
  public static void registroProduccion(){
          int opcion = 0;
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. ");
         System.out.println("2. ");
         System.out.println("3. ");
         System.out.println("4. ");
         System.out.println("5. regresar");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();    
      
  }
  
  
  public static void reportes(){
          int opcion = 0;
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. ");
         System.out.println("2. ");
         System.out.println("3. ");
         System.out.println("4. ");
         System.out.println("5. regresar");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();    
      
  }
     
 public static void menuPrincipal(){
  int opcion = 0;
    do{
         System.out.println("----------------------------------------");
         System.out.println("|           LA VAQUITA FELIZ           |");
         System.out.println("----------------------------------------");
         System.out.println("Ingrese una opción (1-5) luego presione ");
         System.out.println("la tecla enter.");
         System.out.println("");
         System.out.println("1. Gestión de Vacas");
         System.out.println("2. Gestión de Alimentos");
         System.out.println("3. Registro de Alimentación");
         System.out.println("4. Registro de Producción");
         System.out.println("5. Reportes");
         System.out.println("----------------------------------------");
         System.out.println("");
         System.out.print("Opcion: ");
         opcion = leer.nextInt();  
         
         
         
         switch (opcion){
             case 1 : gestionVacas();
                      break;
             case 2 : gestionAlimentos();
                      break;  
             case 3 : registroAlimentos();
                      break;
             case 4 : registroProduccion();
                      break;
             case 5 : reportes();
                      break;             
         }
            if (opcion < 0){
               System.exit(0);
            }
         }while ( opcion < 6 );
}   
    

  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menuPrincipal();
    int opcion = 1; 
        
    } 
}


