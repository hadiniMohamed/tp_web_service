package WebService;

import Models.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebService(name = "BanqueWs")
public class Banque {

    @WebMethod(operationName = "ConvertionFromEuroToDH")
    public double conversion (@WebParam(name = "mantant") double mt )
    {
        return  mt*11;
    }

    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code)
    {
        return new Compte(code,Math.random()*5000, new Date());
    }

    @WebMethod
    public List<Compte> listComptes() {
        return Arrays.asList(
                new Compte(1, Math.random() * 5000, new Date()),
                new Compte(2, Math.random() * 5000, new Date()),
                new Compte(3, Math.random() * 5000, new Date())
        );
    }
}
