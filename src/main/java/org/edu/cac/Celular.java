package org.edu.cac;

public class Celular implements Comunicable{

    private String numero;
    private String modelo;

    public Celular(String numero, String modelo) {
        this.numero = numero;
        this.modelo = modelo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //Se implementan métodos de la interfaz y los sobreescribimos:
    @Override
    public void enviarMensaje(Mensaje mensaje, Comunicable destinatario) {
        System.out.println(this.numero + " ha enviado el mensaje '" + mensaje.getContenido() + "' a " + destinatario);
        destinatario.recibirMensaje(mensaje, this); //espera una instancia de Persona como segundo argumento.
    }

    @Override
    public void recibirMensaje(Mensaje mensaje, Comunicable emisor) {
        System.out.println(this.getNumero() + " ha recibido el mensaje '" + mensaje.getContenido() + "' de " + emisor);
    }

    @Override
    public String toString() {
        return numero;
    }
}
