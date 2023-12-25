
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _ConvertionFromEuroToDH_QNAME = new QName("http://WebService/", "ConvertionFromEuroToDH");
    private static final QName _ConvertionFromEuroToDHResponse_QNAME = new QName("http://WebService/", "ConvertionFromEuroToDHResponse");
    private static final QName _GetCompte_QNAME = new QName("http://WebService/", "getCompte");
    private static final QName _GetCompteResponse_QNAME = new QName("http://WebService/", "getCompteResponse");
    private static final QName _ListComptes_QNAME = new QName("http://WebService/", "listComptes");
    private static final QName _ListComptesResponse_QNAME = new QName("http://WebService/", "listComptesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertionFromEuroToDH }
     * 
     * @return
     *     the new instance of {@link ConvertionFromEuroToDH }
     */
    public ConvertionFromEuroToDH createConvertionFromEuroToDH() {
        return new ConvertionFromEuroToDH();
    }

    /**
     * Create an instance of {@link ConvertionFromEuroToDHResponse }
     * 
     * @return
     *     the new instance of {@link ConvertionFromEuroToDHResponse }
     */
    public ConvertionFromEuroToDHResponse createConvertionFromEuroToDHResponse() {
        return new ConvertionFromEuroToDHResponse();
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     * @return
     *     the new instance of {@link GetCompte }
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     * @return
     *     the new instance of {@link GetCompteResponse }
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ListComptes }
     * 
     * @return
     *     the new instance of {@link ListComptes }
     */
    public ListComptes createListComptes() {
        return new ListComptes();
    }

    /**
     * Create an instance of {@link ListComptesResponse }
     * 
     * @return
     *     the new instance of {@link ListComptesResponse }
     */
    public ListComptesResponse createListComptesResponse() {
        return new ListComptesResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     * @return
     *     the new instance of {@link Compte }
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDH }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDH }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ConvertionFromEuroToDH")
    public JAXBElement<ConvertionFromEuroToDH> createConvertionFromEuroToDH(ConvertionFromEuroToDH value) {
        return new JAXBElement<>(_ConvertionFromEuroToDH_QNAME, ConvertionFromEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDHResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertionFromEuroToDHResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "ConvertionFromEuroToDHResponse")
    public JAXBElement<ConvertionFromEuroToDHResponse> createConvertionFromEuroToDHResponse(ConvertionFromEuroToDHResponse value) {
        return new JAXBElement<>(_ConvertionFromEuroToDHResponse_QNAME, ConvertionFromEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptes }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listComptes")
    public JAXBElement<ListComptes> createListComptes(ListComptes value) {
        return new JAXBElement<>(_ListComptes_QNAME, ListComptes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListComptesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://WebService/", name = "listComptesResponse")
    public JAXBElement<ListComptesResponse> createListComptesResponse(ListComptesResponse value) {
        return new JAXBElement<>(_ListComptesResponse_QNAME, ListComptesResponse.class, null, value);
    }

}
