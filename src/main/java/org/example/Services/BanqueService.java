package org.example.Services;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.example.Entities.Compte;

import java.util.Date;
import java.util.List;


@WebService(serviceName = "bnService")
public class BanqueService {


@WebMethod(operationName = "ConversionEuroToDH")
    public double Conversion(@WebParam(name = "montant") double montant){

        return montant * 11;
    }
    @WebMethod(operationName = "displayOneAccount")
    public Compte getCompte(@WebParam(name = "code") int code){

     return  new Compte(code,Math.random()* 68000,new Date());
    }
@WebMethod(operationName = "listCompte")
    public List<Compte>listCompte(){

        return List.of(new Compte(1,Math.random()* 68000,new Date()),
                new Compte(2,Math.random()* 68000,new Date()),
                        new Compte(3,Math.random()* 68000,new Date())
        );
    }
}
