package models;

public class Carro extends Vehiculo {

    //Constructor para la subclase carro
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    //Se implementa el metodo mover de la clase Vehiculo
    public void mover() {
        System.out.println("El carro de la marca " + getMarca() + " y modelo " + getModelo() + " se esta moviendo en Carretera Masaya");
    }
}
