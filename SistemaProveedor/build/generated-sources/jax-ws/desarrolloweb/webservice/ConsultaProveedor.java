
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
 *         &lt;element name="nit" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="codigoPaciente" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="fechaN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaIC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "nit",
    "codigoPaciente",
    "fechaN",
    "fechaIC"
})
@XmlRootElement(name = "ConsultaProveedor")
public class ConsultaProveedor {

    protected int nit;
    protected int codigoPaciente;
    protected String fechaN;
    protected String fechaIC;

    /**
     * Gets the value of the nit property.
     * 
     */
    public int getNit() {
        return nit;
    }

    /**
     * Sets the value of the nit property.
     * 
     */
    public void setNit(int value) {
        this.nit = value;
    }

    /**
     * Gets the value of the codigoPaciente property.
     * 
     */
    public int getCodigoPaciente() {
        return codigoPaciente;
    }

    /**
     * Sets the value of the codigoPaciente property.
     * 
     */
    public void setCodigoPaciente(int value) {
        this.codigoPaciente = value;
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

    /**
     * Gets the value of the fechaIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaIC() {
        return fechaIC;
    }

    /**
     * Sets the value of the fechaIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaIC(String value) {
        this.fechaIC = value;
    }

}
