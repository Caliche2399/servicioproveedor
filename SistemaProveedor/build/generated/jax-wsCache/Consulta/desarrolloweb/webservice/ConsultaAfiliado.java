
package desarrolloweb.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codigoAfiliado" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "codigoAfiliado",
    "fechaN"
})
@XmlRootElement(name = "ConsultaAfiliado")
public class ConsultaAfiliado {

    protected int codigoAfiliado;
    protected String fechaN;

    /**
     * Gets the value of the codigoAfiliado property.
     * 
     */
    public int getCodigoAfiliado() {
        return codigoAfiliado;
    }

    /**
     * Sets the value of the codigoAfiliado property.
     * 
     */
    public void setCodigoAfiliado(int value) {
        this.codigoAfiliado = value;
    }

    /**
     * Gets the value of the fechaN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaN() {
        return fechaN;
    }

    /**
     * Sets the value of the fechaN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaN(String value) {
        this.fechaN = value;
    }

}
