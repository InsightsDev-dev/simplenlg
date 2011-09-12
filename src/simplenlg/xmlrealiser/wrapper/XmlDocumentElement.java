//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.12 at 08:20:19 PM CEST 
//


package simplenlg.xmlrealiser.wrapper;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentElement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://simplenlg.googlecode.com/svn/trunk/res/xml}NLGElement">
 *       &lt;sequence>
 *         &lt;element name="child" type="{http://simplenlg.googlecode.com/svn/trunk/res/xml}NLGElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://simplenlg.googlecode.com/svn/trunk/res/xml}docAtts"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentElement", propOrder = {
    "child"
})
public class XmlDocumentElement
    extends XmlNLGElement
{

    protected List<XmlNLGElement> child;
    @XmlAttribute
    protected XmlDocumentCategory cat;
    @XmlAttribute
    protected String title;

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlNLGElement }
     * 
     * 
     */
    public List<XmlNLGElement> getChild() {
        if (child == null) {
            child = new ArrayList<XmlNLGElement>();
        }
        return this.child;
    }

    /**
     * Gets the value of the cat property.
     * 
     * @return
     *     possible object is
     *     {@link XmlDocumentCategory }
     *     
     */
    public XmlDocumentCategory getCat() {
        return cat;
    }

    /**
     * Sets the value of the cat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlDocumentCategory }
     *     
     */
    public void setCat(XmlDocumentCategory value) {
        this.cat = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

}
