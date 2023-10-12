/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
public class Persona {
    private String nombre, apellido;
    private int edad;
    private char sexo;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.setEdad(edad);
        this.setSexo(sexo);
        //this.edad = edad;
        //this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >=5 && edad<=90)
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        String sex = Character.toString(sexo);
        if (sex.equalsIgnoreCase("f") || sex.equalsIgnoreCase("m")) 
        {
            this.sexo = sexo;
        } 
        else 
        {
            System.out.println("El sexo tiene que ser f o m");
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
    
}
