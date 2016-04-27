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

  

     
   ArrayList<casoVinilosPOO>coleccion;




   
   Coleccion() {
   
    coleccion=new ArrayList<casoVinilosPOO>();
  
 }

    public ArrayList<casoVinilosPOO> getColeccion() {
        return coleccion;
    }

    public void setColeccion(ArrayList<casoVinilosPOO> coleccion) {
        this.coleccion = coleccion;
    }

   

public void eliminarVinilo(Scanner entrada){
   try{ System.out.println("Ingrese el nombre del artista");
    String buscart=entrada.next();
    if (coleccion.remove(buscart)) {
        System.out.println("El archivo de nombre"+buscart+"Se elimino");        
    } else {
        System.out.println("Busqueda Finalizo no se encontraron resultados");
    }
   }catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
}

    public void conVinilo(){
     for (int i = 0; i < coleccion.size(); i++) {
           System.out.println("La cantidad de vinilos ingresados es"+i);
        }
    }
     public void agregarVinilo(ArrayList<casoVinilosPOO> coleccion ,String art1,String disc2,String year3){
      coleccion.add(new casoVinilosPOO(art1,disc2,year3));
         
     }
     public void mostrarColeccion(){
    for(int x=0;x<coleccion.size();x++) {
  
        System.out.println(coleccion.get(x));
}
     }
     
     public  boolean buscarArtista(String artista){
  boolean salida=false;
    for (int i = 0; i <coleccion.size() ; i++) {
    if (coleccion.get(i).getNomArtista().equalsIgnoreCase(artista)){
            return salida=true;
        } 
    }
return salida;
}
     public  void mostrarBusqueda(Scanner entrada){
   try{ System.out.println("Ingrese el artista que desea buscar");
            String artista=entrada.next();
           buscarArtista(artista);
            if (buscarArtista(artista)==true) {
        System.out.println("El artista si se encuentra en la coleccion");
    } else {
    System.out.println("El artista no se  encuentra en la coleccion");
    }
   } catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
   

}
  public void mostrarDuplicado(ArrayList<casoVinilosPOO> coleccion,String art,String disc ){
      if (buscarDuplicado(art,disc)==true) {
          System.out.println("Se Ingreso un vinilo ya existente");
         
      } 
   

}
     public  boolean buscarDuplicado(String art,String disc){
  boolean salida=false;
         for (int i = 0; i < coleccion.size(); i++) {
            if  (coleccion.get(i).getNomArtista().equalsIgnoreCase(art)&& coleccion.get(i).getNomVinilo().equalsIgnoreCase(disc))
         return true ; 
                }
    
return salida;
}

   
     public void IngresoDatos(){
      Scanner entrada = new Scanner(System.in);
        
   
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
         String art=entrada.next();
             
         System.out.println("Ingrese el disco");
        String  disc=entrada.next();
           
         System.out.println("Ingrese el año ");
       String   year=entrada.next();  
             
          entrada.nextLine(); //limpiar el intro
             mostrarDuplicado(coleccion, art, disc);
          
          agregarVinilo(coleccion,art,disc,year);  
         
         }
             
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
       }while(cantidad<=0||cantidad>100);
         
}
    
}
