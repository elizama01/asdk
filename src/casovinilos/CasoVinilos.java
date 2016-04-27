/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author pcccasd
 */
public class CasoVinilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args ) {
  int opc =0;
  
    Coleccion c1=new Coleccion();
       do {            
     try { Scanner entrada=  new Scanner (System.in);
  
    
        System.out.println("Elija Opcion  ");
        System.out.println(" 1 Ingresar Vinilos   ");
        System.out.println(" 2 Mostrar Vinilos   ");
        System.out.println(" 3 Busqueda de artista   ");
        System.out.println(" 4 Mostrar cuantos vinilos esta ingresados ");
        System.out.println(" 5 eliminar vinilo por nombre de artista   ");
        
        System.out.println(" 4 salir   ");
      
         opc=entrada.nextInt();
        switch (opc){
            case 1:
               
                c1.IngresoDatos();
                
                break;
            case 2:
                ; 
             c1.mostrarColeccion();
                break;
        
            case 3:
               c1.mostrarBusqueda(entrada);
                break;
            case 4:
                c1.conVinilo();
                break;
            case 5:
                
                c1.eliminarVinilo(entrada);
                break;
            case 6:
                
                 System.exit(2);
                break;
               default:
                   System.out.println("Numero ingresado no es valido ");
        }
         
     } catch (java.util.InputMismatchException e) {
          System.out.println("Error!!!! no se ingreso  lo solicitado  ");
     }
         
        } while (opc<=6 || opc<=1);
         
      
        // TODO code application logic here


  
    }
    
      

}
