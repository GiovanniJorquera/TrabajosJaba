/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vina
 */
public class Vehiculo {
    private String tipo,marca,modelo,patente,motor;
    private int año,km;

    public Vehiculo() {
    }
    public Vehiculo(String tipo, String marca, String modelo, String patente, String motor, int año, int km) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
        this.motor = motor;
        this.año = año;
        this.km = km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String chasis) {
        this.patente = chasis;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public void getKm(int km){
        this.km = km;
    }
    public void setKm(int km){
        this.km = km;
    }
//    @Override
//    public String toString() {
//        return "Vehiculo{" + "tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", patente=" + patente + ", motor=" + motor + ", a\u00f1o=" + año + '}';
//    }
    
}
