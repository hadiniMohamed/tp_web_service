import WebService.Banque;
import jakarta.xml.ws.Endpoint;

public class ServerJWB {
    public static void main(String[] args) {
        String url = "http://localhost:7070/";
        Endpoint.publish(url,new Banque());
        System.out.println("server deployed on " +url);

    }
}
