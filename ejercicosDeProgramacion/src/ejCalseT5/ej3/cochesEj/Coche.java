package ejCalseT5.ej3.cochesEj;

import java.util.Random;

public class Coche {
    private Motor motor;
    private String marca;
    private String modelo;
    private double precioAverias;
    private String matricula;

    public Coche(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
        this.precioAverias = 0.0;
        this.motor = new Motor(100); // CV por defecto
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecioAverias() {
        return precioAverias;
    }

    public String getMatricula() {
        return matricula;
    }

    public void acumularAveria() {
        Random rand = new Random();
        double costeAveria = 100 + rand.nextInt(401); // Entre 100 y 500
        this.precioAverias += costeAveria;
    }
}