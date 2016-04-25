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
        // TODO code application logic here
 String  art="",disc="",year="",artista="AC-DC";
 int opc=0;   
 ArrayList<casoVinilosPOO> colecVinilo = new ArrayList<casoVinilosPOO>();
        do {            
             try { Scanner entrada=  new Scanner (System.in);
  
      
        System.out.println("Elija Opcion  ");
        System.out.println(" 1 Ingresar Vinilos   ");
        System.out.println(" 2 Mostrar Vinilos   ");
        System.out.println(" 3 Mostrar Busqueda   ");
        System.out.println(" 4 salir   ");
      
         opc=entrada.nextInt();
        switch (opc){
            case 1:
                agregarVinilo(colecVinilo, art,disc,year,entrada); 
             
                break;
            case 2:
                ; 
              mostrarColeccion(colecVinilo);
                break;
        
            case 3:
                mostrarBusqueda( artista );
                break;
            case 4:
                
                 System.exit(2);
                break;
               default:
                   System.out.println("Numero ingresado no es valido ");
        }
         
     } catch (java.util.InputMismatchException e) {
          System.out.println("Error!!!! no se ingreso  lo solicitado  ");
     }
         
        } while (opc<4|| opc>5);
         
         
        
    }
     public static void agregarVinilo(ArrayList<casoVinilosPOO> vin ,
            String art,String disc,String year,Scanner entrada){
        entrada=new Scanner(System.in);
        casoVinilosPOO aux;
         int cantidad=1 ; 
         do{
         try { 
         do{
         
         System.out.println("Ingrese la cantidad de vinilos que Ingresara max 100");
         cantidad=entrada.nextInt();}
         while(cantidad<0||cantidad>100);
         for (int i = 1; i <= cantidad; i++) {
         System.out.println("Ingrese el Vinilo "+ i);
         System.out.println("Ingrese el Artista");
         art=entrada.next();
         System.out.println("Ingrese el disco");
         disc=entrada.next();
         System.out.println("Ingrese el año ");
         year=entrada.next();  
         
          entrada.nextLine(); //limpiar el intro
            aux = new casoVinilosPOO(); //Se crea un objeto vinilo y se asigna su referencia a aux
            //se asignan valores a los atributos del nuevo objeto
            aux.setNomArtista(art);
            aux.setNomVinilo(disc);
            aux.setNomAgno(year);
                                  
           //se añade el objeto al final del array
            vin.add(aux);
            if (vin.contains(vin)){
                System.out.println("Lo ingresado ya se encuentra dentro ");
           i--;
            }
         }
             
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
       }while(cantidad<=0||cantidad>100);
         }
      
public static void mostrarColeccion(ArrayList<casoVinilosPOO>vin  ){
    for(int x=0;x<vin.size();x++) {
  
        System.out.println(vin.get(x));
}
}
public static boolean buscarArtista(ArrayList<casoVinilosPOO>casoVinilo,String artista){
    for (int i = 0; i <casoVinilo.size() ; i++) {
        if (casoVinilosPOO {
            return true;
        } 
    }
return false;
}


public static void mostrarBusqueda(String artista  ){
    if (buscarArtista(null, artista)!=true ) {
        System.out.println("El artista no se encuentra en la coleccion");
    } else {
    System.out.println("El artista si se  encuentra en la coleccion");
    }
   

}
    
}
