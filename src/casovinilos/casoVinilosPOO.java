/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casovinilos;

/**se tiene una colección de máximo 100 vinilos

- deben poder agregarse vinilos (nombre del artista, 
* nombre del disco, año de lanzamiento)

- debe poder buscarse un vinilo y saber si está o no en la colección

- saber cuantos vinilos tiene la colección

- saber cuantos espacios disponibles hay en la colección
 *
 * @author pcccasd
 */
public class casoVinilosPOO {
 
    public  String nomArtista;
   public String nomVinilo;
    public String Agno;
    casoVinilosPOO(){
    }
    
    casoVinilosPOO(String nomArt,String nomVin,String year){
    this.nomArtista=nomArt;
    this.nomVinilo=nomVin;
    this.Agno=year;
            }
     public  void mostrarVinilo(){
String msj="";
msj=" "+this.nomArtista;
msj+=" "+this.nomVinilo; 
msj+=" "+this.Agno;
    System.out.println(msj);
}
public String getNomArtista(){
        return nomArtista;
} 
public void setNomArtista(String nomArtista){
this.nomArtista=nomArtista;
}

public String getNomVinilo(){
        return nomVinilo;
} 
public void setNomVinilo(String nomVinilo){
this.nomVinilo=nomVinilo;
}

public String getNomAgno(){
        return Agno;
} 
public void setNomAgno(String agno){
this.Agno=agno ; 

}

    @Override
    public String toString() {
        return "Vinilo{" + "Artista=" + nomArtista + ", Vinilo=" + nomVinilo + ", año=" + Agno + '}';
    }
    
   
}
