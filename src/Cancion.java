/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Cancion {
    private String nombre;
    private double duracion;
    private boolean enVivo;
    private Persona interprete;

    public Cancion() {
    }

    public Cancion(String nombre, double duracion, boolean enVivo, Persona interprete) {
        this.setNombre(nombre);
        //this.nombre = nombre;
        this.setDuracion(duracion);
        //this.duracion = duracion;
        this.enVivo = enVivo;
        this.interprete = interprete;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length()>=2){
            this.nombre = nombre;
        }
        else{
            System.out.println("El nombre debe tener al menos dos caracteres");
        }
        
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        if (duracion>60) 
        {
            this.duracion = duracion;
        }
        else
        {
            System.out.println("El minimo de duracion tiene que ser un minuto");
        }   
    }

    public boolean isEnVivo() {
        return enVivo;
    }

    public void setEnVivo(boolean enVivo) {
        this.enVivo = enVivo;
    }

    public Persona getInterprete() {
        return interprete;
    }

    public void setInterprete(Persona interprete) {
        this.interprete = interprete;
    }
    
    public void Cancion(){
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Duración: "+this.getDuracion());
        if (enVivo) {
            System.out.println("La cancion es vivo es ");
        } else 
        {
            System.out.println("La cancion es en estudio");
        }
        System.out.println("Interprete: "+this.getInterprete().toString());
    }
    public String nombreCancionInterprete(){
        return this.getNombre()+"-"+this.getInterprete().getNombre();
    }
    public void mostrarDuracion(){
        if (this.getDuracion()<70) {
            System.out.println("Categoria Corta");
        } else {
            if(this.getDuracion()>=70 && this.getDuracion()<=200){
                System.out.println("Categoria Media");
            }
            else{
                System.out.println("Categoria Larga");
            }
        }
    }
    
}
