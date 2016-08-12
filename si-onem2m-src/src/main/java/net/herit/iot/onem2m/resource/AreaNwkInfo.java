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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="areaNwkType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listOfDevices" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "areaNwkType",
    "listOfDevices",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "areaNwkInfo")
@XmlRootElement(name = "ani")
public class AreaNwkInfo
    extends MgmtResource
{

//	public final static String SCHEMA_LOCATION = "CDT-areaNwkInfo-v1_2_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-areaNwkInfo-v1_6_0.xsd";
	
    //@XmlElement(required = true)
    @XmlElement(name = Naming.AREANWKTYPE_SN, required = true) //"ant"
    protected String areaNwkType;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.LISTOFDEVICES_SN, required = true)  //"ldv"
    protected List<String> listOfDevices;
    @XmlElement(name = Naming.CHILDRESOURCE_SN) //"ch")
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")  //"sub"
    protected List<Subscription> subscription;

    /**
     * Gets the value of the areaNwkType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaNwkType() {
        return areaNwkType;
    }

    /**
     * Sets the value of the areaNwkType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaNwkType(String value) {
        this.areaNwkType = value;
    }

    /**
     * Gets the value of the listOfDevices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfDevices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfDevices() {
//        if (listOfDevices == null) {
//            listOfDevices = new ArrayList<String>();
//        }
        return this.listOfDevices;
    }

    public void addListOfDevices(String dev) {
    	if (listOfDevices == null) {
    		listOfDevices = new ArrayList<String>();
    	}
    	this.listOfDevices.add(dev);
    }
    
    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//        if (childResource == null) {
//            childResource = new ArrayList<ChildResourceRef>();
//        }
        return this.childResource;
    }

    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }
    
    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//        if (subscription == null) {
//            subscription = new ArrayList<Subscription>();
//        }
        return this.subscription;
    }

    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }
    
    
    
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.areaNwkType == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'areaNwkType' is M on memAvailable operation");
			}
			if (this.listOfDevices == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'listOfDevices' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on UPDATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on UPDATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}
}
