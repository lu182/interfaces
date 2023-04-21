package org.edu.cac;

public class Main {

    public static void main(String[] args){

        Persona persona1 = new Persona("Juan", "12345678A", 30);
        Celular celular1 = new Celular("1157485698", "Samsung");
        Mensaje mensaje1 = new Mensaje("Hola, ¿cómo estás?");


        Persona persona2 = new Persona("Maria", "12345678B", 29);
        Mensaje mensaje2 = new Mensaje("Hola Juan, tanto tiempo!");

        Celular celular2 = new Celular("351455877", "Xiaomi");

        Mensaje mensaje3 = new Mensaje("Hola, soy el celular1");


        System.out.println("ENVIO Y RECEPCIÓN DE MENSAJES ENTRE UNA PERSONA Y UN CELULAR");
        //Persona1 envía mensaje a celular1
        persona1.enviarMensaje(mensaje1, celular1);

        //Celular1 responde al mensaje de persona1
        Mensaje respuesta1 = new Mensaje("Hola, estoy bien, gracias por preguntar");
        celular1.enviarMensaje(respuesta1, persona1);


        System.out.println("---------------------------------------------------------");
        System.out.println("ENVIO Y RECEPCIÓN DE MENSAJES ENTRE PERSONAS");
        //persona2 le envia mensaje a persona1:
        persona2.enviarMensaje(mensaje2, persona1);

        //persona1 responde al mensaje de persona2:
        Mensaje respuesta2 =new Mensaje("Hola Maria! es verdad, ha pasado mucho tiempo!");
        persona1.enviarMensaje(respuesta2, persona2);

        System.out.println("---------------------------------------------------------");
        System.out.println("ENVIO Y RECEPCIÓN DE MENSAJES ENTRE CELULARES");
        //celular1 envia mensaje a celular2:
        celular1.enviarMensaje(mensaje3, celular2);

        //celular2 responde al mensaje de celular1:
        Mensaje respuesta3 = new Mensaje("Hola celular1! qué gusto saber de vos!");
        celular2.enviarMensaje(respuesta3, celular1);


    }
}
