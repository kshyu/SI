//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:13:54 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="creator" type="{http://www.onem2m.org/xml/protocols}ID"/>
 *         &lt;element name="eventID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eventType" type="{http://www.onem2m.org/xml/protocols}eventType"/>
 *         &lt;element name="eventStart" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="eventEnd" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="operationType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;list itemType="{http://www.onem2m.org/xml/protocols}operation" />
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dataSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
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
    "creator",
    "eventID",
    "eventType",
    "eventStart",
    "eventEnd",
    "operationType",
    "dataSize",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "eventConfig")
@XmlRootElement(name = "evcg")
public class EventConfig
    extends RegularResource
{

//	public static final String SCHEMA_LOCATION = "CDT-eventConfig-v1_2_0.xsd";
	public static final String SCHEMA_LOCATION = "CDT-eventConfig-v1_6_0.xsd";
	
    //@XmlElement(required = true)
    @XmlElement(name = "cr")
    protected String creator;
    //@XmlElement(required = true)
    @XmlElement(name = "evi")
    protected String eventID;
    //@XmlElement(required = true)
    @XmlElement(name = "evt")
    protected Integer eventType;
    @XmlElement(name = "evs")
    protected String eventStart;
    @XmlElement(name = "eve")
    protected String eventEnd;
    @XmlElement(name = "opt")
    @XmlList
    protected List<Integer> operationType;
    @XmlElement(name = "ds")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer dataSize;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    /**
     * Gets the value of the eventType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEventType() {
        return eventType;
    }

    /**
     * Sets the value of the eventType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEventType(Integer value) {
        this.eventType = value;
    }

    /**
     * Gets the value of the eventStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStart() {
        return eventStart;
    }

    /**
     * Sets the value of the eventStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStart(String value) {
        this.eventStart = value;
    }

    /**
     * Gets the value of the eventEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventEnd() {
        return eventEnd;
    }

    /**
     * Sets the value of the eventEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventEnd(String value) {
        this.eventEnd = value;
    }

    /**
     * Gets the value of the operationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getOperationType() {
//    	if (operationType == null) {
//    		operationType = new ArrayList<Integer>();
//    	}
    	return this.operationType;
    }

    public void addOperationType(Integer optype) {
    	if (operationType == null) {
    		operationType = new ArrayList<Integer>();
    	}
    	this.operationType.add(optype);
    }

    
    /**
     * Gets the value of the dataSize property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSize() {
        return dataSize;
    }

    /**
     * Sets the value of the dataSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSize(Integer value) {
        this.dataSize = value;
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
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//    	}
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
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
//    	}
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
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크

			if (this.creator != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "creator is NP on CREATE");				
			}
			if (this.eventID != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "eventID is NP on CREATE");				
			}
			if (this.eventType == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "eventType is M on CREATE");				
			}

		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크

			if (this.creator != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "creator is UPDATE on UPDATE");				
			}
			if (this.eventID != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "eventID is UPDATE on UPDATE");				
			}
			
		}
		
		super.validate(operation);
		
	}
}
