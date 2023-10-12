
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Album {
    private ArrayList<Cancion> listaCanciones = new ArrayList<>();
    
    public Album(){        
    }
    public ArrayList<Cancion> getListaCanciones() {
        return listaCanciones;
    }
    public void setListaCanciones(ArrayList<Cancion> listaCanciones) {
        this.listaCanciones = listaCanciones;
    }
    public void agregarCancion(Cancion cancion){
        boolean existe = false;
        for(Cancion temCancion : listaCanciones){
            if (temCancion.getNombre().equals(cancion.getNombre()) && 
                    temCancion.getInterprete().getNombre().equals(cancion.getInterprete().getNombre())) { 
                existe=true;
            }           
    }
    if(existe==false){
        listaCanciones.add(cancion);
    }
    }
    public void listarCanciones(){
        
    
}    
