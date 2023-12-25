
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConvertionFromEuroToDH complex type</p>.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.</p>
 * 
 * <pre>{@code
 * <complexType name="ConvertionFromEuroToDH">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="mantant" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConvertionFromEuroToDH", propOrder = {
    "mantant"
})
public class ConvertionFromEuroToDH {

    protected double mantant;

    /**
     * Gets the value of the mantant property.
     * 
     */
    public double getMantant() {
        return mantant;
    }

    /**
     * Sets the value of the mantant property.
     * 
     */
    public void setMantant(double value) {
        this.mantant = value;
    }

}
