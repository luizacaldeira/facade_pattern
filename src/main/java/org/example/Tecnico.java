package org.example;

public class Tecnico extends Setor {

    private static Tecnico tecnico = new Tecnico();

    private Tecnico() {};

    public static Tecnico getInstancia() {
        return tecnico;
    }
}