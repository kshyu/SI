//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:16 오후 KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;


/**
 * XSD-1.6.0
 * <p>Java class for deliveryMetaData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deliveryMetaData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="tracingOption" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *           &lt;element name="tracingInfo" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deliveryMetaData", propOrder = {
    "tracingOption",
    "tracingInfo"
})
public class DeliveryMetaData {

    @XmlElement(name = Naming.TRACINGOPTION_SN)
//  protected boolean tracingOption;
    protected Boolean tracingOption;
    @XmlList
    @XmlElement(name = Naming.TRACINGINFO_SN)
    protected List<String> tracingInfo;

    /**
     * Gets the value of the tracingOption property.
     * 
     */
    public Boolean isTracingOption() {
        return tracingOption;
    }

    /**
     * Sets the value of the tracingOption property.
     * 
     */
    public void setTracingOption(Boolean value) {
        this.tracingOption = value;
    }

    /**
     * Gets the value of the tracingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tracingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTracingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTracingInfo() {
//    	if (tracingInfo == null) {
//    		tracingInfo = new ArrayList<String>();
//    	}
    	return this.tracingInfo;
    }

    public void addTracingInfo(String tinfo) {
    	if (tracingInfo == null) {
    		tracingInfo = new ArrayList<String>();
    	}
    	this.tracingInfo.add(tinfo);
    }

    
}
