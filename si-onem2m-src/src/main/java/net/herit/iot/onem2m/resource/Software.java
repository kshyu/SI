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
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="softwareName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="install" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="uninstall" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="installStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus"/>
 *         &lt;element name="activate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deactivate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="activeStatus" type="{http://www.onem2m.org/xml/protocols}actionStatus" minOccurs="0"/>
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
    "version",
    "softwareName",
    "url",
    "install",
    "uninstall",
    "installStatus",
    "activate",
    "deactivate",
    "activeStatus",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "software")
@XmlRootElement(name = "swr")
public class Software
    extends MgmtResource
{
//	public final static String SCHEMA_LOCATION = "CDT-software-v1_2_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-software-v1_6_0.xsd";

    //@XmlElement(required = true)
	@XmlElement(name = "vr", required = true)
    protected String version;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.SOFTWARENAME_SN, required = true)
    protected String softwareName;
    //@XmlElement(name = "URL", required = true)
    @XmlElement(name = "url", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(name = "in")
//    protected boolean install;
    protected Boolean install;
    @XmlElement(name = "un")
//    protected boolean uninstall;
    protected Boolean uninstall;
    //@XmlElement(required = true)
    @XmlElement(name = "ins", required = true)
    protected ActionStatus installStatus;
    @XmlElement(name = "act")
    protected Boolean activate;
    @XmlElement(name = "dea")
    protected Boolean deactivate;
    @XmlElement(name = "acts")
    protected ActionStatus activeStatus;
    @XmlElement(name = "ch")
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = "sub", namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the softwareName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoftwareName() {
        return softwareName;
    }

    /**
     * Sets the value of the softwareName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoftwareName(String value) {
        this.softwareName = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the install property.
     * 
     */
    public Boolean isInstall() {
        return install;
    }

    /**
     * Sets the value of the install property.
     * 
     */
    public void setInstall(Boolean value) {
        this.install = value;
    }

    /**
     * Gets the value of the uninstall property.
     * 
     */
    public Boolean isUninstall() {
        return uninstall;
    }

    /**
     * Sets the value of the uninstall property.
     * 
     */
    public void setUninstall(Boolean value) {
        this.uninstall = value;
    }

    /**
     * Gets the value of the installStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getInstallStatus() {
        return installStatus;
    }

    /**
     * Sets the value of the installStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setInstallStatus(ActionStatus value) {
        this.installStatus = value;
    }

    /**
     * Gets the value of the activate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActivate() {
        return activate;
    }

    /**
     * Sets the value of the activate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActivate(Boolean value) {
        this.activate = value;
    }

    /**
     * Gets the value of the deactivate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeactivate() {
        return deactivate;
    }

    /**
     * Sets the value of the deactivate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeactivate(Boolean value) {
        this.deactivate = value;
    }

    /**
     * Gets the value of the activeStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ActionStatus }
     *     
     */
    public ActionStatus getActiveStatus() {
        return activeStatus;
    }

    /**
     * Sets the value of the activeStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionStatus }
     *     
     */
    public void setActiveStatus(ActionStatus value) {
        this.activeStatus = value;
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
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
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
			if (this.version == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'version' is M on CREATE operation");
			}
			if (this.softwareName == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'softwareName' is M on CREATE operation");
			}
			if (this.url == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'url' is M on CREATE operation");
			}
			if (this.install != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'install' is NP on CREATE operation");
			}
			if (this.uninstall != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'uninstall' is NP on CREATE operation");
			}
			if (this.installStatus != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'installStatus' is NP on CREATE operation");
			}
			if (this.activate != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'activate' is NP on CREATE operation");
			}
			if (this.deactivate != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'deactivate' is NP on CREATE operation");
			}
			if (this.activeStatus != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'activeStatus' is NP on CREATE operation");
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
			if (this.installStatus != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'installStatus' is NP on UPDATE operation");
			}
			if (this.activeStatus != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'activeStatus' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}
}
