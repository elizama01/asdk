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
 * @author Esteban
 */
public class Coleccion {
 String  art="",disc="",year="",artista="";
 int opc=0;   
   
 Coleccion(ArrayList<casoVinilosPOO>colecVinilo) {
    
    }

    Coleccion() {
        
    }
     public void agregarVinilo(ArrayList<casoVinilosPOO> vin ,
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
           if ()){
               System.out.println("El vinilo ya se encuentra en la coleccion");
           }
           //se añade el objeto al final del array
            vin.add(aux);
           
         }
             
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
       }while(cantidad<=0||cantidad>100);
         }
     public void mostrarColeccion(ArrayList<casoVinilosPOO>vin  ){
    for(int x=0;x<vin.size();x++) {
  
        System.out.println(vin.get(x));
}
     }
     
     public  boolean buscarArtista(ArrayList<casoVinilosPOO>casoVinilo,String artista){
  boolean salida=false;
    for (int i = 0; i <casoVinilo.size() ; i++) {
    if (casoVinilo.get(i).getNomArtista().equalsIgnoreCase(artista)){
            return salida=true;
        } 
    }
return salida;
}
     public  void mostrarBusqueda(ArrayList<casoVinilosPOO> vin ,String artista,Scanner entrada){
    System.out.println("Ingrese el artista que desea buscar");
            artista=entrada.next();
    if (buscarArtista(vin, artista)==true) {
        System.out.println("El artista si se encuentra en la coleccion");
    } else {
    System.out.println("El artista no se  encuentra en la coleccion");
    }
   

}
  public void mostrarDuplicado(ArrayList<casoVinilosPOO> vin,String art,String disc,String year ){
    
   

}
     public  boolean buscarDuplicado(ArrayList<casoVinilosPOO>vin,String numArtista,String numVinilo){
  boolean salida=false;
    
    
return salida;
}

     public void menu(ArrayList<casoVinilosPOO>colecVinilo){
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
                
              
                mostrarBusqueda( colecVinilo,artista,entrada);
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
    
}
