package models;

public class Camion extends Vehiculo {

    //Constructor de la subclase Camion
    public Camion(String marca, String modelo) {
        super(marca, modelo);
    }


    //Se implementa el metodo mover de la clase Vehiculo
    public void mover() {
        System.out.println("El camion de la marca " + getMarca() + " y modelo " + getModelo() + " esta arrancando en Carretera Masaya");
    }

}
