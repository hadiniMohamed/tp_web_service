import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

import java.util.List;

public class Client {
    public static void main(String[] args) {

        BanqueWs proxy =new BanqueService().getBanqueWsPort();
        System.out.println("-----------test convert Method client side-----------");
        System.out.println(proxy.convertionFromEuroToDH(20));
        Compte c1= proxy.getCompte(11);
        System.out.println("-----------test getComte Method client side-----------");
        System.out.println(c1.getCode() + " "+ c1.getSolde() + " "+ c1.getDateCreation());
        System.out.println("-----------test listComptes Method client side-----------");

        List<Compte> comptes = proxy.listComptes();
        for (Compte c : comptes)
            System.out.println(c.getCode() + " "+ c.getSolde() + " "+ c.getDateCreation());




    }
}
