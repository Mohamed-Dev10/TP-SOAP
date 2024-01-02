package org.example;

import jakarta.xml.ws.Endpoint;
import org.example.Services.BanqueService;

public class ServerJWS {

    public static void  main(String [] args){
String url="http://0.0.0.0:4545/";
        Endpoint.publish(url,new BanqueService());
        System.out.println("le serveur web de dépoiement est :  "+url);
    }
}
