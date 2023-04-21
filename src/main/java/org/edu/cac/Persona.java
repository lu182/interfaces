package org.edu.cac;

public class Persona implements Comunicable{

    private String nombre;
    private String dni;
    private int edad;

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Se implementan métodos de la interfaz y los sobreescribimos:
    @Override
    public void enviarMensaje(Mensaje mensaje, Comunicable destinatario) {
        System.out.println(this.getNombre() + " ha enviado el mensaje '" + mensaje.getContenido() + "' a " + destinatario);
        destinatario.recibirMensaje(mensaje, this);
    }

    @Override
    public void recibirMensaje(Mensaje mensaje, Comunicable emisor) {
        System.out.println(this.getNombre() + " ha recibido el mensaje '" + mensaje.getContenido() + "' de " + emisor);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
