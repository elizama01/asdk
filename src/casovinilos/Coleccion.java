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

  
int opc =0;
     
   ArrayList<casoVinilosPOO>coleccion;
String art1,disc2,year3,artista4;

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    public String getArt1() {
        return art1;
    }

    public void setArt1(String art1) {
        this.art1 = art1;
    }

    public String getDisc2() {
        return disc2;
    }

    public void setDisc2(String disc2) {
        this.disc2 = disc2;
    }

    public String getYear3() {
        return year3;
    }

    public void setYear3(String year3) {
        this.year3 = year3;
    }

    public String getArtista4() {
        return artista4;
    }

    public void setArtista4(String artista4) {
        this.artista4 = artista4;
    }

   
   Coleccion(String art, String disc,String year) {
   
     ArrayList<casoVinilosPOO>coleccion=new ArrayList<casoVinilosPOO>();
    this.art1=art;
    this.disc2=disc;
    this.year3=year;
 }

    public ArrayList<casoVinilosPOO> getColeccion() {
        return coleccion;
    }

    public void setColeccion(ArrayList<casoVinilosPOO> coleccion) {
        this.coleccion = coleccion;
    }

   


    

    
     public void agregarVinilo(ArrayList<casoVinilosPOO> coleccion){
      coleccion.add(new casoVinilosPOO(art1,disc2,year3));
         
     }
     public void mostrarColeccion(ArrayList<casoVinilosPOO>coleccion  ){
    for(int x=0;x<coleccion.size();x++) {
  
        System.out.println(coleccion.get(x));
}
     }
     
     public  boolean buscarArtista(ArrayList<casoVinilosPOO>coleccion){
  boolean salida=false;
    for (int i = 0; i <coleccion.size() ; i++) {
    if (coleccion.get(i).getNomArtista().equalsIgnoreCase(artista4)){
            return salida=true;
        } 
    }
return salida;
}
     public  void mostrarBusqueda(ArrayList<casoVinilosPOO> coleccion ,Scanner entrada){
    System.out.println("Ingrese el artista que desea buscar");
            String artista=entrada.next();
    setArtista4(artista);
            if (buscarArtista(coleccion)==true) {
        System.out.println("El artista si se encuentra en la coleccion");
    } else {
    System.out.println("El artista no se  encuentra en la coleccion");
    }
   

}
  public void mostrarDuplicado(ArrayList<casoVinilosPOO> coleccion ){
    
   

}
     public  boolean buscarDuplicado(ArrayList<casoVinilosPOO>coleccion,String art,String numdisc){
  boolean salida=false;
         for (int i = 0; i < coleccion.size(); i++) {
            if  (coleccion.get(i).getNomArtista().equalsIgnoreCase(art)&& coleccion.get(i).getNomVinilo().equalsIgnoreCase(disc2))
         return true ; 
                }
    
return salida;
}

     public void menu(){
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
               
                IngresoDatos();
                
              agregarVinilo(coleccion);
             
                break;
            case 2:
                ; 
              mostrarColeccion(coleccion);
                break;
        
            case 3:
                
              
                mostrarBusqueda( coleccion,entrada);
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
             setArt1(art);
         System.out.println("Ingrese el disco");
        String  disc=entrada.next();
             setDisc2(disc);
         System.out.println("Ingrese el año ");
       String   year=entrada.next();  
             setYear3(year);
          entrada.nextLine(); //limpiar el intro
           
         }
             
         } catch (java.util.InputMismatchException e) {
             System.out.println("Error Se ingreso un elemento no valido");
         }
       }while(cantidad<=0||cantidad>100);
        
}
    
}
