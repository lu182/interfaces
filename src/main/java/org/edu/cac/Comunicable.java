package org.edu.cac;

public interface Comunicable {

    void enviarMensaje(Mensaje mensaje, Comunicable destinatario);

    void recibirMensaje(Mensaje mensaje, Comunicable emisor);


}
