//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:07:20 오후 KST 
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="targetNetwork" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;element name="minReqVolume" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="backOffParameters" type="{http://www.onem2m.org/xml/protocols}backOffParameters"/>
 *         &lt;element name="otherConditions" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="mgmtLink" type="{http://www.onem2m.org/xml/protocols}mgmtLinkRef"/>
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
    "targetNetwork",
    "minReqVolume",
    "backOffParameters",
    "otherConditions",
    "mgmtLink"
})
//@XmlRootElement(name = "cmdhNwAccessRule")
@XmlRootElement(name = "cmwr")
public class CmdhNwAccessRule
    extends MgmtResource
{

//	public final static String SCHEMA_LOCATION = "CDT-cmdhNwAccessRule-v1_2_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-cmdhNwAccessRule-v1_6_0.xsd";
	
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = "ttn", required = true)
    protected List<String> targetNetwork;
    //@XmlElement(required = true)
    @XmlElement(name = "mrv", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected Integer minReqVolume;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = "bop", required = true)
    protected List<Integer> backOffParameters;
    //@XmlElement(required = true)
    @XmlElement(name = "ohc", required = true)
    protected Object otherConditions;
    //@XmlElement(required = true)
    @XmlElement(name = "cmlk", required = true)
    protected MgmtLinkRef mgmtLink;

    /**
     * Gets the value of the targetNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetNetwork() {
//        if (targetNetwork == null) {
//            targetNetwork = new ArrayList<String>();
//        }
        return this.targetNetwork;
    }
    
    public void addTargetNetwork(String tn) {
    	if (targetNetwork == null) {
    		targetNetwork = new ArrayList<String>();
    	}
    	this.targetNetwork.add(tn);
    }


    /**
     * Gets the value of the minReqVolume property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinReqVolume() {
        return minReqVolume;
    }

    /**
     * Sets the value of the minReqVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinReqVolume(Integer value) {
        this.minReqVolume = value;
    }

    /**
     * Gets the value of the backOffParameters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backOffParameters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackOffParameters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getBackOffParameters() {
//        if (backOffParameters == null) {
//            backOffParameters = new ArrayList<Integer>();
//        }
        return this.backOffParameters;
    }

    public void addBackOffParameters(Integer bop) {
    	if (backOffParameters == null) {
    		backOffParameters = new ArrayList<Integer>();
    	}
    	this.backOffParameters.add(bop);
    }
    
    /**
     * Gets the value of the otherConditions property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getOtherConditions() {
        return otherConditions;
    }

    /**
     * Sets the value of the otherConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setOtherConditions(Object value) {
        this.otherConditions = value;
    }

    /**
     * Gets the value of the mgmtLink property.
     * 
     * @return
     *     possible object is
     *     {@link MgmtLinkRef }
     *     
     */
    public MgmtLinkRef getMgmtLink() {
        return mgmtLink;
    }

    /**
     * Sets the value of the mgmtLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link MgmtLinkRef }
     *     
     */
    public void setMgmtLink(MgmtLinkRef value) {
        this.mgmtLink = value;
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.targetNetwork == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'targetNetwork' is M on CREATE operation");
			}
			if (this.minReqVolume == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'minReqVolume' is M on CREATE operation");
			}
			if (this.backOffParameters == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'backOffParameters' is M on CREATE operation");
			}
			if (this.mgmtLink == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtLink' is M on CREATE operation");
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
