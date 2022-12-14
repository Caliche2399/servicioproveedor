
package desarrolloweb.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the desarrolloweb.webservice package. 
 * <p>An ObjectFactory allows you to programatically 
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

    private final static QName _String_QNAME = new QName("http://desarrolloweb/webservice", "string");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: desarrolloweb.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsultaProveedor }
     * 
     */
    public ConsultaProveedor createConsultaProveedor() {
        return new ConsultaProveedor();
    }

    /**
     * Create an instance of {@link ConsultaProveedorResponse }
     * 
     */
    public ConsultaProveedorResponse createConsultaProveedorResponse() {
        return new ConsultaProveedorResponse();
    }

    /**
     * Create an instance of {@link ConsultaAfiliado }
     * 
     */
    public ConsultaAfiliado createConsultaAfiliado() {
        return new ConsultaAfiliado();
    }

    /**
     * Create an instance of {@link ConsultaAfiliadoResponse }
     * 
     */
    public ConsultaAfiliadoResponse createConsultaAfiliadoResponse() {
        return new ConsultaAfiliadoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://desarrolloweb/webservice", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

}
